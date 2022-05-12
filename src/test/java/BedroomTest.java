import hotel.Guest;
import hotel.room.Bedroom;
import hotel.room.Bedroom;
import hotel.room.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.SINGLE, 1, 67.50);
        guest = new Guest("Bob");
    }

    @Test
    public void hasGuestList(){
        assertEquals(0, bedroom.getGuests().size());
    }

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }

    @Test
    public void canAddGuests(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuests().size());
    }

    @Test
    public void hasRate(){
        assertEquals(67.50, bedroom.getRate(), 0.0);
    }
    
    
}
