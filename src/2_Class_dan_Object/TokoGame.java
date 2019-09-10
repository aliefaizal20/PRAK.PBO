package tokogame;
public class TokoGame {
    public int mId;
    public String mNamaGame;
    public String mNamaMember;
    public int mJumlahHari;
    public double mHarga;
    
    public void printData1941723003Alief(){
        System.out.println("No ID  : "+mId);
        System.out.println("Nama Member : "+mNamaMember);
        System.out.println("Nama Game   : "+mNamaGame);
        System.out.println("Jumlah hari : "+mJumlahHari);
        System.out.println("Harga Sewa :  "+mHarga+" Per Hari");
    }
    
    public double hargaSewa1941723003Alief(/*double harga, int jumlahHari*/){
        mHarga = mHarga*mJumlahHari;
        return mHarga;
    }
}
