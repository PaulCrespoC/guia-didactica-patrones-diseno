package estructurales.adapter.v2;

public class VlcPlayer implements ReproductorDeMusicaAvanzado {
    @Override
    public void playVlc(String nombreArchivo) {
        System.out.println("Reproduciendo vlc -> Nombre del Archivo: " + nombreArchivo);
    }

    @Override
    public void playMp4(String nombreArchivo) {
// no hace nada
    }
}
