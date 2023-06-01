/**
 * <h2>InvalidSalaryOption.java - Error message</h2>
 *
 * @author Will Bouasisavath
 * @version Homework 13, Project 3
 */

public class InvalidSalaryOption extends Exception {
    /**
     * Constructor passes text to <b>super</b>
     */
    public InvalidSalaryOption() {
        super("Error: you cannot enter a negative salary, please re-enter.");
    }

    /**
     * Constructor w/ parameter
     * @param message - text passed to <b>super</b>
     */
    public InvalidSalaryOption(String message) {
        super(message);
    }
}