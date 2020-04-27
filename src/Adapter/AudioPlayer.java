package Adapter;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String type, String filename) {
        if(type.equalsIgnoreCase("mp3")){
            System.out.println(filename+"has been played");
        }else if(type.equalsIgnoreCase("mp4")||type.equalsIgnoreCase("vlc")){
            MediaAdapter mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type,filename);

        }else{
            System.out.println("format not supported!");
        }

    }
}
