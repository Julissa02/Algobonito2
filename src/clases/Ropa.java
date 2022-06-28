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
public class Ropa {
    private String clave;
    private String marca;
    private String tipo_producto;
    private String descripcion;
    private String talla;
    private int cantidad_existente;
    private double precio;

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the tipo_producto
     */
    public String getTipo_producto() {
        return tipo_producto;
    }

    /**
     * @param tipo_producto the tipo_producto to set
     */
    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the talla
     */
    public String getTalla() {
        return talla;
    }

    /**
     * @param talla the talla to set
     */
    public void setTalla(String talla) {
        this.talla = talla;
    }

    /**
     * @return the cantidad_existente
     */
    public int getCantidad_existente() {
        return cantidad_existente;
    }

    /**
     * @param cantidad_existente the cantidad_existente to set
     */
    public void setCantidad_existente(int cantidad_existente) {
        this.cantidad_existente = cantidad_existente;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
  
    
    public Ropa(){
        
    }
    
    public Ropa( String clave,String marca,String tipo_producto,String descripcion,String talla,int cantidad_existente,double precio) {
     this.clave=clave;
     this.marca=marca;
     this. tipo_producto=tipo_producto;
     this.descripcion=descripcion;
     this. talla = talla;
     this. cantidad_existente = cantidad_existente;
     this.precio = precio;
    
}
               }
