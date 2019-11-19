
package Objetos;

import LOSPANELES.PanelClientes;
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
public final class ServiceCliente {
    //Variables de las clases importadas
    private PanelClientes panel;
    private gestionSQL gSQL;

   
    /**
     * Constructor de la clase
     * @param panel 
     */
    public ServiceCliente(PanelClientes panel) {
        this.panel = panel;
        contarClientes();
        activaTabla();
    }
    
    /**
     * Metodo que guarda los datos (introducidos por el usuario en el programa) en la base de datos.
     * Guarda los datos en la tabla clientes
     */
    
    public void saveCliente(){
      
        gestionSQL cc = new gestionSQL();
        Connection cn = cc.openConnection();
        String nombre;
        String clave;
        String sql="";
        nombre = panel.getTxtAdd().getText();
        clave = crearClave(); 
        sql = "INSERT INTO clientes(nombre, clave)" + " values(?,?)";
                try {
                PreparedStatement ps = cn.prepareStatement(sql);  
                ps.setString(1, nombre);
                ps.setString(2, clave);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Ahora " + nombre + " es un cliente habitual." );
             } catch (SQLException ex) {  
                JOptionPane.showMessageDialog(null,"No se ha podido añadir a " + nombre + " en clientes habituales." );
                Logger.getLogger(PanelClientes.class.getName()).log(Level.SEVERE, null, ex);
    }
        panel.setTxtAdd("");
        
    }
    /**
     * Metodo en el que el usuario introduce unos datos del cliente y si coincide con la base
     * de datos, elimina el cliente.
     */
    public void deleteCliente(){
        gestionSQL cc = new gestionSQL();
        Connection cn = cc.openConnection();
        String nombre;
        String clave;
        String sql="";
        nombre = panel.getTxtEliminarNombre().getText();
        clave = panel.getTxtEliminarClave().getText();
        sql = "DELETE FROM clientes WHERE nombre = '" + nombre + "' AND clave = '" + clave +"'";
            try {
                PreparedStatement ps = cn.prepareStatement(sql);  
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, nombre + " ha sido eliminado de 'clientes habituales'." );
             } catch (SQLException ex) {  
                JOptionPane.showMessageDialog(null,"Ha habido un error, por favor contacte con su administrador." );
                Logger.getLogger(PanelClientes.class.getName()).log(Level.SEVERE, null, ex);
    }

    }
  
    
    /**
     * Metodo para crear un numero de clave del cliente;
     */
    public void contarClientes() {
        int nRegistros = 0;
        try {
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            gestionSQL conn = new gestionSQL();
            Connection con = conn.openConnection();
            
            String sql = ("SELECT count(*) as total FROM clientes");
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
     * Metodo en el que se crea y asigna una clave. Esta clave unica se utilizara
     * para que el cliente se identifique
     */
    public String crearClave(){
        
        int clavee = 0;
        
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            gestionSQL cc = new gestionSQL();
            Connection cn = cc.openConnection();
            String sql = ("SELECT id as total FROM clientes ORDER BY id DESC LIMIT 1");
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                clavee=Integer.parseInt(rs.getString("total"));
                String clave = "0011" + (clavee + 1);
                return clave;   }
     
        } catch (SQLException ex) {
            Logger.getLogger(ServiceCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
        
            
        
        
        }
    /**
     * Metodo que coge todos los datos de la tabla clientes y los añade en la tabla
     * clientes dentro del panelClientes
     */
    public void activaTabla(){
        try{
            
            DefaultTableModel modelo = new DefaultTableModel();
            panel.getTblClientes().setModel(modelo);            
            PreparedStatement ps = null;
            ResultSet rs = null;
            gestionSQL conn = new gestionSQL();
            Connection con = conn.openConnection();
            
            String sql = "SELECT id, nombre, clave FROM clientes";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("id");
            modelo.addColumn("nombre");
            modelo.addColumn("clave");
            
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

