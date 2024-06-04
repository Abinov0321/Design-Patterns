package structure.adapter;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("vlc", "alone.vlc");
        audioPlayer.play("mp4", "mind me.avi");
    }
}
