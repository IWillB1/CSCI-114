/**
 * <h2>Truck.java - represents a Truck, which is a type of {@link Vehicle}</h2>
 *
 * <h3>Instance variables:</h3>
 *
 * <ul>
 *     <li><b>double</b> loadCapacity - How much a load it can hold
 *     <li><b>int</b> towCapacity - How much of a load it can tow
 * </ul>
 *
 * @author Will Bouasisavath
 * @version Homework 11, Project 2
 */

public class Truck extends Vehicle 
{

    private double loadCapacity;
    private int towCapacity;

    /**
     * Constructor utilizes the <code>super</code> technique to set the first three, then instantiates the others to the specific <code>Truck</code>
     * @param manufacturerName (<b>String</b>) - The name of the manufacturer
     * @param engineCylinders (<b>int</b>) - How many engine cylinders it has
     * @param person (<b>Person</b>) - Which <code>Person</code> object owns this vehicle
     * @param loadCapacity (<b>double</b>) - How much of a load it can hold. Set to <code>this.loadCapacity</code>
     * @param towCapacity (<b>int</b>) - How much of a load it can tow. Set to <code>this.towCapacity</code>
     */

    public Truck(String manufacturerName, int engineCylinders, Person person, double loadCapacity, int towCapacity) 
    {

        super(manufacturerName, engineCylinders, person);
        this.loadCapacity = loadCapacity;
        this.towCapacity = towCapacity;

    }

    /**
     * Getter for <code>loadCapacity</code>
     * @return (<b>double</b>) loadCapacity
     */
    public double getLoadCapacity() 
    {
        return loadCapacity;
    }

    /**
     * Setter for <code>loadCapacity</code>
     * @param loadCapacity sets <code>this.loadCapacity</code>
     */
    public void setLoadCapacity(double loadCapacity) 
    {
        this.loadCapacity = loadCapacity;
    }

    /**
     * Getter for <code>towCapacity</code>
     * @return (<b>int</b>) towCapacity
     */
    public int getTowCapacity() 
    {
        return towCapacity;
    }

    /**
     * Setter for <code>towCapacity</code>
     * @param towCapacity sets <code>this.towCapacity</code>
     */
    public void setTowCapacity(int towCapacity) 
    {
        this.towCapacity = towCapacity;
    }

    /**
     * Creates and returns a string with useful values
     * @return (<b>String</b>) of useful values
     */
    public String toString() 
    {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                ", towCapacity=" + towCapacity +
                "manufacturerName='" + getManufacturerName() + '\'' +
                ", engineCylinders=" + getEngineCylinders() +
                ", ownerName='" + getOwnerName() + '\'' +
                '}';
    }

    /**
     * Equals method tests two objects and determines if they are the same (aka equal)
     * @param other is an <b>Object</b> which is cast into a <code>Truck</code> so it can be compared
     * @return (<b>Boolean</b>) which is <b>true</b> if the objects are the same, else return <b>false</b>
     */
    public boolean equals(Object other) 
    {

        Truck otherVehicle = (Truck)other;

        return super.equals(other) && ((loadCapacity == otherVehicle.loadCapacity) && towCapacity == otherVehicle.towCapacity);
    }
}