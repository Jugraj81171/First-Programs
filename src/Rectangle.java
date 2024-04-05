import java.util.Scanner;

 public class Rectangle {
    public void areaOfRectangle(double length, double width)
    {

        double area = length*width;
        System.out.println("area of rectangle="+area);
    }
    public static void main (String[] args)
    {
        System.out.println("Enter a length");
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextInt();
        System.out.println("Enter a width");
        double width = scanner.nextInt();
        double area;
        Rectangle rectangle= new Rectangle();
        rectangle.areaOfRectangle(length, width);

    }
}
