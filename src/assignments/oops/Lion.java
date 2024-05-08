package assignments.oops;

public class Lion implements Animal,Climbable{
    @Override
    public void name(){
        System.out.println("Lion");
    }
    public void species(){
        System.out.println("It's a mammal");
    }
    public void feed(){
        System.out.println("A lion is a voracious carnivore");
    }
    public void makeSound(){
        System.out.println("A lion roars");
    }

    public boolean climb(){

        System.out.println("A Lion can climb the branches of the trees");
        return true;
    }
    public void title()
    {
        System.out.println("A lion is known as the King of forest");
    }



}
