package Launcher;

import controleur.Controleur;
import vue.ProjetVue;
import Model.ProjetModele;

public class Launch {

    private Controleur ct;
    private ProjetModele pjm;
    private ProjetVue pjv;

    public Launch() {

        pjv = new ProjetVue();
        pjm = new ProjetModele();
        ct = new Controleur(pjm,pjv);
        ct.gestion();

    }
    
    public static void main(String[] args){
        Launch l = new Launch();
    }

}
