import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FlightTest {

    public Plane plane;
    public Flight flight;
    public Passenger passenger;

    @Before
    public void setup(){
        plane = new Plane(PlaneType.BOEING757);
        flight = new Flight(PlaneType.BOEING757,"EM123", "DXB", "GLA", "12:30");
        passenger = new Passenger("Kim", 2);
    }

    @Test
    public void canGetPlane(){
        assertEquals(PlaneType.BOEING757, flight.getPlane());
    }

    @Test
    public void canGetFlightNo(){
        assertEquals("EM123", flight.getFlightNumber());
    }

    @Test
    public void canGetDestination(){
        assertEquals("DXB", flight.getDestination());
    }

    @Test
    public void canGetDepartureAirport(){
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void canGetDeptTime(){
        assertEquals("12:30", flight.getDepartureTime());
    }

    @Test
    public void passengerStartsEmpty(){
        assertEquals(0, flight.countPassengers());
    }

    @Test
    public void canAddPassengers(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.countPassengers());
    }

    @Test
    public void canReturnAvailableSeats(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(198, flight.returnAvailableSeats());
    }

    @Test
    public void canBookOnAPassenger(){
        flight.bookAPassenger(passenger);
        assertEquals(1, flight.countPassengers());
    }









}
