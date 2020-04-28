package estructurales.adapter.v2;

public class MediaAdapter implements ReproductorDeMusica {
    ReproductorDeMusicaAvanzado reproductorDeMusica;

    public MediaAdapter(String tipoAudio) {
        if (tipoAudio.equalsIgnoreCase("vlc")) {
            reproductorDeMusica = new VlcPlayer();
        } else if (tipoAudio.equalsIgnoreCase("mp4")) {
            reproductorDeMusica = new Mp4Player();
        }
    }

    @Override
    public void play(String tipoAudio, String nombreArchivo) {
        if (tipoAudio.equalsIgnoreCase("vlc")) {
            reproductorDeMusica.playVlc(nombreArchivo);
        } else if (tipoAudio.equalsIgnoreCase("mp4")) {
            reproductorDeMusica.playMp4(nombreArchivo);
        }
    }
}
