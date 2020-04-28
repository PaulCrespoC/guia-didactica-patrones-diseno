package estructurales.flyweight;

public class Circulo implements Molde {
    private String color;
    private int x;
    private int y;
    private int radio;

    public Circulo(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Circulo: Diujar() [Color : " +
                color + ", x : " + x + ", y :" + y +
                ", radio :" + radio);
    }
}
