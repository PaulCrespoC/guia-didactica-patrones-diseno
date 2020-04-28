package estructurales.adapter.v2;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "Más allá del horizonte.mp3");
        audioPlayer.play("mp4", "solo.mp4");
        audioPlayer.play("vlc", "muy muy lejos.vlc");
        audioPlayer.play("avi", "me importaria.avi");
    }
}
