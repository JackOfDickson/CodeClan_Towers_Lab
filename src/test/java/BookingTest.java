import hotel.Booking;
import hotel.Guest;
import hotel.room.Bedroom;
import hotel.room.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;


    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.SINGLE, 1);
        booking = new Booking(bedroom, 5);
    }

    @Test
    public void hasNightsBooked(){
        assertEquals(5, booking.getNightsBooked());
    }

}
