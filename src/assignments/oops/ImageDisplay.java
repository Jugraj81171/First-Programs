package assignments.oops;

public class ImageDisplay extends MediaDevice{
    String image_name;
    int resolution;

    public ImageDisplay(String name, String image_name, int resolution) {
        super(name);
        this.image_name = image_name;
        this.resolution = resolution;
    }

    public void displayImage()
    {
        System.out.println("Image is of full quality");
    }

    @Override
    public void displayDetails() {
        System.out.println("Image Name:"+ image_name);
        System.out.println("Resolution:"+resolution);
    }
}
