/**
 * <h2>StackEmptyException.java - Thrown when trying to remove an object from the stack when the stack is empty.</h2>
 *
 *  @author Will Bouasisavath
 *  version Module 13 Lab Project 1
 */
public class StackEmptyException extends Exception 
{
    public StackEmptyException() {
        
        super("PersonStack is empty - no object to return.") ;
        
    }

    public StackEmptyException(String message) {
        
        super(message) ;
        
    }
}