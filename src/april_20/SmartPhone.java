package april_20;

public class SmartPhone implements Calculator,Computer,Camera,MusicPlayer{
    @Override
    public void calculate() {
        System.out.println("A SmartPhone has a calculator");
    }

    @Override
    public void clickPhoto() {
        System.out.println("It can click photo");

    }

    @Override
    public void memory() {

        System.out.println("Its  have a big memory");
    }

    @Override
    public void listenSongs() {
        System.out.println("We can listen songs on smartphone");

    }

    @Override
    public boolean keyboard() {
        return false;
    }
    public void call(){
        System.out.println("I cxan make call in it");
    }
}
