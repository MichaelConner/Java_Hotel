import com.sun.xml.internal.bind.v2.TODO;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;
    Guest guest;


    @Before
    public void before(){

        hotel = new Hotel("Step Back Inn");

        bedroom = new Bedroom(1, 2, "Double", 50, "a wee mint");
        bedroom2 = new Bedroom(1, 2, "Double", 50, "a wee mint");
        bedroom3 = new Bedroom(1, 2, "Double", 50, "a wee mint");
        bedroom4 = new Bedroom(1, 2, "Double", 50, "a wee mint");


        diningRoom = new DiningRoom("The McCrannoch Lounge", 10);

        conferenceRoom = new ConferenceRoom("The Stiletto Conference Room", 20);

        guest = new Guest();

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

    @Test
    public void canCheckInConferenceRoom(){
        hotel.checkInConferenceRoom(conferenceRoom, guest);
        assertEquals(1, conferenceRoom.getGuestCount());
    }

    @Test
    public void cannotCheckInConferenceRoomAsFull(){
        for (int i=0; i <25; i++) {
            hotel.checkInConferenceRoom(conferenceRoom, guest);
        }
        assertEquals(20, conferenceRoom.getGuestCount());
    }

    @Test
    public void canCheckInDiningRoom(){
        hotel.checkInDiningRoom(diningRoom, guest);
        assertEquals(1, diningRoom.getGuestCount());
    }

    @Test
    public void cannotCheckInDiningRoomAsFull(){
        for (int i=0; i <15; i++) {
            hotel.checkInDiningRoom(diningRoom, guest);
        }
        assertEquals(10, diningRoom.getGuestCount());
    }

    @Test
    public void canCheckInBedroom(){
        hotel.checkInBedroom(bedroom, guest);
        assertEquals(1, bedroom.getGuestCount());
    }

    @Test
    public void cannotCheckInBedroomAsFull(){
        for (int i=0; i <5; i++) {
            hotel.checkInBedroom(bedroom, guest);
        }
        assertEquals(2, bedroom.getGuestCount());
    }

    @Test
    public void canCheckOutConferenceRoom(){
        hotel.checkInConferenceRoom(conferenceRoom, guest);
        hotel.checkOutConferenceRoom(conferenceRoom, guest);
        assertEquals(0, conferenceRoom.getGuestCount());
    }

    @Test
    public void cannotCheckOutIfNotPresentInConferenceRoom(){
        hotel.checkOutConferenceRoom(conferenceRoom, guest);
        assertEquals(0, conferenceRoom.getGuestCount());
    }
    @Test
    public void canCheckOutDiningRoom(){
        hotel.checkInDiningRoom(diningRoom, guest);
        hotel.checkOutDiningRoom(diningRoom, guest);
        assertEquals(0, diningRoom.getGuestCount());
    }

    @Test
    public void cannotCheckOutIfNotPresentInDiningRoom(){
        hotel.checkOutDiningRoom(diningRoom, guest);
        assertEquals(0, diningRoom.getGuestCount());
    }
    @Test
    public void canCheckOutBedroom(){
        hotel.checkInBedroom(bedroom, guest);
        hotel.checkOutBedroom(bedroom, guest);
        assertEquals(0, bedroom.getGuestCount());
    }

    @Test
    public void cannotCheckOutIfNotPresentInBedroom() {
        hotel.checkOutBedroom(bedroom, guest);
        assertEquals(0, bedroom.getGuestCount());
    }

    @Test
    public void canBookRoom(){
        Booking testBooking = hotel.bookRoom(bedroom, 3);
        assertEquals(bedroom, testBooking.getBedroom());
        assertEquals(3, testBooking.getNights());
    }

    @Test
    public void canPresentBill(){
        Booking testBooking = hotel.bookRoom(bedroom, 3);
        assertEquals(150, hotel.presentBill(testBooking));
    }

    @Test
    public void canListEmptyRooms(){
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        hotel.checkInBedroom(bedroom2, guest);
        assertEquals(2, hotel.getEmptyRooms().size());
    }

}
