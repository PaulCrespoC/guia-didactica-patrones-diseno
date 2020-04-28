package creacionales.factory;

public class Samsung implements IMobile {
    @Override
    public void costo() {
        System.out.println("El costo de Samsung comienza por los 6000 $");
    }

    @Override
    public void capacidadCamara() {
        System.out.println("La capacidad de la camara de Lenovo comienza en los 4mp");
    }

    @Override
    public void poderBateria() {
        System.out.println("El poder de la bateria Lenovo empieza en los 1200");
    }
}
