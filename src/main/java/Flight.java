import java.util.ArrayList;

public class Flight {

    private PlaneType plane;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(PlaneType plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.plane = plane;
        this.passengers = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }



    public PlaneType getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int countPassengers() {
        return passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public int returnAvailableSeats(){
          return plane.getCapacity() - countPassengers();
    }


    public void bookAPassenger(Passenger passenger) {
        int availableSeats = returnAvailableSeats();
        if (availableSeats > 0) {
            addPassenger(passenger);
        }
    }
}



