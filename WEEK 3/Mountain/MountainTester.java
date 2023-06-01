/**
 * MountainTester.java - Test the Mountain class with 6 summits
 * Author:     Will Bouasisavath
 * Module:     3
 * Project:    Lab 3
 * Problem Statement:  Create a Mountain class which tracks the
 *    mountain's name, the continent with the mountain, and the
 *    elevation at its peak (in feet).  Create 6 Mountain objects  
 *    for the largest mountain on each continent and display.
 *
 * Algorithm:
 *   1. Create Mountain objects for each of the tallest mountain
 *      summits using a constructor.  Use incorrect data for
 *      Aconcagua.
 *
 *
 *         --Continent--    -----Name---  Elevation
 *         North America    Denali           20,310
 *         South America    Aconcagua        22,831
 *         Africa           Kilimanjaro      19,340
 *         Europe           Mt. Elbrus       18,510
 *         Asia             Mt. Everest      29,035
 *         Australia        Kosciuszko        7,310
 *
 *   2.  Use toString to display the values for all six mountains
 *   3.  Use setters to correct the values for Aconcagua
 *   4.  Use getters to display the corrected values
 */

public class MountainTester
{
    public static void main(String[] args) 
    {
        
        //create a mountain object for each object
        Mountain denali = new Mountain("Denali", "North America", 20310);
        Mountain aconcagua = new Mountain("Aconcagua", "Mars", -500);
        Mountain kilimanjaro = new Mountain("Kilimanjaro", "Africa", 19340);
        Mountain mountElbrus = new Mountain("Mt. Elbrus", "Europe", 18510);
        Mountain mountEverest = new Mountain("Mt. Everest", "Asia", 29035);
        Mountain kosciuszko = new Mountain("Kosciuszko", "Australia", 7310);
                       
        //print the info for each mountain
        System.out.println(denali.toString());
        System.out.println(aconcagua);
        System.out.println(kilimanjaro.toString());
        System.out.println(mountElbrus.toString());
        System.out.println(mountEverest.toString());
        System.out.println(kosciuszko.toString());
        
        // Correcting the values for South America with setters
        aconcagua.setContinent("South America");
        aconcagua.setElevation(22821);
        
        //testing getter and setter methods
        System.out.println("\nThe new value of " + aconcagua.getName() + " in " + aconcagua.getContinent() + " is " + aconcagua.getElevation() + " feet.");
    }
} 

