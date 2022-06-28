/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesmetodos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import metodosvarios.Conexion;
import clases.Agregar;

/**
 *
 * @author 
 */
public class Agregar_metodos {
     Conexion con = new Conexion();
    PreparedStatement psql;
    ResultSet rsl;
  Connection cn = null;
  int r=0;
    
      public int guardar_inventario(Agregar usg){ 
      
        String sql="Call agregar_inventario(?,?,?,?,?)";
        try {
            cn=con.Conectar();
            psql=cn.prepareStatement(sql);
            psql.setString(1,usg.getId_ropa());
            psql.setInt(2,usg.getId_usuario());
            psql.setString(3,usg.getFecha());
            psql.setString(4,usg.getHora());
            psql.setInt(5,usg.getCantidad());//usg.getState());
           
            r= psql.executeUpdate();
        } catch (Exception e) {
        }
        return r;
   }
    
    
    
    
    
    
     public ArrayList<Agregar> listaragregarporfecha(String idfta){
         ArrayList listaauto= new ArrayList();
        Agregar agregar;
         
         String SentenciaSQL ="select * from agregar where fecha =(?)";
         Connection cn = null;
        

         try {
              cn=con.Conectar();
            psql=cn.prepareStatement(SentenciaSQL);
            psql.setString(1,idfta);
           
           rsl=psql.executeQuery();
             //System.out.println("resultset = "+rsl);
             while (rsl.next()){
                 agregar=new Agregar();
                 agregar.setId_ropa(rsl.getString(1));
                 agregar.setId_usuario(rsl.getInt(2));
                 agregar.setFecha(rsl.getString(3));
                 agregar.setHora(rsl.getString(4));
                  agregar.setCantidad(rsl.getInt(5));
              
                   
                 
                  
                 //System.out.println("DENTRO DEL LA LSTA DE ROPA");
                 listaauto.add(agregar);   
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

