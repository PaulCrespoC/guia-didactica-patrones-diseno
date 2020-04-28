package comportamiento.iterator;


public class Main {
    public static void main(String... args) {

        ListaNumeros ln = new ListaNumeros();
        ListaPalabras lp = new ListaPalabras();
        Iterator iterador;
        ln.agregar(5);
        ln.agregar(3);
        ln.agregar(1);
        ln.agregar(9);
        ln.agregar(2);
        ln.agregar(8);
        lp.agregar("OCHO");
        lp.agregar("CINCO");
        lp.agregar("DOS");
        lp.agregar("UNO");
        lp.agregar("TRES");
        lp.agregar("NUEVE");
        iterador = ln.iterador();
        while (iterador.tieneSiguiente()) {
            // ACCEDE AL ELEMENTO
            int numero = (int) iterador.siguiente();
            // HACER ALGO CON EL ELEMENTO
            System.out.println(numero);
        }
        System.out.println();
        iterador = lp.iterador();
        while (iterador.tieneSiguiente()) {
            String palabra = (String) iterador.siguiente();
            System.out.println(palabra);
        }
    }
}
