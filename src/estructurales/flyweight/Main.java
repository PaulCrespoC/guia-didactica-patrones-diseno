package estructurales.flyweight;

public class Main {
    private static final String colores[] = {"Rojo", "Verde", "Azul",
            "Blanco", "Negro"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; ++i) {
            Circulo circulo = (Circulo)
                    MoldeFactory.getCirculo(getRandomColor());
            circulo.setX(getRandomX());
            circulo.setY(getRandomY());
            circulo.setRadio(100);
            circulo.dibujar();
        }
    }

    private static String getRandomColor() {
        return colores[(int) (Math.random() * colores.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
