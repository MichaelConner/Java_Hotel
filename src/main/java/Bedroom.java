import java.util.ArrayList;



public class Bedroom {


    private int roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> guestList;


    public Bedroom(int roomNumber, int capacity, String type){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guestList = new ArrayList<>();
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public int getRoomCapacity(){
        return this.capacity;
    }

    public String getRoomType(){
        return this.type;
    }

    public int getGuestCount(){
        return this.guestList.size();
    }




}
