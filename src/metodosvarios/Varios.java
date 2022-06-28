/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosvarios;

import java.awt.Color;

/**
 
 * @author 
 */
public class Varios {
    
     public void borracaja(javax.swing.JTextField myy,java.awt.event.KeyEvent evt){
    int clavetecla=evt.getExtendedKeyCode();
    String my=myy.getText();
    if(my.isEmpty()){
        int cajavacia=7;
    }
    if(clavetecla==127){
        myy.setText(null);
    }
   }
    
    // para convertir una cadena de texto a mayuscula devuelve un string
   public String mayus(String my){
       return my.toUpperCase();
   }
   
   // para convertir una cadena de texto a minuscula devuelve un string
   public String minuscula(String mn){
       return mn.toLowerCase();
   }
   
  
   //para que en la misma caja de texto se convierta en mayuscula con ayuda de un evento KeyReleased
   public void mayuscula(javax.swing.JTextField myy){
     myy.setText(myy.getText().toUpperCase());  
   }
   
   //para que en la misma caja de texto se convierta en minuscula con ayuda de un evento KeyReleased
   public void minuscula(javax.swing.JTextField mnn){
     mnn.setText(mnn.getText().toUpperCase());
    
   }
  
   
   
    public double txdouble(javax.swing.JTextField td){
       double t=Double.parseDouble(td.getText());
       return t;
   }
   
   
   
   public void limcaja(javax.swing.JTextField txt,javax.swing.JLabel atri){
       txt.setText(null);
       colore(atri,3);
   }

 public void colore(javax.swing.JLabel lat,int n){
     if(n==1){
        lat.setForeground(Color.red); 
     }
     if(n==2){
         lat.setForeground(Color.GREEN);
     }
     if(n==3){
         lat.setForeground(Color.BLACK);
     }}  
 

public void txtvacio(javax.swing.JTextField txtcv,javax.swing.JLabel condicion,javax.swing.JLabel atributo){
String n=null;
    if(txtcv.getText().isEmpty()){
      atributo.setForeground(Color.red);
      condicion.setText(Integer.toString(0));
      n=null;
  }
    else{
        condicion.setText(Integer.toString(1));
        atributo.setForeground(Color.GREEN);
         condicion.setText(Integer.toString(1));
    }
}


   

  
}
