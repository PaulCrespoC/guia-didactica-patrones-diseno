package estructurales.decorator;

public class Main {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Forma circulo = new Circulo();
        Forma circuloRojo = new DecorarFormaRojo(new Circulo());
        Forma rectanguloRojo = new DecorarFormaRojo(new Rectangulo());

        System.out.println("Circulo con bordes normales");
        circulo.dibujar();
        System.out.println("\nCirculo de bordes rojos");
        circuloRojo.dibujar();
        System.out.println("\nRectangulo de bordes rojos");
        rectanguloRojo.dibujar();
    }
}