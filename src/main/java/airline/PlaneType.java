package airline;

public enum PlaneType {
    BOEING737(250,1000),
    BOEING747(300,1200),
    BOEING787(350,1500);

    private final int capacity;
    private final int totalWeight;
    PlaneType(int capacity,int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
