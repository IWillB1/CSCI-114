/**
 * <h2>Person.java - represents a Person</h2>
 *
 * <h3>Instance variable:</h3>
 *
 * <ul>
 *     <li><b>String</b> name - Name of the person
 * </ul>
 *
 * @author Will Bouasisavath
 * @version Homework 11, Project 2
 */

public class Person 
{

    private String name;

    /**
     * Constructor
     * @param name (<b>String</b>) sets <code>this.name</code>
     */
    public Person(String name) 
    {
        this.name = name;
    }

    /**
     * Getter for <code>name</code>
     * @return <code>name</code>
     */
    public String getName() 
    {
        return name;
    }

    /**
     * Setter for <code>name</code>
     * @param name (<b>String</b>) sets <code>this.name</code>
     */
    public void setName(String name) 
    {
        this.name = name;
    }

    /**
     * Creates a <b>String</b> with useful values
     * @return a <b>String</b> with useful values like <code>name</code>
     */
    public String toString() 
    {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    /**
     * Classic equals method, comparing <code>Person</code> and another object
     * @param other (<b>Object</b>) - is cast into a <code>Person</code> so it can be compared
     * @return (<b>Boolean</b>) - <b>true</b> if they are the same (aka equal), else <b>false</b>
     */
    public boolean equals(Object other)
    {

        if (other == null) {
            return false;
        }
        else if (other.getClass() != getClass()) {
            return false;
        }

        Person otherPerson = (Person)other;
        return name.equals(otherPerson.name);
    }

}