package etat;

import coffre.Coffre;

public class Ouvert extends Etat{

    protected static Etat instance;

    private Ouvert() {
        super();
    }

    public static Etat getInstance() {
        if (instance == null) {
            instance = new Ouvert();
        }
        return instance;
    }

    public void fermerCoffre(Coffre c) {
        c.setEtat(Ferme.getInstance());
    }
}
