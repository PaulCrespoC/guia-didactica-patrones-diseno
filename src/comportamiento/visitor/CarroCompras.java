package comportamiento.visitor;

public class CarroCompras implements CarroDeComprasDelVisitante {
    @Override
    public int visita(ItemLibro libro) {
        int costo = 0;
        if (libro.getPrecio() > 50) {
            costo = libro.getPrecio() - 5;
        } else {
            costo = libro.getPrecio();
        }
        System.out.println("Libro ISBN: " + libro.getIsbnNumero() + " costo: " + costo);
        return costo;
    }

    @Override
    public int visita(ItemFruta fruta) {
        int costo = fruta.getPrecioPorKg() * fruta.getPeso();
        System.out.println(fruta.getNombre() + " costo: " + costo);
        return costo;
    }
}
