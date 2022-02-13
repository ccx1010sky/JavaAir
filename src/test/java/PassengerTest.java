import org.junit.Before;
import org.junit.Test;
import passenger.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger1;

    @Before
    public void before(){
        passenger1= new Passenger("Joe",3);
    }

    @Test
    public void hasName(){
        assertEquals("Joe",passenger1.getName());
    }

}
