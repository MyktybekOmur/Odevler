/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev3;

import java.util.Scanner;
public class Odev3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        
        System.out.println("Bir yil giriniz:");
        yil = input.nextInt();
        
        switch(yil%4){
            case 0:
                if(yil%100 != 0 || yil%400==0)
                {
                System.out.println("29 subat ARTIK YIL ");
                break;
                }else{
                    System.out.println("28 subat,ARTIK DEGIL100");
                    break;
                }
            default: System.out.println("28 subat,ARTIK DEGIL");
                break;
        }
        
        
    }
    
}
