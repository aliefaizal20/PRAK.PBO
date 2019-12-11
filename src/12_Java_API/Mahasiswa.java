public class Mahasiswa {
    private String Nim, Nama, Alamat;
    
    public Mahasiswa (String Nim, String Nama, String Alamat) {
        this.Nim = Nim;
        this.Nama = Nama;
        this.Alamat = Alamat;
    }
    
    public String getNim(){
        return Nim;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public String getAlamat(){
        return Alamat;
    }
    
}
