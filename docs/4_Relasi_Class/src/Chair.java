package TUgas;
public class Kursi {
     private String nomor;
    private relasclass.percobaan4.Penumpang penumpang;

    public Kursi(String nomor) {
        this.nomor = nomor;
    }

    

    public String getNomer() {
        return nomor;
    }

    public void setNomer(String nomer) {
        this.nomor = nomer;
    }

    public relasclass.percobaan4.Penumpang getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(relasclass.percobaan4.Penumpang penumpang) {
        this.penumpang = penumpang;
    }
public String info() { String info = ""; 
info += "Nomor: " + nomor + "\n"; 
if (this.penumpang != null) {
info += "Penumpang: " + penumpang.info() + "\n"; 

}
return info;
}
}