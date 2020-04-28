package estructurales.composite;

public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Desarrollador("Jhon", 10000);
        Empleado emp2 = new Desarrollador("David", 15000);
        Empleado manager1 = new Gerente("Daniel", 25000);
        manager1.agregar(emp1);
        manager1.agregar(emp2);
        Empleado emp3 = new Desarrollador("Michael", 20000);
        Gerente generalManager = new Gerente("Mark", 50000);
        generalManager.agregar(emp3);
        generalManager.agregar(manager1);
        System.out.println("\tManager General");
        generalManager.imprimir();
        System.out.println("\tManager1");
        manager1.imprimir();
    }
}