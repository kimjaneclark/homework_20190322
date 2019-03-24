import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    public Plane plane;

    @Before
    public void setup(){
        plane = new Plane(PlaneType.A380);
    }

   @Test
    public void canGetCapacity(){
        assertEquals(555, plane.getCapacity());
   }

   @Test
    public void canGetWeight(){
        assertEquals(560000, plane.getWeight());
   }
}
