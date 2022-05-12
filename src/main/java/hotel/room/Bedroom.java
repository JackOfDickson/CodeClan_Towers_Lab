package hotel.room;

import hotel.Guest;

import java.util.ArrayList;

public class Bedroom extends Room{

    private RoomType roomType;

    public Bedroom(RoomType roomType) {
        this.roomType = roomType;
    }

    public RoomType getRoomType() {
        return roomType;
    }


}
