package hotel.room;

import hotel.Guest;

import java.util.ArrayList;

public class Bedroom extends Room{

    private RoomType roomType;
    private int roomNumber;
    private double rate;

    public Bedroom(RoomType roomType, int roomNumber, double rate) {
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.rate = rate;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getRate() {
        return rate;
    }
}
