package comportamiento.mediator;

public class ColegaB extends Colega {
    public ColegaB(IMediador mediador) {
        this.mediador = mediador;
        this.mediador.registrarB(this);
    }

    public void hacerAlgo() {
        this.mediador.hablar();
    }
}
