package hotel.room;


public class DiningRoom extends Room{

    private String name;
    private int capacity;

    public DiningRoom(String name, int capacity) {
        this.capacity = capacity;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
