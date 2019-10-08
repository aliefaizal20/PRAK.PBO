
import Jobsheet6.Manager;

public class Inheritance {
    
    public static void main(String[] args) {
        Manager M= new Manager();
        M.nama="Vivin";
        M.alamat="Jl. Vinolia";
        M.umur=25;
        M.jk="Perempuan";
        M.gaji=3000000;
        M.tunjangan=1000000;
        M.tampilDataManager();
        
        Staff S = new Staff();
        S.nama="Lestari";
        S.alamat="Malang";
        S.umur=25;
        S.jk="Perempuan";
        S.gaji=2000000;
        S.lembur=5000000;
        S.potongan=2500000;
        S.tampilDataStaff();
    }
    
}
