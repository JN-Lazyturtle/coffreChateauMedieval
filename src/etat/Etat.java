package etat;

import coffre.Coffre;

public abstract class Etat {

    public void oterLivre(Coffre c) {}

    public void remettreLivre(Coffre c) {}

    public void tournerChandelleVersDroite(Coffre c) {}

    public void tournerChandelleVersGauche(Coffre c) {}

    public void fermerCoffre(Coffre c) {}

    public boolean peutOterLivreUML() {
        return false;
    }

    public boolean peutTournerChandelleVersDroite() {
        return false;
    }

    public boolean peutTournerChandelleVersGauche() {
        return false;
    }

    public boolean peutFermerCoffre() {
        return false;
    }

    public boolean peutRemettreLivreUML() {
        return false;
    }


}
