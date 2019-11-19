
package tpv.Acciones;

import LOSPANELES.PanelProductos;
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
public class AccionesProductos {
    //Variable de la clase PanelProductos.
    private PanelProductos panel;
    /**
     * Constructor de la clase
     * @param panel 
     */
    public AccionesProductos(PanelProductos panel) {
        this.panel = panel;
        activaTabla();
    }
    
    /**
     * Método que crea un producto y lo añade en la tabla productos de la base 
     * de datos
     */
    public void crearProducto(){
        gestionSQL cc = new gestionSQL();
        Connection cn = cc.openConnection();
        String nombre;
        String precio;
        String categoria;
        String imagenSeleccionada;
        String sql="";
        nombre = panel.getTxtAdd().getText();
        precio = panel.getTxtPrecio().getText();
        categoria = panel.getLblCategoriaSeleccionada().getText();
        imagenSeleccionada = panel.getImagenSeleccionada();
        sql = "INSERT INTO productos(nombre, precio, categoria, imagenSeleccionada)"+ " values(?,?,?,?)";
            try {
                PreparedStatement ps = cn.prepareStatement(sql);  
                ps.setString(1, nombre);
                ps.setString(2, precio);
                ps.setString(3, categoria);
                ps.setString(4, imagenSeleccionada);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Has introducido " + nombre + " en la base de datos." );
             } catch (SQLException ex) {  
                JOptionPane.showMessageDialog(null,"La categoria " + nombre + " ya existe." );
                Logger.getLogger(PanelProductos.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    /**
     * Método que elimina un producto de la base de datos
     */
    
    public void eliminarProducto(){
        gestionSQL cc = new gestionSQL();
        Connection cn = cc.openConnection();
        String nom;
        String sql="";
        nom = panel.getTxtEliminar().getText();
        sql = "DELETE FROM productos WHERE nombre = '" + nom + "'";         
       try { 
           PreparedStatement ps = cn.prepareStatement(sql);  
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null,"Has eliminado a " + nom + " de la base de datos." );
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"El usuario " + nom + " no existe." );      
            }
    }    
    /**
     * Método que comprueba que la categoria que ha introducido el usuario concuerda
     * con alguna de la base de datos.
     */
    public void seleccionarCategoria(){
        try {
            gestionSQL cc = new gestionSQL();
            Connection cn = cc.openConnection();
            String nombre;
            String sql="";
            nombre = panel.getTxtCategoria().getText();
            sql = "SELECT nombre FROM categorias";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String categoria = rs.getString("nombre");
                if(categoria.equals(nombre)){
                    panel.setLblCategoriaSeleccionada(categoria);
                }
            }
            if(panel.getLblCategoriaSeleccionada().getText() == ""){
            JOptionPane.showMessageDialog(null,"la categoria que has introducido no existe" );
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(AccionesProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Método que añade todos los datos de la tabla productos en la tabla
     * del programa llamada tblProductos
     */
    public void activaTabla(){
        try{
            
            DefaultTableModel modelo = new DefaultTableModel();
            panel.getTblProductos().setModel(modelo);            
            PreparedStatement ps = null;
            ResultSet rs = null;
            gestionSQL conn = new gestionSQL();
            Connection con = conn.openConnection();
            
            String sql = "SELECT categoria, nombre, precio FROM productos";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("categoria");
            modelo.addColumn("nombre");
            modelo.addColumn("precio");

            
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
