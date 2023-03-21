package coffre;

import etat.CacheParBibliotheque;
import etat.Etat;
import fenetre.Observateur;

import java.util.ArrayList;
import java.util.List;

public class Coffre implements I_CoffreChateau {

    private Etat etat = CacheParBibliotheque.getInstance();
    private boolean lapinestlibere = false;
    private boolean chienestlibere = false;
    private List<Observateur> auditeurs = new ArrayList<>();

    @Override
    public void oterLivre() {
        etat.oterLivre(this);
        avertir();
    }

    @Override
    public void remettreLivre() {
        etat.remettreLivre(this);
        avertir();
    }

    @Override
    public void tournerChandelleVersDroite() {
        etat.tournerChandelleVersDroite(this);
        avertir();
    }

    @Override
    public void tournerChandelleVersGauche() {
        etat.tournerChandelleVersGauche(this);
        avertir();
    }

    @Override
    public void fermerCoffre() {
        etat.fermerCoffre(this);
        avertir();
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

    @Override
    public boolean peutOterLivreUML() {
        return etat.peutOterLivreUML();
    }

    @Override
    public boolean peutTournerChandelleVersDroite() {
        return etat.peutTournerChandelleVersDroite();
    }

    @Override
    public boolean peutTournerChandelleVersGauche() {
        return etat.peutTournerChandelleVersGauche();
    }

    @Override
    public boolean peutFermerCoffre() {
        return etat.peutFermerCoffre();
    }

    @Override
    public boolean peutRemettreLivreUML() {
        return etat.peutRemettreLivreUML();
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public void libererLapintueur() {
        this.lapinestlibere = true;
        avertir();
    }

    public void libererChienGentil() {
        this.chienestlibere = true;
        avertir();
    }

    public void recupererChienGentil() {
        this.chienestlibere = false;
        avertir();
    }

    public void attacher(Observateur observateur) {
        if (!auditeurs.contains(observateur)) {
            auditeurs.add(observateur);
            avertir();
        }
    }

    private void avertir() {
        for (Observateur observateur : auditeurs) {
            observateur.mettreAJour(this);
        }
    }


}
