package hotel;

import hotel.room.Bedroom;

public class Booking {

    private Bedroom bedroom;
    private int nightsBooked;

    public Booking(Bedroom bedroom, int nightsBooked) {
        this.bedroom = bedroom;
        this.nightsBooked = nightsBooked;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNightsBooked() {
        return nightsBooked;
    }

    public double totalBill() {
        return bedroom.getRate() * nightsBooked;
    }
}
