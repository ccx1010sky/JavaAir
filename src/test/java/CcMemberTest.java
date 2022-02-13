import airline.CcMember;
import airline.CrewRank;
import org.junit.Before;

public class CcMemberTest {
        private CcMember ccMember;

        @Before
        public void before(){
            ccMember = new CcMember("John", CrewRank.FIRST_OFFICER);
        }



}
