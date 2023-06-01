 /**
 * <h2>Main.java - Tester program</h2>
 *
 * @author Will Bouasisavath
 * @version Module 13, Lab Project 2
 */

public class Main 
{
    public static void main(String[] args) {
        
        PersonStack stack = new PersonStack() ;

        System.out.println("Adding People to the stack") ;
        // 1st try block
        try {
            // Create 4 Person objects 
            Person will = new Person("Will", "Programmer") ;
            Person kelly = new Person("Kelly", "Public Health Official") ;
            Person towa = new Person("Towa", "Therapist") ;
            Person santa = new Person("Santa Claus", "Unemployed") ;

            // instantiate and "push" 4 different Person objects onto the stack
            stack.push(will) ;
            stack.push(kelly) ;
            stack.push(towa) ;
            stack.push(santa) ;

            // Print the contents of the stack using the toString method
            System.out.println(stack) ;

            System.out.println("\nTrying to add a fifth Person ot the stack:") ;
            // Add a 5th person to throw an exception
            stack.push(new Person("Your mom", "Mother")) ;


        } catch (StackFullException e) {
            // Print the exception message returned from getMessage
            System.out.println(e.getMessage()) ;
            
        } catch (IllegalObjectTypeException e) {
            // Print the exception message returned from getMessage
            System.out.println(e.getMessage()) ;
            
        }

        System.out.println("\nPopping the contents of the stack plus one") ;
        // 2nd try block
        try {
            for (int i = 0; i < 6; i++) {
                // "Pop" four Person objects from the stack
                System.out.println("  " + stack.pop()) ;
                
            }

        } catch (StackEmptyException e) {
            // The stack should now be empty
            // try to "pop" a 5th object
            System.out.println(e.getMessage()) ;
            
        }

        System.out.println("\nTrying to add an Object object to the stack.") ;
        // 3rd try block
        try {
            // Instantiate an object of any type other than Person
            String badParameter = "This is not a Person" ;

            // Throw an IllegalObjectTypeException
            stack.push(badParameter) ;
            
        }
        catch(IllegalObjectTypeException e) {
            // Print the exception message returned from getMessage
            System.out.println(e.getMessage()) ;
            
        }
        catch(StackFullException e) {
            // Print the exception message returned from getMessage
            System.out.println(e.getMessage()) ;
            
        }
    }
}