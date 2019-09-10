package lingkaran;

public class Lingkaran{
    public double mPhi=3.14, mR, mLuas, mKeliling;
    
/*public void mPhi(double phi){
    mPhi = phi;    
}
public void jari2(double r){
    mR = r;
}*/
public double hitungLuas(/*double mPhi, double mR*/){
    mLuas = mPhi*mR*mR;
    return mLuas;
}
public double hitungKeliling(/*double mR, double mPhi*/){
    mKeliling = 2*mPhi*mR*mR;
    return mKeliling;
}
public void printHasil(){ 
    System.out.println("Nilai phi : "+mPhi);
    System.out.println("Nilai Jari-jari "+mR);
}
}