package TUgas;
public class MainTugas {
    public static void main(String[] args) {
        
    Passenger p = new Passenger("12345", "Mr. Krab"); 
    Kabin Kabin = new Kabin("A", 10); 
    Kabin.Passenger(p, 1); 
    System.out.println(Kabin.info()); 
    }
}