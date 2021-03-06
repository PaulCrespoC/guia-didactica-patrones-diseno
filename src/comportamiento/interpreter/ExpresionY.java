package comportamiento.interpreter;

public class ExpresionY implements Expresion {
    private Expresion expr1 = null;
    private Expresion expr2 = null;

    public ExpresionY(Expresion expr1, Expresion expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public boolean interpreta(String contexto) {
        return expr1.interpreta(contexto) && expr2.interpreta(contexto);
    }
}
