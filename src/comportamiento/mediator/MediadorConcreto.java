package comportamiento.mediator;

public class MediadorConcreto implements IMediador {

    ColegaA hablar;
    ColegaB luchar;

    public void hablar() {
        System.out.println("El mediador esta hablando");
    }

    public void luchar() {
        System.out.println("El mediador esta luchando");
    }

    public void registrarA(ColegaA a) {
        this.hablar = a;
    }

    public void registrarB(ColegaB b) {
        this.luchar = b;
    }
}
