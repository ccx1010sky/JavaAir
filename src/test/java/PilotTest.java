import airline.CrewRank;
import airline.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;
    @Before
    public void pilot(){
        pilot = new Pilot("Mike", CrewRank.CAPTAIN,"CCA0001");
    }

    @Test
    public void hasName(){
        assertEquals("Mike",pilot.getName());
    }
    @Test
    public  void hasLicenceNumber(){
        assertEquals("CCA0001",pilot.getLicenceNumber());
    }
}
