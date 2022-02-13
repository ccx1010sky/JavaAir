import airline.*;
import org.junit.Before;
import org.junit.Test;
import passenger.Passenger;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Pilot Mike;
    Pilot Jack;
    ArrayList<Pilot> pilots;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;

    private CcMember ccMember_01;
    private CcMember ccMember_02;
    private CcMember ccMember_03;



    @Before
    public void before(){
        Mike = new Pilot("Mike", CrewRank.CAPTAIN,"CCA0001");
        Jack = new Pilot("Jack",CrewRank.FIRST_OFFICER,"CCA0002");

        passenger1= new Passenger("Joe",3);
        passenger2= new Passenger("Tom",4);
        passenger3= new Passenger("Jane",2);

        ccMember_01 = new CcMember("John", CrewRank.PURSER);
        ccMember_02 = new CcMember("Vicky", CrewRank.PURSER);
        ccMember_03 = new CcMember("Andy", CrewRank.PURSER);

        flight = new Flight(PlaneType.BOEING737, FlightInfo.GLA_EDI);
    }

    @Test
    public void flightHasTwoPilots(){
        flight.addPilot(Mike);
        flight.addPilot(Jack);
        assertEquals(2,flight.getPilotCount());
    }
    @Test
    public void flightHasPassengers(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(3,flight.getPassengerCount());
    }
    @Test
    public void canGetNumberOfSeatsAvailable(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(247,flight.numberOfAvailableSeats());

    }
    @Test
    public void canClearPassenger(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.clearPassenger();
        assertEquals(0,flight.getPassengerCount());


    }

}
