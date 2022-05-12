package hotel.room;

import hotel.Guest;

import java.util.ArrayList;

public class Bedroom extends Room{

    private RoomType roomType;
    private int roomNumber;

    public Bedroom(RoomType roomType, int roomNumber) {
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }


}
