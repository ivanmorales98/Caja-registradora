
package tpv.Acciones;

import LOSPANELES.PanelCategorias;
import tpv.bd.gestionSQL;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ivan
 */
public class AccionesCategorias {
    //variable de la clase PanelCategorias
    private PanelCategorias panel;

    /**
     * Constructor de la clase
     * @param panel 
     */
    public AccionesCategorias(PanelCategorias panel) {
        this.panel = panel;
    }

    /**
     * Metodo que crea una categoria e introduce los datos en la tabla categorias
     * de la base de datos
     */
    public void crearCategoria(){
        gestionSQL cc = new gestionSQL();
        Connection cn = cc.openConnection();
        String nombre;
        String imagenSeleccionada;
        String sql="";
        nombre = panel.getTxtAdd().getText();
        imagenSeleccionada = panel.getImagenSeleccionada();
        sql = "INSERT INTO categorias(nombre,imagenSeleccionada)"+ " values(?,?)";
            try {
                PreparedStatement ps = cn.prepareStatement(sql);  
                ps.setString(1, nombre);
                ps.setString(2, imagenSeleccionada);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Has introducido " + nombre + " en la base de datos." );
             } catch (SQLException ex) {  
                JOptionPane.showMessageDialog(null,"La categoria " + nombre + " ya existe." );
                Logger.getLogger(PanelCategorias.class.getName()).log(Level.SEVERE, null, ex);
    }
        panel.setTxtAdd("");
    }
    
    /**
     * Método que elimina una categoria de la base de datos
     */
    public void eliminarCategoria(){
        gestionSQL cc = new gestionSQL();
        Connection cn = cc.openConnection();
        String nom;
        String sql="";
        String sql2 = "";
        nom = panel.getTxtEliminar().getText();
        sql = "DELETE FROM categorias WHERE nombre = '" + nom + "'";  
        sql2 = "DELETE FROM productos WHERE categoria = '" + nom + "'";
       try { 
           PreparedStatement ps = cn.prepareStatement(sql);  
           PreparedStatement ps2 = cn.prepareStatement(sql2);  
           ps.executeUpdate();
           ps2.executeUpdate();
           JOptionPane.showMessageDialog(null,"Has eliminado a " + nom + " de la base de datos." );
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"El usuario " + nom + " no existe." );      
            }
    }
    
    /**
     * Método que introduce los datos de la tabla de categorias de la base de 
     * datos en la tabla tblCategorias del programa.
     */
        public void activaTabla(){
        try{
            
            DefaultTableModel modelo = new DefaultTableModel();
            panel.getTblCategorias().setModel(modelo);            
            PreparedStatement ps = null;
            ResultSet rs = null;
            gestionSQL conn = new gestionSQL();
            Connection con = conn.openConnection();
            
            String sql = "SELECT nombre FROM categorias";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("Nombre categoria");


            
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

