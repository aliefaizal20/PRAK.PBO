package kuis;
public class TestPintu {
    public static void main (String args[]){
        Pintu Pintu1=new Pintu();
        Pintu1.JenisPintu="Kayu";
        Pintu1.NamaPintu="Pintu Kayu";
        Pintu1.stok=30;
        Pintu1.tampilBarang();
        // menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println ("Stok Baru adalah " +Pintu1.tambahStok(40));
    }   
}