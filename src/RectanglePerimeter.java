public class RectanglePerimeter {
    int length;
    int width;
    RectanglePerimeter(int length, int width)
    {
        this.length=length;
        this.width=width;
    }
    RectanglePerimeter(int length)
    {
        this.length=length;

    }
    public void  areaOfRectangle(){
        int area = length*width;
        System.out.println("Area of rectangle is "+area);


    }
    public void  perimeterOfRectangle(){
        int perimeter = 2*(length+width);
        System.out.println("Perimeter of rectangle is "+perimeter);

    }
    public static void main (String[] args){
        RectanglePerimeter rectangle= new RectanglePerimeter(20);
       rectangle.areaOfRectangle();
        rectangle.perimeterOfRectangle();
    }
}

