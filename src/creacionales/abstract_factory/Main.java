package creacionales.abstract_factory;

import creacionales.factory.MobileFactory;

public class Main {
    public static void main(String[] args) {
        MobileFactory fabrica = new MobileFactory();
        LenovoFabricaMovil lmf = (LenovoFabricaMovil) fabrica.crearMovil("lenf");
        Lenovo ln = (Lenovo) lmf.crearMovilLenovo();
        ln.capacidadCamara();
        ;
    }
}

