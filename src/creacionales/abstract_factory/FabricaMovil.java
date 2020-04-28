package creacionales.abstract_factory;

public class FabricaMovil implements IFabricaMovil {
    @Override
    public IFabricaMovil crearMovil(String type) {
        IFabricaMovil mov=null;
        if("lenf".equalsIgnoreCase(type)){
            mov= new LenovoFabricaMovil();
        }else if ("samf".equalsIgnoreCase(type)){
            mov= new SamsungFabricaMovil();
        }
        return mov;
    }
}
