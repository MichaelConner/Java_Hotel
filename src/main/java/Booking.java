import java.awt.print.Book;

public class Booking {
    Bedroom bedroom;
    int nights;

    public Booking(Bedroom bedroom, int nights){
        this.bedroom = bedroom;
        this.nights = nights;
    }

    public Bedroom getBedroom(){
        return this.bedroom;
    }

    public int getNights(){
        return this.nights;
    }
}
