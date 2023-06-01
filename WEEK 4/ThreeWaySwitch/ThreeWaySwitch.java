/**
 * CircuitTester.java - will utilize the objects from ThreeWaySwitch class
 * Author: Will Bouasisavath
 * Module: 4
 * Project: Homework Project1 Light Switch
 * Problem statement: Create a Java class which describes a 3-way light switch. Each object of this class will have two switches (up or down), then calculate the state of the light they control (on or off).
 *  
 * Algorithm: 
 * 
 *     Instance variables:
 *     firstSwitchState (int) holds an int value for the first switch in the method
 *     secondSwitchState (int) holds an int value for the second switch in the method
 *
 *     Methods:
 *          *  ThreeWaySwitch(), a typical constrcutor which take on two parameters (initialFirstSwitch, initialSecondSwitch), and sets them to the two instance variables respectively.
 *          *  getFirstSwitchState() and getSecondSwitchState(), a getter for the first and second switch states respectively, returns an int
 *          *  toggleFirstSwitch() and toggleSecondSwitch(), "setters" but really just increase the int value of the first and second switches by 1 respectively.
 *          *  getLightState(), uses logic ((fss + sss) % 2) to return a 1 or 0 which represents the on and off light states respectively.
 * 
 */

public class ThreeWaySwitch
{
    // instance variables
    private int firstSwitchState = 0, 
                secondSwitchState = 0;

    /**
     * Constructor for objects of class ThreeWaySwitch
     */
    public ThreeWaySwitch(int initialFirstSwitch, int initialSecondSwitch)
    {
        firstSwitchState = initialFirstSwitch;
        secondSwitchState = initialSecondSwitch;
    }

    /**
     * Getter for firstSwitchState
     *
     * return firstSwitchState (0 = down, 1 = up)
     */
    public int getFirstSwitchState()
    {
        return firstSwitchState;
    }

    /**
     * Getter for secondSwitchState
     *
     * return secondSwitchState (int)
     */
    public int getSecondSwitchState()
    {
        return secondSwitchState;
    }

    /**
     * Getter for light state
     *
     * return logic for light state (0 off, 1 on)
     */
    public int getLightState()
    {
        return (firstSwitchState + secondSwitchState) % 2;
    }

    /**
     * Setter for first switch
     *
     * adds 1 to variable firstSwitchState
     */
    public void toggleFirstSwitch()
    {
        firstSwitchState++;
    }

    /**
     * Setter for second switch
     *
     * adds 1 to variable secondSwitchState
     */
    public void toggleSecondSwitch()
    {
        secondSwitchState++;
    }

    /**
     * toString returns
     */
    public String toString()
    {
        return String.format("The switch statement is %d/n ", firstSwitchState, secondSwitchState) ;

    }
}