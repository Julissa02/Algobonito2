/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesmetodos;

import clases.Ropa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import metodosvarios.Conexion;
import clases.Venta;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Venta_metodos {
      Conexion con = new Conexion();
    PreparedStatement psql;
    ResultSet rsl;
  Connection cn = null;
  int r=0;
  
  public int guardar_venta(Venta vnt){ 
   
        String sql="insert into ventas values(?,?,?,?,?)";
        try {
            cn=con.Conectar();
            psql=cn.prepareStatement(sql);
            
            psql.setString(1,vnt.getId_venta());
            psql.setInt(2,vnt.getId_usuario());
             psql.setString(3,vnt.getFecha());
              psql.setString(4,vnt.getHora());
            psql.setString(5,vnt.getTotal_venta());
           
           
            r= psql.executeUpdate();
        } catch (Exception e) {
        }
        return r;
   }
  
  
  
      public int guardar_detalleventa(Venta dvnt){ 
   
        String sql="call detalle_venta(?,?,?)";
        try {
            cn=con.Conectar();
            psql=cn.prepareStatement(sql);
            
            psql.setString(1,dvnt.getId_venta());
            psql.setString(2,dvnt.getId_ropa());
             psql.setInt(3,dvnt.getCantidad());
          
            r= psql.executeUpdate();
        } catch (Exception e) {
        }
        return r;
   }
      
      //////////////////
        public ArrayList<Venta> ventastotal(String fechaventa){
         ArrayList listaauto= new ArrayList();
         Venta venta;
         
         String SentenciaSQL ="SELECT * FROM ventas where fecha =(?)";
         Connection cn = null;
        

         try {
              cn=con.Conectar();
            psql=cn.prepareStatement(SentenciaSQL);
            psql.setString(1,fechaventa);
           
           rsl=psql.executeQuery();
             //System.out.println("resultset = "+rsl);
             while (rsl.next()){
                 venta=new Venta();
                 venta.setId_venta(rsl.getString(1));
                 venta.setId_usuario(rsl.getInt(2));
                 venta.setFecha(rsl.getString(3));
                 venta.setHora(rsl.getString(4));
                 venta.setTotal_venta(rsl.getString(5));
                   
                 
                 //System.out.println("DENTRO DEL LA LSTA DE ROPA");
                 listaauto.add(venta);   
                 // JOptionPane.showMessageDialog(null, "SE HA GUARDADO CORRECTAMENTE");
             }            
         }catch(SQLException e){
             System.err.println(e);            
        }
         finally {
             try {
                 if (cn != null) {
                     con.cerrar();
                 }
             } catch (SQLException ex) {
 
                JOptionPane.showMessageDialog(null, "Error al intentar cerrar la conexión:\n"
                        + ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);
            }
       }
         return listaauto;        
   }
        /////////////777
         public ArrayList<Venta> ventasDetalleventa(String idfventa){
         ArrayList listaauto= new ArrayList();
         Venta venta;
         
         String SentenciaSQL ="SELECT * FROM detalle_ventas where id_venta =(?)";
         Connection cn = null;
        

         try {
              cn=con.Conectar();
            psql=cn.prepareStatement(SentenciaSQL);
            psql.setString(1,idfventa);
           
           rsl=psql.executeQuery();
             //System.out.println("resultset = "+rsl);
             while (rsl.next()){
                 venta=new Venta();
                 venta.setId_venta(rsl.getString(1));
                 venta.setId_ropa(rsl.getString(2));
                 venta.setCantidad(rsl.getInt(3));
                 
                   
                 
                 //System.out.println("DENTRO DEL LA LSTA DE ROPA");
                 listaauto.add(venta);   
                 // JOptionPane.showMessageDialog(null, "SE HA GUARDADO CORRECTAMENTE");
             }            
         }catch(SQLException e){
             System.err.println(e);            
        }
         finally {
             try {
                 if (cn != null) {
                     con.cerrar();
                 }
             } catch (SQLException ex) {
 
                JOptionPane.showMessageDialog(null, "Error al intentar cerrar la conexión:\n"
                        + ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);
            }
       }
         return listaauto;        
   }
         
         
  ////////////////
            public ArrayList<Venta> ventasDetalleventaporfecha(String idfventa){
         ArrayList listaauto= new ArrayList();
         Venta venta;
         
         String SentenciaSQL ="SELECT ventas.id_venta,detalle_ventas.id_ropa,detalle_ventas.cantidad_venta from ventas,detalle_ventas  where ventas.id_venta =detalle_ventas.id_venta and ventas.fecha =(?)";
         Connection cn = null;
        

         try {
              cn=con.Conectar();
            psql=cn.prepareStatement(SentenciaSQL);
            psql.setString(1,idfventa);
           
           rsl=psql.executeQuery();
             //System.out.println("resultset = "+rsl);
             while (rsl.next()){
                 venta=new Venta();
                 venta.setId_venta(rsl.getString(1));
                 venta.setId_ropa(rsl.getString(2));
                 venta.setCantidad(rsl.getInt(3));
                 
                   
                 
                 //System.out.println("DENTRO DEL LA LSTA DE ROPA");
                 listaauto.add(venta);   
                 // JOptionPane.showMessageDialog(null, "SE HA GUARDADO CORRECTAMENTE");
             }            
         }catch(SQLException e){
             System.err.println(e);            
        }
         finally {
             try {
                 if (cn != null) {
                     con.cerrar();
                 }
             } catch (SQLException ex) {
 
                JOptionPane.showMessageDialog(null, "Error al intentar cerrar la conexión:\n"
                        + ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);
            }
       }
         return listaauto;        
   }
}
