
package tpv.principal;


/**
 * Clase lanzadora de la aplicación.
 * 
 * @author Ivan
 */
public class LanzadorAplicacion {
    
    /**
     * Método lanzador.
     * 
     * @param args String[] parámetros 
     */
    
    public static void main(String[] args) {
        TpvFrame frame = new TpvFrame();
        frame.setVisible(true);
        frame.addMenu();
    }
}
