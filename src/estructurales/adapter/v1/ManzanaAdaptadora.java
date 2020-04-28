package estructurales.adapter.v1;

public class ManzanaAdaptadora extends Manzana {
    private Naranja naranja;

    public ManzanaAdaptadora(Naranja naranja) {
        this.naranja = naranja;
    }

    public void getColor(String color) {
        naranja.getColorDeNaranja(color);
    }
}
