import airline.CcMember;
import airline.CrewRank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CcMemberTest {
    private CcMember ccMember_01;
    private CcMember ccMember_02;
    private CcMember ccMember_03;


    @Before
        public void before(){
            ccMember_01 = new CcMember("John", CrewRank.PURSER);
            ccMember_02 = new CcMember("Vicky", CrewRank.PURSER);
            ccMember_03 = new CcMember("Andy", CrewRank.PURSER);

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
