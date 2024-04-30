package assignments.oops;

public class Car extends Vehicle{
    int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
    }



    public boolean isElectric(){
        System.out.println("Electric :No");
        return false;
    }




    public boolean isHeatedSeats()
    {
        System.out.println("Heated Seats:No");
       return false;
    }

}
