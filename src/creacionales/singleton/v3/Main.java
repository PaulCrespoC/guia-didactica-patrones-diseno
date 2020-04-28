package creacionales.singleton.v3;

import java.io.*;

public class Main implements Serializable {
    private static Main instancia = new Main();

    public Main() {
        System.out.println("Creando...");
    }

    public static Main getInstancia() {
        return instancia;
    }

    public static void main(String[] args) throws Exception {
        Main s1 = Main.getInstancia();
        Main s2 = Main.getInstancia();
        print("s1", s1);
        print("s2", s2);
        ObjectOutputStream oos = new ObjectOutputStream(new
                FileOutputStream("/tmp/s2.ser"));
        oos.writeObject(s2);
        ObjectInputStream ois = new ObjectInputStream(new
                FileInputStream("/tmp/s2.ser"));
        Main s3 = (Main) ois.readObject();
        print("s3", s3);
    }

    static void print(String name, Main obj) {
        System.out.println(String.format("Objeto: %s, Código hash: "
                , name, obj.hashCode()));
    }

    private Object readResolve() {
        System.out.println("Aplicación de la resolución de lectura...");
        return instancia;
    }
}
