package comportamiento.visitor;

public class Main {
    public static void main(String[] arg) {
        ElementoDeCarroDeCompras[] items = new ElementoDeCarroDeCompras[]{
                new ItemLibro(20, "123"), new ItemLibro(100, "5678"),
                new ItemFruta(10, 2, "Banana"), new ItemFruta(5, 5, "Manzana")};
        int total = calcularPrecio(items);
        System.out.println("Costo Total: " + total);
    }

    public static int calcularPrecio(ElementoDeCarroDeCompras[] items) {
        CarroDeComprasDelVisitante visitante = new
                CarroCompras
                ();
        int suma = 0;
        for (ElementoDeCarroDeCompras item : items) {
            suma += item.accept(visitante);
        }
        return suma;
    }
}
