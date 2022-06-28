/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import clases.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 
 */
public class Otros {

 Calendar Cal = Calendar.getInstance();
 Calendar calendario = Calendar.getInstance();

        @SuppressWarnings("empty-statement")
 public String novacio(String maay){ //convierte a mayusculas y quita espacios demas
     String may;
     if(maay!=null && !"".equals(maay)){
     String texto = maay;
       texto=texto.trim();
       texto=texto.replaceAll("\\s{2,}", " ");
       may=texto.toUpperCase();
     
     }else{
        may =""; 
     }
       return may;
   }
////
///
 public String sinespacios(String maa){
     String may="";
     if(may!=null && !"".equals(may)){
     String texto = may;
       texto=texto.trim();
       texto=texto.replaceAll("\\s{2,}", " ");

     
     }else{
        may =""; 
     }
       return may;
   }
 /////////
          public String fechaactual(){
    String day;
    String month;
    int mes=(Cal.get(Calendar.MONTH) + 1);
    int dia=Cal.get(Calendar.DATE );
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
   
  
      String   date = day+"/"+ month+"/"+ Cal.get(Calendar.YEAR);
      
  return date;
    }
          ////////
            public String hora_completa() {
      String tiempo=null;
Date date = new Date();
int thor=calendario.get(Calendar.AM_PM);
if(thor==0){
  tiempo=" A.M";
 }
 if(thor==1){
     tiempo=" P.M";
 }
//Caso 1: obtener la hora y salida por pantalla con formato:
//DateFormat hourFormat = new SimpleDateFormat("h:mm:ss");
DateFormat hourFormat = new SimpleDateFormat("h:mm");
 String f =hourFormat.format(date)+tiempo;
return f;
} 


}
