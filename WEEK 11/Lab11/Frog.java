/**
 * <h2>Frog.java - represents a Frog, which is a type of {@link Animal}</h2>
 *
 * @author Will Bouasisavath
 * @version Module 11, Lab 11
 */
public class Frog extends Animal 
{

    /**
     * Constructor for <b>Frog</b> object
     * @param newName is a string that represents the name that will be set to the <b>Owl</b>
     */
    public Frog(String newName) 
    {
        super(newName);
        System.out.println("A Frog " + getName() + " has been created.");
    }

    /**
     * Cause this <b>Frog</b> to make some noise
     */
    public void makeNoise() 
    {
        System.out.println("The Frog " + getName() + " is ribbiting." );
    }

    /**
     * Get this <b>Frog</b> in <b>String</b> format
     * @return This <b>Frog</b> as a <b>String</b>
     */
    public String toString() 
    {
        return "The Frog " + getName();
    }
}