/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesmetodos;

import clases.Apartado;
import clases.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import metodosvarios.Conexion;

/**
 *
 * @author
 */
public class Apartado_metodos {
     Conexion con = new Conexion();
    PreparedStatement psql;
    ResultSet rsl;
  Connection cn = null;
  int r=0;
    
    public int modifica_estado_apartado(Apartado apt){ 
      
        String sql="update apartado set estado_apar =(?) where id_apartado =(?)";
        try {
            cn=con.Conectar();
            psql=cn.prepareStatement(sql);
            psql.setInt(1,apt.getEstado_apartado());
            psql.setString(2,apt.getId_apartado());
            
                   
                   
            r= psql.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("DETALLE AL GUARDAR APARTADO"+e);
        }
        return r;
   }
  
  
      public int guardar_apartado(Apartado apt){ 
      
        String sql="insert into apartado values (?,?,?,?,?,?,?,?)";
        try {
            cn=con.Conectar();
            psql=cn.prepareStatement(sql);
            psql.setString(1,apt.getId_apartado());
             psql.setInt(2,apt.getId_usuario());
              psql.setInt(3,apt.getId_cliente());
               psql.setString(4,apt.getFecha_inicio());
                psql.setString(5,apt.getFecha_fin());
                 psql.setString(6,apt.getHora());
                  psql.setDouble(7,apt.getTotal_apartado());
                   psql.setInt(8,apt.getEstado_apartado());
                   
            r= psql.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("DETALLE AL GUARDAR APARTADO"+e);
        }
        return r;
   }
      
  public int guardar_cientes(Apartado apt){ 
      
        String sql="insert into clientes values (?,?,?,?,?)";
        try {
            cn=con.Conectar();
            psql=cn.prepareStatement(sql);
            psql.setInt(1,apt.getId_cliente());
             psql.setString(2,apt.getNombre_c());
               psql.setString(3,apt.getAp_c());
                psql.setString(4,apt.getAm_c());
                 psql.setString(5,apt.getTelefono_c());
                
                   
            r= psql.executeUpdate();
        } catch (Exception e) {
        }
        return r;
   }    
      
     public int guardardetalle_apartado(Apartado apt){ 
      
        String sql="call detalle_apartado(?,?,?)";
        try {
            cn=con.Conectar();
            psql=cn.prepareStatement(sql);
            psql.setString(1,apt.getId_apartado());
               psql.setString(2,apt.getId_ropa());
                psql.setInt(3,apt.getCantidad_apartado());
               
                   
            r= psql.executeUpdate();
        } catch (Exception e) {
        }
        return r;
   }
     //////
         public ArrayList<Apartado> apartadodeporfecha(String idfta){
         ArrayList listaauto= new ArrayList();
        Apartado apde;
         
         String SentenciaSQL ="SELECT apartado.id_apartado,detalle_apartado.id_ropa,detalle_apartado.cantidad_apartado from apartado,detalle_apartado  where apartado.id_apartado =detalle_apartado.id_apartado and apartado.fecha_inicio =(?)";
         Connection cn = null;
        

         try {
              cn=con.Conectar();
            psql=cn.prepareStatement(SentenciaSQL);
            psql.setString(1,idfta);
           
           rsl=psql.executeQuery();
             //System.out.println("resultset = "+rsl);
             while (rsl.next()){
                 apde=new Apartado();
                 
                apde.setId_apartado(rsl.getString(1));
                apde.setId_ropa(rsl.getString(2));
                apde.setCantidad_apartado(rsl.getInt(3));
     
                 //System.out.println("DENTRO DEL LA LSTA DE ROPA");
                 listaauto.add(apde);   
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

     ///////
     
         public int pagos_apartado(Apartado apt){ 
      
        String sql="insert into pago_apartado values (?,?,?,?)";
        try {
            cn=con.Conectar();
            psql=cn.prepareStatement(sql);
            psql.setString(1,apt.getId_apartado());
               psql.setDouble(2,apt.getPago_apartado());
                psql.setString(3,apt.getFecha_pago());
                 psql.setString(4,apt.getHora_pago());
                
               
                   
            r= psql.executeUpdate();
        } catch (Exception e) {
            System.out.println("eror en agoaprtadp"+e);
        }
        return r;
   }
           public  Apartado pagoapartadoTDA(String id){
         Apartado apagof = new Apartado ();
       Connection cn = null;
       
        String sql="select * from pago_apartado where  id_apartado =(?)";
        try {
             cn=con.Conectar();
            psql=cn.prepareStatement(sql);
             psql.setString(1,id);
           rsl=psql.executeQuery();
            while (rsl.next()) {
                
            
               apagof.setId_apartado(rsl.getString(1));
                 apagof.setPago_apartado(rsl.getDouble(2));
                 apagof.setFecha_pago(rsl.getString(3));
                 apagof.setHora_pago(rsl.getString(4));
             
            //usa.setTipo(rsl.getString(3));
             //usa.setState(4);
            }
        } catch (Exception e) {
        }
        return apagof;
    }
           /////////////////////
            public ArrayList<Apartado> pagosporfecha(String fechapago){
         ArrayList listaauto= new ArrayList();
         Apartado apagof;
         
         String SentenciaSQL ="SELECT * FROM pago_apartado where fecha_pago =(?)";
         Connection cn = null;
        

         try {
              cn=con.Conectar();
            psql=cn.prepareStatement(SentenciaSQL);
            psql.setString(1,fechapago);
           
           rsl=psql.executeQuery();
             //System.out.println("resultset = "+rsl);
             while (rsl.next()){
                 apagof=new Apartado();
                  apagof.setId_apartado(rsl.getString(1));
                 apagof.setPago_apartado(rsl.getDouble(2));
                 apagof.setFecha_pago(rsl.getString(3));
                 apagof.setHora_pago(rsl.getString(4));
                   
                 
                 //System.out.println("DENTRO DEL LA LSTA DE ROPA");
                 listaauto.add(apagof);   
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
           
           
           
         ////
             public ArrayList<Apartado> pagosrporfecha(String idfta){
         ArrayList listaauto= new ArrayList();
        Apartado apagof;
       
         String SentenciaSQL ="select * from pago_apartado where fecha_pago =(?) or id_apartado =(?)";
         Connection cn = null;
        

         try {
              cn=con.Conectar();
            psql=cn.prepareStatement(SentenciaSQL);
            psql.setString(1,idfta);
            psql.setString(2,idfta);
           rsl=psql.executeQuery();
             //System.out.println("resultset = "+rsl);
             while (rsl.next()){
                 apagof=new  Apartado ();
                 
                 apagof.setId_apartado(rsl.getString(1));
                 apagof.setPago_apartado(rsl.getDouble(2));
                 apagof.setFecha_pago(rsl.getString(3));
                 apagof.setHora_pago(rsl.getString(4));
                 
              
                   
                 
                  
                 //System.out.println("DENTRO DEL LA LSTA DE ROPA");
                 listaauto.add(apagof);   
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

         //
          public  Apartado clientesTDA(String id){
         Apartado cliente = new Apartado ();
       Connection cn = null;
       
        String sql="select * from clientes where id_cliente =(?)";
        try {
             cn=con.Conectar();
            psql=cn.prepareStatement(sql);
             psql.setString(1,id);
           rsl=psql.executeQuery();
            while (rsl.next()) {
                
            
                 cliente.setId_cliente(rsl.getInt(1));
                 cliente.setNombre_c(rsl.getString(2));
                 cliente.setAp_c(rsl.getString(3));
                 cliente.setAm_c(rsl.getString(4));
                 cliente.setTelefono_c(rsl.getString(5));
             
            //usa.setTipo(rsl.getString(3));
             //usa.setState(4);
            }
        } catch (Exception e) {
        }
        return cliente;
    }
          //
  
             public ArrayList<Apartado> clientespor(String id){
         ArrayList listaauto= new ArrayList();
         Apartado cliente;
         
         String SentenciaSQL ="select * from clientes where id_cliente =(?) or telefono_c =(?) or ap_c =(?) or nombre_c =(?)";
         Connection cn = null;
        

         try {
              cn=con.Conectar();
            psql=cn.prepareStatement(SentenciaSQL);
            psql.setString(1,id);
            psql.setString(2,id);
            psql.setString(3,id);
            psql.setString(4,id);
            
           
           rsl=psql.executeQuery();
             //System.out.println("resultset = "+rsl);
             while (rsl.next()){
                 cliente=new Apartado();
          
                 
                 cliente.setId_cliente(rsl.getInt(1));
                 cliente.setNombre_c(rsl.getString(2));
                 cliente.setAp_c(rsl.getString(3));
                 cliente.setAm_c(rsl.getString(4));
                 cliente.setTelefono_c(rsl.getString(5));
  
                 
                 //System.out.println("DENTRO DEL LA LSTA DE ROPA");
                 listaauto.add(cliente);   
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
      
      
            public ArrayList<Apartado> apartado_todo(String id_cc,int tipoapa){
         ArrayList listaauto= new ArrayList();
         Apartado apart;
         
         String SentenciaSQL =null;
         if(tipoapa==1){
               SentenciaSQL="select * from apartado where id_cliente= (?) ";
         }
         if(tipoapa==2){
               SentenciaSQL="select * from apartado where id_apartado= (?) ";
         }
         if(tipoapa==3){
               SentenciaSQL="select * from apartado where fecha_inicio= (?) ";
         }
        
         Connection cn = null;
        

         try {
              cn=con.Conectar();
            psql=cn.prepareStatement(SentenciaSQL);
            psql.setString(1,id_cc);
           
           rsl=psql.executeQuery();
             //System.out.println("resultset = "+rsl);
             while (rsl.next()){
                 apart=new Apartado();
              
                   apart.setId_apartado(rsl.getString(1));
                    apart.setId_usuario(rsl.getInt(2));
                     apart.setId_cliente(rsl.getInt(3));
                      apart.setFecha_inicio(rsl.getString(4));
                       apart.setFecha_fin(rsl.getString(5));
                        apart.setHora(rsl.getString(6));
                         apart.setTotal_apartado(rsl.getDouble(7));
                          apart.setEstado_apartado(rsl.getInt(8));
       
                 
                 //System.out.println("DENTRO DEL LA LSTA DE ROPA");
                 listaauto.add(apart);   
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
            
             public  Apartado apartadotodoTDA(String id){
         Apartado apart = new Apartado ();
       Connection cn = null;
       
        String sql="select * from apartado where id_apartado= (?)";
        try {
             cn=con.Conectar();
            psql=cn.prepareStatement(sql);
             psql.setString(1,id);
           rsl=psql.executeQuery();
            while (rsl.next()) {
                
              apart.setId_apartado(rsl.getString(1));
                    apart.setId_usuario(rsl.getInt(2));
                     apart.setId_cliente(rsl.getInt(3));
                      apart.setFecha_inicio(rsl.getString(4));
                       apart.setFecha_fin(rsl.getString(5));
                        apart.setHora(rsl.getString(6));
                         apart.setTotal_apartado(rsl.getDouble(7));
                          apart.setEstado_apartado(rsl.getInt(8));
            //usa.setTipo(rsl.getString(3));
             //usa.setState(4);
            }
        } catch (Exception e) {
        }
        return apart;
    }
}
