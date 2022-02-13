package airline;

public enum CrewRank {
    CAPTAIN(1,1),
    FIRST_OFFICER(2,1),
    PURSER(3,4),
    FLIGHT_ATTENDANT(4,6);
    private int rank;
    private int numberOfCrew;
    CrewRank(int rank,int numberOfCrew){
        this.rank = rank;
        this.numberOfCrew = numberOfCrew;
    }

    public int getRank() {
        return rank;
    }

    public int getNumberOfCrew() {
        return numberOfCrew;
    }

    public void setNumberOfCrew(int numberOfCrew) {
        this.numberOfCrew = numberOfCrew;

    }
}
