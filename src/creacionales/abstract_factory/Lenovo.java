package creacionales.abstract_factory;

public class Lenovo implements IMovil {
    @Override
    public void costo() {
        System.out.println("El costo de Lenovo empieza en 10000");
    }
    @Override
    public void capacidadCamara() {
        System.out.println("La Capacidad de la cámara de Lenovo comienza en los 10 MP");
    }
    @Override
    public void poderBateria() {
        System.out.println("El poder de la bateria Lenovo comienza en los 2500MAh");
    }
    public String toString() {
        return " Lenovo [toString()="+super.toString()+"]";
    }
}
