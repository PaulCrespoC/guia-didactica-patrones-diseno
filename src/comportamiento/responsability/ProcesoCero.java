package comportamiento.responsability;

public class ProcesoCero implements Cadena {
    private Cadena siguienteEnCadena;

    @Override
    public void setSiguiente(Cadena c) {
        siguienteEnCadena = c;
    }

    @Override
    public void proceso(Numero solicitud) {
        if (solicitud.getNumero() == 0) {
            System.out.println("Proceso cero: " + solicitud.getNumero());

        } else {
            siguienteEnCadena.proceso(solicitud);
        }

    }
}
