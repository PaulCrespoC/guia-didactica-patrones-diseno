package creacionales.factory;

public class Lenovo implements IMobile {
    @Override
    public void costo() {
        System.out.println("El costo de Lenovo empieza en 10000");
    }

    @Override
    public void capacidadCamara() {
        System.out.println("La Capacidad de la camara de Lenovo comienza en los 10mp");
    }

    @Override
    public void poderBateria() {
        System.out.println("El poder de la bateria Lenovo comienza en los 2500MAh");
    }

    public String toString() {
        return " Lenovo [toString()=" + super.toString() + "]";
    }
}

