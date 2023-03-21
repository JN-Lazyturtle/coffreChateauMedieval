package coffre;

import etat.CacheParBibliotheque;
import etat.Etat;

public class Coffre implements I_CoffreChateau {

    private Etat etat = CacheParBibliotheque.getInstance();
    private boolean lapinestlibere = false;
    private boolean chienestlibere = false;

    @Override
    public void oterLivre() {
        etat.oterLivre(this);
    }

    @Override
    public void remettreLivre() {
        etat.remettreLivre(this);
    }

    @Override
    public void tournerChandelleVersDroite() {
        etat.tournerChandelleVersDroite(this);
    }

    @Override
    public void tournerChandelleVersGauche() {
        etat.tournerChandelleVersGauche(this);
    }

    @Override
    public void fermerCoffre() {
        etat.fermerCoffre(this);
    }

    @Override
    public boolean lapinEstLibere() {
        return lapinestlibere;
    }

    @Override
    public boolean chienEstLibere() {
        return chienestlibere;
    }

    @Override
    public String nomEtat() {
        return etat.getClass().getSimpleName();
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public void libererLapintueur() {
        this.lapinestlibere = true;
    }

    public void libererChienGentil() {
        this.chienestlibere = true;
    }

    public void recupererChienGentil() {
        this.chienestlibere = false;
    }
}
