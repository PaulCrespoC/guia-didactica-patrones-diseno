package comportamiento.template;

public class Orden_Compra_Online extends PlantillaCompra {
    @Override
    public void seleccionar() {
        System.out.println("Item agregado a la tarjeta online");
        System.out.println("Dar un regalo de preferencia");
        System.out.println("dar direccion de la compra");
    }
    @Override
    public void pagar() {
        System.out.println("El cliente paga a traves de Netbanking/Cards");
    }

    @Override
    public void entregar() {
        System.out.println("Enviar el artículo a través del correo a la dirección de entrega");
    }
}
