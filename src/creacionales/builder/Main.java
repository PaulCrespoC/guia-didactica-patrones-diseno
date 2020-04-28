package creacionales.builder;

public class Main {
    public static void main(String[] args) {
        //Crear el objeto usando en patron builer
        Pastel bizcocho = new Pastel.ConstruirPastel().azucar(1).mantequilla(0.5).leche(0.5).cerezas(2).construir();
        //El objeto creado se muestra por la pantalla
        System.out.println(bizcocho);
    }
}