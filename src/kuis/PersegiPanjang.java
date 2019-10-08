package PersegiPanjang;
public class PersegiPanjang {
    public double mPhi=5, mR, mLuas, mPanjang;
    
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
    mPanjang = 2*mPhi*mR*mR;
    return mPanjang;
}
public void printHasil(){ 
    System.out.println("Nilai phi : "+mPhi);
    System.out.println("Nilai Jari-jari "+mR);
}
}