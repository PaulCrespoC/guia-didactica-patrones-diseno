package comportamiento.command;

/*Comando almuerzo implementa la interfaz Comando.Esta contiene una referencia a la clase
Almuerzo que es el receptor
El metodo ejecutar() invoca la accion apropiada del receptor
*/
public class ComandoAlmuerzo implements Comando {
    Almuerzo almuerzo;

    public ComandoAlmuerzo(Almuerzo al) {
        almuerzo = al;
    }

    @Override
    public void ejecutar() {
        almuerzo.hacerAlmuerzo();
    }
}
