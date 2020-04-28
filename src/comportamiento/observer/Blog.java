package comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Asunto {

    List<Observador> listaObservadores;
    private boolean cambioDeEstado;

    //constructor
    public Blog() {
        this.listaObservadores = new ArrayList();
        cambioDeEstado = false;
    }

    @Override
    public void registrarObservador(Observador observador) {
        listaObservadores.add(observador);
    }

    @Override
    public void notificarObservador() {
        if (cambioDeEstado) {
            for (Observador observador : listaObservadores) {
                observador.actualizar();
                System.out.println("Observador notificado! ");
            }
        }

    }

    @Override
    public void anularRegistroObservador(Observador observador) {
        listaObservadores.remove(observador);

    }

    @Override
    public Object getActualizacion() {
        Object estadoCambiado = null;
        //Debe tener lógica para enviar el cambio de estado a la consulta del observador

        if (cambioDeEstado) {
            estadoCambiado = " Design Pattern Observador";
        }
        return estadoCambiado;
    }

    public void publicarNuevoArticulo() {
        cambioDeEstado = true;
        notificarObservador();
    }
}
