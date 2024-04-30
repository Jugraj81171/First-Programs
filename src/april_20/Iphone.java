package april_20;

public class Iphone extends SmartPhone{

    @Override
    public void calculate() {
        System.out.println("It can calculate big numbers");
    }

    @Override
    public void clickPhoto() {
        System.out.println("It can click HD pictures");
    }

    @Override
    public void memory() {
        System.out.println("It has 256 GB storage");
    }

    @Override
    public void listenSongs() {
        System.out.println("You can listen songs");
    }

    @Override
    public boolean keyboard() {

        System.out.println("Sorry!Smartphone does not have keyboard");
        return false;

    }

    public void call()
    {
        System.out.println("I can make also a call in it");
    }
    public void videoCall(){
        System.out.println("I can also make a video call on it");
    }
}
