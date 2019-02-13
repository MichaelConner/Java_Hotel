import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BedroomTest {


    Bedroom bedroom;
    Guest guest;


    @Before
    public void before(){

        bedroom = new Bedroom(1, 2, "Double", "a wee mint");

        guest = new Guest();

    }


    @Test
    public void hasRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getRoomCapacity());
    }

    @Test
    public void hasType(){
        assertEquals("Double", bedroom.getRoomType());
    }

    @Test
    public void hasEmptyGuestList(){
        assertEquals(0, bedroom.getGuestCount());
    }

    @Test
    public void addGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuestCount());
    }



}
