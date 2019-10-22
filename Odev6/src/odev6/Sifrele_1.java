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

public class Sifrele_1 {
    String mesaj,sifreli_mesaj="";
    //char[] sifreli_mesaj=new char[50];
    int number,k=6;
    
    String sifrele(){
      for(int i=0; i<mesaj.length(); i++){
          
          if(mesaj.charAt(i)>='A' && mesaj.charAt(i)<='Z'){
              if(mesaj.charAt(i)>'T'){
                  number = 'A' +( k - ('Z' - mesaj.charAt(i)));
                  sifreli_mesaj += (char)number;
                  //sifreli_mesaj += mesaj.replace(mesaj.charAt(i), (char)('A' +( k - ('Z' - mesaj.charAt(i)))));
              }else{
                  number = mesaj.charAt(i) + k;
                  sifreli_mesaj += (char)number;
                  //sifreli_mesaj += mesaj.replace(mesaj.charAt(i), (char)(mesaj.charAt(i) + k));
              }
          }else if(mesaj.charAt(i)>='a' && mesaj.charAt(i)<='z'){
              if(mesaj.charAt(i)>'t'){
                  number = 'a' +( k - ('z' - mesaj.charAt(i)));
                  sifreli_mesaj += (char)number;
                  //sifreli_mesaj += mesaj.replace(mesaj.charAt(i), (char)('A' +( k - ('Z' - mesaj.charAt(i)))));
              }else{
                  number = mesaj.charAt(i) + k;
                  sifreli_mesaj += (char)number;
                  //sifreli_mesaj += mesaj.replace(mesaj.charAt(i), (char)(mesaj.charAt(i) + k));
              }
          }else{
             sifreli_mesaj +=mesaj.charAt(i);
          }
      }        
        return sifreli_mesaj;
    }
    
    
    
}
