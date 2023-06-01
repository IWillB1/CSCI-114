/**
 * <h2>Vehicle.java - represents a Vehicle</h2>
 *
 * <h3>Instance variables:</h3>
 *
 * <ul>
 *     <li><b>String</b> manufacturerName - Name of the manufacturer
 *     <li><b>String</b> Owner - Who is the owner
 *     <li><b>int</b> engineCylinders - How many cylinders it has
 * </ul>
 *
 * @author Will Bouasisavath
 * @version Homework 11, Project 2
 */

public class Vehicle 
{

    private String manufacturerName;
    private int engineCylinders;
    private String ownerName;

    /**
     * Constructor sets and instantiates the three instance variables
     * @param manufacturerName (<b>String</b>) - The name of the manufacturer
     * @param engineCylinders (<b>int</b>) - How many engine cylinders it has
     * @param person (<b>Person</b>) - Which person (<code>Person.getName()</code>) object owns this vehicle
     */

    public Vehicle(String manufacturerName, int engineCylinders, Person person) 
    {

        this.manufacturerName = manufacturerName;
        this.engineCylinders = engineCylinders;
        ownerName = person.getName();

    }

    /**
     * Getter for <code>manufacturerName</code>
     * @return <code>manufacturerName</code>
     */
    public String getManufacturerName() 
    {
        return manufacturerName;
    }

    /**
     * Getter for setManufacturerName
     * @param manufacturerName - Sets <code>this.manufacturerName</code>
     */
    public void setManufacturerName(String manufacturerName) 
    {
        this.manufacturerName = manufacturerName;
    }

    /**
     * Getter for <code>engineCylinders</code>
     * @return <code>engineCylinders</code>
     */
    public int getEngineCylinders() 
    {
        return engineCylinders;
    }

    /**
     * Setter for <code>engineCylinders</code>
     * @param engineCylinders - Sets <code>this.engineCylinders</code>
     */
    public void setEngineCylinders(int engineCylinders) 
    {
        this.engineCylinders = engineCylinders;
    }

    /**
     * Getter for <code>ownerName</code>
     * @return <code>ownerName</code>
     */
    public String getOwnerName() 
    {
        return ownerName;
    }

    /**
     * Setter for <code>ownerName</code>
     * @param ownerName - Sets <code>this.ownerName</code>
     */
    public void setOwnerName(String ownerName) 
    {
        this.ownerName = ownerName;
    }

    /**
     * Creates and returns a string with useful values
     * @return (<b>String</b>) of useful values
     */
    public String toString() 
    {
        return "Vehicle{" +
                "manufacturerName='" + manufacturerName + '\'' +
                ", engineCylinders=" + engineCylinders +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }

     /**
     * Equals method tests two objects and determines if they are the same (aka equal)
     * @param anObject is an <b>Object</b> which is cast into a <code>Vehicle</code> so it can be compared
     * @return (<b>Boolean</b>) which is <b>true</b> if the objects are the same, else return <b>false</b>
     */
     public boolean equals(Object anObject) 
     {

         if (anObject == null || getClass() != anObject.getClass()) 
         {
             return false;
         }

         Vehicle aVehicle = (Vehicle) anObject;

         return ((manufacturerName.equals(aVehicle.getManufacturerName()) && (engineCylinders == aVehicle.getEngineCylinders())) && ownerName.equals(aVehicle.getOwnerName()));

     }

}