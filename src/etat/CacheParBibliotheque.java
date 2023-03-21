package etat;

import coffre.Coffre;

public class CacheParBibliotheque extends Etat {

    protected static Etat instance;

    private CacheParBibliotheque() {
        super();
    }

    public static Etat getInstance() {
        if (instance == null) {
            instance = new CacheParBibliotheque();
        }
        return instance;
    }

    @Override
    public void oterLivre(Coffre c) {
        c.setEtat(Ferme.getInstance());

    }

    @Override
    public boolean peutOterLivreUML() {
        return true;
    }
}
