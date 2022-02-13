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
        ccMembers = new ArrayList<>();
        passengers = new ArrayList<>();
    }

    public int numberOfAvailableSeats(){
        return this.plane.getPlaneCapacity() -  this.passengers.size();
    }

    public void addPilot(Pilot pilot){
        this.pilots.add(pilot);
    }

    public int getPassengerCount(){
        return passengers.size();
    }

    public void bookInPassenger(Passenger passenger){
        if (this.numberOfAvailableSeats() >0){
        this.passengers.add(passenger);
        }

    }




}
