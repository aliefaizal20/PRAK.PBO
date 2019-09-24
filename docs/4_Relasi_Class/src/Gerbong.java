package relasclass.percobaan4;
public class Gerbong {
private String kode;
    private Kursi[] Kursi;
    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.Kursi =new Kursi[jumlah];
        this.initKursi();
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public Kursi[] getKursi() {
        return Kursi;
    }

    public void setKursi(Kursi[] Kursi) {
        this.Kursi = Kursi;
    }
    
    private void initKursi() { 
        for (int i = 0; i < Kursi.length; i++){
        this.Kursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }   
    public String info() { 
        String info = ""; 
        info += "Kode: " + kode + "\n"; 
        for (Kursi kursi : Kursi) {
            info += kursi.info();
           
        } 
         return info; 
    }
    public void setPenumpang(Penumpang penumpang, int nomor) { 
        this.Kursi[nomor - 1].setPenumpang(penumpang);
    }
}