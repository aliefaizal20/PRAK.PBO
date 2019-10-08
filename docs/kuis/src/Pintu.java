package kuis;
public class Pintu {
    public String JenisPintu;
    public String NamaPintu;
    public int stok;
    
    public void tampilBarang(){
        System.out.println ("Jenis Pintu  : "+JenisPintu);
        System.out.println ("Nama Pintu : "+NamaPintu);
        System.out.println ("Stok : "+stok);
    }
    
    //method dengan argumen dan nilai balik (return)
    public int tambahStok(int PintuMasuk){
        int stokBaru=PintuMasuk+stok;
        return stokBaru;
    }

    void printHasil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String hitungLebar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String hitungPanjang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}