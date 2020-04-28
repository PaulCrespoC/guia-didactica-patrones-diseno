package estructurales.facade.v1;

public class FormadordeFormas {
    private Forma circulo;
    private Forma rectangulo;
    private Forma cuadrado;
    public FormadordeFormas() {
        circulo = new Circulo();
        rectangulo = new Rectangulo();
        cuadrado = new Cuadrado();
    }
    public void dibujarCirculo(){
        circulo.dibujar();
    }
    public void dibujarRectangulo(){
        rectangulo.dibujar();
    }
    public void dibujarCuadrado(){
        cuadrado.dibujar();
    }
}
