package Model;

import java.util.Objects;

/**
 *
 */
public class Client {

    /**
     * Default constructor
     */
    protected String nom = "";
    protected String tel = "";
    protected String adresse = "";

    public Client() {
    }

    public Client(String nom, String tel, String adresse) { //constructeur complet
        this.nom = nom;
        this.tel = tel;
        this.adresse = adresse;
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
    public String getAdresse() {
        // TODO implement here
        return adresse;
    }

    /**
     * @param value
     */
    public void setAdresse(String adrese) {
        // TODO implement here
        this.adresse = adresse;
    }

    /**
     * @return
     */
    public String getTel() {
        // TODO implement here
        return tel;
    }

    /**
     * @param value
     */
    public void setTel(String tel) {
        // TODO implement here
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Nom= " + nom + ", tel= " + tel + ", adresse= " + adresse;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nom);
        hash = 23 * hash + Objects.hashCode(this.tel);
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
        final Client other = (Client) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.tel, other.tel)) {
            return false;
        }
        return true;
    }

}
