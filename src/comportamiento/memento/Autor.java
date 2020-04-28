package comportamiento.memento;

public class Autor {
    private String estado;

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public Memento guardarEstadoPorElMomento() {
        return new Memento(estado);
    }

    public void getEstadoMemento(Memento memento) {
        estado = memento.getEstado();
    }
}
