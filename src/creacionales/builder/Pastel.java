package creacionales.builder;

public class Pastel {
    private double azucar; //tazas
    private double mantequilla;//tazas
    private double leche;//tazas
    private int cerezas;

    //Contructor de tipo privado para forzar al creacion del objeto a traves de build¡
    private Pastel(ConstruirPastel construir) {
        this.azucar = construir.azucar;//tazas
        this.mantequilla = construir.mantequilla;//tazas
        this.leche = construir.leche;//tazas
        this.cerezas = construir.cerezas;
    }

    public static class ConstruirPastel {
        private double azucar;
        private double mantequilla;
        private double leche;
        private int cerezas;

        //metodos constructores para modificar las propiedades
        public ConstruirPastel azucar(double tazas) {
            this.azucar = tazas;
            return this;
        }

        public ConstruirPastel mantequilla(double tazas) {
            this.mantequilla = tazas;
            return this;
        }

        public ConstruirPastel leche(double tazas) {
            this.leche = tazas;
            return this;
        }

        public ConstruirPastel cerezas(int tazas) {
            this.cerezas = tazas;
            return this;
        }

        //retorna el objeto construido completamente
        public Pastel construir() {
            return new Pastel(this);
        }

        //Para mostrar el objeto creado por la consola
        @Override
        public String toString() {
            return "Pastel [azucar=" + azucar + ", mantequilla=" + mantequilla + ", leche=" + leche + ", cerezas=" + cerezas + "]";
        }
    }
}
