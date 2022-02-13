import airline.CcMember;
import airline.CrewRank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CcMemberTest {
        private CcMember ccMember_01;

        @Before
        public void before(){
            ccMember_01 = new CcMember("John", CrewRank.PURSER);
        }
        @Test
        public void hasName(){
            assertEquals("John",ccMember_01.getName());
        }
        @Test
        public  void hasCrewRank(){
            assertEquals(CrewRank.PURSER,ccMember_01.getCrewRank());
        }



}
