import java.util.Scanner;

public class Assignment4_1 {

    /*write a java program to that converts temperature from Celsius
    to Fahrenheit and Celsius to Kelvin. Use method overloading to perform that.
    Celsius to Kelvin, K = C + 273.15.
    Celsius to Fahrenheit, F = (9/5)C + 32.*/
    public void celsius_conversion(double celsius, double constant_value){
        double kelvin = celsius + constant_value;
        System.out.println("Temperature in kelvin will be = "+ kelvin);

    }
    public void celsius_conversion(double celsius){
        double fahrenheit = ((double)9/5)*celsius+32;
        System.out.println("Temperature in fahrenheit will be = "+ fahrenheit);

    }

    public static void main(String[] args) {
        System.out.println("Please Enter the temperature in celsius");
        Scanner scanner= new Scanner(System.in);
        double constant_value = 273.15;
        double celsius = scanner.nextDouble();
        Assignment4_1 temp = new Assignment4_1();
        temp.celsius_conversion(celsius);
        temp.celsius_conversion(celsius,constant_value);


    }
}
