package frontend;
import backend.*;

public class TestBackendAnggota {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Dimas Bagus W.S", "JL mangga", "083122286711");
        Anggota anggota2 = new Anggota("Helmi Effendi", "JL Manggis", "082141109795");
        Anggota anggota3 = new Anggota("Julia Intan", "JL Durian", "085122286312");
        
        //test insert
        anggota1.save();
        anggota2.save();
        anggota3.save();
        
        //test update
        anggota2.setAlamat("JL Alpukat");
        anggota2.save();
        
        //test delete
        anggota3.delete();
        
        //test select all
        for (Anggota anggota : new Anggota().getAll()) {
            System.out.println("Nama: " + anggota.getNama() + ", Ket: " + anggota.getAlamat());
        }
        
        //test search
        for (Anggota anggota : new Anggota().search("JL Alpukat")) {
            System.out.println("Nama: " + anggota.getNama() + ", Ket: " + anggota.getAlamat());
        }
    }
    
}
