package assignments.oops;

public class VehicleMain {
    public static void main(String[] args)
    {
        //car class object
         Car car =new Car("Kia","Forte",2023,4);
         car.displayInfo();
         car.isElectric();
         car.isHeatedSeats();
        System.out.println("########## ");
         //motorcycle class object
        Motorcycle motorcycle= new Motorcycle("Royal Enfield","Hunter",2022,2);
        motorcycle.average(35);
        System.out.println("########## ");
        //electric_car class object
        Electric_Car electric_car= new Electric_Car("Tesla","X",2023,4,62);
         electric_car.displayInfo();
        System.out.println("Features--");
         electric_car.chargeBattery();
         electric_car.isHeatedSeats();
    }
}
