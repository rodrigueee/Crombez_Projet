/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import Model.Client;
import Model.Membres;
import Model.Projet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class ProjetVue {

    private Scanner sc = new Scanner(System.in);

    public int menu() {
        List<String> listeItems = new ArrayList<>(Arrays.asList(
                "ajouter client",
                "ajouter membre",
                "ajouter projet",
                "changement d'adresse",
                "liste clients",
                "liste membres",
                "fin"));
        //affListe(ListeItems);

        int ch;
        do {
            String chs = getMsg("Votre choix");
            ch = Integer.parseInt(chs);
            if (ch > 0 && ch <= listeItems.size()) {
                break;
            }
            affMsg("Choix incorrect");
        } while (true);
        return ch;

    }
        
    
    public Client encodeClient(){
        String nom =getMsg("Nom du client : ");
        String tel=getMsg("Numéro de tel du client : ");
        String adresse = getMsg("Adresse du client : ");
        Client cl = new Client(nom,tel,adresse);
        return cl;
    }
    
    public Membres encodeMembre(){
        String nom=getMsg("Nom du membre : ");
        String prenom = getMsg("Prénom du membre : ");
        String gsm=getMsg("GSM du membre : ");
        String email=getMsg("Email du membre : ");
        Membres mb =new Membres(nom,prenom,gsm,email);
        return mb;
    }
    
    public Projet encodeProjet()
    {
        String titre=getMsg("Titre du projet : ");
        String dated=getMsg("Date du début du projet : ");
        String datef=getMsg("Date de fin du projet : ");
        Projet pj = new Projet(titre,dated,datef);
        return pj;
    }
    
    public void affClient(Client cl) {
        affMsg("Nom : " + cl.getNom());
        affMsg("Tel : " + cl.getTel());
        affMsg("Adresse : " + cl.getAdresse());
    }
    
    public void affMembre(Membres mb) {
        affMsg("Nom : "+ mb.getNom());
        affMsg("Prenom : " +mb.getPrenom());
        affMsg("GSM : "+ mb.getGsm());
        affMsg("Email : "+ mb.getEmail());
    }
    
    public void affProjet(Projet pj) {
        affMsg("Titre : "+ pj.getTitre());
        affMsg("Date de debut : "+ pj.getDated());
        affMsg("Date de fin : "+ pj.getDatef());
    }
    
    public String getMsg(){
        String msg = sc.nextLine();
        return msg;
    }
    
    public void affMsg(Object msg) {
        System.out.println(msg);
    }
    
    public String getMsg(String msg) {
        affMsg(msg);
        return getMsg();
    }
    
    public void affListe(Collection liste){
        int i=1;
        for(Object o : liste){
            affMsg((i++)+"." + o);
        }
    }
    
    

}
