import com.sun.corba.se.impl.orbutil.closure.Constant;

import java.util.Scanner;

public class Circumference_of_circle{
    public void cirOfCircle(double radius , double PI){

        double circumference= 2*PI*radius;
        System.out.println("circumference of circle ="+circumference);

    }
    public void areaOfCircle(double radius , double PI)
    {

        double area= PI*radius*radius;
        System.out.println("Area of circle ="+area);
    }
    public static void main(String[] args)
    {
        double PI=2.14;
        System.out.println("Enter the radius of circle");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        Circumference_of_circle circum = new Circumference_of_circle();
        circum.cirOfCircle(radius,2.14);
        System.out.println("*****************************");
        circum.areaOfCircle(radius,2.14);



    }


}
