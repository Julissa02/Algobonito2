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
public class Apartado {
    private String id_apartado;
    private int id_usuario;
    private int id_cliente;
    private String fecha_inicio;
     private String  fecha_fin;
      private String hora;
       private double total_apartado;
       private int estado_apartado;
       
       private String id_ropa;
       private int cantidad_apartado;
       
        private double pago_apartado;
         private String fecha_pago;
          private String hora_pago;
          
          private String nombre_c;
          private String ap_c;
          private String am_c;
          private String telefono_c;
                          
          

    /**
     * @return the id_apartado
     */
    public String getId_apartado() {
        return id_apartado;
    }

    /**
     * @param id_apartado the id_apartado to set
     */
    public void setId_apartado(String id_apartado) {
        this.id_apartado = id_apartado;
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
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the fecha_inicio
     */
    public String getFecha_inicio() {
        return fecha_inicio;
    }

    /**
     * @param fecha_inicio the fecha_inicio to set
     */
    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    /**
     * @return the fecha_fin
     */
    public String getFecha_fin() {
        return fecha_fin;
    }

    /**
     * @param fecha_fin the fecha_fin to set
     */
    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
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
     * @return the total_apartado
     */
    public double getTotal_apartado() {
        return total_apartado;
    }

    /**
     * @param total_apartado the total_apartado to set
     */
    public void setTotal_apartado(double total_apartado) {
        this.total_apartado = total_apartado;
    }

    /**
     * @return the estado_apartado
     */
    public int getEstado_apartado() {
        return estado_apartado;
    }

    /**
     * @param estado_apartado the estado_apartado to set
     */
    public void setEstado_apartado(int estado_apartado) {
        this.estado_apartado = estado_apartado;
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
     * @return the cantidad_apartado
     */
    public int getCantidad_apartado() {
        return cantidad_apartado;
    }

    /**
     * @param cantidad_apartado the cantidad_apartado to set
     */
    public void setCantidad_apartado(int cantidad_apartado) {
        this.cantidad_apartado = cantidad_apartado;
    }

    /**
     * @return the pago_apartado
     */
    public double getPago_apartado() {
        return pago_apartado;
    }

    /**
     * @param pago_apartado the pago_apartado to set
     */
    public void setPago_apartado(double pago_apartado) {
        this.pago_apartado = pago_apartado;
    }

    /**
     * @return the fecha_pago
     */
    public String getFecha_pago() {
        return fecha_pago;
    }

    /**
     * @param fecha_pago the fecha_pago to set
     */
    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    /**
     * @return the hora_pago
     */
    public String getHora_pago() {
        return hora_pago;
    }

    /**
     * @param hora_pago the hora_pago to set
     */
    public void setHora_pago(String hora_pago) {
        this.hora_pago = hora_pago;
    }
         
       
       public Apartado(){
           
       }
       
public Apartado( String id_apartado,int id_usuario,int id_cliente,String fecha_inicio,String  fecha_fin, String hora,double total_apartado, int estado_apartado,String id_ropa,int cantidad_apartado,double pago_apartado, String fecha_pago, String hora_pago, String nombre_c , String ap_c, String am_c , String telefono_c){
          this.id_apartado= id_apartado;
          this.id_usuario=id_usuario;
   this. id_cliente= id_cliente;
  this.fecha_inicio=fecha_inicio;
   this.fecha_fin= fecha_fin;
  this. hora=hora;
this.total_apartado= total_apartado;
      this.estado_apartado= estado_apartado;
       
       this. id_ropa=id_ropa;
    this.cantidad_apartado=cantidad_apartado;
       
       this. pago_apartado=pago_apartado;
       this. fecha_pago=fecha_pago;
       this. hora_pago= hora_pago;
       
        this.nombre_c=nombre_c;
          this.ap_c=ap_c;
           this. am_c=am_c;
         this. telefono_c=telefono_c;
       }

    /**
     * @return the nombre_c
     */
    public String getNombre_c() {
        return nombre_c;
    }

    /**
     * @param nombre_c the nombre_c to set
     */
    public void setNombre_c(String nombre_c) {
        this.nombre_c = nombre_c;
    }

    /**
     * @return the ap_c
     */
    public String getAp_c() {
        return ap_c;
    }

    /**
     * @param ap_c the ap_c to set
     */
    public void setAp_c(String ap_c) {
        this.ap_c = ap_c;
    }

    /**
     * @return the am_c
     */
    public String getAm_c() {
        return am_c;
    }

    /**
     * @param am_c the am_c to set
     */
    public void setAm_c(String am_c) {
        this.am_c = am_c;
    }

    /**
     * @return the telefono_c
     */
    public String getTelefono_c() {
        return telefono_c;
    }

    /**
     * @param telefono_c the telefono_c to set
     */
    public void setTelefono_c(String telefono_c) {
        this.telefono_c = telefono_c;
    }
       
     
      
}
