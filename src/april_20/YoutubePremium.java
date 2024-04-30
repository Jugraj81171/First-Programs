package april_20;

import java.sql.SQLOutput;

public class YoutubePremium extends YouTube implements AudioMediaPlayer,VideoMediaPlayer{
    public void play()
    {
        System.out.println("Play your video or audio");
    }
    public void pause()
    {
        System.out.println("Pause your video or audio");
    }

    @Override
    public boolean screenOffAllowed() {
        return true;
    }

    @Override
    public boolean caption() {
        return true;
    }

    public void noAdds(){
        System.out.println("You can enjoy your movie without adds");
    }


}
