/**
 * ElementTester.java - Test the Element object class 
 * Author:     Will Bouasisavath
 * Module:     3
 * Project:    Lab 3 extra credit
 * Problem Statement:  
     * Create a Element class with three properties (private instance variables),
     * getters, setters, and a toString method, then manipulate Element objects using those methods
 *
 * Algorithm:
 *   1. Create Element objects for the following four chemical elements:
     *   create Hydrogen using no-arg constructor, then setters
     *   create the other elements using the full constructor
 *
 *
 *              Name         Number        Natural?
 *         -------------    ----------     --------
 *         Hydrogen             1             Yes
 *         Oxygen               8             Yes
 *         Gold                79             Yes
 *         Plutonium           94             No
 *
 *   2.  Display all 4 elements on separate lines using toString
 *   3.  Create a columnar report showing all 4 elements:
 *       * atomic number should be right-justified, since its a number
 *       * name and "natural" flag should be left justified (both are text)

 */

public class ElementTester
{
    public static void main(String[] args) 
    {
        
        //create 4 element for each object
        Element hydrogen = new Element("Hydrogen", 1, true);
        Element oxygen = new Element("Oxygen", 8, true);
        Element gold = new Element("Gold", 79, true);
        Element plutonium = new Element("Plutonium", 94, false);
                       
        //print the info for each element
        System.out.println(hydrogen.toString());
        System.out.println(oxygen.toString());
        System.out.println(gold.toString());
        System.out.println(plutonium.toString());
        
        System.out.println(""); // space
        
        // toString method with a format string
        System.out.println("Atomic     Element         Is\n" + "Number     ----Name----    Natural?");
        System.out.println("");
        String format = "%4d       %-12s       %3s %n" ;
        
        // extracting the properties of each element
        System.out.printf(format, hydrogen.getAtomicNumber(), hydrogen.getName(), hydrogen.getIsNatural());
        System.out.printf(format, oxygen.getAtomicNumber(), oxygen.getName(), oxygen.getIsNatural());
        System.out.printf(format, gold.getAtomicNumber(), gold.getName(), gold.getIsNatural());
        System.out.printf(format, plutonium.getAtomicNumber(), plutonium.getName(), plutonium.getIsNatural());

    }
} 
