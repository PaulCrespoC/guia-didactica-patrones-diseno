package creacionales.abstract_factory;

public class LenovoFabricaMovil extends FabricaMovil{
    Lenovo crearMovilLenovo(){
        return new Lenovo();
    }
}
