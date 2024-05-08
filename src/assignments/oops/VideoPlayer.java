package assignments.oops;

public class VideoPlayer extends MediaDevice implements Playable{
    String title;
    int duration;

    public VideoPlayer(String name, String title, int duration) {
        super(name);
        this.title = title;
        this.duration = duration;
    }

    public void play(){
        System.out.println("To play the video please click on the play button");
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Title:"+title);
        System.out.println("Duration of the song :"+duration);


    }

}
