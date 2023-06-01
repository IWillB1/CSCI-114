/**
 * <h2>SSNCharacterException.java - Error message</h2>
 *
 * @author Will Bouasisavath
 * @version Homework 13, Project 3
 */

public class SSNCharacterException extends Exception 
{
    /**
     * Constructor passes text to <b>super</b>
     */
    public SSNCharacterException() {
        super("Error: your SSN is not all numeric, please re-enter.");
    }

    /**
     * Constructor w/ parameter
     * @param message - text passed to <b>super</b>
     */
    public SSNCharacterException(String message) {
        super(message);
    }
}