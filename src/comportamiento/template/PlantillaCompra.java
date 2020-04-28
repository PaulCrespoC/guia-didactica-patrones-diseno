package comportamiento.template;

public abstract class PlantillaCompra {

    public abstract void seleccionar();
    public abstract void pagar();

    public final void hacerPaquetes(){
        System.out.println("Regalo envuelto");
    }

    public abstract void entregar();

    public final void procesarOrden(){
        seleccionar();
        pagar();
        hacerPaquetes();
        entregar();
    }
}
