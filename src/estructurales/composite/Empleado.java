package estructurales.composite;

public interface Empleado {
    public void agregar(Empleado emp);

    public void eliminar(Empleado emp);

    public Empleado getChild(int i);

    public String getNombre();

    public double getSalario();

    public void imprimir();
}
