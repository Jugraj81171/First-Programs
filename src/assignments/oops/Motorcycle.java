package assignments.oops;

public class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, int numCylinders) {
        super(make, model, year);
        this.numCylinders = numCylinders;
    }

    int numCylinders;
public void average(double average){
    super.displayInfo();
    System.out.println("Number of Cylinders: "+numCylinders);
    System.out.println("Average:"+average+"kmpl");
}

}
