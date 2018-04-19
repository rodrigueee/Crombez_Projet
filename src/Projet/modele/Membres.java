package modele;

import java.util.Objects;

/**
 *
 */
public class Membres {

    /**
     * Default constructor
     */
    protected String nom = "";
    protected String prenom = "";
    protected String gsm = "";
    protected String email = "";

    public Membres() {
    }

    public Membres(String nom, String prenom, String gsm, String email) {  //constructeur basé sur les informations d'identification
        this.nom = nom;
        this.prenom = prenom;
        this.gsm = gsm;
        this.email = email;
    }

    public String getNom() {
        // TODO implement here
        return nom;
    }

    /**
     * @param value
     */
    public void setNom(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getPrenom() {
        // TODO implement here
        return prenom;
    }

    /**
     * @param value
     */
    public void setPrenom(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getGsm() {
        // TODO implement here
        return gsm;
    }

    /**
     * @param value
     */
    public void setGsm(String gsm) {
        // TODO implement here
        this.gsm = gsm;
    }

    /**
     * @return
     */
    public String getEmail() {
        // TODO implement here
        return email;
    }

    /**
     * @param value
     */
    public void setEmail(String email) {
        // TODO implement here
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nom= " + nom + ", prenom= " + prenom + ", gsm= " + gsm + ", email= " + email;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nom);
        hash = 23 * hash + Objects.hashCode(this.prenom);
        hash = 23 * hash + Objects.hashCode(this.gsm);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Membres other = (Membres) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.gsm, other.gsm)) {
            return false;
        } 
        return true;
    }

}
