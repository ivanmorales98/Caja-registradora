
package TPV.Acciones;

import LOSPANELES.PanelEmpleados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tpv.bd.gestionSQL;
import tpv.principal.TpvFrame;

/**
 *
 * @author Ivan
 */
public class AccionesEmpleados {
    //Variables de las clases importadas
    private TpvFrame frame;
    private PanelEmpleados panel;
    /**
     * Constructor de la clase
     * @param frame 
     */
    public AccionesEmpleados(TpvFrame frame) {
        this.frame = frame;
    }
    /**
     * Método que añade los datos de los empleados en la base de datos de la tabla
     * empleados.
     */
    public void addEmpleado(){
        gestionSQL cc = new gestionSQL();
        Connection cn = cc.openConnection();
        String nombre;
        String id;
        String sql="";
        nombre = panel.getTxtAdd().getText();
        id = "NULL";
        sql = "INSERT INTO empleados(nombre)"+ " values(?)";
            try {
                PreparedStatement ps = cn.prepareStatement(sql);  
                ps.setString(1, nombre);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Has introducido " + nombre + " en la base de datos." );
             } catch (SQLException ex) {  
                JOptionPane.showMessageDialog(null,"La categoria " + nombre + " ya existe." );
                Logger.getLogger(PanelEmpleados.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    /**
     * Método que elimina un empleado de la base de datos
     */
    
    public void eliminarEmpleado(){
        gestionSQL cc = new gestionSQL();
            Connection cn = cc.openConnection();
            String nom;
            String apellido1;
            String apellido2;
            String sql="";
            nom = panel.getTxtAdd().getText();
            sql = "DELETE FROM categorias WHERE nombre = '" + nom + "'";         
            try { 
                PreparedStatement ps = cn.prepareStatement(sql);  
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Has eliminado a " + nom + " de la base de datos." );
             } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"El usuario " + nom + " no existe." );
                
            }
    }
}
