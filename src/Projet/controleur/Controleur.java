package controleur;

import vue.ProjetVue;
import modele.ProjetModele;
import java.util.List;
import modele.Client;
import modele.Membres;
import modele.Projet;

public class Controleur {

    /**
     * Declaration de variables des types
     */
    private ProjetModele pm;
    private ProjetVue pv;

    /**
     * Constructeur par defaut
     */
    public Controleur() {

    }
    /**
     * Constructeur paramétré
     * @param pm
     * @param pv 
     */
    public Controleur(ProjetModele pm, ProjetVue pv) {

        this.pm = pm;
        this.pv = pv;
    }

    public void gestion() {
        int ch;
        do {
            ch = pv.menu();

            switch (ch) {
                case 1:
                    ajoutClient();
                    break;
                case 2:
                    ajoutMembre();
                    break;
                case 3:
                    ajoutProjet();
                    break;
                case 4:
                    changementAdresseC();
                    break;
                case 5:
                   // ListeClients();
                    break;
                case 6:
                   // ListeMembres();
                    break;
                case 7:
                    pv.affMsg("Bye");
                    break;
                default:
                    pv.affMsg("Choix invalide");

            }
        } while (ch != 7);
    }

    public void ajoutClient() {
        Client cl = pv.encodeClient();
        String msg = pm.ajouterClient(cl);
        pv.affMsg(msg);
    }

    public void ajoutMembre() {
        Membres mb = pv.encodeMembre();
        String msg = pm.ajouterMembre(mb);
        pv.affMsg(msg);
    }

    public void ajoutProjet() {
        Projet pj = pv.encodeProjet();
        String msg = pm.ajouterProjet(pj);
        pv.affMsg(msg);
    }

    public void changementAdresseC() {

        Client cliRech = rechClient();
        if (cliRech == null) {
            pv.affMsg("Client introuvable");
            return;
        }
        pv.affClient(cliRech);
        String nvadr = pv.getMsg("nouvelle adresse : ");
        String msg = pm.changeAdresse(cliRech, nvadr);
        pv.affMsg(msg);
    }

    public Client rechClient() {
        Client cRech = pv.formRechClient();
        return pm.getClient(cRech);
    }
/*
    public void listeClients() {
        List<Client> lc = pm.tousClients();
        pv.affListe(lc);
    }

    public void listeMembres() {
        List<Membres> lm = pm.tousMembres();
        pv.affListe(lm);
    }
*/
}
