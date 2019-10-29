package jb9.abstractclass;
public class Program 
{
    public static void main(String[] srgs)
    {
      Kucing kucingKampung = new Kucing();
      Ikan lumbalumba = new Ikan();
      
      Orang ani = new Orang("Ani");
      Orang budi = new Orang("Budi");
      
      ani.peliharaHewan(kucingKampung);
      budi.peliharaHewan(lumbalumba);
      
      ani.ajakPeliharaanJalanJalan();
      budi.ajakPeliharaanJalanJalan();
    }
}
