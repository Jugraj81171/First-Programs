import java.util.Scanner;

public class Shape{
   /* Create a Shape class which calculates the area of Circle,
      square, rectangle and show the usage of method overloading.
      area of circle = PI*r*r;
      Area of Square = s*s;
      Area of rectangle = 2*l*b;*/
   public void calculate(double radius,double constant){
           double area_of_circle= (constant*radius*radius);
           System.out.println("Area of circle is "+area_of_circle);

        }
    public void calculate(int side){
        double area_of_square= (side*side);
        System.out.println("Area of circle is "+area_of_square);


    }
    public void calculate(int length,int breath){
        double area_of_rectangle= (length*breath);
        System.out.println("Area of circle is "+area_of_rectangle);


    }

    public static void main(String[] args) {
        System.out.println("Please enter the radius for circle for which you want to calculate the area ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        Shape shape = new Shape();
        shape.calculate(radius,3.14);
        System.out.println("Please enter the side of the square for which you want to calculate the area ");

        int side = scanner.nextInt();

        shape.calculate(side);
        System.out.println("Please enter the length of the rectangle for which you want to calculate the area ");

        int length = scanner.nextInt();

        System.out.println("Please enter the breath of the rectangle for which you want to calculate the area ");

        int breath = scanner.nextInt();
        shape.calculate(length, breath);




    }
}
