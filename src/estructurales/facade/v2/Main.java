package estructurales.facade.v2;

public class Main {
    public static void main(String[] args) {
        Fachada fachada = new Fachada();

        int x = 3;
        System.out.println("Cubo de " + x + ": " + fachada.cuboX(x));
        System.out.println("Cubo de " + x + " Times 2: " +
                fachada.cuboXVeces2(x));
        System.out.println("Valor " + x + " Multiplica la Clase1 y Clase2:"
                + fachada.multiplicarAmbos(x));
    }
}
