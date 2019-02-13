import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before

    public void before(){
        bedroom = new Bedroom(1, 2, "Double", 50, "A nicely folded towel bird thing");
        booking = new Booking(bedroom, 3);
    }

    @Test

    public void bookingHasABedroom(){
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test

    public void bookingHasNumNights(){
        assertEquals(3, booking.getNights());
    }

    @Test

    public void canGetTotalPrice(){
        assertEquals(150, booking.getTotalCost());
    }
}
