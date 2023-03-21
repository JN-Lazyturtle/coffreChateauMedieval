package etat;

import coffre.Coffre;

public abstract class Visible extends Etat {

    @Override
    public void remettreLivre(Coffre c) {
        c.recupererChienGentil();
        c.setEtat(CacheParBibliotheque.getInstance());
    }

    @Override
    public void tournerChandelleVersGauche(Coffre c) {
        c.libererLapintueur();
        c.setEtat(Bloque.getInstance());
    }
}
