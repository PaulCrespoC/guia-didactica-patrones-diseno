package estructurales.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Gerente implements Empleado {
    private String nombre;
    private double salario;

    public Gerente(String name, double salary) {
        this.nombre = name;
        this.salario = salary;
    }

    ArrayList<Empleado> empleados = new ArrayList<Empleado>();

    @Override
    public void agregar(Empleado emp) {
        empleados.add(emp);
    }

    @Override
    public void eliminar(Empleado emp) {
        empleados.remove(emp);
    }

    @Override
    public Empleado getChild(int i) {
        return empleados.get(i);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void imprimir() {
        System.out.println("-----------------");
        System.out.println("Nombre = " + this.getNombre());
        System.out.println("Salario = " + this.getSalario());
        System.out.println("-----------------");
        Iterator<Empleado> empIterator = empleados.iterator();
        while (empIterator.hasNext()) {
            Empleado emp = empIterator.next();
            emp.imprimir();
        }
    }
}
