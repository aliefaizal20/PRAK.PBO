package kuis;
public class Pintu1 {
    private String Nama; 
    private String Warna; 
    private Pintu1 Jenis; 
    private Pintu1 Harga; 

    Pintu1(String string, String spongebob_Squarepants) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public Pintu1 getJenis() {
        return Jenis;
    }

    public void setJenis(Pintu1 Jenis) {
        this.Jenis = Jenis;
    }

    public Pintu1 getHarga() {
        return Harga;
    }

    public void setHarga(Pintu1 Harga) {
        this.Harga = Harga;
    }    
    public String info() { 
        String info = ""; 
        info += "Nama: " + this.Nama + "\n"; 
        info += "Warna: " + this.Warna + "\n"; 
        info += "Jenis: " + this.Jenis.info() + "\n"; 
        info += "Harga: " + this.Harga.info() + "\n"; 
        return info; 
    }
}
