/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev2;

import java.util.Scanner;
import java.util.Random;

public class Odev2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Random r = new Random();
       
       int i=0,max,min,s1,s2;
       
       System.out.println("Bilgisayar tutacak Max.ve Min. sayi giriniz: ");
       max=input.nextInt();
       min=input.nextInt();
       s1 = r.nextInt((max - min)+1)+min;
      
       while(true){
           System.out.println(" Sayi gir: ");
           s2=input.nextInt();
           if(s1 > s2){
               System.out.println("Daha buyuk sayi gir!");
           }else if(s1 < s2){
               System.out.println("Daha kucuk sayi gir!");
           }else{
               System.out.println("Tebrikler! Aranan sayi:" + s1);
               break;
           }
       }
       
       
       
    }
    
}
