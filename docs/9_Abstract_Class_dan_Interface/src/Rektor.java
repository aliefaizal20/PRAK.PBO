package jb9.abstractclass;
public class Rektor 
{
  public void beriSertifikatCumClaude(ICumlaude mahasiswa)
  {
      System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
      System.out.println("Selamat silahkan perkenalkan diri Anda..");
      
      mahasiswa.lulus();
      mahasiswa.meraihIPKTinggi();
      
      System.out.println("==========================================");
  }
}
