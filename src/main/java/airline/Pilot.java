package airline;

public class Pilot extends Employee {
    private String licenceNumber;
    public Pilot(String name,CrewRank crewRank,String licenceNumber){
        super(name,crewRank);
        this.licenceNumber = licenceNumber;
    }


}
