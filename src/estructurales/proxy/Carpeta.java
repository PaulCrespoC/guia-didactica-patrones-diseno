package estructurales.proxy;

public class Carpeta implements MiCarpeta {
    @Override
    public void RealizarOperacion() {
        System.out.println("Operación de abordaje en la carpeta");
    }
}
