package creacionales.factory;

public class FactoryTest {
    public static void main(String [] args) {
        MobileFactory factory = new MobileFactory();
//Creo una maquina de clase Lenovo
        Lenovo lenovoMaquina = (Lenovo) factory.crearMovil("len");
        lenovoMaquina.poderBateria();
        System.out.println("\n***********");
//Creo una maquina de clase Samsung
        Samsung samsungMaquina = (Samsung) factory.crearMovil("sam");
        samsungMaquina.costo();//cost;
    }
}
