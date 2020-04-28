package estructurales.adapter.v1;

public class Main {
    public static void main(String[] args) {
        Manzana manzana1 = new Manzana();
        manzana1.getColorDeManzana("VERDE");
        Naranja naranja = new Naranja();
        ManzanaAdaptadora adaptador = new ManzanaAdaptadora(naranja);
        adaptador.getColor("rojo");
    }
}
