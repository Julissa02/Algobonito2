/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author 
 */
public class Venta {
    private String id_venta;
    private String fecha;
    private String hora;
    private String total_venta;
      
      private int id_usuario;
      private String id_ropa;
      private int cantidad;

    /**
     * @return the id_venta
     */
    public String getId_venta() {
        return id_venta;
    }

    /**
     * @param id_venta the id_venta to set
     */
    public void setId_venta(String id_venta) {
        this.id_venta = id_venta;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the total_venta
     */
    public String getTotal_venta() {
        return total_venta;
    }

    /**
     * @param total_venta the total_venta to set
     */
    public void setTotal_venta(String total_venta) {
        this.total_venta = total_venta;
    }

    /**
     * @return the id_ropa
     */
    public String getId_ropa() {
        return id_ropa;
    }

    /**
     * @param id_ropa the id_ropa to set
     */
    public void setId_ropa(String id_ropa) {
        this.id_ropa = id_ropa;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
   
    public Venta(){
        
    }
    public Venta(String id_venta  ,String fecha , String  hora,String total_venta,String id_ropa, int cantidad,int id_usuario){
        this.id_venta=id_venta;
        this.fecha=fecha;
        this.hora=hora;
        this.total_venta=total_venta;
        this.id_ropa=id_ropa;
        this.cantidad=cantidad;
        this.id_usuario=id_usuario;
    }

    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
}
