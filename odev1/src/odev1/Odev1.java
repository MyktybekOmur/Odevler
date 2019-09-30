/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev1;

import java.util.Scanner;
/**
 *
 * @author Myktybek
 */
public class Odev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        String k_giris;
        int i;
        Scanner s = new Scanner(System.in);
 
        k_giris = s.next();
        if(k_giris.equals("a") || k_giris.equals("A")) 
            for(i=0; i<10; i++)
            System.out.println(i);
        else if(k_giris.equals("d") || k_giris.equals("D")) 
            for(i=9; i>=0; i--)
            System.out.println(i);
        else System.out.println("Hatali giris");
    
    }
    
}
