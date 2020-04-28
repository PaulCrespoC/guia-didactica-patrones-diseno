package estructurales.decorator;

public abstract class DecorarForma implements Forma {
    protected Forma formadecorada;

    public DecorarForma(Forma formadecorada) {
// TODO Auto-generated constructor stub
        this.formadecorada = formadecorada;
    }

    public void dibujar() {
        formadecorada.dibujar();
    }
}
