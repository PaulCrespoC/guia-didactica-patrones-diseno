package estructurales.proxy;

public class CarpetaProxy implements MiCarpeta {
    Carpeta carpeta;
    Usuario usuario;

    public CarpetaProxy(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void RealizarOperacion() {
        if (usuario.getNombreUsuario().equalsIgnoreCase("dev") &&
                usuario.getContrasena().equalsIgnoreCase("dev")) {
            carpeta = new Carpeta();
            carpeta.RealizarOperacion();
        } else {
            System.out.println("Usted no tiene acceso a esta carpeta");
        }
    }
}
