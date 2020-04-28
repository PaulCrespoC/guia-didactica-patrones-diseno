package creacionales.singleton.v4;

public class Main {

    private static Main instancia= null;
    public Main(){
        System.out.println("Creando...");
    }
    public static Main getInstancia() {
        if (instancia==null){
            instancia=new Main();
        }
        return instancia;

    }
    static void usarSingelton(){
        Main singleton = Main.getInstancia();
        print("singelton",singleton );
    }

    public static void main(String[] args) {
        //ExecutorServise service = SingeltonT.newFixedThreadPool(2);
        //service.submit(SingeltonT::usarSingelton);
        //service.submit(SingeltonT::usarSingelton);
        //service.shutdown();
    }
    static void print(String name, Main obj){
        System.out.println(String.format("Objeto: %s, Codigo hash: %s",name,obj.hashCode()));
    }
}
