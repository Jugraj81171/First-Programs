package assignments.oops;

public class Vehicle {
    private String make;
    String model;
    int year;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public boolean start()
    {
        System.out.println("The driver should be able to start the vehicle");
        return true;
    }
    public void stop()
    {
        System.out.println("There should be brakes to stop the vehicle ");
    }
    public void displayInfo()
    {

        System.out.println("Make:"+make);
        System.out.println("Model:"+model);
        System.out.println("Year:"+year);
    }




}
