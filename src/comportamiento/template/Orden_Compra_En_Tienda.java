package comportamiento.template;

public class Orden_Compra_En_Tienda extends PlantillaCompra{
    @Override
    public void seleccionar() {
        System.out.println("El cliente elige el artículo del estante");
    }
    @Override
    public void pagar() {
        System.out.println("El cliente paga en efectivo");
    }
    public void entregar() {
        System.out.println("El articulo ha sido entregado");
    }
}
