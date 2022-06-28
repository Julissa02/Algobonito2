/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesmetodos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import metodosvarios.Conexion;
import clases.Ropa;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author 
 */
public class Ropa_metodos {
   Conexion con = new Conexion();
    PreparedStatement psql;
    ResultSet rsl;
  Connection cn = null;
  int r=0;
  
    

   public int guardar_ropa(Ropa p){ 
      
        String sql="insert into ropa(id_ropa,marca,tipo_ropa,descripcion,talla,inventario,precio)values(?,?,?,?,?,?,?)";
        try {
            cn=con.Conectar();
            psql=cn.prepareStatement(sql);
            psql.setString(1, p.getClave());
            psql.setString(2, p.getMarca());
            psql.setString(3, p.getTipo_producto());
            psql.setString(4, p.getDescripcion());
            psql.setString(5, p.getTalla());
            psql.setInt(6, p.getCantidad_existente());
            psql.setDouble(7, p.getPrecio());
                 
            psql.executeUpdate();
        } catch (Exception e) {
        }
        return r;
   }
public Ropa ropaTDA(String id){
        Ropa pr=new Ropa();
       Connection cn = null;
       
        String sql="select * from ropa where id_ropa =(?)";
        try {
             cn=con.Conectar();
            psql=cn.prepareStatement(sql);
             psql.setString(1,id);
           rsl=psql.executeQuery();
            while (rsl.next()) {
                pr.setClave(rsl.getString(1));
                pr.setMarca(rsl.getString(2));
                pr.setTipo_producto(rsl.getString(3));
                pr.setDescripcion(rsl.getString(4));
                pr.setTalla(rsl.getString(5));
                pr.setCantidad_existente(rsl.getInt(6));
                pr.setPrecio(rsl.getDouble(7));
                
             
            }
        } catch (Exception e) {
        }
        return pr;
    }

public List lista_ropa(String id){
        String sql="select * from Ropa id_ropa =(?)";
        List<Ropa>lista=new ArrayList<>();
        try {
            cn=con.Conectar();
            psql=cn.prepareStatement(sql);
            psql.setString(1,id);
           rsl=psql.executeQuery();
            while (rsl.next()) {
                Ropa prr=new Ropa();
                prr.setClave(rsl.getString(1));
                prr.setMarca(rsl.getString(2));
                prr.setTipo_producto(rsl.getString(3));
                prr.setDescripcion(rsl.getString(4));
                prr.setTalla(rsl.getString(5));
                prr.setCantidad_existente(rsl.getInt(6));
                prr.setPrecio(rsl.getDouble(7));              
                lista.add(prr);
            }
        } catch (Exception e) {
        }
        return lista;
    }

//////////////////
   public ArrayList<Ropa> Ropatotal(String id){
         ArrayList listaauto= new ArrayList();
         Ropa ropa;
         
         String SentenciaSQL ="SELECT * FROM ROPA WHERE TIPO_ROPA =(?) or id_ropa= (?) or precio= (?)";
         Connection cn = null;
        

         try {
              cn=con.Conectar();
            psql=cn.prepareStatement(SentenciaSQL);
            psql.setString(1,id);
            psql.setString(2,id);
            psql.setString(3,id);
           rsl=psql.executeQuery();
             //System.out.println("resultset = "+rsl);
             while (rsl.next()){
                 ropa=new Ropa();
                ropa.setClave(rsl.getString(1));
                ropa.setMarca(rsl.getString(2));
                ropa.setTipo_producto(rsl.getString(3));
                ropa.setDescripcion(rsl.getString(4));
                ropa.setTalla(rsl.getString(5));
                ropa.setCantidad_existente(rsl.getInt(6));
                ropa.setPrecio(rsl.getDouble(7));    
                 
                 //System.out.println("DENTRO DEL LA LSTA DE ROPA");
                 listaauto.add(ropa);   
                  //JOptionPane.showMessageDialog(null, "SE HA GUARDADO CORRECTAMENTE");
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
   
    public ArrayList<Ropa> ropatodo(){
         ArrayList listaauto= new ArrayList();
         Ropa ropa;
         
         String SentenciaSQL ="SELECT * FROM ROPA";
         Connection cn = null;
        

         try {
              cn=con.Conectar();
            psql=cn.prepareStatement(SentenciaSQL);
          
           rsl=psql.executeQuery();
             //System.out.println("resultset = "+rsl);
             while (rsl.next()){
                 ropa=new Ropa();
                ropa.setClave(rsl.getString(1));
                ropa.setMarca(rsl.getString(2));
                ropa.setTipo_producto(rsl.getString(3));
                ropa.setDescripcion(rsl.getString(4));
                ropa.setTalla(rsl.getString(5));
                ropa.setCantidad_existente(rsl.getInt(6));
                ropa.setPrecio(rsl.getDouble(7));    
                 
                 //System.out.println("DENTRO DEL LA LSTA DE ROPA");
                 listaauto.add(ropa);                
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


  //*******Operaciones CRUD***************//  
/*
    public List listar(){
        String sql="select * from producto";
        List<Ropa>lista=new ArrayList<>();
        try {
            con=cnn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Ropa prr=new Ropa();
                prr.setClave(rs.getString(1));
                prr.setMarca(rs.getString(2));
                prr.setTipo_producto(rs.getString(3));
                prr.setDescripcion(rs.getString(4));
                prr.setTalla(rs.getString(5));
                prr.setCantidad_existente(rs.getInt(6));
                prr.setPrecio(rs.getDouble(7));                
                lista.add(prr);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    public int guardar_ropa(Ropa p){ 
      
        String sql="insert into ropa(id_ropa,marca,tipo_ropa,descripcion,talla,inventario,precio)values(?,?,?,?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, p.getClave());
            ps.setString(2, p.getMarca());
            ps.setString(3, p.getTipo_producto());
            ps.setString(4, p.getDescripcion());
            ps.setString(5, p.getTalla());
            ps.setInt(6, p.getCantidad_existente());
            ps.setDouble(7, p.getPrecio());
                 
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
        
    }
    
    
   
    /*
    public int actualizar(Producto em){
        String sql="update producto set Nombres=?, Precio=?, Stock=?, Estado=? where IdProducto=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, em.getNom());
            ps.setDouble(2, em.getPre());
            ps.setInt(3, em.getStock());
            ps.setString(4, em.getEstado());            
            ps.setInt(5, em.getId());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    public void delete(int id){
        String sql="delete from producto where IdProducto="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }*/
}
