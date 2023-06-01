/**
 * <h2>Pro.java - Subclass of the Player.java class</h2>
 *
 * @author Will Bouasisavath
 * @version Module 11, Homework Project 1
 *
 */

public class Pro extends Player  {

     /**
     * Constructor for this type of object
     * @param name which uses <b>super</b> to set <code>name</code>
     */
    public Pro(String name) {
        super(name) ;
    }

    /**
     * Getter for the score for this object
     * @return an <b>int</b> which is how much score this object does
     */
    public int getScore() {
        return 15 ;
    }

     /**
     * ToString method writes a string with useful information
     * @return a <b>String</b> with the <code>name</code> and <code>Score</code> for this object
     */
    public String toString() {
        return "Pro: " + getName() + " Score: " + getScore() ;
    }
}