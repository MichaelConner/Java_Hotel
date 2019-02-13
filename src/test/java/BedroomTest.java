import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BedroomTest {


    Bedroom bedroom;
    Guest guest1;
    Guest guest2;
    Guest guest3;


    @Before
    public void before(){

        bedroom = new Bedroom(1, 2, "Double", "a wee mint");

        guest1 = new Guest();
        guest2 = new Guest();
        guest3 = new Guest();
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
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.getGuestCount());
    }
    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest1);
        bedroom.removeGuest(guest1);
        assertEquals(0, bedroom.getGuestCount());
    }

    @Test
    public void canRemoveSpecificGuest(){
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.addGuest(guest3);
        bedroom.removeGuest(guest2);
        assertEquals(2, bedroom.getGuestCount());
        assertEquals(true, bedroom.getGuestList().contains(guest1));
        assertEquals(true, bedroom.getGuestList().contains(guest3));
    }


}
