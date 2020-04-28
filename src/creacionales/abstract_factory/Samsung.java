package creacionales.abstract_factory;

public class Samsung implements IMovil {
    @Override
    public void costo() {
        System.out.println("El costo de Samsung comienza por los 6000 $");
    }
    @Override
    public void capacidadCamara() {
        System.out.println("La capacidad de la cámara de Lenovo comienza en los 4 MP");
    }
    @Override
    public void poderBateria() {
        System.out.println("El poder de la bateria Lenovo empieza en los 1200");
    }
}
