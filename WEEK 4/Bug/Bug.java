/**
 * Bug.java - will utilize objects from Bug.java class
 * Author: Will Bouasisavath
 * Module: 4
 * Project: Homework Project2 Bug
 * Problem statement: Implement a class named Bug that models a bug walking along a wire
 * Algorithm: 
 * 
 * Instance variables:
 *     position (int), a number that represents where the bug is in 1d space
 *     direction (int), a number (initially 1, can be 1, or -1 depending on if turn() is called) that decides which way the bug is going (positive/right, negative/left)
 *
 * Methods:
 *          *  Bug(), a typical constrcutor which take on the parameter initialPosition, and sets it to the position instance var.
 *          *  getCurrentPosition() a getter for the position var
 *          *  move() adds the direction variable to the position variable
 *          *  turn() multiplies the direction variable by -1, which in turn changes the direction
 *          *  toString() returns a string with the instance varibles listed in plain english. 
 * 
 */
public class Bug
{
    // instance variables
    private int position = 0, direction = 1;

    /**
     * Constructor for objects of class Bug
     */
    public Bug(int initialPosition)
    {
        position = initialPosition;
    }

    /**
     * Getter for position
     *
     * return position (int)
     */
    public int getCurrentPosition()
    {
        return position;
    }

    /**
     * Basically increases/decreases variable
     *
     * adds direction (could be either -1 or 1) to variable position
     */
    public void move()
    {
        position += direction;
    }
    
    /**
     * Swaps direction
     *
     * multiplies direction by -1
     */
    public void turn()
    {
        direction = direction * -1;
    }

    /**
     * returns a string into text form
     */
    public String toString()
    {
        return "The position is " + position + " and the direction is " + direction + ".";
    }
}