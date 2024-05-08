package assignments.oops;

public abstract class MediaDevice {
    String name;

    public MediaDevice(String name) {
        this.name = name;
    }

    public void displayDetails()
    {

        System.out.println("Name:"+name);
    }

}
