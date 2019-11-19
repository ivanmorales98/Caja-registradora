
package tpv.bd;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que se encarga en conectarse con la base de datos
 * @author Ivan
 */
public class gestionSQL {
    //Variables para conectarse en la base de datos
    public PreparedStatement psInsertar;
    private Connection con = null;
    private static final String DRIVER = "com.mysql.jdbc.Driver"; //variable del controlador de mysql 
    private static final String SERVER = "jdbc:mysql://localhost:3306/tpv";//puerto de la base de datos
    private static final String USERNAME = "root";//usuario base de datos
    private static final String PASSWORD = "";//contraseña base de datos
    
    /**
     * Metodo para conectar con la base de datos
     * @return 
     */
     public static Connection openConnection() {

            try {
                Connection con = DriverManager.getConnection(SERVER, USERNAME, PASSWORD);
                return con;
            } catch (SQLException ex) {
                Logger.getLogger(gestionSQL.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
     /**
      * Método para cerrar la base de datos
      */
     public void closeConnection(){
         try {
            con.close();
            System.out.println("Base de datos desconectada");
        } catch (Exception e) {
            System.out.println(e);
        }    
        
     }
     

}
