import java.util.ArrayList;

public class Hotel {


    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;


    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.diningRooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }


    public String getName(){
        return this.name;
    }

    public int getBedroomCount(){
        return this.bedrooms.size();
    }

    public int getDiningRoomCount(){
        return this.diningRooms.size();
    }

    public int getConferenceRoomCount(){
        return this.conferenceRooms.size();
    }

    public void addBedroom(Bedroom bedroom){
        bedrooms.add(bedroom);
    }

    public void addDiningRoom(DiningRoom diningRoom){
        diningRooms.add(diningRoom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        conferenceRooms.add(conferenceRoom);
    }

    public int getTotalRoomCount(){
        return(getBedroomCount() + getDiningRoomCount() + getConferenceRoomCount());
    }






}
