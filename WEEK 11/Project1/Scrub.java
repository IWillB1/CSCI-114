/**
 * <h2>Scrub.java - Subclass of the Player.java class</h2>
 *
 * @author Will Bouasisavath
 * @version Module 11 Homework, Project 1
 *
 */

public class Scrub extends Player {

    /**
     * Constructor for this type of object
     * @param name which uses <b>super</b> to set <code>name</code>
     */
    public Scrub(String name) {
        super(name) ;
    }

    /**
     * Getter for the score for this object
     * @return an <b>int</b> which is how much score this object does
     */
    public int getScore() {
        return 6 ;
    }

    /**
     * ToString method writes a string with useful information
     * @return a <b>String</b> with the <code>name</code> and <code>score</code> for this object
     */
    public String toString() {
        return "Scrub: " + getName() + " Score: " + getScore() ;
    }

}