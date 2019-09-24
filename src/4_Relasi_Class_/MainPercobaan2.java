package relasiclass.percobaan2;
public class MainPercobaan2 {
    public static void main(String[] args){
        Mobil m = new Mobil(); 
        m.setMerk("Avanza"); 
        m.setBiaya(350000);
        Supir s = new Supir(); 
        s.setNama("John Doe"); 
        s.setBiaya(200000); 
        Pelanggan p = new Pelanggan(); 
        p.setNama("Jane Doe"); 
        p.setMobil(m); 
        p.setSupir(s); 
        p.setHari(2); 
        System.out.println("Biaya Total = " + p.hitungBiayaTotal());     
    }   
}