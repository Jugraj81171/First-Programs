package assignments.oops;

public class MediaMain {
       public static void main(String[] args) {

        AudioPlayer audioPlayer=new AudioPlayer("You tube Music","Born to Shine","Diljit Dosanjh");
        VideoPlayer videoPlayer=new VideoPlayer("You tube Music","Born",3);
        ImageDisplay imageDisplay=new ImageDisplay("You tube Music","Diljit The Star",1080);
        audioPlayer.play();
        audioPlayer.displayDetails();
        videoPlayer.play();
        videoPlayer.displayDetails();
        imageDisplay.displayImage();
        imageDisplay.displayDetails();
    }
}
