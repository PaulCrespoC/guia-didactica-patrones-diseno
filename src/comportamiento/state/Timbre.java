package comportamiento.state;

public class Timbre implements EstadoDelMovil {
    @Override
    public void getEstado() {
        System.out.println("El Movil Esta En Estado De Timbre");
    }
}
