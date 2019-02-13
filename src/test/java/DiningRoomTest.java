import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;


    @Before
    public void before(){

        diningRoom = new DiningRoom("The McCrannoch Lounge", 10);

        guest1 = new Guest();
        guest2 = new Guest();
        guest3 = new Guest();

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
        diningRoom.addGuest(guest1);
        assertEquals(1, diningRoom.getGuestCount());
    }
    @Test
    public void canRemoveGuest(){
        diningRoom.addGuest(guest1);
        diningRoom.removeGuest(guest1);
        assertEquals(0, diningRoom.getGuestCount());
    }

    @Test
    public void canRemoveSpecificGuest(){
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest2);
        diningRoom.addGuest(guest3);
        diningRoom.removeGuest(guest2);
        assertEquals(2, diningRoom.getGuestCount());
        assertEquals(true, diningRoom.getGuestList().contains(guest1));
        assertEquals(true, diningRoom.getGuestList().contains(guest3));
    }

}
