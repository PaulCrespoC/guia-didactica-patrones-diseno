package comportamiento.state;

public class ContextoDelMovil implements EstadoDelMovil {
    private EstadoDelMovil estadoDelMovil;

    public void setEstadoDelMovil(EstadoDelMovil estado) {
        estadoDelMovil = estado;
    }

    public ContextoDelMovil(EstadoDelMovil estadoDelMovil) {
        this.estadoDelMovil = estadoDelMovil;
    }

    public void getEstado() {
        estadoDelMovil.getEstado();
    }
}
