package estructurales.adapter.v2;

public class Mp4Player implements ReproductorDeMusicaAvanzado {
    @Override
    public void playVlc(String nombreArchivo) {
// no hace nada
    }

    @Override
    public void playMp4(String nombreArchivo) {
        System.out.println("Reproduciendo mp4 -> Nombre del Archivo: " + nombreArchivo);
    }
}
