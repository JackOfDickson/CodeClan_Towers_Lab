package hotel;

import hotel.room.Bedroom;
import hotel.room.ConferenceRoom;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedroomList;
    private ArrayList<ConferenceRoom> conferenceRoomsList;

    public Hotel() {
        this.bedroomList = new ArrayList<>();
        this.conferenceRoomsList = new ArrayList<>();
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
        bedroom.addGuest(guest);
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
}
