import com.sun.xml.internal.bind.v2.TODO;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;


    @Before
    public void before(){

        hotel = new Hotel("Step Back Inn");

        bedroom = new Bedroom(1, 2, "Double");

        diningRoom = new DiningRoom("The McCrannoch Lounge", 10);

        conferenceRoom = new ConferenceRoom("The Stiletto Conference Room", 20);

    }


    @Test
    public void hotelHasName(){
        assertEquals("Step Back Inn", hotel.getName());
    }

    @Test
    public void hasEmptyBedroomList(){
        assertEquals(0, hotel.getBedroomCount());
    }

    @Test
    public void hasEmptyDiningRoomList(){
        assertEquals(0, hotel.getDiningRoomCount());
    }

    @Test
    public void hasEmptyConferenceRoomList(){
        assertEquals(0, hotel.getConferenceRoomCount());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getBedroomCount());
    }

    @Test
    public void canAddDiningRoom(){
        hotel.addDiningRoom(diningRoom);
        assertEquals(1, hotel.getDiningRoomCount());
    }

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getConferenceRoomCount());
    }

    @Test
    public void canGetTotalRoomCount(){
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom);
        hotel.addDiningRoom(diningRoom);
        hotel.addDiningRoom(diningRoom);
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(6, hotel.getTotalRoomCount());
    }


}
