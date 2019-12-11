package frontend;
import backend.*;

public class TestBackendBuku {
   public static void main(String[] args) {
        Kategori novel = new Kategori().getById(74);
        Kategori referensi = new Kategori().getById(75);
       
        Buku buku1 = new Buku(novel, "Timun Mas", "Bang Supil", "Elex Media");
        Buku buku2 = new Buku(referensi, "Aljabar Linier", "Alex Baldwin", "Springer");
        Buku buku3 = new Buku(novel, "The Sphere", "Michael", "Wyane Publis");
        
        //test insert
        buku1.save();
        buku2.save();
        buku3.save();
        
        //test update
        buku2.setJudul("Aljabar Linier");
        buku2.save();
        
        //test delete
        buku3.delete();
        
        //test id kategori
        
        //test select all
        for (Buku buku : new Buku().getAll()) {
            System.out.println("Kategori: " + buku.getKategori().getNama() + ", Judul: " + buku.getJudul());
        }
        
        //test search
        for (Buku buku : new Buku().search("timun")) {
            System.out.println("Kategori: " + buku.getKategori().getNama() + ", Judul: " + buku.getJudul());
        }
    }   
}
