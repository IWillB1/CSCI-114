/**
 * <h2>Robot.java - Parent of the RobotStats.java class</h2>
 *
 * <p>Instance variables:</p>
 *
 * <ul>
 *     <li><b>int</b> team - Number of the team
 *     <li><b>boolean</b> functional - Whether the robot works or not
 *     <li><b>boolean</b> tall - Whether the robot cannot go under the WOF
 *     <li><b>boolean</b> groundIntake - Whether the robot can pickup balls from the ground
 *     <li><b>boolean</b> shootHigh - Whether the robot can shoot in the tall port
 *     <li><b>boolean</b> climb - Whether the robot can climb or not
 *     <li><b>boolean</b> translate - Whether the robot is apart of #translatorClimbGang
 * </ul>
 *
 * @author Will Bouasisavath
 * @version Final Project
 */

public class Robot {

    //Instance variables
    private int team;
    private boolean functional;
    private boolean tall;
    private boolean groundIntake;
    private boolean shootHigh;
    private boolean climb;
    private boolean translate;

    /**
     * Constructor for <code>Robot</code>
     * @param team - Sets <code>this.team</code>
     * @param functional - Sets <code>this.functional</code>
     * @param tall - Sets <code>this.tall</code>
     * @param groundIntake - Sets <code>this.groundIntake</code>
     * @param shootHigh - Sets <code>this.shootHigh</code>
     * @param climb - Sets <code>this.climb</code>
     * @param translate - Sets <code>this.translate</code>
     */
    public Robot(int team, boolean functional, boolean tall, boolean groundIntake, boolean shootHigh, boolean climb, boolean translate) {
        this.team = team;
        this.functional = functional;
        this.tall = tall;
        this.groundIntake = groundIntake;
        this.shootHigh = shootHigh;
        this.climb = climb;
        this.translate = translate;
    }

    /**
     * Getter for <code>team</code>
     * @return <code>team</code>
     */
    public int getTeam() {
        return team;
    }

    /**
     * Setter for <code>team</code>
     * @param team - Sets <code>this.team</code>
     */
    public void setTeam(int team) {
        this.team = team;
    }

    /**
     * Getter for <code>functional</code>
     * @return <code>functional</code>
     */
    public boolean isFunctional() {
        return functional;
    }

    /**
     * Setter for <code>functional</code>
     * @param functional - Sets <code>this.functional</code>
     */
    public void setFunctional(boolean functional) {
        this.functional = functional;
    }

    /**
     * Getter for <code>tall</code>
     * @return <code>tall</code>
     */
    public boolean isTall() {
        return tall;
    }

    /**
     * Setter for <code>tall</code>
     * @param tall - Sets <code>this.tall</code>
     */
    public void setTall(boolean tall) {
        this.tall = tall;
    }

    /**
     * Getter for <code>groundIntake</code>
     * @return <code>groundIntake</code>
     */
    public boolean isGroundIntake() {
        return groundIntake;
    }

    /**
     * Setter for <code>groundIntake</code>
     * @param groundIntake - Sets <code>this.groundIntake</code>
     */
    public void setGroundIntake(boolean groundIntake) {
        this.groundIntake = groundIntake;
    }

    /**
     * Getter for <code>shootHigh</code>
     * @return <code>shoot.High</code>
     */
    public boolean isShootHigh() {
        return shootHigh;
    }

    /**
     * Setter for <code>shootHigh</code>
     * @param shootHigh -Sets <code>this.shootHigh</code>
     */
    public void setShootHigh(boolean shootHigh) {
        this.shootHigh = shootHigh;
    }

    /**
     * Getter for <code>climb</code>
     * @return <code>climb</code>
     */
    public boolean isClimb() {
        return climb;
    }

    /**
     * Setter for <code>climb</code>
     * @param climb - Setter for <code>this.climb</code>
     */
    public void setClimb(boolean climb) {
        this.climb = climb;
    }

    /**
     * Getter for <code>translate</code>
     * @return <code>translate</code>
     */
    public boolean isTranslate() {
        return translate;
    }

    /**
     * Setter for <code>translate</code>
     * @param translate - Sets <code>this.translate</code>
     */
    public void setTranslate(boolean translate) {
        this.translate = translate;
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
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Robot robot = (Robot) o;
        return team == robot.team &&
                functional == robot.functional &&
                tall == robot.tall &&
                groundIntake == robot.groundIntake &&
                shootHigh == robot.shootHigh &&
                climb == robot.climb &&
                translate == robot.translate;
    }

    /**
     * Method to return a string of instance variables
     * @return a <b>String</b> populated by all the instance variables
     */
    public String toString() {
        return "Robot{" +
                "team=" + team +
                ", functional=" + functional +
                ", tall=" + tall +
                ", groundIntake=" + groundIntake +
                ", shootHigh=" + shootHigh +
                ", climb=" + climb +
                ", translate=" + translate +
                '}';
    }
}