package assignments.oops;

public class AudioPlayer extends MediaDevice implements Playable{
    String song_name;
    String artist;

    public AudioPlayer(String name,String song_name, String artist) {
       super(name);
        this.song_name = song_name;
        this.artist = artist;
    }

    public void play(){
        System.out.println("To play the audio click on the play button");

    }

    public String getArtist() {
        return artist;
    }
     @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Song Name:"+song_name);
        System.out.println("Artist:"+ artist);
    }



}
