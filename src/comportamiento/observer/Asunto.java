package comportamiento.observer;

public interface Asunto {
    public void registrarObservador(Observador observador);

    public void notificarObservador();

    public void anularRegistroObservador(Observador observador);

    public Object getActualizacion();
}
