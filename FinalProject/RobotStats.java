import java.util.Objects;
/**
 * <h2>RobotStats.java - Child of Robot class</h2>
 *
 * <p>Instance variables:</p>
 *
 * <ul>
 *     <li><b>int</b> climbs - Total number of successful climbs
 *     <li><b>int</b> ballsScore - Ball score of the robot
 *     <li><b>int</b> autoScore - Average match auto score for the robot
 *     <li><b>int</b> rank - Rank of the robot at the LAN comp
 * </ul>
 *
 * @author Will Bouasisavath
 * @version Final Project
 */

public class RobotStats extends Robot {

    //Instance variables
    private int climbs;
    private int ballsScore;
    private int autoScore;
    private int rank;

    /**
     * Constructor
     * @param team - Set into the <b>super</b> constructor
     * @param functional - Set into the <b>super</b> constructor
     * @param tall - Set into the <b>super</b> constructor
     * @param groundIntake - Set into the <b>super</b> constructor
     * @param shootHigh - Set into the <b>super</b> constructor
     * @param climb - Set into the <b>super</b> constructor
     * @param translate - Set into the <b>super</b> constructor
     * @param climbs - Sets <code>this.climbs</code>
     * @param ballsScore - Sets <code>this.ballsScore</code>
     * @param autoScore - Sets <code>this.autoScore</code>
     * @param rank - Sets <code>this.rank</code>
     */
    public RobotStats(int team, boolean functional, boolean tall, boolean groundIntake, boolean shootHigh, boolean climb, boolean translate, int climbs, int ballsScore, int autoScore, int rank) {
        super(team, functional, tall, groundIntake, shootHigh, climb, translate);
        this.climbs = climbs;
        this.ballsScore = ballsScore;
        this.autoScore = autoScore;
        this.rank = rank;
    }

    /**
     * Getter for <code>climbs</code>
     * @return <code>climbs</code>
     */
    public int getClimbs() {
        return climbs;
    }

    /**
     * Setter for <code>climbs</code>
     * @param climbs - sets <code>this.climbs</code>
     */
    public void setClimbs(int climbs) {
        this.climbs = climbs;
    }

    /**
     * Getter for <code>ballsScore</code>
     * @return <code>ballsScore</code>
     */
    public int getBallsScore() {
        return ballsScore;
    }

    /**
     * Setter for <code>ballsScore</code>
     * @param ballsScore - Sets <code>this.ballsScore</code>
     */
    public void setBallsScore(int ballsScore) {
        this.ballsScore = ballsScore;
    }

    /**
     * Getter for <code>autoScore</code>
     * @return <code>autoScore</code>
     */
    public int getAutoScore() {
        return autoScore;
    }

    /**
     * Setter for <code>autoScore</code>
     * @param autoScore - Sets <code>this.autoScore</code>
     */
    public void setAutoScore(int autoScore) {
        this.autoScore = autoScore;
    }

    /**
     * Getter for <code>rank</code>
     * @return <code>rank</code>
     */
    public int getRank() {
        return rank;
    }

    /**
     * Setter for <code>rank</code>
     * @param rank - Sets <code>this.rank</code>
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * Tests if two objects are equal
     * @param o - <code>Object</code> that will be compared
     * @return true, if they are equal in every way, otherwise return false
     */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!super.equals(o)) {
            return false;
        }
        RobotStats that = (RobotStats) o;
        return climbs == that.climbs &&
                ballsScore == that.ballsScore &&
                autoScore == that.autoScore &&
                rank == that.rank;
    }

    /**
     * Example of polymorphism and inheritance, as it uses a super (parent) toString and generates a unique one that overrides when called on this object.
     * @return A <b>String</b> with instance variables, also using <code>super.toString</code>
     */
    @Override
    public String toString() {
        return super.toString() + " RobotStats{" +
                "climbs=" + climbs +
                ", ballsScore=" + ballsScore +
                ", autoScore=" + autoScore +
                ", rank=" + rank +
                "} ";
    }
}