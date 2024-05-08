package assignments.oops;

public class Penguin implements Animal,Swimmable{
    @Override
    public void name(){
        System.out.println("Penguin");
    }


    public void species() {
        System.out.println("Penguins are birds");

    }

    public void feed(){
        System.out.println("A penguin is also a carnivore");
    }
    public void makeSound(){
        System.out.println("A penguin squawks");
    }
    public boolean swim(){
        System.out.println("A Penguin can swim");
        return true;

    }
    public void canWalk(){
        System.out.println("Penguin can walk long distance ");
    }

}
