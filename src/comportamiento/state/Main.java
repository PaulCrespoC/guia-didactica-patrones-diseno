package comportamiento.state;


public class Main {
    public static void main(String[] args) {
        ContextoDelMovil contexto = new ContextoDelMovil(new Timbre());
        contexto.getEstado();
        contexto.setEstadoDelMovil(new Vibracion());
        contexto.getEstado();
        contexto.setEstadoDelMovil(new Silencio());
        contexto.getEstado();
    }
}