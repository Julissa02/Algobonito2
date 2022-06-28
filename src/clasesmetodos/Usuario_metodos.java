/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesmetodos;

import java.sql.Connection;
import clases.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import metodosvarios.Conexion;
/**
 *
 * @author
 */
public class Usuario_metodos {
    Conexion con = new Conexion();
    PreparedStatement psql;
    ResultSet rsl;
  Connection cn = null;
  int r=0;
  
  
  public int guardar_usuario(Usuario usg){ 
      
        String sql="insert into usuario values(?,?,?,?,?)";
        try {
            cn=con.Conectar();
            psql=cn.prepareStatement(sql);
            psql.setInt(1,0);
            psql.setString(2,usg.getNombre_us());
            psql.setString(3,usg.getContraseña());
            psql.setString(4,usg.getNombre_completo());
            psql.setInt(5,usg.getTipo_usuario());//usg.getState());
           
            r= psql.executeUpdate();
        } catch (Exception e) {
        }
        return r;
   }
    
     public  Usuario usuarioTDA(String id){
         Usuario  usa=new  Usuario();
       Connection cn = null;
       
        String sql="select * from usuario where nombre_us =(?)";
        try {
             cn=con.Conectar();
            psql=cn.prepareStatement(sql);
             psql.setString(1,id);
           rsl=psql.executeQuery();
            while (rsl.next()) {
                
             usa.setClave_us(rsl.getInt(1));
             usa.setNombre_us(rsl.getString(2));
             usa.setContraseña(rsl.getString(3));
              usa.setNombre_completo(rsl.getString(4));
              usa.setTipo_usuario(rsl.getInt(5));
             
            //usa.setTipo(rsl.getString(3));
             //usa.setState(4);
            }
        } catch (Exception e) {
        }
        return usa;
    }
      public  Usuario usuarioTDAporamdin(String id){
         Usuario  usa=new  Usuario();
       Connection cn = null;
       
        String sql="select * from usuario where tipo_usuario =(?)";
        try {
             cn=con.Conectar();
            psql=cn.prepareStatement(sql);
             psql.setString(1,id);
           rsl=psql.executeQuery();
            while (rsl.next()) {
                
             usa.setClave_us(rsl.getInt(1));
             usa.setNombre_us(rsl.getString(2));
             usa.setContraseña(rsl.getString(3));
              usa.setNombre_completo(rsl.getString(4));
              usa.setTipo_usuario(rsl.getInt(5));
             
            //usa.setTipo(rsl.getString(3));
             //usa.setState(4);
            }
        } catch (Exception e) {
        }
        return usa;
    }


 public  Usuario usTDAporid(int id){
         Usuario  usa=new  Usuario();
       Connection cn = null;
       
        String sql="select * from usuario where id_usuario = (?)";
        try {
             cn=con.Conectar();
            psql=cn.prepareStatement(sql);
             psql.setInt(1,id);
           rsl=psql.executeQuery();
            while (rsl.next()) {
                
             usa.setClave_us(rsl.getInt(1));
             usa.setNombre_us(rsl.getString(2));
             usa.setContraseña(rsl.getString(3));
              usa.setNombre_completo(rsl.getString(4));
              usa.setTipo_usuario(rsl.getInt(5));
             
            //usa.setTipo(rsl.getString(3));
             //usa.setState(4);
            }
        } catch (Exception e) {
        }
        return usa;
    }
 public static void main(String [] args){
     Usuario_metodos usm= new Usuario_metodos();
    String f= usm.usTDAporid(1).getNombre_completo();
     System.out.println("nomre" +f);
 }
}
