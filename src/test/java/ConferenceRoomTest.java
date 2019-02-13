import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ConferenceRoomTest {


    ConferenceRoom conferenceRoom;
    Guest guest;



    @Before
    public void before(){

        conferenceRoom = new ConferenceRoom("The Stiletto Conference Room", 20);
        guest = new Guest();

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
    public void addGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getGuestCount());
    }
}
