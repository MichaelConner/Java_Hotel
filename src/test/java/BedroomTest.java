import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BedroomTest {


    Bedroom bedroom;


    @Before
    public void before(){

        bedroom = new Bedroom(1, 2, "Double");


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



}
