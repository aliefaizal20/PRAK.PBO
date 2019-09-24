package relasiclass.percobaan2;
public class Pelanggan {
    
    private String nama;
    private Mobil Mobil;
    private Supir Supir;
    private int hari;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mobil getMobil() {
        return Mobil;
    }

    public void setMobil(Mobil Mobil) {
        this.Mobil = Mobil;
    }

    public Supir getSupir() {
        return Supir;
    }

    public void setSupir(Supir Supir) {
        this.Supir = Supir;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }
    public int hitungBiayaTotal() { 
        return Mobil.hitungBiayaMobil(hari) + Supir.hitungBiayaSopir(hari); 
    }
}
