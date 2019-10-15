/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev5;

/**
 *
 * @author Myktybek
 */
import java.util.Scanner;
public class Odev5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dortgen dortgen = new Dortgen();
        DortgenPrizma prizma = new DortgenPrizma();
        int alan,perimetre,hacim;
        System.out.print("Dortgenin uzunlugu: ");
        dortgen.a = input.nextInt();
        System.out.print("Dortgenin yuksekligi: ");
        dortgen.b = input.nextInt();
        alan = dortgen.alan();
        perimetre = dortgen.perimetre();
        System.out.println("Dortgenin alani: " + alan);
        System.out.println("Dortgenin perimetri: " + perimetre);
        
        System.out.print("Prizmanin uzunlugu: ");
        prizma.a = input.nextInt();
        System.out.print("Prizmanin yuksekligi: ");
        prizma.h = input.nextInt();
        System.out.print("Prizmanin dogrusu: ");
        prizma.b = input.nextInt();
        
        hacim = prizma.hacim();
        alan = prizma.prizm_alan();
        
        System.out.println("Prizmanin alani: " + alan);
        System.out.println("Prizmanin hacmi: " + hacim);
        
        // TODO code application logic here
    }
    
}
class Dortgen{
    int a;
    int b;
    
    int alan(){
        return a*b;
    }
    int perimetre(){
        return (2*a)+(2*b);
    }
}

class DortgenPrizma extends Dortgen{
    int h;
    
    int prizm_alan(){
        return 2*(a*b + a*h + b*h);
    }
    int hacim(){
        return a*b*h;
    } 
}
