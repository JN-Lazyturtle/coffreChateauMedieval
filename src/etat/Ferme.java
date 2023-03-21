package etat;

import coffre.Coffre;

public class Ferme extends Visible {

    protected static Etat instance;

    private Ferme() {
        super();
    }

    public static Etat getInstance() {
        if (instance == null) {
            instance = new Ferme();
        }
        return instance;
    }

    @Override
    public void tournerChandelleVersDroite(Coffre c) {
        c.libererChienGentil();
        c.setEtat(PresqueOuvert.getInstance());
    }
}
