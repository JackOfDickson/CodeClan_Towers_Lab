package hotel.room;

import hotel.Guest;

import java.util.ArrayList;



public abstract class Room {

    private ArrayList<Guest> guests;

    public Room() {
        this.guests = new ArrayList<>();
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void addGuest(Guest guest){
        guests.add(guest);
    }
}
