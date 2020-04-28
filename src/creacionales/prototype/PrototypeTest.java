package creacionales.prototype;

public class PrototypeTest {
    public Bicicleta HacerJaguar(Bicicleta basicaBicicleta) {
        basicaBicicleta.makeAdvanced();
        return basicaBicicleta;
    }

    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta();
        Bicicleta basicaBicicleta = bicicleta.clonar();
        PrototypeTest pt = new PrototypeTest();
        Bicicleta BicicletaAvanzada = pt.HacerJaguar(basicaBicicleta);
        System.out.println("Prototype Design Pattern: " + BicicletaAvanzada.getModelo());
        System.out.println("Prototype Design Pattern: " + BicicletaAvanzada.toString());
        ;
    }
}
