import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightMangerTest {

    public Plane plane;
    public Flight flight;
    public FlightManager flightManager;
    public Passenger passenger1;
    public Passenger passenger2;

    @Before
    public void setup(){
        plane = new Plane(PlaneType.BOEING757);
        flight = new Flight(PlaneType.BOEING757,"EM123", "DXB", "GLA", "12:30");
        passenger1 = new Passenger("Kim", 2);
        passenger2 = new Passenger("Ken",1);
        flightManager = new FlightManager(flight);
    }

    @Test
    public void canGetFlightBaggageWeight(){
        assertEquals(49895, flightManager.getFlightBaggageWeight(plane));
    }

    @Test
    public void canGetWeightPerPassenger(){
        assertEquals(249, flightManager.getBaggageWeightPerPassenger(plane));
    }

    @Test
    public void canGetBookedWeight(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(498, flightManager.getBookedWeight(flight, plane));
    }

    @Test
    public void canGetRemainingBaggageWeight(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(49397, flightManager.getRemainingBaggageWeight(plane, flight));
    }

}
