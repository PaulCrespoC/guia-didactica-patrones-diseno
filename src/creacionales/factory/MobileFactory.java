package creacionales.factory;

public class MobileFactory {
    public MobileFactory() {
    }

    public IMobile crearMovil(String type) {
        IMobile movil = null;
        if ("len".equalsIgnoreCase(type)) {
            movil = new Lenovo();
            System.out.println("Movil Lenovo Creado");
        } else if ("sam".equalsIgnoreCase(type)) {
            movil = new Samsung();
            System.out.println("Movil Samsung Creado");
        }
        return movil;
    }
}
