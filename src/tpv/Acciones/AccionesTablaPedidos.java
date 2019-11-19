/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpv.Acciones;

import LOSPANELES.PanelTablaPedidos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import tpv.bd.gestionSQL;

/**
 *
 * @author Ivan
 */
public class AccionesTablaPedidos {
    
    private PanelTablaPedidos panel;

    public AccionesTablaPedidos(PanelTablaPedidos panel) {
        this.panel = panel;
    }
    
    
    
    
    public void activaTabla(){
        try{
            
            DefaultTableModel modelo = new DefaultTableModel();
            panel.getTblPedidos().setModel(modelo);            
            PreparedStatement ps = null;
            ResultSet rs = null;
            gestionSQL conn = new gestionSQL();
            Connection con = conn.openConnection();
            
            String sql = "SELECT * FROM pedidos";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("id");
            modelo.addColumn("cantidad");
            modelo.addColumn("descripcion");
            modelo.addColumn("descuento");
            modelo.addColumn("precio");
            modelo.addColumn("subtotal");
            modelo.addColumn("empleado");
            modelo.addColumn("fecha");

            
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
