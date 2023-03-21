package etat;

public class Bloque extends Etat {

    protected static Etat instance;

    private Bloque() {
        super();
    }

    public static Etat getInstance() {
        if (instance == null) {
            instance = new Bloque();
        }
        return instance;
    }
}