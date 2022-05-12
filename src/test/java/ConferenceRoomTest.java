import hotel.Guest;
import hotel.room.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Adam Room");
        guest = new Guest("Bob");
    }

    @Test
    public void hasGuestList(){
        assertEquals(0, conferenceRoom.getGuests().size());
    }

    @Test
    public void canAddGuests(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getGuests().size());
    }


}
