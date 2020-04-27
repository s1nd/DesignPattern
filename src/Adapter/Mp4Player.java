package Adapter;

public class Mp4Player implements AdvancedMediaPlay {
    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println(filename+" has been played!");
    }
}
