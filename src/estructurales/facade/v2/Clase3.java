package estructurales.facade.v2;

public class Clase3 {
    //El método hacerMasCosas() de la Clase3
// toma un objeto de Clase1, un objeto de Clase2 y los multiplica.
    public int hacerMasCosas(Clase1 clase1, Clase2 clase2, int x) {
        return clase1.hacerAlgoComplicado(x) * clase2.hacerOtraCosa(clase1, x);
    }
}
