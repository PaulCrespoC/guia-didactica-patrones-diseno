package creacionales.prototype;

public class Bicicleta implements Cloneable {

    private int engranajes;
    private String TipoBicicleta;
    private String modelo;

    public Bicicleta() {
        TipoBicicleta = "Estandar";
        modelo = "Leopardo";
        engranajes = 4;
    }

    public Bicicleta clonar() {
        return new Bicicleta();
    }

    public void makeAdvanced() {
        TipoBicicleta = "Avanzada";
        modelo = "Jaguar";
        engranajes = 6;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Bicicleta [Engranajes= " + engranajes + ", Tipo de bicicleta= " + TipoBicicleta + ", modelo= " + modelo + "]";
    }
}
