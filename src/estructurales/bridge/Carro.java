package estructurales.bridge;

public class Carro extends Vehiculo{
    public Carro(TipoVehiculo tipo1, TipoVehiculo tipo2){
        super(tipo1, tipo2);
    }
    @Override
    public void compra(){
        System.out.println("Carro");
        tipo1.libro();
        tipo2.libro();
    }
}
