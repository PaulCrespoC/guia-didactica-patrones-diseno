package comportamiento.template;

public class Main {
    public static void main(String[] args) {
        PlantillaCompra online = new Orden_Compra_Online();
        online.procesarOrden();
        PlantillaCompra offline = new Orden_Compra_En_Tienda();
        offline.procesarOrden();
    }
}
