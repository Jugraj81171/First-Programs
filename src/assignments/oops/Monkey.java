package assignments.oops;

public class Monkey implements Animal,Climbable {

    public void name(){
        System.out.println("Monkey");

    }
    public void feed(){
        System.out.println("A monkey is a Omnivore");
    }
    public void makeSound(){
        System.out.println("A monkey chatter");
    }
    public void species(){
        System.out.println("A monkey is a primate");
    }

    public boolean climb(){

        System.out.println("A monkey can climb ");
        return true;
    }

}

