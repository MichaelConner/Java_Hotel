import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest;


    @Before
    public void before(){

        diningRoom = new DiningRoom("The McCrannoch Lounge", 10);

        guest = new Guest();

    }


    @Test
    public void hasRoomName(){
        assertEquals("The McCrannoch Lounge", diningRoom.getRoomName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, diningRoom.getRoomCapacity());
    }

    @Test
    public void hasEmptyGuestList(){
        assertEquals(0, diningRoom.getGuestCount());
    }

    @Test
    public void addGuest(){
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.getGuestCount());
    }

}
