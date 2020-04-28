package estructurales.facade.v2;

public class Fachada {
    //Necesitamos ser capaces de simplificar
// la interacción con este sistema de clases
//Para que los clientes puedan interactuar
// con estas clases de una manera sencilla y estandarizada,
//Hacemos esto con la clase de fachada.
//Los nombres de estos métodos indican claramente lo que hacen,
//Y estos métodos ocultan las iteracciones
//de Class1, Class2 y Class3 del cliente
    public int cuboX(int x) {
        Clase1 clase1 = new Clase1();
        return clase1.hacerAlgoComplicado(x);
    }

    public int cuboXVeces2(int x) {
        Clase1 clase1 = new Clase1();
        Clase2 clase2 = new Clase2();
        return clase2.hacerOtraCosa(clase1, x);
    }

    public int multiplicarAmbos(int x) {
        Clase1 clase1 = new Clase1();
        Clase2 clase2 = new Clase2();
        Clase3 clase3 = new Clase3();
        return clase3.hacerMasCosas(clase1, clase2, x);
    }
}
