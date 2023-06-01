/**
 * <h2>Main.java - Creates three HotDogStand objects</h2>
 *
 * <h3>Problem Statement:</h3>
 * <p>You operate several hot dog stands distributed throughout San Diego County. Implement a class named Main that creates three <code>HotDogStand</code> objects and tests methods related to the class</p>
 *
 * <h3>Algorithm:</h3>
 * <p>In main:</p>
 * <ol>
 *     <li>create three <b>HotDogStand</b> objects, instantiating them with a unique <code>id</code> and starting <code>sold</code> value
 *     <li>For each object, create a for loop each repeating a different amount that inside calls the <code>justSold</code> method
 *     <li>Display the total amount of hot dogs sold for each stand with the <code>toString</code> method
 *     <li>Display the total amount of all the hot dogs sold across all the stands using the <code>hotDogStandsTotal</code> method
 * </ol>
 *
 * @author Will Bouasisavath
 * @version Module 10, Homework Project 2
 */
public class Main 
{

    public static void main(String[] args) 
    {

        // create three HotDogStand object
        HotDogStand hotDogStand1 = new HotDogStand("id1", 31);
        HotDogStand hotDogStand2 = new HotDogStand("id2", 69);
        HotDogStand hotDogStand3 = new HotDogStand("id3", 95);

        // create a for loop for each stand repeating a different amount
        for (int i = 0; i < 44; i++) 
        {
            hotDogStand1.justSold();
        }
        for (int i = 0; i < 69; i++) 
        {
            hotDogStand2.justSold();
        }
        for (int i = 0; i < 57; i++) 
        {
            hotDogStand3.justSold();
        }

        // displays the total amount sold for each stand 
        System.out.println(hotDogStand1.toString());
        System.out.println(hotDogStand2.toString());
        System.out.println(hotDogStand3.toString());

        // The total famount of overall Hot Dogs sold for all three stands
        System.out.println("\n\nTotal amount of hot dogs sold across all stands: " + hotDogStand1.hotDogStandsTotal());
    }

}
