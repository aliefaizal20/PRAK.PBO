package jb9.abstractclass;
public class PascaSarjana extends Mahasiswa implements ICumlaude, IBerprestasi; {
    public PascaSarjana(String nama)
    {
        super(nama);
    }
    @Override
    public void lulus() {
        throw new UnsupportedOperationException("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggi() {
        throw new UnsupportedOperationException("IPK-ku lebih dari 3,71");
    }
    
}