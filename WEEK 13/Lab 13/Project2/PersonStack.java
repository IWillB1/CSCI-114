 /**
 * <h2>PersonStack.java - Stores a stack of Person objects and methods to manipulate the stack.</h2>
 *
 * @author Will Bouasisavath
 * @version Module 13, Lab project 2
 */

public class PersonStack 
{
    // The stack implementation using an array with capacity of 4 Person objects
    // Int variable is set to 0 used to the next available stack position in array
    public static final int STACK_SIZE = 4 ;
    private Person[] stack = new Person[STACK_SIZE] ;
    private int nextAvailablePosition = 0 ;

    // The class will provide a method named push 
    // which will take one parameter of type Object
    public void push(Object anObject)
                throws StackFullException,
                    IllegalObjectTypeException {

        // if the object is null or object is not instance of Person class
        // this method will throw an exception of type IllegalObjectTypeException
        if (anObject == null || !(anObject instanceof Person)) {
            
            throw new IllegalObjectTypeException() ;
            
        }

        // this method will throw an exception of type StackFullException 
        if (nextAvailablePosition >= STACK_SIZE) {
            
            throw new StackFullException() ;
            
        }

        // Otherwise, the method will typecast the object to a Person
        // place the object on top of the stack "next available stack position"
        // and increment that variable
        stack[nextAvailablePosition++] = (Person)anObject ;
    }

    public Person pop() throws StackEmptyException {
        
        // this method should throw an exception of type StackEmptyException
        // but will not catch it
        if (nextAvailablePosition <= 0) {
            
            throw new StackEmptyException() ;

        }

        // Get the Person from the top of the stack,
        Person returnPerson = stack[--nextAvailablePosition] ;

        // set that element in the stack to null,
        stack[nextAvailablePosition] = null ;

        // and return the Person that was removed
        return returnPerson ;
    }

    public String toString() {
        
        // a method named toString which lists all of the Person objects
        // currently residing on the stack
        String returnString = "Contents of stack: \n" ;
        
        if (nextAvailablePosition <= 0) {
            
            returnString += "   (nothing)" ;
            
        } else {
            
            for (int i = 0; i < nextAvailablePosition; i++) {
                
                returnString += "   " + stack[i].toString() + "\n" ; 
                
            }
        }
        
        return returnString ;
    }
}