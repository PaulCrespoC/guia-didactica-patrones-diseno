package comportamiento.observer;

public class Main {
    public static void main(String[] args) {

        Blog blog = new Blog();
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();
        blog.registrarObservador(usuario1);
        blog.registrarObservador(usuario2);
        usuario1.setAsunto(blog);
        usuario2.setAsunto(blog);
        System.out.println(usuario1.getArticulo());
        blog.publicarNuevoArticulo();
        System.out.println(usuario2.getArticulo());

    }
}