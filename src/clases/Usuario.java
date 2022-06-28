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
public class Usuario {
    private int clave_us;
   private String  nombre_completo;
    private String nombre_us;
    private String contraseña;
    private int tipo_usuario;

    /**
     * @return the clave_us
     */
    public int getClave_us() {
        return clave_us;
    }

    /**
     * @param clave_us the clave_us to set
     */
    public void setClave_us(int clave_us) {
        this.clave_us = clave_us;
    }

    /**
     * @return the nombre_completo
     */
    public String getNombre_completo() {
        return nombre_completo;
    }

    /**
     * @param nombre_completo the nombre_completo to set
     */
    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    /**
     * @return the nombre_us
     */
    public String getNombre_us() {
        return nombre_us;
    }

    /**
     * @param nombre_us the nombre_us to set
     */
    public void setNombre_us(String nombre_us) {
        this.nombre_us = nombre_us;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @return the tipo_usuario
     */
    public int getTipo_usuario() {
        return tipo_usuario;
    }

    /**
     * @param tipo_usuario the tipo_usuario to set
     */
    public void setTipo_usuario(int tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
    
   public Usuario(){
        
    }
   public Usuario(int clave_us,String nombre_completo,String nombre_us,String contraseña,int tipo_usuario){
       this.clave_us= clave_us;
       this.nombre_completo=nombre_completo;
       this.nombre_us=nombre_us;
       this.contraseña=contraseña;
       this.tipo_usuario=tipo_usuario;
       
       
   }
}
