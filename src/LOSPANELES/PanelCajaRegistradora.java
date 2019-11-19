package LOSPANELES;


import Objetos.ServicePedido;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import tpv.Acciones.AccionesCajaRegistradora;
import tpv.principal.TpvFrame;


/**
 *  Clase PanelCajaRegistradora
 * @author Ivan
 */
public class PanelCajaRegistradora extends javax.swing.JPanel {
    //variables de las clases importadas
    private TpvFrame frame;   
    private AccionesCajaRegistradora acciones;
    private ServicePedido pedido;
    //variables de las clases
    String categoriaClicada;
    File fichero;
    String numeros="";
    String precioProducto;
    
    /**
     * Constructor de la clase
     * @param frame 
     */
    public PanelCajaRegistradora(TpvFrame frame) {
       this.frame = frame;
       initComponents();
       acciones = new AccionesCajaRegistradora(this);
       pedido = new ServicePedido(this);
       btnPDesc.setEnabled(false);
       acciones.borrarPedidoEnCurso();
       setTxtTotal("0.0");
       
    }

   

    
    /**
     * Metodos get y set 
     * 
     */
    
    public TpvFrame getFrame() {
        return frame;
    }

    public void setFrame(TpvFrame frame) {
        this.frame = frame;
    }


    public JTable getTblPedidos() {
        return tblPedidos;
    }

    public void setTblPedidos(JTable tblPedidos) {
        this.tblPedidos = tblPedidos;
    }

    public JScrollPane getPanelTabla() {
        return panelTabla;
    }

    public void setPanelTabla(JScrollPane panelTabla) {
        this.panelTabla = panelTabla;
    }

    public String getTxtTotal() {
        return txtTotal.getText();
    }

    public void setTxtTotal(String txtTotal) {
        this.txtTotal.setText(txtTotal);
    }

    public JLabel getLblNumero() {
        return lblNumero;
    }

    public void setLblNumero(JLabel lblNumero) {
        this.lblNumero = lblNumero;
    }

    public JLabel getLblDescuento() {
        return lblDescuento;
    }

    public void setLblDescuento(String lblDescuento) {
        this.lblDescuento.setText(lblDescuento);
    }

    public JLabel getLblPrecioProducto() {
        return lblPrecioProducto;
    }

    public void setLblPrecioProducto(String lblPrecioProducto) {
        this.lblPrecioProducto.setText(lblPrecioProducto);
    }

    public JLabel getLblProductoSeleccionado() {
        return lblProductoSeleccionado;
    }

    public void setLblProductoSeleccionado(String lblProductoSeleccionado) {
        this.lblProductoSeleccionado.setText(lblProductoSeleccionado);
    }

    public JLabel getLblDatosCal() {
        return lblDatosCal;
    }

    public void setLblDatosCal(String lblDatosCal) {
        this.lblDatosCal.setText(lblDatosCal);
    }

    public JLabel getLblCantidad() {
        return lblCantidad;
    }

    public void setLblCantidad(String lblCantidad) {
        this.lblCantidad.setText(lblCantidad);
    }

    public String getNumeros() {
        return numeros;
    }

    public void setNumeros(String numeros) {
        this.numeros = numeros;
    }

    public JButton getBtnPDesc() {
        return btnPDesc;
    }

    public void setBtnPDesc(JButton btnPDesc) {
        this.btnPDesc = btnPDesc;
    }

    public JTextField getTxtEmpleado() {
        return txtEmpleado;
    }

    public void setTxtEmpleado(String txtEmpleado) {
        this.txtEmpleado.setText(txtEmpleado);
    }

    public JLabel getLblFotoCategoria1() {
        return lblFotoCategoria1;
    }

    public void setLblFotoCategoria1(String lblFotoCategoria1) {
        this.lblFotoCategoria1.setText(lblFotoCategoria1);
    }

    public JLabel getLblFotoCategoria2() {
        return lblFotoCategoria2;
    }

    public void setLblFotoCategoria2(String lblFotoCategoria2) {
        this.lblFotoCategoria2.setText(lblFotoCategoria2);
    }

    public JLabel getLblFotoCategoria3() {
        return lblFotoCategoria3;
    }

    public void setLblFotoCategoria3(String lblFotoCategoria3) {
        this.lblFotoCategoria3.setText(lblFotoCategoria3);
    }

    public JLabel getLblFotoCategoria4() {
        return lblFotoCategoria4;
    }

    public void setLblFotoCategoria4(String lblFotoCategoria4) {
        this.lblFotoCategoria4.setText(lblFotoCategoria4);
    }

    public JLabel getLblFotoCategoria5() {
        return lblFotoCategoria5;
    }

    public void setLblFotoCategoria5(String lblFotoCategoria5) {
        this.lblFotoCategoria5.setText(lblFotoCategoria5);
    }

    public JLabel getLblFotoCategoria6() {
        return lblFotoCategoria6;
    }

    public void setLblFotoCategoria6(String lblFotoCategoria6) {
        this.lblFotoCategoria6.setText(lblFotoCategoria6);
    }

    public JLabel getLblFotoCategoria7() {
        return lblFotoCategoria7;
    }

    public void setLblFotoCategoria7(String lblFotoCategoria7) {
        this.lblFotoCategoria7.setText(lblFotoCategoria7);
    }

    public JLabel getLblFotoCategoria8() {
        return lblFotoCategoria8;
    }

    public void setLblFotoCategoria8(String lblFotoCategoria8) {
        this.lblFotoCategoria8.setText(lblFotoCategoria8);
    }




    public JLabel getLblFotoCafe08() {
        return lblFotoCafe08;
    }

    public void setLblFotoCafe08(String lblFotoCafe08) {
        this.lblFotoCafe08.setText(lblFotoCafe08);
    }

    public JLabel getLblFotoCafe1() {
        return lblFotoCafe1;
    }

    public void setLblFotoCafe1(String lblFotoCafe1) {
        this.lblFotoCafe1.setText(lblFotoCafe1);
    }

    public JLabel getLblFotoCafe2() {
        return lblFotoCafe2;
    }

    public void setLblFotoCafe2(String lblFotoCafe2) {
        this.lblFotoCafe2.setText(lblFotoCafe2);
    }

    public JLabel getLblFotoCafe3() {
        return lblFotoCafe3;
    }

    public void setLblFotoCafe3(String lblFotoCafe3) {
        this.lblFotoCafe3.setText(lblFotoCafe3);
    }

    public JLabel getLblFotoCafe4() {
        return lblFotoCafe4;
    }

    public void setLblFotoCafe4(String lblFotoCafe4) {
        this.lblFotoCafe4.setText(lblFotoCafe4);
    }

    public JLabel getLblFotoCafe5() {
        return lblFotoCafe5;
    }

    public void setLblFotoCafe5(String lblFotoCafe5) {
        this.lblFotoCafe5.setText(lblFotoCafe5);
    }

    public JLabel getLblFotoCafe6() {
        return lblFotoCafe6;
    }

    public void setLblFotoCafe6(String lblFotoCafe6) {
        this.lblFotoCafe6.setText(lblFotoCafe6);
    }

    public JLabel getLblFotoCafe7() {
        return lblFotoCafe7;
    }

    public void setLblFotoCafe7(String lblFotoCafe7) {
        this.lblFotoCafe7.setText(lblFotoCafe7);
    }

    public String getCategoriaClicada() {
        return categoriaClicada;
    }

    public void setCategoriaClicada(String categoriaClicada) {
        this.categoriaClicada = categoriaClicada;
    }

    public String getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(String precioProducto) {
        this.precioProducto = precioProducto;
    }

    public void setLblCat1(String lblCat1) {
        this.lblCat1.setText(lblCat1);
    }

    public void setLblCat2(String lblCat2) {
        this.lblCat2.setText(lblCat2);    }

    public void setLblCat3(String lblCat3) {
        this.lblCat3.setText(lblCat3);    }

    public void setLblCat4(String lblCat4) {
        this.lblCat4.setText(lblCat4);    }

    public void setLblCat5(String lblCat5) {
        this.lblCat5.setText(lblCat5);    }

    public void setLblCat6(String lblCat6) {
        this.lblCat6.setText(lblCat6);    }

    public void setLblCat7(String lblCat7) {
        this.lblCat7.setText(lblCat7);    }

    public void setLblCat8(String lblCat8) {
        this.lblCat8.setText(lblCat8);    }

    public void setLblprod1(String lblprod1) {
        this.lblprod1.setText(lblprod1);
    }

    public void setLblprod2(String lblprod2) {
        this.lblprod2.setText(lblprod2);
    }

    public void setLblprod3(String lblprod3) {
        this.lblprod3.setText(lblprod3);
    }

    public void setLblprod4(String lblprod4) {
        this.lblprod4.setText(lblprod4);
    }

    public void setLblprod5(String lblprod5) {
        this.lblprod5.setText(lblprod5);
    }

    public void setLblprod6(String lblprod6) {
        this.lblprod6.setText(lblprod6);
    }

    public void setLblprod7(String lblprod7) {
        this.lblprod7.setText(lblprod7);
    }

    public void setLblprod8(String lblprod8) {
        this.lblprod8.setText(lblprod8);
    }

    public JLabel getLblCat1() {
        return lblCat1;
    }
    
    public JLabel getLblCat2() {
        return lblCat2;
    }

    public JLabel getLblCat3() {
        return lblCat3;
    }

    public JLabel getLblCat4() {
        return lblCat4;
    }

    public JLabel getLblCat5() {
        return lblCat5;
    }

    public JLabel getLblCat6() {
        return lblCat6;
    }

    public JLabel getLblCat7() {
        return lblCat7;
    }

    public JLabel getLblCat8() {
        return lblCat8;
    }

    public JLabel getLblprod1() {
        return lblprod1;
    }

    public JLabel getLblprod2() {
        return lblprod2;
    }

    public JLabel getLblprod3() {
        return lblprod3;
    }

    public JLabel getLblprod4() {
        return lblprod4;
    }

    public JLabel getLblprod5() {
        return lblprod5;
    }

    public JLabel getLblprod6() {
        return lblprod6;
    }

    public JLabel getLblprod7() {
        return lblprod7;
    }

    public JLabel getLblprod8() {
        return lblprod8;
    }
    
    
    
    
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTabla = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        btnCal23 = new javax.swing.JButton();
        btnCal27 = new javax.swing.JButton();
        btnCal28 = new javax.swing.JButton();
        btnCal29 = new javax.swing.JButton();
        btnCal25 = new javax.swing.JButton();
        btnCal22 = new javax.swing.JButton();
        btnCal24 = new javax.swing.JButton();
        btnCal21 = new javax.swing.JButton();
        btnCal26 = new javax.swing.JButton();
        btnCal20 = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        txtTotal = new javax.swing.JLabel();
        btnDescuento = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnEliminarProducto = new javax.swing.JButton();
        lblFotoCategoria2 = new javax.swing.JLabel();
        lblFotoCategoria3 = new javax.swing.JLabel();
        lblFotoCategoria4 = new javax.swing.JLabel();
        lblFotoCategoria6 = new javax.swing.JLabel();
        lblFotoCategoria7 = new javax.swing.JLabel();
        lblFotoCategoria8 = new javax.swing.JLabel();
        lblFotoCategoria5 = new javax.swing.JLabel();
        lblFotoCategoria1 = new javax.swing.JLabel();
        btnAddProducto = new javax.swing.JButton();
        lblNumero = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblProductoSeleccionado = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblPrecioProducto = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        btnPDesc = new javax.swing.JButton();
        lblDatosCal = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        btnCantidad = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnNuevoPedido = new javax.swing.JButton();
        txtEmpleado = new javax.swing.JTextField();
        lblFotoCafe1 = new javax.swing.JLabel();
        lblFotoCafe2 = new javax.swing.JLabel();
        lblFotoCafe3 = new javax.swing.JLabel();
        lblFotoCafe4 = new javax.swing.JLabel();
        lblFotoCafe5 = new javax.swing.JLabel();
        lblFotoCafe6 = new javax.swing.JLabel();
        lblFotoCafe7 = new javax.swing.JLabel();
        lblFotoCafe08 = new javax.swing.JLabel();
        lblCat1 = new javax.swing.JLabel();
        lblCat2 = new javax.swing.JLabel();
        lblCat3 = new javax.swing.JLabel();
        lblCat4 = new javax.swing.JLabel();
        lblCat5 = new javax.swing.JLabel();
        lblCat6 = new javax.swing.JLabel();
        lblCat7 = new javax.swing.JLabel();
        lblCat8 = new javax.swing.JLabel();
        lblprod1 = new javax.swing.JLabel();
        lblprod2 = new javax.swing.JLabel();
        lblprod3 = new javax.swing.JLabel();
        lblprod4 = new javax.swing.JLabel();
        lblprod5 = new javax.swing.JLabel();
        lblprod6 = new javax.swing.JLabel();
        lblprod7 = new javax.swing.JLabel();
        lblprod8 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(null);

        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cant.", "Producto", "Dto.", "Precio", "subtotal"
            }
        ));
        tblPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblPedidos.setShowHorizontalLines(false);
        tblPedidos.setShowVerticalLines(false);
        panelTabla.setViewportView(tblPedidos);

        add(panelTabla);
        panelTabla.setBounds(140, 760, 670, 200);

        btnCal23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCal23.setText("1");
        btnCal23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCal23MouseClicked(evt);
            }
        });
        add(btnCal23);
        btnCal23.setBounds(50, 510, 80, 50);

        btnCal27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCal27.setText("7");
        btnCal27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCal27MouseClicked(evt);
            }
        });
        btnCal27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCal27ActionPerformed(evt);
            }
        });
        add(btnCal27);
        btnCal27.setBounds(50, 390, 80, 50);

        btnCal28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCal28.setText("8");
        btnCal28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCal28MouseClicked(evt);
            }
        });
        add(btnCal28);
        btnCal28.setBounds(140, 390, 80, 50);

        btnCal29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCal29.setText("9");
        btnCal29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCal29MouseClicked(evt);
            }
        });
        add(btnCal29);
        btnCal29.setBounds(230, 390, 80, 50);

        btnCal25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCal25.setText("2");
        btnCal25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCal25MouseClicked(evt);
            }
        });
        add(btnCal25);
        btnCal25.setBounds(140, 510, 80, 50);

        btnCal22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCal22.setText("3");
        btnCal22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCal22MouseClicked(evt);
            }
        });
        add(btnCal22);
        btnCal22.setBounds(230, 510, 80, 50);

        btnCal24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCal24.setText("5");
        btnCal24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCal24MouseClicked(evt);
            }
        });
        add(btnCal24);
        btnCal24.setBounds(140, 450, 80, 50);

        btnCal21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCal21.setText("6");
        btnCal21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCal21MouseClicked(evt);
            }
        });
        add(btnCal21);
        btnCal21.setBounds(230, 450, 80, 50);

        btnCal26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCal26.setText("0");
        btnCal26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCal26MouseClicked(evt);
            }
        });
        add(btnCal26);
        btnCal26.setBounds(50, 570, 80, 50);

        btnCal20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCal20.setText("4");
        btnCal20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCal20MouseClicked(evt);
            }
        });
        add(btnCal20);
        btnCal20.setBounds(50, 450, 80, 50);

        btnAtras.setText("<-");
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasMouseClicked(evt);
            }
        });
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        add(btnAtras);
        btnAtras.setBounds(49, 13, 50, 40);

        txtTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtTotal);
        txtTotal.setBounds(650, 960, 160, 30);

        btnDescuento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDescuento.setText("Cliente habitual");
        btnDescuento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDescuentoMouseClicked(evt);
            }
        });
        add(btnDescuento);
        btnDescuento.setBounds(230, 570, 180, 50);

        jLabel5.setText("Empleado");
        add(jLabel5);
        jLabel5.setBounds(460, 580, 70, 16);

        btnEliminarProducto.setText("Eliminar producto");
        btnEliminarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarProductoMouseClicked(evt);
            }
        });
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });
        add(btnEliminarProducto);
        btnEliminarProducto.setBounds(620, 620, 160, 25);

        lblFotoCategoria2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFotoCategoria2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoCategoria2MouseClicked(evt);
            }
        });
        add(lblFotoCategoria2);
        lblFotoCategoria2.setBounds(140, 140, 80, 79);

        lblFotoCategoria3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFotoCategoria3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoCategoria3MouseClicked(evt);
            }
        });
        add(lblFotoCategoria3);
        lblFotoCategoria3.setBounds(230, 140, 80, 79);

        lblFotoCategoria4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblFotoCategoria4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFotoCategoria4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoCategoria4MouseClicked(evt);
            }
        });
        add(lblFotoCategoria4);
        lblFotoCategoria4.setBounds(320, 140, 80, 79);

        lblFotoCategoria6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFotoCategoria6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoCategoria6MouseClicked(evt);
            }
        });
        add(lblFotoCategoria6);
        lblFotoCategoria6.setBounds(140, 260, 80, 79);

        lblFotoCategoria7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFotoCategoria7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoCategoria7MouseClicked(evt);
            }
        });
        add(lblFotoCategoria7);
        lblFotoCategoria7.setBounds(230, 260, 80, 79);

        lblFotoCategoria8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lblFotoCategoria8);
        lblFotoCategoria8.setBounds(320, 260, 80, 79);

        lblFotoCategoria5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFotoCategoria5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoCategoria5MouseClicked(evt);
            }
        });
        add(lblFotoCategoria5);
        lblFotoCategoria5.setBounds(50, 260, 80, 79);

        lblFotoCategoria1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFotoCategoria1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoCategoria1MouseClicked(evt);
            }
        });
        add(lblFotoCategoria1);
        lblFotoCategoria1.setBounds(50, 140, 80, 79);

        btnAddProducto.setText("Añadir producto");
        btnAddProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddProductoMouseClicked(evt);
            }
        });
        add(btnAddProducto);
        btnAddProducto.setBounds(460, 620, 150, 25);
        add(lblNumero);
        lblNumero.setBounds(410, 970, 134, 41);

        jLabel8.setText("Producto seleccionado:");
        add(jLabel8);
        jLabel8.setBounds(460, 440, 150, 16);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Seleccionar categoria");
        add(jLabel9);
        jLabel9.setBounds(49, 84, 284, 29);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Seleccionar producto");
        add(jLabel10);
        jLabel10.setBounds(450, 80, 252, 29);
        add(lblProductoSeleccionado);
        lblProductoSeleccionado.setBounds(620, 440, 173, 16);

        jLabel11.setText("Precio del producto:");
        add(jLabel11);
        jLabel11.setBounds(460, 470, 115, 20);
        add(lblPrecioProducto);
        lblPrecioProducto.setBounds(590, 470, 144, 20);

        jLabel13.setText("% Descuento (añadir cliente habitual):");
        add(jLabel13);
        jLabel13.setBounds(460, 510, 220, 16);
        add(lblDescuento);
        lblDescuento.setBounds(700, 510, 102, 16);

        jLabel15.setText("Cantidad:");
        add(jLabel15);
        jLabel15.setBounds(460, 550, 55, 16);

        btnBorrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBorrar.setText("C");
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarMouseClicked(evt);
            }
        });
        add(btnBorrar);
        btnBorrar.setBounds(320, 390, 90, 110);

        btnPDesc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPDesc.setText("% Descuento");
        btnPDesc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPDescMouseClicked(evt);
            }
        });
        add(btnPDesc);
        btnPDesc.setBounds(230, 630, 180, 50);

        lblDatosCal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDatosCal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lblDatosCal);
        lblDatosCal.setBounds(230, 700, 180, 30);
        add(lblCantidad);
        lblCantidad.setBounds(530, 550, 120, 20);

        btnCantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCantidad.setText("Cantidad");
        btnCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCantidadMouseClicked(evt);
            }
        });
        add(btnCantidad);
        btnCantidad.setBounds(320, 510, 90, 50);

        jLabel12.setText("Para desbloquear descuento");
        add(jLabel12);
        jLabel12.setBounds(50, 630, 170, 16);

        jLabel14.setText("añadir cliente habitual");
        add(jLabel14);
        jLabel14.setBounds(50, 650, 150, 16);

        btnNuevoPedido.setText("Nuevo pedido");
        btnNuevoPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoPedidoMouseClicked(evt);
            }
        });
        add(btnNuevoPedido);
        btnNuevoPedido.setBounds(480, 960, 170, 30);
        add(txtEmpleado);
        txtEmpleado.setBounds(540, 580, 130, 20);

        lblFotoCafe1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblFotoCafe1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFotoCafe1.setMaximumSize(new java.awt.Dimension(50, 50));
        lblFotoCafe1.setMinimumSize(new java.awt.Dimension(50, 50));
        lblFotoCafe1.setName(""); // NOI18N
        lblFotoCafe1.setPreferredSize(new java.awt.Dimension(80, 80));
        lblFotoCafe1.setRequestFocusEnabled(false);
        lblFotoCafe1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoCafe1MouseClicked(evt);
            }
        });
        add(lblFotoCafe1);
        lblFotoCafe1.setBounds(450, 140, 80, 80);

        lblFotoCafe2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblFotoCafe2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFotoCafe2.setMaximumSize(new java.awt.Dimension(50, 50));
        lblFotoCafe2.setMinimumSize(new java.awt.Dimension(50, 50));
        lblFotoCafe2.setName(""); // NOI18N
        lblFotoCafe2.setPreferredSize(new java.awt.Dimension(80, 80));
        lblFotoCafe2.setRequestFocusEnabled(false);
        lblFotoCafe2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoCafe2MouseClicked(evt);
            }
        });
        add(lblFotoCafe2);
        lblFotoCafe2.setBounds(540, 140, 80, 80);

        lblFotoCafe3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblFotoCafe3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFotoCafe3.setMaximumSize(new java.awt.Dimension(50, 50));
        lblFotoCafe3.setMinimumSize(new java.awt.Dimension(50, 50));
        lblFotoCafe3.setName(""); // NOI18N
        lblFotoCafe3.setPreferredSize(new java.awt.Dimension(80, 80));
        lblFotoCafe3.setRequestFocusEnabled(false);
        lblFotoCafe3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoCafe3MouseClicked(evt);
            }
        });
        add(lblFotoCafe3);
        lblFotoCafe3.setBounds(630, 140, 80, 80);

        lblFotoCafe4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblFotoCafe4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFotoCafe4.setMaximumSize(new java.awt.Dimension(50, 50));
        lblFotoCafe4.setMinimumSize(new java.awt.Dimension(50, 50));
        lblFotoCafe4.setName(""); // NOI18N
        lblFotoCafe4.setPreferredSize(new java.awt.Dimension(80, 80));
        lblFotoCafe4.setRequestFocusEnabled(false);
        lblFotoCafe4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoCafe4MouseClicked(evt);
            }
        });
        add(lblFotoCafe4);
        lblFotoCafe4.setBounds(720, 140, 80, 80);

        lblFotoCafe5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblFotoCafe5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFotoCafe5.setMaximumSize(new java.awt.Dimension(50, 50));
        lblFotoCafe5.setMinimumSize(new java.awt.Dimension(50, 50));
        lblFotoCafe5.setName(""); // NOI18N
        lblFotoCafe5.setPreferredSize(new java.awt.Dimension(80, 80));
        lblFotoCafe5.setRequestFocusEnabled(false);
        lblFotoCafe5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoCafe5MouseClicked(evt);
            }
        });
        add(lblFotoCafe5);
        lblFotoCafe5.setBounds(450, 260, 80, 80);

        lblFotoCafe6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblFotoCafe6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFotoCafe6.setMaximumSize(new java.awt.Dimension(50, 50));
        lblFotoCafe6.setMinimumSize(new java.awt.Dimension(50, 50));
        lblFotoCafe6.setName(""); // NOI18N
        lblFotoCafe6.setPreferredSize(new java.awt.Dimension(80, 80));
        lblFotoCafe6.setRequestFocusEnabled(false);
        lblFotoCafe6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoCafe6MouseClicked(evt);
            }
        });
        add(lblFotoCafe6);
        lblFotoCafe6.setBounds(540, 260, 80, 80);

        lblFotoCafe7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblFotoCafe7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFotoCafe7.setMaximumSize(new java.awt.Dimension(50, 50));
        lblFotoCafe7.setMinimumSize(new java.awt.Dimension(50, 50));
        lblFotoCafe7.setName(""); // NOI18N
        lblFotoCafe7.setPreferredSize(new java.awt.Dimension(80, 80));
        lblFotoCafe7.setRequestFocusEnabled(false);
        lblFotoCafe7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoCafe7MouseClicked(evt);
            }
        });
        add(lblFotoCafe7);
        lblFotoCafe7.setBounds(630, 260, 80, 80);

        lblFotoCafe08.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblFotoCafe08.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFotoCafe08.setMaximumSize(new java.awt.Dimension(50, 50));
        lblFotoCafe08.setMinimumSize(new java.awt.Dimension(50, 50));
        lblFotoCafe08.setName(""); // NOI18N
        lblFotoCafe08.setPreferredSize(new java.awt.Dimension(80, 80));
        lblFotoCafe08.setRequestFocusEnabled(false);
        lblFotoCafe08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoCafe08MouseClicked(evt);
            }
        });
        add(lblFotoCafe08);
        lblFotoCafe08.setBounds(720, 260, 80, 80);
        add(lblCat1);
        lblCat1.setBounds(50, 230, 80, 20);
        add(lblCat2);
        lblCat2.setBounds(140, 230, 80, 20);
        add(lblCat3);
        lblCat3.setBounds(230, 230, 80, 20);
        add(lblCat4);
        lblCat4.setBounds(320, 230, 80, 20);
        add(lblCat5);
        lblCat5.setBounds(50, 350, 80, 20);
        add(lblCat6);
        lblCat6.setBounds(140, 350, 80, 20);
        add(lblCat7);
        lblCat7.setBounds(230, 350, 80, 20);
        add(lblCat8);
        lblCat8.setBounds(320, 350, 80, 20);
        add(lblprod1);
        lblprod1.setBounds(450, 230, 80, 20);
        add(lblprod2);
        lblprod2.setBounds(540, 230, 80, 20);
        add(lblprod3);
        lblprod3.setBounds(630, 230, 80, 20);
        add(lblprod4);
        lblprod4.setBounds(720, 230, 80, 20);
        add(lblprod5);
        lblprod5.setBounds(450, 350, 80, 20);
        add(lblprod6);
        lblprod6.setBounds(540, 350, 80, 20);
        add(lblprod7);
        lblprod7.setBounds(630, 350, 80, 20);
        add(lblprod8);
        lblprod8.setBounds(720, 350, 80, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCal27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCal27ActionPerformed
    }//GEN-LAST:event_btnCal27ActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        
    }//GEN-LAST:event_btnAtrasActionPerformed
    /**
     * Botón para volver al menu principal
     * @param evt 
     */
    private void btnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseClicked
        frame.atras();
    }//GEN-LAST:event_btnAtrasMouseClicked
    /**
     * Botón que elimina todos los datos del pedido introducidos anteriormente.
     * @param evt 
     */
    private void btnEliminarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProductoMouseClicked
        acciones.borrarPedidoEnCurso();
    }//GEN-LAST:event_btnEliminarProductoMouseClicked

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    /**
     * Label que añade en todos los labels de los productos los productos correspondientes
     * a su categoria.
     * @param evt 
     */
    
    private void lblFotoCategoria3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoCategoria3MouseClicked
        acciones.quitarProductos();
        String categoriaSeleccionada = getLblCat3().getText();
        setCategoriaClicada(categoriaSeleccionada);
        acciones.asignarProducto();
        

    }//GEN-LAST:event_lblFotoCategoria3MouseClicked
    /**
     * Label que añade en todos los labels de los productos los productos correspondientes
     * a su categoria.
     * @param evt 
     */
    private void lblFotoCategoria4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoCategoria4MouseClicked
        acciones.quitarProductos();
        String categoriaSeleccionada = getLblCat4().getText();
        setCategoriaClicada(categoriaSeleccionada);
        acciones.asignarProducto();

    }//GEN-LAST:event_lblFotoCategoria4MouseClicked
    /**
     * Label que añade en todos los labels de los productos los productos correspondientes
     * a su categoria.
     * @param evt 
     */
    private void lblFotoCategoria1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoCategoria1MouseClicked
        acciones.quitarProductos();
        String categoriaSeleccionada = getLblCat1().getText();
        setCategoriaClicada(categoriaSeleccionada);
        acciones.asignarProducto();
        
//



    }//GEN-LAST:event_lblFotoCategoria1MouseClicked
    /**
     * Label que añade en todos los labels de los productos los productos correspondientes
     * a su categoria.
     * @param evt 
     */
    private void lblFotoCategoria2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoCategoria2MouseClicked
        acciones.quitarProductos();
        String categoriaSeleccionada = getLblCat2().getText();
        setCategoriaClicada(categoriaSeleccionada);
        acciones.asignarProducto();

    }//GEN-LAST:event_lblFotoCategoria2MouseClicked
    /**
     * Label que añade en todos los labels de los productos los productos correspondientes
     * a su categoria.
     * @param evt 
     */
    private void lblFotoCategoria5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoCategoria5MouseClicked
        acciones.quitarProductos();
        String categoriaSeleccionada = getLblCat5().getText();
        setCategoriaClicada(categoriaSeleccionada);
        acciones.asignarProducto();

    }//GEN-LAST:event_lblFotoCategoria5MouseClicked
    /**
     * Label que añade en todos los labels de los productos los productos correspondientes
     * a su categoria.
     * @param evt 
     */
    private void lblFotoCategoria6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoCategoria6MouseClicked
        acciones.quitarProductos();
        String categoriaSeleccionada = getLblCat6().getText();
        setCategoriaClicada(categoriaSeleccionada);
        acciones.asignarProducto();

    }//GEN-LAST:event_lblFotoCategoria6MouseClicked
    /**
     * Label que añade en todos los labels de los productos los productos correspondientes
     * a su categoria.
     * @param evt 
     */
    private void lblFotoCategoria7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoCategoria7MouseClicked
        acciones.quitarProductos();
        String categoriaSeleccionada = getLblCat7().getText();
        setCategoriaClicada(categoriaSeleccionada);
        acciones.asignarProducto();

    }//GEN-LAST:event_lblFotoCategoria7MouseClicked
    /**
     * Añade "1" a un String llamado numero que se utilizara para calcular
     * @param evt 
     */
    private void btnCal23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCal23MouseClicked
        numeros = numeros + "1";
        setLblDatosCal(numeros);
    }//GEN-LAST:event_btnCal23MouseClicked
    /**
     * Añade "0" a un String llamado numero que se utilizara para calcular
     * @param evt 
     */
    private void btnCal26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCal26MouseClicked
        numeros = numeros + "0";
        setLblDatosCal(numeros);
    }//GEN-LAST:event_btnCal26MouseClicked
    /**
     * boton que guarda el numero escrito hasta el momento y lo añade en el 
     * label de descuento.
     * @param evt 
     */
    private void btnPDescMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDescMouseClicked
        setLblDescuento(getLblDatosCal().getText());
        acciones.eliminarDatosCal();
    }//GEN-LAST:event_btnPDescMouseClicked
    /**
     * Añade "2" a un String llamado numero que se utilizara para calcular
     * @param evt 
     */
    private void btnCal25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCal25MouseClicked
        numeros = numeros + "2";
        setLblDatosCal(numeros);
    }//GEN-LAST:event_btnCal25MouseClicked
    /**
     * Añade "3" a un String llamado numero que se utilizara para calcular
     * @param evt 
     */
    private void btnCal22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCal22MouseClicked
        numeros = numeros + "3";
        setLblDatosCal(numeros);
    }//GEN-LAST:event_btnCal22MouseClicked
    /**
     * Añade "4" a un String llamado numero que se utilizara para calcular
     * @param evt 
     */
    private void btnCal20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCal20MouseClicked
        numeros = numeros + "4";
        setLblDatosCal(numeros);
    }//GEN-LAST:event_btnCal20MouseClicked
    /**
     * Añade "5" a un String llamado numero que se utilizara para calcular
     * @param evt 
     */
    private void btnCal24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCal24MouseClicked
        numeros = numeros + "5";
        setLblDatosCal(numeros);
    }//GEN-LAST:event_btnCal24MouseClicked
    /**
     * Añade "6" a un String llamado numero que se utilizara para calcular
     * @param evt 
     */
    private void btnCal21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCal21MouseClicked
        numeros = numeros + "6";
        setLblDatosCal(numeros);
    }//GEN-LAST:event_btnCal21MouseClicked
    /**
     * Añade "7" a un String llamado numero que se utilizara para calcular
     * @param evt 
     */
    private void btnCal27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCal27MouseClicked
        numeros = numeros + "7";
        setLblDatosCal(numeros);
    }//GEN-LAST:event_btnCal27MouseClicked
    /**
     * Añade "8" a un String llamado numero que se utilizara para calcular
     * @param evt 
     */
    private void btnCal28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCal28MouseClicked
        numeros = numeros + "8";
        setLblDatosCal(numeros);
    }//GEN-LAST:event_btnCal28MouseClicked
    /**
     * Añade "9" a un String llamado numero que se utilizara para calcular
     * @param evt 
     */
    private void btnCal29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCal29MouseClicked
        numeros = numeros + "9";
        setLblDatosCal(numeros);
    }//GEN-LAST:event_btnCal29MouseClicked
    /**
     * boton que borra el numero escrito en la calculadora
     * @param evt 
     */
    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
        numeros = "";
        setLblDatosCal(numeros);
    }//GEN-LAST:event_btnBorrarMouseClicked
    /**
     * Añade todos los datos a la tabla, a la base de datos y borra los datos 
     * escritos en los labels
     * @param evt 
     */
    private void btnAddProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddProductoMouseClicked
        acciones.añadirATabla();
        pedido.savePedido();
        acciones.total();
        acciones.borrarPedidoEnCurso();

        
        
    }//GEN-LAST:event_btnAddProductoMouseClicked
    /**
     * Comprueba en la base de datos si el numero del cliente que se ha introducido
     * existe
     * @param evt 
     */
    private void btnDescuentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDescuentoMouseClicked
        acciones.comprobarCliente();
        acciones.eliminarDatosCal();
    }//GEN-LAST:event_btnDescuentoMouseClicked

    private void btnCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCantidadMouseClicked
        setLblCantidad(getLblDatosCal().getText());
        acciones.eliminarDatosCal();
    }//GEN-LAST:event_btnCantidadMouseClicked

    private void btnNuevoPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoPedidoMouseClicked
        acciones.nuevoPedido(tblPedidos);
    }//GEN-LAST:event_btnNuevoPedidoMouseClicked

    private void lblFotoCafe1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoCafe1MouseClicked
        acciones.mostrarPrecioProducto();
        setLblPrecioProducto(acciones.getPrecioproducto(1));
        String nombre = getLblprod1().getText();
        setLblProductoSeleccionado(nombre);
    }//GEN-LAST:event_lblFotoCafe1MouseClicked

    private void lblFotoCafe2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoCafe2MouseClicked
        acciones.mostrarPrecioProducto();
        setLblPrecioProducto(acciones.getPrecioproducto(2));
        String nombre = getLblprod2().getText();
        setLblProductoSeleccionado(nombre);
    }//GEN-LAST:event_lblFotoCafe2MouseClicked

    private void lblFotoCafe3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoCafe3MouseClicked
        acciones.mostrarPrecioProducto();
        setLblPrecioProducto(acciones.getPrecioproducto(3));
        String nombre = getLblprod3().getText();
        setLblProductoSeleccionado(nombre);
    }//GEN-LAST:event_lblFotoCafe3MouseClicked

    private void lblFotoCafe4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoCafe4MouseClicked
        acciones.mostrarPrecioProducto();
        setLblPrecioProducto(acciones.getPrecioproducto(4));
        String nombre = getLblprod4().getText();
        setLblProductoSeleccionado(nombre);
    }//GEN-LAST:event_lblFotoCafe4MouseClicked

    private void lblFotoCafe5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoCafe5MouseClicked
        acciones.mostrarPrecioProducto();
        setLblPrecioProducto(acciones.getPrecioproducto(5));
        String nombre = getLblprod5().getText();
        setLblProductoSeleccionado(nombre);
    }//GEN-LAST:event_lblFotoCafe5MouseClicked

    private void lblFotoCafe6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoCafe6MouseClicked
        acciones.mostrarPrecioProducto();
        setLblPrecioProducto(acciones.getPrecioproducto(6));
        String nombre = getLblprod6().getText();
        setLblProductoSeleccionado(nombre);
    }//GEN-LAST:event_lblFotoCafe6MouseClicked

    private void lblFotoCafe7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoCafe7MouseClicked
        acciones.mostrarPrecioProducto();
        setLblPrecioProducto(acciones.getPrecioproducto(7));
        String nombre = getLblprod7().getText();
        setLblProductoSeleccionado(nombre);
    }//GEN-LAST:event_lblFotoCafe7MouseClicked

    private void lblFotoCafe08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoCafe08MouseClicked
        acciones.mostrarPrecioProducto();
        setLblPrecioProducto(acciones.getPrecioproducto(8));
        String nombre = getLblprod8().getText();
        setLblProductoSeleccionado(nombre);
    }//GEN-LAST:event_lblFotoCafe08MouseClicked

    public JButton getBtnFinalizarPedido() {
        return btnNuevoPedido;
    }

    public void setBtnFinalizarPedido(JButton btnFinalizarPedido) {
        this.btnNuevoPedido = btnFinalizarPedido;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProducto;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCal20;
    private javax.swing.JButton btnCal21;
    private javax.swing.JButton btnCal22;
    private javax.swing.JButton btnCal23;
    private javax.swing.JButton btnCal24;
    private javax.swing.JButton btnCal25;
    private javax.swing.JButton btnCal26;
    private javax.swing.JButton btnCal27;
    private javax.swing.JButton btnCal28;
    private javax.swing.JButton btnCal29;
    private javax.swing.JButton btnCantidad;
    private javax.swing.JButton btnDescuento;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnNuevoPedido;
    private javax.swing.JButton btnPDesc;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCat1;
    private javax.swing.JLabel lblCat2;
    private javax.swing.JLabel lblCat3;
    private javax.swing.JLabel lblCat4;
    private javax.swing.JLabel lblCat5;
    private javax.swing.JLabel lblCat6;
    private javax.swing.JLabel lblCat7;
    private javax.swing.JLabel lblCat8;
    private javax.swing.JLabel lblDatosCal;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblFotoCafe08;
    private javax.swing.JLabel lblFotoCafe1;
    private javax.swing.JLabel lblFotoCafe2;
    private javax.swing.JLabel lblFotoCafe3;
    private javax.swing.JLabel lblFotoCafe4;
    private javax.swing.JLabel lblFotoCafe5;
    private javax.swing.JLabel lblFotoCafe6;
    private javax.swing.JLabel lblFotoCafe7;
    private javax.swing.JLabel lblFotoCategoria1;
    private javax.swing.JLabel lblFotoCategoria2;
    private javax.swing.JLabel lblFotoCategoria3;
    private javax.swing.JLabel lblFotoCategoria4;
    private javax.swing.JLabel lblFotoCategoria5;
    private javax.swing.JLabel lblFotoCategoria6;
    private javax.swing.JLabel lblFotoCategoria7;
    private javax.swing.JLabel lblFotoCategoria8;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPrecioProducto;
    private javax.swing.JLabel lblProductoSeleccionado;
    private javax.swing.JLabel lblprod1;
    private javax.swing.JLabel lblprod2;
    private javax.swing.JLabel lblprod3;
    private javax.swing.JLabel lblprod4;
    private javax.swing.JLabel lblprod5;
    private javax.swing.JLabel lblprod6;
    private javax.swing.JLabel lblprod7;
    private javax.swing.JLabel lblprod8;
    private javax.swing.JScrollPane panelTabla;
    public javax.swing.JTable tblPedidos;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
