
package tpv.Acciones;

import LOSPANELES.PanelCajaRegistradora;
import Objetos.ServicePedido;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import tpv.bd.gestionSQL;

/**
 *
 * @author Ivan
 */
public class AccionesCajaRegistradora {
    //Variables de las clases importadas
    private PanelCajaRegistradora panel;
    private ServicePedido serviceP;
    //Variables de la clase
    String nombreProducto;
    String[] precioproducto = new String[8];
    Double total;
    /**
     * Constructores de la clase
     * @param panel 
     */
    public AccionesCajaRegistradora(PanelCajaRegistradora panel) {
        this.panel = panel;
        asignarCategoria();
        
    }
    public AccionesCajaRegistradora(ServicePedido serviceP) {
        this.serviceP = serviceP;
    }

    
    /**
     * Getter de nombreProducto
     * @return nombreProducto 
     */
    public String getNombreProducto() {
        return nombreProducto;
    }
    
    /**
     * Setter de nombreProducto
     * @param nombreProducto 
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    /**
     * Getter del PrecioProducto
     * @return precioproducto
     */
    public String getPrecioproducto(int numero){
        return precioproducto[numero];
    }

    /**
     * Metodo que elimina el numero introducido con la calculadora hasta ahora.
     */
    public void eliminarDatosCal() {
        panel.setLblDatosCal("");
        panel.setNumeros("");
    }
    /**
     * Metodo que añade el nombre y el precio del producto según que 
     * producto se haya seleccionado.
     */
    public void addToLabels(){
        String NombreProducto;
        String PrecioProducto;
        NombreProducto = getNombreProducto();
        //PrecioProducto = getPrecioproducto();
        panel.setLblProductoSeleccionado(NombreProducto);
        //panel.setLblPrecioProducto(PrecioProducto);
        
    }
    /**
     * Método que añade todos los datos a la tablaPedidos para que se vean todos
     * los pedidos en la interfaz gráfica.
     */
     public void añadirATabla (){
        JTable tabla = panel.getTblPedidos();
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        Object[] fila = new Object[5];
        
        String cantidad = panel.getLblCantidad().getText();
        String producto = panel.getLblProductoSeleccionado().getText();
        String precio = panel.getLblPrecioProducto().getText();
        String descuento = panel.getLblDescuento().getText();
         
        String subtotal = subtotal();
        
        fila[0]=cantidad;
        fila[1]=producto;
        fila[2]=descuento;
        fila[3]=precio;
        fila[4]=subtotal;
        modelo.addRow(fila);
             
 
    }
     /**
      * Metodo que calcula el subtotal del pedido (contando la cantidad, el precio
      * y el descuento(si hay)).
      * @return 
      */
     public String subtotal(){
         Double cantidad = Double.valueOf(panel.getLblCantidad().getText());
         Double descuento = Double.valueOf(panel.getLblDescuento().getText());
         Double precio = Double.valueOf(panel.getLblPrecioProducto().getText());
         Double subtotal;
         String subTotal;

         if(descuento>0.0){
             subtotal = cantidad * precio;
             subtotal = ((100-descuento)*subtotal)/100;
             subTotal=Double.toString(subtotal);
             return subTotal;
         }else{
             subtotal = cantidad * precio;
             subTotal=Double.toString(subtotal);
             
             return subTotal;
         }
         
         
     }
     
     /**
      * Método que calcula el total sumando los subtotales que se muestran en la
      * tabla
      */
     public void total(){
        if("0.0".equals(panel.getTxtTotal())){
            total = Double.valueOf(subtotal());
            panel.setTxtTotal(String.valueOf(total));
        }else{
            Double total = Double.parseDouble(panel.getTxtTotal()) + Double.parseDouble(subtotal());
            panel.setTxtTotal(String.valueOf(total));
        }
        
         
         
     }
     /**
      * Metodo que comprueba que la clave del cliente habitual existe en la base
      * de datos
      */
     public void comprobarCliente(){
        try {
            gestionSQL cc = new gestionSQL();
            Connection cn = cc.openConnection();
            PreparedStatement ps = null;
            ResultSet rs = null;
            String clave = panel.getLblDatosCal().getText();
            String sql = "";
      
            sql = "SELECT COUNT(*) FROM clientes WHERE clave = '" + clave + "'";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            while (rs.next()) {
                int numeroCasillas = rs.getInt(1);
                if (numeroCasillas>0){
                    panel.getBtnPDesc().setEnabled(true);
                }else{
                   JOptionPane.showMessageDialog(null,"La clave introducida no es correcta" ); 
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ha habido un error. Consulte con un administrador." );
        }
        
     }
     
     /**
      * Método que borra los datos del actual pedido de todos los label del 
      * panelCajaRegistradora
      */
     
    public void borrarPedidoEnCurso(){
        panel.setLblCantidad("");
        panel.setLblDatosCal("");
        panel.setLblDescuento("0");
        panel.setLblPrecioProducto("");
        panel.setLblProductoSeleccionado(""); 
    }
     
    /**
     * Método que añade texto y imagen a cada label de categorias.
     */
     public void asignarCategoria(){
        try {
            ResultSet rs = null;
            gestionSQL cc = new gestionSQL();
            Connection cn = cc.openConnection();
            String sql="";
            sql = "SELECT nombre,imagenSeleccionada FROM categorias";
            PreparedStatement ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            int cnt = 0;
            while(rs.next()){
                String categoria = rs.getString("nombre");
                cnt++;           
                    switch (cnt) {
                    case 1:
                        panel.setLblCat1(categoria);    
                        addImagenCategoria(panel.getLblFotoCategoria1(),categoria);
                        break;
                    case 2:
                        panel.setLblCat2(categoria);                        
                        addImagenCategoria(panel.getLblFotoCategoria2(),categoria);
                        break;
                    case 3:
                        panel.setLblCat3(categoria);
                        addImagenCategoria(panel.getLblFotoCategoria3(),categoria);
                        break;
                    case 4:
                        panel.setLblCat4(categoria);
                        addImagenCategoria(panel.getLblFotoCategoria4(),categoria);
                        break;
                    case 5:
                        panel.setLblCat5(categoria);
                        addImagenCategoria(panel.getLblFotoCategoria5(),categoria);
                        break;
                    case 6:
                        panel.setLblCat6(categoria);
                        addImagenCategoria(panel.getLblFotoCategoria6(),categoria);
                        break;
                    case 7:
                        panel.setLblCat7(categoria);
                        addImagenCategoria(panel.getLblFotoCategoria7(),categoria);
                        break;
                    case 8:
                        panel.setLblCat8(categoria);
                        addImagenCategoria(panel.getLblFotoCategoria8(),categoria);
                        break;
                    default:
                        break;
                }             
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(AccionesCategorias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     /**
      * Método que añade todos los productos segun su categoria y añade en los labels
      * el nombre y la foto correspondiente
      */
     public void asignarProducto(){
         try {
                     
            gestionSQL cc = new gestionSQL();
            Connection cn = cc.openConnection();
            String sql="";
            String categoriaClicada = panel.getCategoriaClicada();
            sql = "SELECT nombre, precio, categoria FROM productos WHERE categoria = '" + categoriaClicada + "'";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int cnt = 0;
            while(rs.next()){
                
                    String producto = rs.getString("nombre");
                    String precio = rs.getString("precio");
                    System.out.println(precio);
                    cnt++;
                    System.out.println(precio);
                    switch (cnt) {
                        case 1:
                            panel.setLblprod1(producto);
                            precioproducto[1] = precio;
                            addImagenProducto(panel.getLblFotoCafe1(), producto);
                            break;
                        case 2:
                            panel.setLblprod2(producto);
                            precioproducto[2] = precio;
                            addImagenProducto(panel.getLblFotoCafe2(), producto);
                            break;
                        case 3:
                            panel.setLblprod3(producto);
                            precioproducto[3] = precio;
                            addImagenProducto(panel.getLblFotoCafe3(), producto);
                            break;
                        case 4:
                            panel.setLblprod4(producto);
                            precioproducto[4] = precio;
                            addImagenProducto(panel.getLblFotoCafe4(), producto);
                            break;
                        case 5:
                            panel.setLblprod5(producto);
                            precioproducto[5] = precio;
                            addImagenProducto(panel.getLblFotoCafe5(), producto);
                            break;
                        case 6:
                            panel.setLblprod6(producto);
                            precioproducto[6] = precio;
                            addImagenProducto(panel.getLblFotoCafe6(), producto);
                            break;
                        case 7:
                            panel.setLblprod7(producto);
                            precioproducto[7] = precio;
                            addImagenProducto(panel.getLblFotoCafe7(), producto);
                            break;
                        case 8:
                            panel.setLblprod8(producto);
                            precioproducto[8] = precio;
                            addImagenProducto(panel.getLblFotoCafe08(), producto);
                            break;
                        default:
                            break;
                    }
                
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(AccionesCategorias.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     /**
      * Elimina los textos y las imagenes de los labels de productos
      */
     public void quitarProductos(){
         panel.setLblprod1("");
         panel.getLblFotoCafe1().setIcon(null);
         panel.setLblprod2("");
         panel.getLblFotoCafe2().setIcon(null);
         panel.setLblprod3("");
         panel.getLblFotoCafe3().setIcon(null);
         panel.setLblprod4("");
         panel.getLblFotoCafe4().setIcon(null);
         panel.setLblprod5("");
         panel.getLblFotoCafe5().setIcon(null);
         panel.setLblprod6("");
         panel.getLblFotoCafe6().setIcon(null);
         panel.setLblprod7("");
         panel.getLblFotoCafe7().setIcon(null);
         panel.setLblprod8("");
         panel.getLblFotoCafe08().setIcon(null);
     }
     
     /**
      * Método que recibe el String de precio producto y lo añade en un label.
      */
     public void mostrarPrecioProducto(){
        String precio = panel.getPrecioProducto();
        panel.setLblPrecioProducto(precio);
        
        
     }
    
     /**
      * Método que añade las imagenes a cada label de producto segun la imagen
      * que se haya escogido al crear el
      * @param labelSeleccionado 
      */
     public void addImagenCategoria(JLabel labelSeleccionado, String nombreCategoria){
        try {
            gestionSQL cc = new gestionSQL();
            Connection cn = cc.openConnection();
            String sql="";
            String imagen;
            sql = "SELECT imagenSeleccionada,nombre FROM categorias WHERE nombre = '" + nombreCategoria + "' && imagenSeleccionada > 0";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                imagen = rs.getString("imagenSeleccionada");
                if(labelSeleccionado.getIcon() == null){   
                switch (imagen) {
                    case "1":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agua.png")));
                        break;
                    case "2":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresco.png")));
                        break;
                    case "3":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bebida3.png")));
                        break;
                    case "4":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bolleria1.png")));
                        break;
                    case "5":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cafe1.png")));
                        break;
                    case "6":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cafe2.png")));
                        break;
                    case "7":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cafe3.png")));
                        break;
                    case "8":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerveza.png")));
                        break;
                    case "9":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/coca-cola.png")));
                        break;
                    case "10":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/coctel1.png")));
                        break;
                    case "11":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu1.png")));
                        break;
                    case "12":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu2.png")));
                        break;
                    case "13":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/patatas.png")));
                        break;
                    case "14":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sandwich.png")));
                        break;
                    default:
                        break;
                }
                 }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public void addImagenProducto(JLabel labelSeleccionado, String nombreProducto){
        try {
            gestionSQL cc = new gestionSQL();
            Connection cn = cc.openConnection();
            String sql="";
            String imagen;
            sql = "SELECT imagenSeleccionada,nombre FROM productos WHERE nombre = '" + nombreProducto + "'";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                imagen = rs.getString("imagenSeleccionada");
                switch (imagen) {
                    case "1":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agua.png")));
                        break;
                    case "2":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresco.png")));
                        break;
                    case "3":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bebida3.png")));
                        break;
                    case "4":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bolleria1.png")));
                        break;
                    case "5":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cafe1.png")));
                        break;
                    case "6":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cafe2.png")));
                        break;
                    case "7":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cafe3.png")));
                        break;
                    case "8":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerveza.png")));
                        break;
                    case "9":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/coca-cola.png")));
                        break;
                    case "10":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/coctel1.png")));
                        break;
                    case "11":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu1.png")));
                        break;
                    case "12":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu2.png")));
                        break;
                    case "13":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/patatas.png")));
                        break;
                    case "14":
                        labelSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sandwich.png")));
                        break;
                    default:
                        break;
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     /**
      * Crea un nuevo pedido borrando todos los datos de la tabla.
      */
     public void nuevoPedido(javax.swing.JTable Tabla){
        DefaultTableModel Table = (DefaultTableModel) Tabla.getModel();
        Table.setRowCount(0);
        panel.setTxtTotal("0.0");//Reseteamos el total a 0.0
     }
     
     
}
