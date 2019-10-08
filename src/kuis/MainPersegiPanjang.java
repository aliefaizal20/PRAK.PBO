package PersegiPanjang;

import java.util.Scanner;

public class MainPersegiPanjang {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang lp= new PersegiPanjang();
        
        System.out.print("Masukkan Angka:2 ");
        lp.mR = sc.nextDouble();
        System.out.println("================");
        lp.printHasil();
        System.out.println("Luas Persegi: "+lp.hitungLuas());
        System.out.println("Keliling Persegi: "+lp.hitungKeliling());
        
        
    }
}
