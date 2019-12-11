package backend;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.*;

public class Peminjaman {
    private int idpeminjaman;
    private Anggota anggota = new Anggota();
    private Buku buku = new Buku();
    private String tanggalpinjam;
    private String tanggalkembali;
    
    public Peminjaman(){
        
    }
    
    public  Peminjaman(Anggota anggota, Buku buku, String tanggalpinjam, String tanggalkembali){
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalpinjam = tanggalpinjam;
        this.tanggalkembali = tanggalkembali;
    }
    
    public int getIdpeminjaman() {
        return idpeminjaman;
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTanggalpinjam() {
        return tanggalpinjam;
    }

    public void setTanggalpinjam(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public String getTanggalkembali() {
        return tanggalkembali;
    }

    public void setTanggalkembali(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }
    
    public Peminjaman getById(int id){
        Peminjaman peminjaman = new Peminjaman();
     
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                        + "     p.idpeminjaman AS idpeminjaman, "
                                        + "     p.tanggalpinjam AS tanggalpinjam, "
                                        + "     p.tanggalkembali AS tanggalkembali, "
                                        + "     a.idanggota AS idanggota, "
                                        + "     a.nama AS nama,"
                                        + "     b.idbuku AS idbuku,"
                                        + "     b.judul AS judul "
                                        + "     FROM peminjaman p "
                                        + "     INNER JOIN anggota a ON p.idanggota = a.idanggota "
                                        + "     INNER JOIN buku b ON p.idbuku = b.idbuku "
                                        + "     WHERE p.idpeminjaman = '" + id + "'");

        try {
            while (rs.next()) {                
                peminjaman = new Peminjaman();
                peminjaman.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdanggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.setTanggalpinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembali(rs.getString("tanggalkembali"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         return peminjaman;
    }
    
    public ArrayList<Peminjaman> getAll(){
        ArrayList<Peminjaman> ListPeminjaman = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT "
                                        + "     p.idpeminjaman AS idpeminjaman, "
                                        + "     p.tanggalpinjam AS tanggalpinjam, "
                                        + "     p.tanggalkembali AS tanggalkembali, "
                                        + "     a.idanggota AS idanggota, "
                                        + "     a.nama AS nama,"
                                        + "     b.idbuku AS idbuku, "
                                        + "     b.judul AS judul "
                                        + "     FROM peminjaman p "
                                        + "     INNER JOIN anggota a ON p.idanggota = a.idanggota "
                                        + "     INNER JOIN buku b ON p.idbuku = b.idbuku ");
        
        try {
            while (rs.next()) {                
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdanggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.setTanggalpinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembali(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPeminjaman;
    }
    
    public ArrayList<Peminjaman> search(String keyword){
        
        ArrayList<Peminjaman> ListPeminjaman = new ArrayList();
        

        ResultSet rs = DBHelper.selectQuery("SELECT "
                                        + "     p.idpeminjaman AS idpeminjaman, "
                                        + "     p.tanggalpinjam AS tanggalpinjam, "
                                        + "     p.tanggalkembali AS tanggalkembali, "
                                        + "     a.idanggota AS idanggota, "
                                        + "     a.nama AS nama,"
                                        + "     b.idbuku AS idbuku, "
                                        + "     b.judul AS judul "
                                        + "     FROM peminjaman p "
                                        + "     INNER JOIN anggota a ON p.idanggota = a.idanggota "
                                        + "     INNER JOIN buku b ON p.idbuku = b.idbuku "
                                        + "     WHERE a.nama IN (SELECT a.nama FROM anggota WHERE a.nama LIKE '%" + keyword + "%') "
                                        + "     OR b.judul IN (SELECT b.judul FROM buku WHERE b.judul LIKE '%" + keyword + "%') ");
                                        
//                                                + "     OR a.idanggota '" + keyword + "' ");
        
        try {
            while (rs.next()) {                
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdanggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.setTanggalpinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembali(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPeminjaman;
    }
    
    
    public void save(){
        if (getById(idpeminjaman).getIdpeminjaman()== 0) {
            
            String SQL = "INSERT INTO peminjaman (`idanggota`, `idbuku`, `tanggalpinjam`, `tanggalkembali`) VALUES("
                    + "     '" + this.getAnggota().getIdanggota() + "', "
                    + "     '" + this.getBuku().getIdbuku() + "', "
                    + "     '" + this.tanggalpinjam + "', "
                    + "     '" + this.tanggalkembali + "' "
                    + "     )";
            this.idpeminjaman = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE peminjaman SET "
                    + "     idanggota='" + this.getAnggota().getIdanggota() + "', "
                    + "     idbuku='" + this.getBuku().getIdbuku() + "', "
                    + "     tanggalpinjam='" + this.tanggalpinjam + "', "
                    + "     tanggalkembali='" + this.tanggalkembali +"' "
                    + "     WHERE idpeminjaman = '" + this.idpeminjaman +"'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idpeminjaman + "'";
        DBHelper.executeQuery(SQL);
    }
    
}
