package airline;
import passenger.Passenger;

import java.util.ArrayList;

public class Flight {
    ArrayList<Pilot> pilots;
    ArrayList<CcMember> ccMembers;
    ArrayList<Passenger> passengers;
    private FlightInfo flightInfo;
    private PlaneType planeType;

    public Flight( PlaneType planeType,FlightInfo flightInfo){
        this.planeType = planeType;
        this.flightInfo = flightInfo;
        pilots =  new ArrayList<>();
        ccMembers = new ArrayList<>();
        passengers = new ArrayList<>();
    }

    public int getPilotCount() {
        return pilots.size();
    }
    public int getCcMemberCount() {
        return ccMembers.size();
    }

    public int numberOfAvailableSeats(){
        return this.planeType.getCapacity() - this.passengers.size();
    }

    public void addPilot(Pilot pilot){
        this.pilots.add(pilot);
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public void clearPassenger(){
        this.passengers.clear();
    }
    public int getPassengerCount(){
        return passengers.size();
    }

    public FlightInfo getFlightInfo() {
        return flightInfo;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void bookInPassenger(Passenger passenger){
        if (this.numberOfAvailableSeats() >0){
        this.passengers.add(passenger);
        }

    }




}
