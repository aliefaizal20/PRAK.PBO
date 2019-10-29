package jb9.abstractclass;
public class Kucing extends Hewan{

    @Override
    public void bergerak() {
        throw new UnsupportedOperationException("Berjalan dengan KAKI, \"Tap..tap..\"");            
    }
}