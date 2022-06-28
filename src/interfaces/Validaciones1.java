/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**
 *
 * @author 
 */
public class Validaciones1 {
       public void soloRecibeTexto(java.awt.event.KeyEvent evt, javax.swing.JTextField jt){
char c = evt.getKeyChar();
String n="ñ";
String nn="Ñ";
if ((c < 'a') || (c > 'z')){
    if ((c < 'a') || (c > 'z')){
 if ((c < 'A') || (c > 'Z')){
   if( (c != (char)KeyEvent.VK_SPACE)){
       if(n.equals(c)){
           if(nn.equals(c)){
               evt.consume();  
           }
     
       }
}   } } 


}}
       
 public void textoycero(java.awt.event.KeyEvent evt, javax.swing.JTextField jt){
char c = evt.getKeyChar();
String n="ñ";
String nn="Ñ";

if ((c < 'a') || (c > 'z')){
    if ((c < 'a') || (c > 'z')){
 if ((c < 'A') || (c > 'Z')){
   if( (c != (char)KeyEvent.VK_SPACE)){
       if(n.equals(c)){
           if(nn.equals(c)){
              
               evt.consume();  
              
           }
     
       }
}   } } 


}}
    
    
       public void corchete(java.awt.event.KeyEvent evt, javax.swing.JTextField jt){
char c = evt.getKeyChar();
String nte="/";
   if( nte.equals(c)){
       evt.consume();
   }
 }
    
        public void mm(java.awt.event.KeyEvent evt, javax.swing.JTextField jt){
char c = evt.getKeyChar();
if ((c < 'a') || (c > 'z')){
 if ((c < 'A') || (c > 'Z')){
   if( (c != (char)KeyEvent.KEY_RELEASED)){
       evt.consume();
    
}   } }  }
    
    public  void tamañocarecteres(java.awt.event.KeyEvent evt, javax.swing.JTextField jt,int lim){
if(jt.getText().length()==lim){
evt.consume();
}
}
    
   public void evento(java.awt.event.KeyEvent evt,javax.swing.JTextField jt) {
    
   }  
    
 
    //texto con mayusculas y minusculas 
   public void texto(java.awt.event.KeyEvent evt, javax.swing.JTextField jt,int n){
       soloRecibeTexto(evt,jt);
       tamañocarecteres(evt,jt,n);   
   } 
   
    public void numeros(java.awt.event.KeyEvent evt, javax.swing.JTextField jt,int n){
        tamañocarecteres(evt,jt,n);
        numero(evt,jt);
         
   } 
    
    public void numerosyletras(java.awt.event.KeyEvent evt, javax.swing.JTextField jt,int n){
        numero(evt,jt);
         soloRecibeTexto(evt,jt);
         tamañocarecteres(evt,jt,n);  
    }
    public void fecha(java.awt.event.KeyEvent evt, javax.swing.JTextField jt,int n){
       numero(evt,jt);
       tamañocarecteres(evt,jt,10);  
       corchete(evt,jt);
   } 
    
   
   
public  void numero(java.awt.event.KeyEvent evt, javax.swing.JTextField jt){
char c = evt.getKeyChar();
if ((c < '0') || (c > '9')) {
evt.consume();
}
}

public  void numeroypunto(java.awt.event.KeyEvent evt, javax.swing.JTextField jt){
char c = evt.getKeyChar();
if ((c < '0') || (c > '9')) {


}
}

   public void textoynumero(java.awt.event.KeyEvent evt, javax.swing.JTextField jt){
char c = evt.getKeyChar();

int clavetecla=evt.getExtendedKeyCode();
String n=".";


          
               if ((c < '0') || (c > '9') ) {
                   if((c > '.')){
                        evt.consume();  
                   }
              
               }
           
     
       
 


}




public void numycoma(java.awt.event.KeyEvent evt, javax.swing.JTextField jt){
String tt=null;
    char c = evt.getKeyChar();
if ((c < '0') || (c > '9')) {
    if ((c < '0') || (c > '9')) {
evt.consume();
}

}

}
   
   
   
  public String t(javax.swing.JTextField jt){
      String txt=null;
      
      
      return txt;
  }
    
    
     boolean vcurpvalidar(String cajatexto){
     Pattern p=Pattern.compile("([A-Z](A|E|I|O|U)[A-Z][A-Z][0-9][0-9][0-9][0-9][0-9][0-9](M|H)[A-Z][A-Z][A-Z][A-Z][A-Z](A|[0-9])[0-9])");
     Matcher m=p.matcher(cajatexto);
     return m.matches();
     }
      boolean vtelefono(String cajatexto){
     Pattern p=Pattern.compile("([0-9][1-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9])");
     Matcher m=p.matcher(cajatexto);
     return m.matches();
     }
      
      boolean vusuario(String cajatexto){
     Pattern p=Pattern.compile("(^(@)(?=.*[a-z])(?=.*[A-Z]).{8,10}$)");
     Matcher m=p.matcher(cajatexto);
     return m.matches();
     }
       boolean vcorreo(String cajatexto){
     Pattern p=Pattern.compile("(^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*(@gmail.com|@hotmail.com|@outlook.com))");
     Matcher m=p.matcher(cajatexto);
     return m.matches();
     }
        boolean vcontraseña(String cajatexto){
     Pattern p=Pattern.compile("(^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,10}$)");
     Matcher m=p.matcher(cajatexto);
     return m.matches();
     }
 boolean vfecha(String cajatexto){
     Pattern p=Pattern.compile("(([19][1-9][0-9]|[20][0-9][0-9]))");
     Matcher m=p.matcher(cajatexto);
     return m.matches();
     }
boolean vexpediente(String cajatexto){
     Pattern p=Pattern.compile("(([0-9]){2,9})");
     Matcher m=p.matcher(cajatexto);
     return m.matches();
     }
boolean vnombre(String cajatexto){
     Pattern p=Pattern.compile("((([Ñ]*[A-Z][Ñ]*){3,25}|([Ñ]*[A-Z][Ñ]*){3,25}[ ]([Ñ]*[A-Z][Ñ]*){2,25}|([Ñ]*[A-Z][Ñ]*){3,25}[ ]([Ñ]*[A-Z][Ñ]*){2,25}[ ]([Ñ]*[A-Z][Ñ]*){2,25}|([Ñ]*[A-Z][Ñ]*){3,25}[ ]([Ñ]*[A-Z][Ñ]*){2,25}[ ]([Ñ]*[A-Z][Ñ]*){2,25}[ ]([Ñ]*[A-Z][Ñ]*){2,25}))");
     Matcher m=p.matcher(cajatexto);
     return m.matches();
     
     }


boolean vapellidos(String cajatexto){
     Pattern p=Pattern.compile("((([Ñ]*[A-Z][Ñ]*){3,25}[ ]([Ñ]*[A-Z][Ñ]*){2,25}|([Ñ]*[A-Z][Ñ]*){3,25}[ ]([Ñ]*[A-Z][Ñ]*){2,25}[ ]([Ñ]*[A-Z][Ñ]*){2,25}|([Ñ]*[A-Z][Ñ]*){3,25}[ ]([Ñ]*[A-Z][Ñ]*){2,25}[ ]([Ñ]*[A-Z][Ñ]*){2,25}[ ]([Ñ]*[A-Z][Ñ]*){2,25}))");
     Matcher m=p.matcher(cajatexto);
     return m.matches();
     }
boolean vestado(String cajatexto){
     Pattern p=Pattern.compile("(([0-9][0-9]){1,2})");
     Matcher m=p.matcher(cajatexto);
     return m.matches();
     }

boolean vtalla(String cajatexto){
     Pattern p=Pattern.compile("(([5-9][0-9][ ](CM)|[1][0-9][1][0-9][ ](CM)))");
     Matcher m=p.matcher(cajatexto);
     return m.matches();
     }
boolean vpeso(String cajatexto){
     Pattern p=Pattern.compile("(((0.)[6-9][0-9][ ](KG)|[1-150][ ](KG)))");
     Matcher m=p.matcher(cajatexto);
     return m.matches();
     }

boolean vtemperatura(String cajatexto){
     Pattern p=Pattern.compile("(([3][6-9](°)|[3][6-9](.)[0-9](°)))");
     Matcher m=p.matcher(cajatexto);
     return m.matches();
     }

boolean vclaveemp(String cajatexto){
     Pattern p=Pattern.compile("([A-Z]([0-9]){5,8})");
     Matcher m=p.matcher(cajatexto);
     return m.matches();
     }
boolean vnumero(String cajatexto){
     Pattern p=Pattern.compile("([A-Z]([0-9]).{8})");
     Matcher m=p.matcher(cajatexto);
     return m.matches();
     }
boolean vnumerocasa(String cajatexto){
     Pattern p=Pattern.compile("(([S/N]|([0-9]){1,3}))");
     Matcher m=p.matcher(cajatexto);
     return m.matches();
     }
boolean vnumerocasainterior(String cajatexto){
     Pattern p=Pattern.compile("(([S/N]|([0-9]){1,3}|[A-Z]))");
     Matcher m=p.matcher(cajatexto);
     return m.matches();
     }
boolean vpadecimiento(String cajatexto){
     Pattern p=Pattern.compile("(([A-Z][0-9][0-9]|[A-Z][0-9][0-9][0-9]))");
     Matcher m=p.matcher(cajatexto);
     return m.matches();
     }
boolean vprocedimiento(String cajatexto){
     Pattern p=Pattern.compile("(([0-9]){3,4})");
     Matcher m=p.matcher(cajatexto);
     return m.matches();
     }


boolean vusuario2(String cajatexto){
     Pattern p=Pattern.compile("(([@]){0,1}(([A-Z]){3,25}|([A-Z]){3,25}[ ]([A-Z]){3,25}))");
     Matcher m=p.matcher(cajatexto);
     return m.matches();
     }

 
}
