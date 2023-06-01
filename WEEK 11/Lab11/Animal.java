/**
 * <h2>Animal.java - represents an animal</h2>
 *
 * <h3>Instance variable:</h3>
 * <ul>
 *     <li><b>String</b> name - The name of the <b>Animal</b>
 * </ul>
 *
 * @author Will Bouasisavath
 * @version Module 11, Lab 11
 */
public class Animal 
{
    private String name;

    /**
     * A constructor that initializes the <b>Animal</b>'s name
     * @param newName The name of this <b>Animal</b>
     */
    public Animal(String newName)
    {
        name = newName;
        System.out.println("The Animal " + name + " has been created.");
    }

    /**
     * Get the <b>Animal</b>'s name
     * @return the <b>Animal</b>'s name
     */
    public String getName() 
    {
        return name;
    }

    /**
     * Change the <b>Animal</b>'s name to the given <b>String</b>
     * @param newName The new name of this <b>Animal</b>
     */
    public void setName(String newName) 
    {
        name = newName;
    }

    /**
     * Make this <b>Animal</b> go to sleep
     */
    public void sleep()
    {
        System.out.println("The Animal " + name + " is asleep.");
    }

    /**
     * Cause this <b>Animal</b> to make some noise
     */
    public void makeNoise() 
    {
        System.out.println("The Animal " + getName() + " is making a noise.");
    }

    /**
     * Get this <b>Animal</b> in <b>String</b> format
     * @return This <b>Animal</b> as a <b>String</b>
     */
    public String toString()
    {
        return "The Animal " + name;
    }

    /**
     * Is this <b>Animal</b> the same as another <b>Object</b>
     * @param other The <b>Object</b> to compare to this <b>Animal</b>
     * @return <b>True</b> if they are the same, else <b>False</b>
     */
    public boolean equals(Object other)
    {
        if (other == null)
        {
            return false;
        }
        else if (other.getClass() != getClass())
        {
            return false;
        }

        Animal otherAnimal = (Animal)other;

        return name.equals(otherAnimal.name);
    }
}