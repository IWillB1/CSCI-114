/**
 * <h2>HotDogStand.java - Contains methods that will be utilized in Main.java class </h2>
 *
 * <h3>Instance variables:</h3>
 * <ul>
 *     <li> <code>point</code> (<b>double</b>) - a <code>Point</code> object with <b>x</b> and <b>y</b> values that store the Robot's location in the 2-dimensional plane
 *     <li> <code>direction</code> (<b>char</b>) - contains a string with a character that represents either north, south, east or west
 * </ul>
 *
 * @author Will Bouasisavath
 * @version Module 10 Homework, Project 2
 *
 */
public class HotDogStand 
{

    //Instance variables
    private String id;
    private int sold;
    private static int soldTotal = 0;

    /**
     * Constructor for a <code>HotDogStand</code>
     * @param id sets the <code>id</code> for the object
     * @param sold sets the <code>sold</code> (amount of hot dogs sold that day) for the object
     */
    public HotDogStand(String id, int sold) 
    {
        this.id = id;
        this.sold = sold;
        soldTotal += sold;
    }

    /**
     * Method <code>justSold</code> increases <code>sold</code> and <code>soldTotal</code>
     */
    public void justSold() 
    {
        sold++;
        soldTotal++;
    }

    /**
     * Compares the sales of two <code>HotDogStand</code>s
     * @param hotDogStand object
     * @return <b>true</b> if both the <code>sold</code> are equal, otherwise return <b>false</b>
     */
    public boolean equals(HotDogStand hotDogStand) 
    {
        if (this.sold == hotDogStand.hotDogStandTotal()) 
        {
            return true;
        }
        else return false;
    }

    /**
     * Method to return the total hot dogs sold for the stand
     * @return <code>sold</code>
     */
    public int hotDogStandTotal() 
    {
        return sold;
    }
    /**
     * Method to return the total hot dogs sold by all stands
     * @return <code>soldTotal</code>
     */
    public int hotDogStandsTotal() 
    {
        return soldTotal;
    }

    /**
     * Method to return a <b>string</b>
     * @return a <b>string</b> with <code>id</code> and <code>sold</code> variables, in a readable format
     */
    public String toString() 
    {
        return "Hot dog Stand with the id of " + id + " sold " + sold + " many hot dogs today";
    }

}
