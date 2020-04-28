package creacionales.singleton.v2;

public class Main implements Cloneable {
    private static Main instancia = new Main(); //Instance

    public Main() {
        System.out.println("Creando...");
    }

    public static Main getInstancia() { //getInstance
        return instancia;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws Exception {
        Main s1 = Main.getInstancia();
        Main s2 = Main.getInstancia();
        print("s1", s1);
        print("s2", s2);
        Main s3 = (Main) s2.clone();
        print("s3", s3);
    }

    static void print(String name, Main obj) {
        System.out.println(String.format("Objeto: %s, Codigo"
                + "hash:", name, obj.hashCode()));
    }
}