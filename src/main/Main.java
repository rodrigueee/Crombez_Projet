package main;

import controleur.Controleur;
import vue.ProjetVue;
import modele.ProjetModele;

public class Main {

    private Controleur ct;
    private ProjetModele pjm;
    private ProjetVue pjv;

    public Main() {

        pjv = new ProjetVue();
        pjm = new ProjetModele();
        ct = new Controleur(pjm,pjv);
        ct.gestion();

    }
    
    public static void main(String[] args){
        Main l = new Main();
    }

}
