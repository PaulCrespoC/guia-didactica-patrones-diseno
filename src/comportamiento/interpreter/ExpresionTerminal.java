package comportamiento.interpreter;

public class ExpresionTerminal implements Expresion {
    private String datos;

    public ExpresionTerminal(String datos) {
        this.datos = datos;
    }

    public boolean interpreta(String contexto) {
        if (contexto.contains(datos)) {
            return true;
        }
        return false;
    }
}
