package comportamiento.visitor;

public class ItemLibro implements ElementoDeCarroDeCompras {
    private int precio;
    private String isbnNumero;

    public ItemLibro(int costo, String isbn) {
        this.precio = costo;
        this.isbnNumero = isbn;
    }

    public int getPrecio() {
        return precio;
    }

    public String getIsbnNumero() {
        return isbnNumero;
    }

    @Override
    public int accept(CarroDeComprasDelVisitante visitante) {
        return visitante.visita(this);
    }
}
