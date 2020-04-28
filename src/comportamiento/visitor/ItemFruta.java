package comportamiento.visitor;

public class ItemFruta implements ElementoDeCarroDeCompras {
    private int precioPorKg;
    private int peso;
    private String nombre;

    public ItemFruta(int precioKg, int pso, String nm) {
        this.precioPorKg = precioKg;
        this.peso = pso;
        this.nombre = nm;
    }

    public int getPrecioPorKg() {
        return precioPorKg;
    }

    public int getPeso() {
        return peso;
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public int accept(CarroDeComprasDelVisitante visitante) {
        return visitante.visita(this);
    }
}
