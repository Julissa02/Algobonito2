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
public class Agregar {
    private String id_ropa;
    private String fecha;
    private String  hora;
    private int id_usuario;
    private int cantidad;

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
    
    public Agregar(){
        
    }
    public Agregar(String id_ropa,int id_usuario,String fecha,String hora,int cantidad){
        this.id_ropa=id_ropa;
        this.id_usuario=id_usuario;
        this.fecha=fecha;
        this.hora=hora;
        this.cantidad=cantidad;
    }
}
