import airline.CrewRank;
import airline.Pilot;
import org.junit.Before;

public class PilotTest {
    Pilot pilot;
    @Before
    public void pilot(){
        pilot = new Pilot("Mike", CrewRank.CAPTAIN,"CCA0001");
    }
}
