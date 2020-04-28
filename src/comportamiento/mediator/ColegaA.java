package comportamiento.mediator;

public class ColegaA extends Colega {

    public ColegaA(IMediador mediador) {
        this.mediador = mediador;
        this.mediador.registrarA(this);
    }

    public void hacerAlgo() {
        this.mediador.hablar();
    }
}
