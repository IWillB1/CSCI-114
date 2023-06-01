/**
 * <h2>InvalidSalaryText.java - Error message</h2>
 *
 * @author Will Bouasisavath
 * @version Homework 13, Project 3
 */
public class InvalidSalaryText extends Exception {

    /**
     * Constructor passes text to <b>super</b>
     */
    public InvalidSalaryText() {
        super("Error: you cannot use commas or characters, please re-enter.");
    }

    /**
     * Constructor w/ parameter
     * @param message - text passed to <b>super</b>
     */
    public InvalidSalaryText(String message) {
        super(message);
    }
}
