/**
 * <h2>Lab11.java - The class containing main for the eleventh lab</h2>
 *
 * <ol>
 *     <li>{@link Animal}
 *     <li>{@link Owl} {@link Frog}
 *     <li>Yes. The Object class.
 *     <li>Yes. The Animal overrides the default Object toString, and the Owl and Frog override the Animal toString. makeNoise is overriden in Owl and Frog. So is sleep.
 *     <li>Yes. It makes sense and will work properly because Frog has no new instance variables to compare.
 *     <li>Because the Owl class has an additional instance variable to check, <code>breed</code>
 *     <li>Yes you can, as they are all objects and can be compared using the equals method.
 *     <li>Yes they do, they belong to the default package.
 *     <li>No you would not need getters and setters, as they would all have access to the instance variables.
 * </ol>
 *
 * @author Will Bouasisavath
 * @version Module 11, Lab 11
 */

public class Lab11 
{

    public static void main(String[] args) 
    {
        // Create animal object with name oscar
        // Create owl object with name errol and breed great grey
        // Create frog object with name kermit
        Animal oscar = new Animal("Oscar");
        Owl errol = new Owl("Errol", "Great Grey");
        Frog kermit = new Frog("Kermit");

        // uses toString method to print Oscar, Errol, Kermit
        System.out.println(oscar);
        System.out.println(errol);
        System.out.println(kermit);

        // causes Oscar, Errol, and Kermit to each make a noise
        oscar.makeNoise();
        errol.makeNoise();
        kermit.makeNoise();

        // causes Oscar, Errol, and Kermit to each go to sleep
        oscar.sleep();
        errol.sleep();
        kermit.sleep();
    }

}