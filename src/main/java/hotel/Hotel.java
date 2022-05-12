package hotel;

import hotel.room.Bedroom;
import hotel.room.ConferenceRoom;
import hotel.room.DiningRoom;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedroomList;
    private ArrayList<ConferenceRoom> conferenceRoomsList;
    private HashMap<String, DiningRoom> diningRoomHashMap;

    public Hotel() {
        this.bedroomList = new ArrayList<>();
        this.conferenceRoomsList = new ArrayList<>();
        this.diningRoomHashMap = new HashMap<>();
    }

    public ArrayList<Bedroom> getBedroomList() {
        return bedroomList;
    }

    public ArrayList<ConferenceRoom> getConferenceRoomsList() {
        return conferenceRoomsList;
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        conferenceRoomsList.add(conferenceRoom);
    }

    public void addBedroom(Bedroom bedroom){
        bedroomList.add(bedroom);
    }

    public void addGuestToBedroom(Bedroom bedroom, Guest guest){
        if (bedroom.getGuests().size() < bedroom.getRoomType().getCapacity()){
        bedroom.addGuest(guest);}
    }

    public void removeGuestFromBedroom(Bedroom bedroom, Guest guest){
        bedroom.removeGuest(guest);
    }

    public Bedroom getBedroomAtIndex(int index){
        return bedroomList.get(index);
    }

    public void addGuestToConferenceRoom(ConferenceRoom conferenceRoom, Guest guest){
        conferenceRoom.addGuest(guest);
    }

    public void removeGuestFromConferenceRoom(ConferenceRoom conferenceRoom, Guest guest){
        conferenceRoom.removeGuest(guest);
    }

    public ConferenceRoom getConferenceRoomAtIndex(int index){
        return conferenceRoomsList.get(index);
    }

    public Booking bookRoom(Bedroom bedroom, int nightsBooked){
        Booking newBooking = new Booking(bedroom, nightsBooked);
        return newBooking;
    }

    public HashMap<String, DiningRoom> getDiningRoomHashMap() {
        return diningRoomHashMap;
    }

    public void addDiningRoom(DiningRoom diningRoom){
        if (!diningRoomHashMap.containsKey(diningRoom.getName())){
            diningRoomHashMap.put(diningRoom.getName(), diningRoom);
        }
    }
}
