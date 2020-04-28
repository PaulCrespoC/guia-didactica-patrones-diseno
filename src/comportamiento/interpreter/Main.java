package comportamiento.interpreter;

public class Main {
    //Regla: Robert y John son masculinos
    public static Expresion getMasculinoexpresion() {
        Expresion roberto = new ExpresionTerminal("Roberto");
        Expresion john = new ExpresionTerminal("John");
        return new ExpresionO(roberto, john);
    }

    //Regla: Julie es mujer casada
    public static Expresion getMujerCasadaExpresion() {
        Expresion julia = new ExpresionTerminal("Julia");
        Expresion casada = new ExpresionTerminal("Casada");
        return new ExpresionY(julia, casada);
    }

    public static void main(String[] args) {
        Expresion esmasculino = getMasculinoexpresion();
        Expresion esMujerCasada = getMujerCasadaExpresion();
        System.out.println("John es masculino? " + esmasculino.interpreta("John"));
        System.out.println("Julia es una mujer casada? " + esMujerCasada.interpreta("Casada Julia"));
    }
}
