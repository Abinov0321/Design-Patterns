package structure.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVideo(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }
}

