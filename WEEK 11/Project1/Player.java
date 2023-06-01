/**
 * <h2>Player.java - Contains methods that will be utilized in Main.java class </h2>
 *
 * <h3>Instance variables:</h3>
 * <ul>
 *     <li> <code>name</code> (<b>String</b>) - contains the name for the player
 * </ul>
 *
 * @author Will Bouasisavath
 * @version Module 11, Homework Project 1
 *
 */

public class Player {
    
    // single private instance variable for the name of playe
    private String name;

     /**
     * Constructor for this type of object
     * @param name which uses <b>super</b> to set <code>name</code>
     */
    public Player(String name) {
        this.name = name ;
    }

    /**
     * A Getter for the <code>name</code> variable
     * @return a <b>String</b> which is the name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the <code>name</code> variable
     * @param name sets <code>this.name</code>
     */
    public void setName(String name) {
        this.name = name;
    }

     /**
     * Getter for the score for this object
     * @return an <b>int</b> which is how much the score this object does
     */
    public int getScore() {
        return 0;
    }

     /**
     * ToString method writes a string with useful information
     * @return a <b>String</b> with the <code>name</code> and <code>score</code> for this object
     */
    public String toString() {
        return "Player: " + getName() + " Score: " + getScore();
    }

    /**
     * Equals method compares Players
     * @param anObject is an <code>Object</code>is compared with another <code>player</code>
     * @return <b>true</b> if they have both the same name and score, otherwise return <b>false</b>
     */
    public boolean equals(Object anObject) {

        if (anObject == null || getClass() != anObject.getClass()) {
            return false;
        }

        Player anPlayer = (Player) anObject;

        return (name.equals(anPlayer.getName()) && (getScore() == anPlayer.getScore()));

    }

}