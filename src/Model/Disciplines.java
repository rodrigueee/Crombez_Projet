
import java.util.*;

/**
 * 
 */
public class Disciplines {

    /**
     * Default constructor
     */
    public Disciplines() {
    }

    /**
     * 
     */
    private String nomdiscipline;


    /**
     * 
     */
    public Set<Projet> projet;

    /**
     * 
     */
    public Set<Membres> membre;

    /**
     * @return
     */
    public String getNomdiscipline() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setNomdiscipline(String value) {
        // TODO implement here
    }

    /**
     * 
     */
    public class Compétence {

        /**
         * Default constructor
         */
        public Compétence() {
        }

        /**
         * 
         */
        private int degré;

        /**
         * 
         */
        public niveaux niveaux;

        /**
         * 
         */
        public Membres membre;

        /**
         * 
         */
        public Disciplines discipline;

    }

}