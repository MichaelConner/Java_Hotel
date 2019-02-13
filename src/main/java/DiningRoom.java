import java.util.ArrayList;



public class DiningRoom {


    private String name;
    private int capacity;
    private ArrayList<Guest> guestList;


    public DiningRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.guestList = new ArrayList<>();
    }

    public String getRoomName(){
        return this.name;
    }

    public int getRoomCapacity(){
        return this.capacity;
    }

    public int getGuestCount(){
        return this.guestList.size();
    }
}
