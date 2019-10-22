/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev6;

/**
 *
 * @author Myktybek
 */
public class Sifre_coz {
    //Sifrele_1 sifre = new Sifrele_1();
      String mesaj,sifre_coz="";
      //char[] sifre_coz = new char[100];
      int k=6,number;
      
      String sifre_coz(){
 
          for(int i=0; i<mesaj.length(); i++){
             
          if(mesaj.charAt(i)>='A' && mesaj.charAt(i)<='Z'){
              if(mesaj.charAt(i) < 'G'){
                  number = 'Z' - ('G' - mesaj.charAt(i));
                  System.out.print(number);
                  sifre_coz += (char)number;
                 
              }else{
                  number = mesaj.charAt(i) - k;
                  
                  sifre_coz += (char)number;
                 
              }
          }else if(mesaj.charAt(i)>='a' && mesaj.charAt(i)<='z'){
              if(mesaj.charAt(i) < 'g'){
                  number = 'z' - ('g' - mesaj.charAt(i));
               
                  sifre_coz  += (char)number;
                 
              }else{
                  number = mesaj.charAt(i) - k;
                  sifre_coz += (char)number;
                 
              }
          }else{
              sifre_coz +=mesaj.charAt(i);
          }
      }        
        return sifre_coz;
      }
    
}
