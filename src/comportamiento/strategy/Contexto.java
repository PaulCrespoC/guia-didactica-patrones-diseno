package comportamiento.strategy;

public class Contexto {
    private Estrategia estrategia;
    public Contexto(Estrategia estrategia) {
        this.estrategia = estrategia;
    }
    public void organizar(int [] entrada){
        estrategia.ordenar(entrada);
    }
}
