package assignments.oops;

public class animalMain {
    public static void main(String[] args) {
        System.out.println("------------Lion::The King of Forest----------");
        Lion lion =new Lion();
        lion.name();
        lion.feed();
        lion.climb();
        lion.species();
        lion.title();
        lion.makeSound();

        System.out.println("-----The Penguin:A streamlined Animal----");
        Penguin penguin=new Penguin();
        penguin.canWalk();
        penguin.name();
        penguin.swim();
        penguin.feed();
        penguin.species();
        penguin.makeSound();

        System.out.println("-----------The Monkey--------------");
        Monkey monkey=new Monkey();
        monkey.name();
        monkey.climb();
        monkey.feed();
        monkey.species();
        monkey.makeSound();
    }
}
