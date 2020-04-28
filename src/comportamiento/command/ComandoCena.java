package comportamiento.command;

/*La clase ComandoCena es similar a la clase ComandoAlmuerzo
Esta contiene una referencia a la clase Cena que es el receptor
*/
public class ComandoCena implements Comando {
    Cena cena;

    public ComandoCena(Cena cena) {
        this.cena = cena;
    }

    @Override
    public void ejecutar() {
        cena.hacerCena();

    }
}
