package tokogame;

import java.util.Scanner;

public class MainGane {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Scanner s = new Scanner(System.in);
        var c = new Scanner(System.in);
        TokoGame tg=new TokoGame();
        
        System.out.print("Masukkan No Id: ");
        tg.mId = sc.nextInt ();2
        
        System.out.print("Masukkan Nama Member");
        tg.mNamaMember = s.nextLine();
        
        System.out.print("Masukkan Nama Game : ");
        tg.mNamaGame = c.nextLine();
        
        System.out.println("Masukkan Jumlah Hari");
        tg.mJumlahHari = sc.nextInt ();
        
        System.out.println("Masukkan Harga: ");
        tg.mHarga = sc.nextDouble();
        
        System.out.println("==================");
        
        tg.printData1941723003Alief();
        
        System.out.println("Harga Sewa Game: "+tg.hargaSewa1941723003Alief());               
    }
    
}