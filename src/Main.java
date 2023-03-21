
import fenetre.FenetreChateauMedieval;
import fenetre.FenetreChienGentil;
import fenetre.FenetreEtat;
import fenetre.FenetreLapinTueur;

public class Main {

    public static void main(String[] args) {

        FenetreChateauMedieval fenetreChateauMedieval = new FenetreChateauMedieval();
        FenetreEtat fenetreEtat = new FenetreEtat();
        FenetreLapinTueur fenetreLapinTueur = new FenetreLapinTueur();
        FenetreChienGentil fenetreChienGentil = new FenetreChienGentil();

        fenetreChateauMedieval.getCoffre().attacher(fenetreChateauMedieval);
        fenetreChateauMedieval.getCoffre().attacher(fenetreEtat);
        fenetreChateauMedieval.getCoffre().attacher(fenetreChienGentil);
        fenetreChateauMedieval.getCoffre().attacher(fenetreLapinTueur);



    }
}
