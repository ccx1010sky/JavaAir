import org.junit.Before;
import org.junit.Test;
import passenger.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;

    @Before
    public void before(){

        passenger1= new Passenger("Joe",3);
        passenger2= new Passenger("Tom",4);
        passenger3= new Passenger("Jane",2);

    }

    @Test
    public void hasName(){
        assertEquals("Joe",passenger1.getName());
    }

}
