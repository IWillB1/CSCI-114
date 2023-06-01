/**
 * <h2>SSNLengthException.java - Error message</h2>
 *
 * @author Will Bouasisavath
 * @version Homework 13, Project 3
 */

public class SSNLengthException extends Exception 
{
    /**
     * Constructor passes text to <b>super</b>
     */
    public SSNLengthException() {
        super("Error: your SSN is not 9 digits, please re-enter.");
    }
    /**
     * Constructor w/ parameter
     * @param message - text passed to <b>super</b>
     */
    public SSNLengthException(String message) {
        super(message);
    }
}