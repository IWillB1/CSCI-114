/**
 * <h2>Owl.java - represents a Owl, which is a type of {@link Animal}</h2></h2>
 *
 * <h3>Instance variable:</h3>
 * <ul>
 *     <li><b>String</b> breed - The breed of type of <b>Owl</b>
 * </ul>
 *
 * @author Will Bouasisavath
 * @version Module 11, Lab 11
 */
public class Owl extends Animal
{

    private String breed;

    /**
     * Constructor for the <b>Owl</b> method
     * @param name - The name for the <b>Owl</b>
     * @param breed - The breed for the <b>Owl</b>
     */
    public Owl (String name, String breed) 
    {
        super(name);
        this.breed = breed;

        System.out.println("A Owl " + getName() + " of breed " + breed + " has been created.");
    }

    /**
     * Getter for the <b>Owl</b>'s breed
     * @return breed
     */
    public String getBreed() 
    {
        return breed;
    }

    /**
     * Setter for the <b>Owl</b>'s breed
     * @param breed
     */
    public void setBreed(String breed) 
    {
        this.breed = breed;
    }

    /**
     * Cause this <b>Owl</b> to make some noise
     */
    public void makeNoise() 
    {
        System.out.println("The Owl " + getName() + " is hooting.");
    }

    /**
     * Get this <b>Owl</b> in <b>String</b> format
     * @return This <b>Owl</b> as a <b>String</b>
     */
    public String toString() 
    {
        return "The Owl " + getName() + " of breed " + breed;
    }

    /**
     * Is this <b>Owl</b> the same as another <b>Object</b>
     * @param other The <b>Object</b> to compare to this <b>Owl</b>
     * @return <b>True</b> if they are the same, else <b>False</b>
     */
    public boolean equals(Object other) 
    {
        return super.equals(other) && breed.equals((Owl)other);
    }


}