package airline;

public enum FlightInfo {
    GLA_EDI("FR756","GLA","EDI","8:00 am"),
    EDI_LHR("EL3456","EDI","LHR","9:00am");

    String fightNumber;
    String departureAirport;
    String destination;
    String time;
    FlightInfo(String flightNumber,String departureAirport,String destination, String time){
        this.fightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destination = destination;
        this.time = time;
    }

    public String getFightNumber() {
        return fightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDestination() {
        return destination;
    }

    public String getTime() {
        return time;
    }
}
