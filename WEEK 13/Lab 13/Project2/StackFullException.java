 /**
 * <h2>StackFullException.java - An exception that occurs when the Person stack if full.</h2>
 *
 * @author Will Bouasisavath
 * @version Module 13 Lab Project 1
*/

public class StackFullException extends Exception
{

    public StackFullException() {
        
        super("PersonStack is full - object not added.") ;
        
    }

    public StackFullException(String message) {
        
        super(message) ;
        
    }
}