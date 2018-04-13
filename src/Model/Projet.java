package Model;

import java.util.Objects;

/**
 *
 */
public class Projet {

    /**
     * Default constructor
     */
    protected String titre = "";
    protected String dated = "";
    protected String datef = "";

    public Projet() {
    }
    
    public Projet(String titre, String dated,String datef) {
        this.titre=titre;
        this.dated=dated;
        this.datef=datef;
    }

    public String getTitre() {
        // TODO implement here
        return titre;
    }

    /**
     * @param value
     */
    public void setTitre(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getClient() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setClient(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getDated() {
        // TODO implement here
        return dated;
    }

    /**
     * @param value
     */
    public void setDated(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getDatef() {
        // TODO implement here
        return datef;
    }

    /**
     * @param value
     */
    public void setDatef(String value) {
        // TODO implement here
    }

    /**
     *
     */
    public class Travail {

        /**
         * Default constructor
         */
        public Travail() {
        }

        /**
         *
         */
        private String dateengagement;

        /**
         *
         */
        private int pourcentagetemps;

    }

}
