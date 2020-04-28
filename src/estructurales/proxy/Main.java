package estructurales.proxy;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("dev", "dev");
        CarpetaProxy carpetaProxy = new CarpetaProxy(usuario);
        System.out.println("Cuando usuario y la contraseña" +
                " son correctos:");
        carpetaProxy.RealizarOperacion();
        System.out.println("***********************************");
        Usuario usuarioInvalido = new Usuario("abc", "abc");
        CarpetaProxy proxyUsuarioInvalido =
                new CarpetaProxy(usuarioInvalido);
        System.out.println("Cuando Usuario y contrseña" +
                " son incorrectos:");
        proxyUsuarioInvalido.RealizarOperacion();
    }
}
