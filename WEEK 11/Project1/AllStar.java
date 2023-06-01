/**
 * <h2>AllStar.java - Subclass of the Player.java class</h2>
 *
 * @author Will Bouasisavath
 * @version Module 11, Homework Project 1
 *
 */

public class AllStar extends Player  {

    public static int ALL_STAR = 0;
    
     /**
     * Constructor for this type of object
     * @param name which uses <b>super</b> to set <code>name</code>
     */
    public AllStar(String name) {
        super(name) ;
    }

    /**
     * Getter for the score for this object
     * @return an <b>int</b> which is how much score this object does
     */
    public int getScore() {
        return 35 ;
    }

     /**
     * ToString method writes a string with useful information
     * @return a <b>String</b> with the <code>name</code> and <code>damage</code> for this object
     */
    public String toString() {
        return "AllStar: " + getName() + " Score: " + getScore() ;
    }
}