/**
 * Element.java - Describes the highest mountain on a continent  
 * Author:     Will Bouasisavath
 * Module:     3
 * Project:    Lab 3 extra credit
 *
 * Instance variables:
 *   String name - the official name of the Element
 *   atomicNumber - the Number of the element
 *   isNatural - determines if the element being called natural or not
 *
 * Methods:
 *   Full constructor
 *   All getters and setters
 *   toString
 */

import java.lang.String;

public class Element
{
    // instance variables 
    private String name = "(unknown)";
    private int atomicNumber = 0 ;
    private boolean isNatural = true ;
    
    /* Constructor for objects of class Element */
    public Element(String newName, int newNumber, boolean newIsNatural)
    {
        name = newName ;
        atomicNumber = newNumber ;
        isNatural = newIsNatural ;
    }

    // Return type is the type of variable returned
    public String getName() 
    {
        return name ;                
    }
    
    public int getAtomicNumber() 
    {
        return atomicNumber ;                
    }
    
    public boolean getIsNatural() 
    {
        return isNatural ;                
    }
    
    // Setters are provided for all instance variables
    // (setter for atomic number prhoibits negative numbers)
    public void setName(String newName) 
    {
        name = newName;
    }
    
    public void setAtomicNumber(int newNumber) 
    {
        atomicNumber = (newNumber < 0 ? 0 : newNumber) ;
    }
    
     public void setIsNatural(boolean newIsNatural) 
    {
        isNatural = newIsNatural;
    }
    
    /* toString method - printing out variables in an english sentence */
    /* return String of varibles with english filler words */
    public String toString()
    {
        return name + " has atomic number " + atomicNumber + " and is " + (isNatural ? "natural" : "synthetic.") ;
    }
    
}