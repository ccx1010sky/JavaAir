package airline;

public abstract class Employee {
    String name;
    CrewRank crewRank;
    public void Employee(String name,CrewRank crewRank){
        this.name = name;
        this.crewRank = crewRank;
    }

}
