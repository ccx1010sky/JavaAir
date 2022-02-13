import airline.CcMember;
import airline.CrewRank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CcMemberTest {
        private CcMember ccMember;

        @Before
        public void before(){
            ccMember = new CcMember("John", CrewRank.FIRST_OFFICER);
        }
        @Test
        public void hasName(){
            assertEquals("John",ccMember.getName());
        }
        @Test
        public  void hasCrewRank(){
            assertEquals(CrewRank.FIRST_OFFICER,ccMember.getCrewRank());
        }



}
