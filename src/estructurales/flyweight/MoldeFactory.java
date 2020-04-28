package estructurales.flyweight;

import java.util.HashMap;

public class MoldeFactory {
    private static final HashMap<String, Molde> circuloMap = new
            HashMap<>();

    public static Molde getCirculo(String color) {
        Circulo circulo = (Circulo) circuloMap.get(color);
        if (circulo == null) {
            circulo = new Circulo(color);
            circuloMap.put(color, circulo);
            System.out.println("Se esta creando el circulo de color : "
                    + color);
        }
        return circulo;
    }
}
