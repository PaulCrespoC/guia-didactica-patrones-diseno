package comportamiento.responsability;

//Esta es la interfaz que actúa como un enlace de cadena
public interface Cadena {
    void setSiguiente(Cadena siguienteEnCadena);

    void proceso(Numero solicitud);
}
