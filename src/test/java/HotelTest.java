import hotel.Guest;
import hotel.Hotel;
import hotel.room.Bedroom;
import hotel.room.ConferenceRoom;
import hotel.room.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    ConferenceRoom conferenceRoom;
    Bedroom bedroom;

    @Before
    public void before(){
        hotel = new Hotel();
        conferenceRoom = new ConferenceRoom("Adam Room");
        bedroom = new Bedroom(RoomType.SINGLE, 1);
        guest = new Guest("Bob");
    }

    @Test
    public void hasBedroomList(){
        assertEquals(0, hotel.getBedroomList().size());
    }

    @Test
    public void hasConferenceRoomList(){
        assertEquals(0, hotel.getConferenceRoomsList().size());
    }

    @Test
    public void canAddConferenceRoomToList(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getConferenceRoomsList().size());
    }

    @Test
    public void canAddBedroomToList(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getBedroomList().size());
    }


    @Test
    public void canAddGuestToBedroom(){
        hotel.addBedroom(bedroom);
        hotel.addGuestToBedroom(bedroom, guest);
        assertEquals(1, hotel.getBedroomAtIndex(0).getGuests().size());
    }

    @Test
    public void canRemoveGuestFromBedroom() {
        hotel.addBedroom(bedroom);
        hotel.addGuestToBedroom(bedroom, guest);
        hotel.removeGuestFromBedroom(bedroom, guest);
        assertEquals(0, hotel.getBedroomAtIndex(0).getGuests().size());

    }

    @Test
    public void canAddGuestToConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        hotel.addGuestToConferenceRoom(conferenceRoom, guest);
        assertEquals(1, hotel.getConferenceRoomAtIndex(0).getGuests().size());
    }

    @Test
    public void canRemoveGuestToBedroom() {
        hotel.addConferenceRoom(conferenceRoom);
        hotel.addGuestToConferenceRoom(conferenceRoom, guest);
        hotel.removeGuestFromConferenceRoom(conferenceRoom, guest);
        assertEquals(0, hotel.getConferenceRoomAtIndex(0).getGuests().size());

    }
}
