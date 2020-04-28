package creacionales.abstract_factory;

public class SamsungFabricaMovil extends FabricaMovil{
    Samsung crearMovilSamsung(){
        return new Samsung();
    }
}
