import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ConferenceRoomTest {


    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before(){

        conferenceRoom = new ConferenceRoom("The Stiletto Conference Room", 20);
        guest1 = new Guest();
        guest2 = new Guest();
        guest3 = new Guest();

    }


    @Test
    public void hasRoomName(){
        assertEquals("The Stiletto Conference Room", conferenceRoom.getRoomName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(20, conferenceRoom.getRoomCapacity());
    }

    @Test
    public void hasEmptyGuestList(){
        assertEquals(0, conferenceRoom.getGuestCount());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.getGuestCount());
    }

    @Test
    public void canRemoveGuest(){
        conferenceRoom.addGuest(guest1);
        conferenceRoom.removeGuest(guest1);
        assertEquals(0, conferenceRoom.getGuestCount());
    }

    @Test
    public void canRemoveSpecificGuest(){
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.addGuest(guest3);
        conferenceRoom.removeGuest(guest2);
        assertEquals(2, conferenceRoom.getGuestCount());
        assertEquals(true, conferenceRoom.getGuestList().contains(guest1));
        assertEquals(true, conferenceRoom.getGuestList().contains(guest3));
    }
}
