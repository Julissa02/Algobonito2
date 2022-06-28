/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosvarios;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 
 */
public class Fecha {
    Calendar calendario = Calendar.getInstance();
     Calendar Cal = Calendar.getInstance();
    
  //ESTE METODO DEVOLVERÁ LA HORA ACTUAL DEL EQUIPO
  public String hora_completa() {
      String tiempo=null;
Date date = new Date();
if(calendario.get(Calendar.AM_PM)==0){
  tiempo=" a.m";
 }
 if(calendario.get(Calendar.AM_PM)==1){
     tiempo=" p.m";
 }
//Caso 1: obtener la hora y salida por pantalla con formato:
DateFormat hourFormat = new SimpleDateFormat("h:mm:ss");
 String f =hourFormat.format(date)+tiempo;
return f;
} 
  public void m1(){
      
  }
  
 /// metodo para devolver la fecha actual del la computadora en un string 
  public String fechaventa(){
     String day=null;
    String month=null;
    int mes=(Cal.get(Cal.MONTH) + 1);
    int dia=Cal.get(Cal.DATE );
    if(dia<=9){
        day="0"+dia;
    }
    else{
        day=Integer.toString(dia);
    }
  
    if(mes<=9){
        month="0"+mes;
    }
    else{
       month= Integer.toString(mes);
    }
   
  
      String   datev =Cal.get(Cal.YEAR)+""+ month+""+day ;
      
  return datev;
  }
  
   public String horaventa() {
Date date = new Date();
int tem=calendario.get(Calendar.AM_PM);

//Caso 1: obtener la hora y salida por pantalla con formato:
DateFormat hourFormat = new SimpleDateFormat("hmmss");
 String f =hourFormat.format(date)+tem;
return f;
} 
  
   
   
   
    public String fechaactual(){
    String day=null;
    String month=null;
    int mes=(Cal.get(Cal.MONTH) + 1);
    int dia=Cal.get(Cal.DATE );
    if(dia<=9){
        day="0"+dia;
    }
    else{
        day=Integer.toString(dia);
    }
  
    if(mes<=9){
        month="0"+mes;
    }
    else{
       month= Integer.toString(mes);
    }
   
  
      String   date = day+"/"+ month+"/"+ Cal.get(Cal.YEAR);
      
  return date;
    }
    
        public String fechaclave(){
    String day=null;
    String month=null;
    int mes=(Cal.get(Cal.MONTH) + 1);
    int dia=Cal.get(Cal.DATE );
    if(dia<=9){
        day="0"+dia;
    }
    else{
        day=Integer.toString(dia);
    }
  
    if(mes<=9){
        month="0"+mes;
    }
    else{
       month= Integer.toString(mes);
    }
   
  
      String   date =  Cal.get(Cal.YEAR)+""+ month+""+ day ;
      
  return date;
    }
    
    public void clave_venta(){
       
    }
    
    
    
    public static String cutcadena(String cade,int inicio,int fin){
    String ccadena=cade.substring(inicio, fin);

    return ccadena;
}
    
    public int  edia(String fcha){
    int ed=0;
  
    ed= Integer.parseInt(cutcadena(fcha,0,2));
    return ed;
}
public int  emes(String fcha){
    int ed=0;
  
    ed= Integer.parseInt(cutcadena(fcha,3,5));
    return ed;
}
public int  eaño(String fcha){
    int ed=0;
  
    ed= Integer.parseInt(cutcadena(fcha,6,10));
    return ed;
}
    public static void main(String args[]){
        Fecha fc= new Fecha();
        System.out.println("gaga"+ fc.horaventa());
       
                
    }

    
}
