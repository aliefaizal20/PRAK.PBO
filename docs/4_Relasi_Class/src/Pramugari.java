package Tugas;
public class Pramugari {
    private String no; 
    private String nama; 

    public Pramugari(String nip, String nama) {
        this.no = no;
        this.nama = nama;
    }
    
    
    public String getNip() {
        return no;
    }

    public void setNip(String no) {
        this.no = no;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String info() { String info = ""; 
    info += "no: " + this.no + "\n"; 
    info += "Nama: " + this.nama + "\n"; 
    return info; 
    }
}   