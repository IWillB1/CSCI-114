/** 
 * SeparateDwarfPlanet.java - will utilize the objects from DwarfPlanet
 * Author: Will Bouasisavath
 * Module: 3
 * Project: Homework Project 2
 * Problem statement: Create a class to create and print DwarfPlanet objects in a chart
 * 
 * Algorithm: 
 * 
 * 1. Establish the dwarf planets listed in the project table
 * 2. After each object is created, use the toString method to print the properties of that object
 * 3. Finally, print a nicely-formatted columnar, using the boundaries below
        -Use printf statements in the main method to determine the spacing for each column (do NOT use toString, the tab character, or lots of spaces.)
        -In main, assign your format string to a variable so that each printf statement uses the same format string.
        -Place commas in all numbers when appropriate.
        -Use a single printf statement for each mountain.
 * 
 */
import java.lang.String;

public class SeparateDwarfPlanet
{
    public static void main(String[] args) 
    {
    
        DwarfPlanet planet1 = new DwarfPlanet("Ceres", "Piazzi", 1801, 952.4, 413700000L);
        System.out.println(planet1.toString());
        
        DwarfPlanet planet2 = new DwarfPlanet("Pluto", "Tombaugh", 1930, 2302.0, 5874000000L);
        System.out.println(planet2.toString());
        
        DwarfPlanet planet3 = new DwarfPlanet("Haumea", "Brown", 2004, 1220.0, 6452000000L);
        System.out.println(planet3.toString());
        
        DwarfPlanet planet4 = new DwarfPlanet("Makemake", "Brown", 2005, 1424.0, 6850000000L);
        System.out.println(planet4.toString());
        
        DwarfPlanet planet5 = new DwarfPlanet("Eris", "Brown", 2003, 2326.0, 10125000000L);
        System.out.println(planet5.toString());
         
        System.out.println("\n");
        
        String title = "Five Dwarf Planets\n\n";
        String labels = "     Name     Discovered by    Year    Diameter(km)   Distance(km)\n\n";
        
        System.out.printf("%44s", title);
        System.out.printf("%24s", labels);
        System.out.printf("%9s %12s %12d %,10.1f %,18d\n", planet1.getName(), planet1.getDiscoverer(), planet1.getYear(), planet1.getDiameter(), planet1.getSunDistance());
        System.out.printf("%9s %12s %12d %,10.1f %,18d\n", planet2.getName(), planet2.getDiscoverer(), planet2.getYear(), planet2.getDiameter(), planet2.getSunDistance());
        System.out.printf("%9s %12s %12d %,10.1f %,18d\n", planet3.getName(), planet3.getDiscoverer(), planet3.getYear(), planet3.getDiameter(), planet3.getSunDistance());
        System.out.printf("%9s %12s %12d %,10.1f %,18d\n", planet4.getName(), planet4.getDiscoverer(), planet4.getYear(), planet4.getDiameter(), planet4.getSunDistance());
        System.out.printf("%9s %12s %12d %,10.1f %,18d", planet5.getName(), planet5.getDiscoverer(), planet5.getYear(), planet5.getDiameter(), planet5.getSunDistance());
        
    }
    
}