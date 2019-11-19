
package Objetos;

import LOSPANELES.PanelCajaRegistradora;
import LOSPANELES.PanelClientes;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tpv.Acciones.AccionesCajaRegistradora;
import tpv.bd.gestionSQL;
import java.util.Date;

/**
 *
 * @author Ivan
 */
public class ServicePedido {
    //Variables de las clases importadas.
    private PanelCajaRegistradora panel;
    
    /**
     * Constructor de la clase
     * @param panel 
     */
    public ServicePedido(PanelCajaRegistradora panel) {
        this.panel = panel;  
    }
   
    /**
     * Crea un pedido añadiendo todos los datos del producto en la tabla pedidos 
     * de la base de datos
     */
   
    public void savePedido() {
        AccionesCajaRegistradora acciones= new AccionesCajaRegistradora(panel);
        Date fecha =new Date();
       gestionSQL cc = new gestionSQL();
        Connection cn = cc.openConnection();
        String sql="";    
        String cantidad = panel.getLblCantidad().getText();
        String producto = panel.getLblProductoSeleccionado().getText();
        String precio = panel.getLblPrecioProducto().getText();
        String descuento = panel.getLblDescuento().getText();
        String subtotal = acciones.subtotal();
        String empleado = panel.getTxtEmpleado().getText();

        sql = "INSERT INTO pedidos(cantidad, descripcion, descuento, precio, subtotal,empleado,fecha)" + " values(?,?,?,?,?,?,?)";
                try {
                PreparedStatement ps = cn.prepareStatement(sql);  
                ps.setString(1, cantidad);
                ps.setString(2, producto);
                ps.setString(3, descuento);
                ps.setString(4, precio);
                ps.setString(5, subtotal);
                ps.setString(6, empleado);
                ps.setString(7, fecha.toString());
                ps.executeUpdate();
             } catch (SQLException ex) {  
                JOptionPane.showMessageDialog(null,"No se ha podido añadir este producto" );
                Logger.getLogger(PanelClientes.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
    
    /**
     * Se conecta con la base de datos y traslada los datos a una tabla.
     */
    /*
        public void activaTabla(){
        try{
            
            DefaultTableModel modelo = new DefaultTableModel();
            panel.getTblPedidos().setModel(modelo);            
            PreparedStatement ps = null;
            ResultSet rs = null;
            gestionSQL conn = new gestionSQL();
            Connection con = conn.openConnection();
            
            String sql = "SELECT descripcion, precio FROM pedidos";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("descripcion");
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
    }*/

    

   
   
    
    
}
