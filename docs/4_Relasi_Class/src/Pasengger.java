package TUgas;
public class Pasengger {
    private String ktp;
    private String Name;


    public String getKtp() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String info() { String info = ""; 
    info += "ktp: " + this.ktp + "\n"; 
    info += "name: " + this.Name + "\n"; 
    return info; 
    }
}