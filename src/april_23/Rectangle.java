package april_23;

import java.sql.SQLOutput;

public class Rectangle extends Shape {
   int length;
   int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea()
    {

        System.out.println("Area of Rectangle ="+(length*breadth));
    }


}
