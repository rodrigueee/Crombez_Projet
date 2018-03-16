
import java.util.*;

/**
 * 
 */
public class Projet {

    /**
     * Default constructor
     */
    public Projet() {
    }

    /**
     * 
     */
    private String titre;

    /**
     * 
     */
    private String dated;

    /**
     * 
     */
    private String datef;


    /**
     * 
     */
    public Set<Membres> membre;

    /**
     * 
     */
    public Set<Disciplines> discipline;

    /**
     * 
     */
    public Client client;

    /**
     * 
     */
    public Set<Travail> travail;

    /**
     * 
     */
    public Set<Temps> temps;

    /**
     * @return
     */
    public String getTitre() {
        // TODO implement here
        return "";
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
        return "";
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
        return "";
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