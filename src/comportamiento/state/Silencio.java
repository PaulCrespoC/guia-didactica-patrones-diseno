package comportamiento.state;

public class Silencio implements EstadoDelMovil {
    @Override
    public void getEstado() {
        System.out.println("El Movil Esta En Estado De Silencio");
    }
}
