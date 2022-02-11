package airline;

public class CcMember extends Employee{
    private String licenceNumber;
    public CcMember(String name,CrewRank crewRank,String licenceNumber){
        super(name,crewRank);
        this.licenceNumber = licenceNumber;
    }



}
