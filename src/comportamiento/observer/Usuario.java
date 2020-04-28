package comportamiento.observer;

public class Usuario implements Observador {

    private String articulo;
    private Asunto blog;

    @Override
    public void actualizar() {
        System.out.println("Cambio de estado reportado por el asunto");
        articulo = (String) blog.getActualizacion();

    }

    @Override
    public void setAsunto(Asunto blog) {
        this.blog = blog;
        articulo = "No hay ningun articulo nuevo";

    }

    public String getArticulo() {
        return articulo;
    }
}
