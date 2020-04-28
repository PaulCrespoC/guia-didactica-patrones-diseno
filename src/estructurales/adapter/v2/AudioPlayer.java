package estructurales.adapter.v2;

public class AudioPlayer implements ReproductorDeMusica {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String tipoDeAudio, String nombreArchivo) {
// Soporte incorporado para reproducir archivos de musica mp3
        if (tipoDeAudio.equalsIgnoreCase("mp3")) {
            System.out.println("Repoduciendo mp3 " +
                    "-> Nombre del Archivo: " + nombreArchivo);
// MediaAdapter proporciona soporte
            //para reproducir otros formatos de archivo
        } else if (tipoDeAudio.equalsIgnoreCase("vlc") ||
                tipoDeAudio.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(tipoDeAudio);
            mediaAdapter.play(tipoDeAudio, nombreArchivo);
        } else {
            System.out.println("Reproducción Inválida," +
                    " no soporta el formato ." + tipoDeAudio);
        }
    }
}
