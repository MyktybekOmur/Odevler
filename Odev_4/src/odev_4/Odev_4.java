/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev_4;

import java.util.Scanner;
import java.util.Random;
public class Odev_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int s1,s2;
        
        System.out.println("Birinci sayiyi giriniz:");
        s1 = input.nextInt();
        System.out.println("Ikinci sayiyi giriniz:");
        s2 = input.nextInt();
        
        System.out.println("Birinci sayiyi: " + s1);
        System.out.println("ikinci sayiyi: " + s2);
        
        s1 = s1^s2; 
        s2 = s1^s2; 
        s1 = s1^s2;
        
        System.out.println("Yer deyisti!");
        
        System.out.println("Birinci sayiyi: " + s1);
        System.out.println("ikinci sayiyi: " + s2);
        // TODO code application logic here
    }
    
}
