package comportamiento.mediator;

public class Main {
    public static void main(String[] args) {
        IMediador mediador = new MediadorConcreto();

        ColegaA hablarColega = new ColegaA(mediador);
        hablarColega.hacerAlgo();

        ColegaB pelearColega = new ColegaB(mediador);
        pelearColega.hacerAlgo();
    }
}
