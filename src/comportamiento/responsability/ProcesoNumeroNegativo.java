package comportamiento.responsability;

public class ProcesoNumeroNegativo implements Cadena {
    private Cadena siguienteEnCadena;

    @Override
    public void setSiguiente(Cadena c) {
        siguienteEnCadena = c;

    }

    @Override
    public void proceso(Numero solicitud) {
        if (solicitud.getNumero() < 0) {
            System.out.println("Proceso numeronegativo: " + solicitud.getNumero());

        } else {
            siguienteEnCadena.proceso(solicitud);
        }

    }
}
