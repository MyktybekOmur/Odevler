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
import java.util.Scanner;
public class Odev6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sifrele_1 m_gir = new Sifrele_1();
        Sifre_coz m_al = new Sifre_coz();
        
        System.out.println("Mesaj giriniz:");
        m_gir.mesaj = input.nextLine();
        
        System.out.println("Sifreli mesaj:" + m_gir.sifrele());
        
        m_al.mesaj = m_gir.sifreli_mesaj;
       // System.out.println(m_al.mesaj);
        System.out.print("Cozulen mesaj:");
        System.out.println(m_al.sifre_coz());
        
        // TODO code application logic here
    }
    
}
