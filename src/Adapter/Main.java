package Adapter;

public class Main {
    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp4","designPattern.mp4");
        audioPlayer.play("vlc","javaTutorials.vlc");
    }
}
