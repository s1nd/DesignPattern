package Adapter;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlay advPlayer;

    //根据类型初始化
    public MediaAdapter(String type) {
        if(type.equalsIgnoreCase("mp4")){
            advPlayer = new Mp4Player();
        }else if(type.equalsIgnoreCase("vlc")){
            advPlayer = new VlcPlayer();
        }else{
            System.out.println("init:adapter has no this type...");
        }
    }

    @Override
    public void play(String type, String filename) {
        if(type.equalsIgnoreCase("mp4")){
            advPlayer.playMp4(filename);
        }else if(type.equalsIgnoreCase("vlc")){
            advPlayer.playVlc(filename);
        }else{
            System.out.println("play:adapter has no this type...");
        }
    }
}
