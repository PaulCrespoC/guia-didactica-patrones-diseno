package comportamiento.responsability;

public class Main {
    public static void main(String[] args) {

        //configurar la cadena de responsabilidad
        Cadena c1 = new ProcesoNumeroNegativo();
        Cadena c2 = new ProcesoCero();
        Cadena c3 = new ProcesoNumeroPositivo();
        c1.setSiguiente(c2);
        c2.setSiguiente(c3);

        //llamando a la cadena de responsabilidad
        c1.proceso(new Numero(99));
        c1.proceso(new Numero(-30));
        c1.proceso(new Numero(0));
        c1.proceso(new Numero(100));
    }
}
