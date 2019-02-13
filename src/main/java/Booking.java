public class Booking {
    private Bedroom bedroom;
    private int nights;
    private int totalCost;

    public Booking(Bedroom bedroom, int nights){
        this.bedroom = bedroom;
        this.nights = nights;
        this.totalCost = bedroom.getRate() * nights;
    }

    public Bedroom getBedroom(){
        return this.bedroom;
    }

    public int getNights(){
        return this.nights;
    }

    public int getTotalCost(){
        return this.totalCost;
    }
}
