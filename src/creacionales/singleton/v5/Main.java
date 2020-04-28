package creacionales.singleton.v5;

public class Main {

    private Main() {
        System.out.println("Creando...");
    }

    static class Modelador {
        static final Main INSTANCE = new Main();
    }

    public static Main getInstancia() {
        return Modelador.INSTANCE;
    }

    public static void main(String[] args) {
        Main s1 = Main.getInstancia();
        Main s2 = Main.getInstancia();
        Main s3 = Main.getInstancia();
        print("s1", s1);
        print("s2", s2);
        print("s3", s3);
    }

    static void print(String name, Main obj) {
        System.out.println(String.format("Objeto: %s, Codigo" +
                "hash:", name, obj.hashCode()));
    }
}
