package estructurales.decorator;

public class DecorarFormaRojo extends DecorarForma {
    public DecorarFormaRojo(Forma formadecorada) {
// TODO Auto-generated constructor stub
        super(formadecorada);
    }

    @Override
    public void dibujar() {
        formadecorada.dibujar();
    }

    public void setBordesRojos(Forma formadecorada) {
        System.out.println("Bordes de color: Rojo");
    }
}
