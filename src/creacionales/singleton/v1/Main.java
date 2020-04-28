package creacionales.singleton.v1;

import java.lang.reflect.Constructor;

public class Main {
    private static Main instancia = new Main();

    public Main() {
        System.out.println("Creando...");
        if(instancia != null){
            throw new RuntimeException("");
        }
    }

    public static Main getInstancia() {
        return instancia;
    }

    public static void main(String[] args) throws Exception,
            SecurityException {
        Main s1 = Main.getInstancia();
        Main s2 = Main.getInstancia();

        print("s1", s1);
        print("s2", s2);
        Class clazz = Class.forName("com.dev.dp.creational.singleton.SingletonR");
        Constructor<Main> ctor = clazz.getDeclaredConstructor();
        ctor.setAccessible(true);
        Main s3 = ctor.newInstance();
        print("s3", s3);
    }

    static void print(String name, Main obj) {
        System.out.println(String.format("Objeto: %s, Codigo Hash: %s", name, obj.hashCode()));
    }
}