package etat;

import coffre.Coffre;

public class PresqueOuvert extends Visible {

    protected static Etat instance;

    private PresqueOuvert() {
        super();
    }

    public static Etat getInstance() {
        if (instance == null) {
            instance = new PresqueOuvert();
        }
        return instance;
    }

    @Override
    public void tournerChandelleVersDroite(Coffre c) {
        c.setEtat(Ouvert.getInstance());
    }
}
