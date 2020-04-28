package comportamiento.memento;

public class Main {
    public static void main(String[] args) {
        Autor originator = new Autor();
        Vigilante careTaker = new Vigilante();
        originator.setEstado("State #1");
        originator.setEstado("State #2");
        careTaker.add(originator.guardarEstadoPorElMomento());
        originator.setEstado("State #3");
        careTaker.add(originator.guardarEstadoPorElMomento());
        originator.setEstado("State #4");
        System.out.println("Current State: " + originator.getEstado());
        originator.getEstadoMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getEstado());
        originator.getEstadoMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getEstado());
    }
}
