package estructurales.bridge;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Carro(new NuevoVehiculo(),
                new ViejoVehiculo());
        vehiculo1.compra();

        Vehiculo vehiculo2 = new Bicicleta(new NuevoVehiculo(),
                new ViejoVehiculo());
        vehiculo2.compra();
    }
}
