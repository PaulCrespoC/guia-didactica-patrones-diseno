package comportamiento.visitor;

public interface CarroDeComprasDelVisitante {
    int visita(ItemLibro libro);

    int visita(ItemFruta fruta);
}
