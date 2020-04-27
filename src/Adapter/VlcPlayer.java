package Adapter;

public class VlcPlayer implements AdvancedMediaPlay {
    @Override
    public void playVlc(String filename) {
        System.out.println(filename+" has been played!");
    }

    @Override
    public void playMp4(String filename) {

    }
}
