package april_20;

public class YouTube implements AudioMediaPlayer,VideoMediaPlayer{
    @Override
    public boolean screenOffAllowed() {
        return false;
    }

    @Override
    public void play() {
        System.out.println("Its my feature");
    }

    @Override
    public void pause() {
        System.out.println("Its my basic feature");
    }

    @Override
    public boolean caption() {
        return false;
    }
}
