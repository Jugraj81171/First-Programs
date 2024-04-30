package assignments.oops;

public class Electric_Car extends Car{
    public Electric_Car(String make, String model, int year, int numDoors, int batteryCapacity) {
        super(make, model, year, numDoors);
        this.batteryCapacity = batteryCapacity;
    }

    int batteryCapacity;
    public void chargeBattery()
    {

        System.out.println("Battery Capacity :"+batteryCapacity+"kWH");
    }
    @Override
    public boolean isElectric(){
        System.out.println("Electric:No");
        return true;
    }


}
