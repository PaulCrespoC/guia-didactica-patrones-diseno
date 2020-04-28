package estructurales.bridge;

public abstract class Vehiculo {
    protected TipoVehiculo tipo1;
    protected TipoVehiculo tipo2;

    public Vehiculo(TipoVehiculo tipo1, TipoVehiculo tipo2){
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
    }

    abstract public void compra();
}
