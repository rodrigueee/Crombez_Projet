/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.*;


public class ProjetModele {
    /**
     * liste de tous les clients
     */
    protected List<Client> mesClients = new ArrayList<>();
    protected List<Membres> mesMembres = new ArrayList<>();
    protected List<Projet> mesProjets = new ArrayList<>();
    
    /**
     * Constructeur par défaut
     */
    public ProjetModele(){
        
    }
    /**
     * 
     */
    public String ajouterClient(Client cl){
        if(cl==null){
            return "Client inexistant";
        }
        if(mesClients.contains(cl)){
            return "Client déjà crée";
        }
        mesClients.add(cl);
        return "Ajoute du client";
    }
        /**
     * 
     */
    public String ajouterMembre(Membres mb){
        if(mb==null){
            return "Membre inexistant";
        }
        if(mesMembres.contains(mb)){
            return "Membre déjà crée";
        }
        mesMembres.add(mb);
        return "Ajout du membre";
    }
           /**
     * 
     */
    public String ajouterProjet(Projet pj){
        if(pj==null){
            return "Projet inexistant";
        }
        if(mesProjets.contains(pj)){
            return "Projet déjà crée";
        }
        mesProjets.add(pj);
        return "Ajout du Projet";
    }
    /**
     * 
     */
    public String changeAdresse(Client cl,String adr){
        cl.setAdresse(adr);
        return "Changement d'adrese effectué";
    }
    /**
     * 
     */
    public Client getClient(Client cRech) {
                int p = mesClients.indexOf(cRech);
        if(p<0) {
            return null;
        }
        else {
            return mesClients.get(p);
        }
    }
    
    
    
    
}
