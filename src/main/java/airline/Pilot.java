package airline;
public class Pilot extends Employee {
    private String licenceNumber;
    public Pilot(String name,CrewRank crewRank,String licenceNumber){
        super(name,crewRank);
        this.licenceNumber = licenceNumber;
    }
    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }
    public String flyPlane(){
        return "I am flying the plane";
    }
}






