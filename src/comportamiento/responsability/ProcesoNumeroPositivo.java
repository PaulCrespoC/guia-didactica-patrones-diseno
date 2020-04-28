package comportamiento.responsability;

public class ProcesoNumeroPositivo implements Cadena {
    private Cadena siguienteEnCadena;

    @Override
    public void setSiguiente(Cadena c) {
        siguienteEnCadena = c;

    }

    @Override
    public void proceso(Numero solicitud) {
        if (solicitud.getNumero() > 0) {
            System.out.println("Proceso numero positivo: " + solicitud.getNumero());

        } else {
            siguienteEnCadena.proceso(solicitud);
        }

    }
}
