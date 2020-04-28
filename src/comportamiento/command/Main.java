package comportamiento.command;


public class Main {
    public static void main(String[] args) {
        Almuerzo almuerzo = new Almuerzo();//receptor
        Comando almuerzoComando = new ComandoAlmuerzo(almuerzo);//comando concreto

        Cena cena = new Cena();//receptor
        Comando cenaComando = new ComandoCena(cena);//comando concreto

        InvocadorComida invocadorComida = new
                InvocadorComida(almuerzoComando);//invocador
        invocadorComida.invocar();

        invocadorComida.setComando(cenaComando);
        invocadorComida.invocar();

    }
}
