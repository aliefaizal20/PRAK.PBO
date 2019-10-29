package jb9.abstractclass;
public class program1 
{
    public static void main(String[] args)
    {
        Rektor pakRektor = new Rektor();
        
        Mahasiswa mahasiswaBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
        pakRektor.beriSertifikatCumClaude((ICumlaude) mahasiswaBiasa);
        pakRektor.beriSertifikatCumClaude(sarjanaCumlaude);
        pakRektor.beriSertifikatCumClaude(masterCumlaude);
        
    }
    
}
