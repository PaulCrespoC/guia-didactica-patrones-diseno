package comportamiento.state;

public class Vibracion implements EstadoDelMovil {
    @Override
    public void getEstado() {
        System.out.println("El Movil Esta En Estado De Vibracion");
    }
}
