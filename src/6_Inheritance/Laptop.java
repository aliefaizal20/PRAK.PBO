public class Laptop extends Komputer{
    public String jnsBaterai;
    
    public Laptop () {
    }
    
    public Laptop (String jnsBaterai, String merk, String jnsProcessor, int kecProcessor, int sizememory){
        this.jnsBaterai = jnsBaterai;        
    }
    
    public void tampilLaptop(){
        super.tampilData();
        System.out.println("Jenis Baterai ="+jnsBaterai);
    }
}
