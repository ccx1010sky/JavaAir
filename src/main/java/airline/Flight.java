package airline;


import passenger.Passenger;

import java.util.ArrayList;

public class Flight {
    private Pilot pilot;
    private Plane plane;
    ArrayList<Pilot> pilots;
    ArrayList<CcMember> ccMembers;
    ArrayList<Passenger> passengers;
    private PlaneType planeType;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight( Pilot pilot,PlaneType planeType,String flightNumber,String destination,String departureAirport,String departureTime){
        this.pilot = pilot;
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        pilots = new ArrayList<>();
        ccMembers = new ArrayList<>(7);
        passengers = new ArrayList<>(100);
    }

    public int numberOfAvailableSeats(){
        return plane.getPlaneCapacity() -  passengers.size();
    }



}
