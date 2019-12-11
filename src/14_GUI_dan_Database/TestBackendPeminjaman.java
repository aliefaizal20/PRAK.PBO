package frontend;
import backend.*;

public class TestBackendPeminjaman {
    public static void main(String[] args) {
        Anggota Dimas = new Anggota().getById(19);
        Anggota Helmi = new Anggota().getById(20);
        
        Buku Timun = new Buku().getById(16);
        Buku Aljabar = new Buku().getById(17);
        
        Peminjaman peminjaman1 = new Peminjaman(Dimas, Timun, "2018-12-4", "2018-12-12");
        Peminjaman peminjaman2 = new Peminjaman(Helmi, Aljabar, "2018-12-5", "2018-12-15");
        
        peminjaman1.save();
        peminjaman2.save();

        for (Peminjaman peminjaman : new Peminjaman().getAll()) {
            System.out.println("Id Peminjaman: " + peminjaman.getIdpeminjaman() + 
                            ", Id Buku: " + peminjaman.getBuku().getIdbuku() + 
                            ", Tanggal Pinjam: " + peminjaman.getTanggalpinjam() +
                            ", Tanggal Kembali: " + peminjaman.getTanggalkembali());
        } 
        
        //test search
        for (Peminjaman peminjaman : new Peminjaman().search("Dimas")) {
            System.out.println("Nama Anggota");
            System.out.println("Nama: " + peminjaman.getAnggota().getNama());
        }
        
        for (Peminjaman peminjaman : new Peminjaman().search("Timun")) {
            System.out.println("Judul Buku");
            System.out.println("Judul Buku: " + peminjaman.getBuku().getJudul());
        }
        
        
    }
}
