package estructurales.bridge;

public class Bicicleta extends Vehiculo{
    public Bicicleta(TipoVehiculo tipo1, TipoVehiculo tipo2){
        super(tipo1,tipo2);
    }

    @Override
    public void compra(){
        System.out.println("Bicicleta");
        tipo1.libro();
        tipo2.libro();
    }
}
