package jb9.abstractclass;
public class Sarjana extends Mahasiswa implements ICumlaude 
{

    Sarjana(String dini) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void lulus() {
        throw new UnsupportedOperationException("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        throw new UnsupportedOperationException("IPK-ku lebih dari 3,51");
    }
    
}
