/**
 * DwarfPlanet.java - will define properties of a Dwarf Planet
 * Author:  Will Bouasisavath
 * Module:  3
 * Project: Homework Project 2
 *
 * Instance variables:
 *  
 * 1. name (String)
 *      
 * 2. discoverer (String)
 *      
 * 3. year [of discovery (int)]
 *      
 * 4. diameter [avg, and in km (double)]
 *      
 * 5. sunDistance [average distance from the Sun in km (long)]
 *  
 *  Methods:
 *  
 * 1. A no-arg constructor initialized all the vars to 0 or an empty string, and year to 1800
 *      
 * 2. The constructor should save the values of five parameters (for the five instance variables)
 *      
 * 3. The getters for each property return the variable that is in the getter name
 * 
 * 4. The setters , then set the value of the appropriate instance variable to the new value
 *      
 * 5. The toString returns a String that contains all the varibles values in plain english.
 * 
 */

import java.lang.String;
import java.lang.Long;

public class DwarfPlanet
{
    // instance variables
    private String name, discoverer; 
    private int year;
    private double diameter;
    private long sunDistance;
    
    /**
     * No-args Constructor for the class DwarfPlanet
     * 
     * Initialized ints diameter and sunDistance to 0, year to 1800, and strings id and discoverer to ""
     */
    DwarfPlanet() {
        
        name = "";
        discoverer = "";
        year = 1800;
        diameter = 0;
        sunDistance = 0;
                
    }
      
    public DwarfPlanet(String name, String discoverer, int year, double diameter, long sunDistance)
    {
        this.name = name;
        this.discoverer = discoverer;
                    
        if (year >= 1800 && year <= 2100) 
        {
           this.year = year;
        }
                
        if (diameter >= 0) 
        {            
        this.diameter = diameter;        
        }
        
        if (sunDistance >= 0) 
        {
        this.sunDistance = sunDistance;
        }
        
        /*
        System.out.println(this.name);
        System.out.println(this.discoverer);
        System.out.println(this.year);
        System.out.println(this.diameter);
        System.out.println(this.sunDistance);
        */ 
       
    }
    
    /**
      Getter for name variable
      return name which is a string
     */
    
    public String getName()
    {
        
        return name;
                
    }
    
    /**
      Getter for discoverer variable
      return discoverer which is a string
     */
    public String getDiscoverer()
    {
        
        return discoverer;
                
    }
    
    /**
      Getter for year variable
      return year which is an int
     */
    
    public int getYear()
    {
        
        return year;
        
    }
    
    /**
      Getter for diameter variable
      return diameter which is a double
     */
    
    public double getDiameter()
    {
        
        return diameter;
       
    }
    
    /**
      Getter for sunDistance variable
      return sunDistance which is a long
     */
    
    public long getSunDistance()
    {
        
        return sunDistance;
        
    }
     
    /**
      Setter for name value for new value given
      name gives a new value to name
     */    
    public void setName(String name) 
    {
        
        this.name = name;
        
    }
    
    /**
      Setter for discoverer value for new value given
      discoverer gives a new value to name
     */ 
    
    public void setDiscoverer(String discoverer) 
    {
        
        this.discoverer = discoverer;
        
    }
    
    /**
      Setter for year value for new value given
      year gives a new value to year
     */ 
    
    public void setYear(int year) 
    {
        
        if (year >= 1800 && year <= 2100) {
           this.year = year;
        }
        
    }
    
    /**
      Setter for diameter value for new value given
      diameter gives a new value to diameter
     */  
    
    public void setDiameter(double diameter) 
    {
                
        if (diameter > 0) {            
        this.diameter = diameter;        
        }
        
    }
    
    /**
      Setter for sunDistance value for new value given
      sunDistance gives a new value to sunDistance
     */  
    
    public void setsunDistance(long sunDistance) 
    {
        
        if (sunDistance > 0) {
        this.sunDistance = sunDistance;
        }
        
    }
    
    /** 
      The toString method creates a String holding the values of all the varibles which can be read in plain english
      return a string which is an english sentence with all the variables' values
     */
    
    public String toString() 
    {
                        
        return name + " was discovered by " + discoverer + " in " + year + " with an average distance of " + sunDistance + " km from the sun and has an average diameter of " + diameter + " km.";
        
    }
}