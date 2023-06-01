/**
 * <h2>IllegalObjectException.java - Thrown when trying to add an object to the stack that is not of the correct type.</h2>
 *
 * @author Will Bouasisavath
 * @version Module 13 Lab Project 1
 */
public class IllegalObjectTypeException extends Exception 
{
    public IllegalObjectTypeException() { 
        
        super("Object is not a Person - object not pushed.") ;
        
    }
    
    public IllegalObjectTypeException(String message) {
        
        super(message) ;
        
    }
}