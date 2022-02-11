package airline;

public abstract class Employee {
    String name;
    CrewRank crewRank;
    public Employee(String name, CrewRank crewRank){
        this.name = name;
        this.crewRank = crewRank;
    }

    public String getName() {
        return name;
    }



}
