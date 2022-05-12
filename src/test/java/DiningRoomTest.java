import hotel.Guest;
import hotel.room.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    private DiningRoom diningRoom;
    private Guest guest;

    @Before
    public void before(){
        diningRoom = new DiningRoom("The Dining Room");
    }

    @Test
    public void hasName(){
        assertEquals("The Dining Room", diningRoom.getName());
    }
}
