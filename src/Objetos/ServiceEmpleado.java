
package Objetos;

import LOSPANELES.PanelEmpleados;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tpv.bd.gestionSQL;

/**
 *
 * @author Ivan
 */
public class ServiceEmpleado {
    //Variables de las clases importadas
    private PanelEmpleados panel;
    private gestionSQL gSQL;
    
    /**
     * Constructor de la clase
     * @param panel 
     */
    public ServiceEmpleado(PanelEmpleados panel) {
        this.panel = panel;
        activaTabla();
    }
    
    
  
    /**
     * Metodo que guarda los datos necesarios para crear un empleado en la tabla
     * empleados dentro de la base de datos
     */
    public void saveEmpleado(){
      
        gestionSQL cc = new gestionSQL();
        Connection cn = cc.openConnection();
        String nombre;
        String sql="";
        nombre = panel.getTxtAdd().getText();
        sql = "INSERT INTO empleados(nombre)" + " values(?)";
                try {
                PreparedStatement ps = cn.prepareStatement(sql);  
                ps.setString(1, nombre);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Ahora " + nombre + " es un cliente habitual." );
             } catch (SQLException ex) {  
                JOptionPane.showMessageDialog(null,"No se ha podido añadir a " + nombre + " en clientes habituales." );
                Logger.getLogger(PanelEmpleados.class.getName()).log(Level.SEVERE, null, ex);
    }
        panel.setTxtAdd("");
        
    }
    /**
     * Metodo en el que el usuario elimina un empleado de la base de datos
     */
    public void deleteEmpleado(){
        gestionSQL cc = new gestionSQL();
        Connection cn = cc.openConnection();
        String nombre;
        String sql="";
        nombre = panel.getTxtEliminarNombre().getText();
        sql = "DELETE FROM empleados WHERE nombre = '" + nombre + "' ";
            try {
                PreparedStatement ps = cn.prepareStatement(sql);  
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, nombre + " ha sido eliminado de 'clientes habituales'." );
             } catch (SQLException ex) {  
                JOptionPane.showMessageDialog(null,"Ha habido un error, por favor contacte con su administrador." );
                Logger.getLogger(PanelEmpleados.class.getName()).log(Level.SEVERE, null, ex);
    }

    }
  
    
    /**
     * Metodo para que cuenta los empleados que hay en la base de datos para luego
     * introducirlos en un label.
     */
    public void contarEmpleados() {
        int nRegistros = 0;
        try {
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            gestionSQL conn = new gestionSQL();
            Connection con = conn.openConnection();
            
            String sql = ("SELECT count(*) as total FROM empleados");
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                nRegistros=Integer.parseInt(rs.getString("total"));
                String registros = Integer.toString(nRegistros);
                panel.setLblContador(registros);
            }
            else {
                nRegistros=0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServiceCliente.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        

    }
    /**
     * Método que añade el nombre de la tabla empleados dentro de la tabla tblClientes.
     */
   
    
    public void activaTabla(){
        try{
            
            DefaultTableModel modelo = new DefaultTableModel();
            panel.getTblClientes().setModel(modelo);            
            PreparedStatement ps = null;
            ResultSet rs = null;
            gestionSQL conn = new gestionSQL();
            Connection con = conn.openConnection();
            
            String sql = "SELECT nombre FROM empleados";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("nombre");

            
            while(rs.next()){
                
                Object[] filas = new Object[cantidadColumnas];
                
                for(int i = 0; i<cantidadColumnas;i++){
                    filas[i] = rs.getObject(i + 1);
                    
                }
                
                modelo.addRow(filas);
      
            }
        }catch(SQLException ex){
            System.err.println(ex.toString());
            
        }
    }
    
}
