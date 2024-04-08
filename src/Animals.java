public class Animals {
    String color ;
    int height;
    Animals(String color,int height){
        this.color =color;
        this.height =height;
    }
    public void walk(){
        System.out.println("color of animal is "+color+" and height is "+height);

    }
    public void talk(String color,int height)
    {
        System.out.println("color of animal is "+color+"and height is "+height);
    }
    public void eat(String color,int height)
    {
        System.out.println("color of animal is "+color+"and height is "+height);
    }
    public void makeSound(String color,int height)
    {
        System.out.println("color of animal is "+color+"and height is "+height);
    }
    public static void main (String[] args){

        Animals animals = new Animals("blue",10);
        animals.walk();
        animals.talk("white",5);
        animals.eat("red",6);
        animals.makeSound("voilet",7);

    }
}
