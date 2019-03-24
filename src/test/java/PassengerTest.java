import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    public Passenger passenger;



    @Before
    public void setup() {
        passenger = new Passenger("Kim", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Kim", passenger.getName());
    }


    @Test
    public void canGetNoOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }

    @Test
    public void canUpdateName(){
        passenger.setName("Abi");
        assertEquals("Abi", passenger.getName());
    }

    @Test
    public void canUpdateNoOfBages(){
        passenger.setNumberOfBags(3);
        assertEquals(3, passenger.getNumberOfBags());
    }


}
