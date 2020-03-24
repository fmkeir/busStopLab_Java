import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;
    
    

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }


    public int getNumberOfPassengers() {
        return this.passengers.size();
    }

    public void pickUpPassenger(BusStop busStop) {
        Person passenger = busStop.removePerson();
        if (this.getNumberOfPassengers() < this.capacity && passenger != null) {
            this.passengers.add(passenger);
        }
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }
}
