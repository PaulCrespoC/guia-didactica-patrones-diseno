package comportamiento.strategy;

public class Main {
    public static void main(String[] args) {
        int[] var = {1, 2, 3, 4, 5};
//Podemos utilizar cualquier estrategia para hacer el ordenamiento
        Contexto ctx = new Contexto(new OredenamientoBurbuja());
        ctx.organizar(var);
//Podemos cambiar la estrategia sin cambiar la clase de Contexto
        ctx = new Contexto(new OrdenamientoRapido());
        ctx.organizar(var);
    }
}
