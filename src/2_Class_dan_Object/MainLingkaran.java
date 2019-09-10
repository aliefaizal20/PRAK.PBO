/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;

import java.util.Scanner;


public class MainLingkaran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lingkaran lr= new Lingkaran();
        
        System.out.print("Masukkan Jari-jari:2 ");
        lr.mR = sc.nextDouble();
        System.out.println("================");
        lr.printHasil();
        System.out.println("Luas Lingkaran: "+lr.hitungLuas());
        System.out.println("Keliling Lingkaran: "+lr.hitungKeliling());
        
        
    }
}
