/**
 * Rectangle.java - Define properties of a Rectangle object
 * Author:   Will Bouasisavath
 * Module:   3
 * Project:  Homework Project 1
 * 
 * Instance Variables:
 * 
 * 1. A string named id which identifies rectangle object
 * 
 * 2. An int named x which represents the x-coordinate of 
 *    the upper-left corner of the rectangle on a grid or canvas
 *    
 * 3. An int named y which represnets the y-coordinate of
 *    the upper-left corner
 *    
 * 4. An int named width which represents the horizontal
 *    size (in the 'x' direction) of the rectangle
 *    
 * 5. An int named height which represents the vertical
 *    size (in the 'y' direction) of the rectangle
 *    
 * Methods:
 * 
 * - The constructor should save the values of the five parameters
 *   (for the five instance variables), then print "In constructor
 *    for <id> with height <height> and width <width> at position (<x>, <y>)
 *    
 * - The draw method should print "Running draw() for <id>".
 * 
 * - The erase method should print "Running erase() for <id>".
 * 
 * - The center method should do these four things:
 *       print "Running center() for <id>".
 *       invoke erase,
 *       print "Centering <id>"
 *       invoke draw
 * 
 * - The getters for each property should print
 *   "Running getter of <variable name> for <id>
 *   
 * - The setters for each property should print 
 *   "Running setter of the <variable name> for <id> with value <new value>,
 *   then set the value of the appropriate instance variable to <new value>
 *   
 * - The toString method creates a String smiliar to 
 *   "<id> with height <height> and width <width> at position (<x>, <y>)",
 *   prints "Running toString() for " 
 *   concatenated with that String, then returns that string.
 */

import java.lang.String;

public class Rectangle
{
    // instance variables
    private String id;
    private int x, y, width, height;

    /*Constructor for objects of class Rectangle*/
    public Rectangle(String inputId, int inputX, int inputY, int inputWidth, int inputHeight)
    {
        id = inputId;
        x = inputX;
        y = inputY;
        width = inputWidth;
        height = inputHeight;

        System.out.printf("In constructor for %s with height %d and width %d at position (%d, %d)\n", id, height, width, x, y);
    }

    //*draw method prints 'running draw() for id'*/
    public void draw()
    {
        System.out.printf("Running draw() for %s\n", id);
    }

    //*erase method prints 'running erase() for id'*/
    public void erase()
    {
        System.out.printf("Running erase() for %s\n", id);
    }

    //*center method prints 'running center() for id'*/
    //then invokes erase
    //prints 'centering'
    //then invokes draw @param id gives the method identification for the rectangle object
    public void center()
    {
        System.out.printf("Running center() for %s\n", id);
        erase();
        System.out.printf("Centering %s\n", id);
        draw();
    }

    //*Getter for x value for id given
    //id gives the method identification for the rectangle 
    //return x value for id*/
    public int getX()
    {
        System.out.printf("Running getter of x for %s\n", id);
        return x;
    }
    
    //*Getter for y value for id given
    //id gives the method identification for the rectangle 
    //return y value for id*/
    public int getY()
    {
        System.out.printf("Running getter of y for %s\n", id);
        return y;
    }

    //*Getter for width value for id given
    //id gives the method identification for the rectangle 
    //return width value for id*/
    public int getWidth()
    {
        System.out.printf("Running getter of width for %s\n", id);
        return width;
    }

    //*Getter for width value for id given
    //id gives the method identification for the rectangle 
    //return width value for id*/
    public int getHeight()
    {
        System.out.printf("Running getter of height for %s\n", id);
        return height;
    }

    //*Setter for x value for id and new value given
    //id gives the method identification for the rectangle 
    //newX gives a new value for x to be set to*/    
    public void setX(int newX) 
    {
        System.out.printf("Running setter of x for %s with value %d\n", id, newX);
        x = newX;
    }

    //*Setter for y value for id and new value given
    //id gives the method identification for the rectangle 
    //newY gives a new value for y to be set to*/    
    public void setY(int newY) 
    {
        System.out.printf("Running setter of y for %s with value %d\n", id, newY);
        y= newY;
    }

    //*Setter for height value for id and new value given
    //id gives the method identification for the rectangle 
    //newHeight gives a new value for height to be set to*/    
    public void setHeight(int newHeight) 
    {
        System.out.printf("Running setter of height for %s with value %d\n", id, newHeight);
        height = newHeight;
    }
    
    //*Setter for width value for id and new value given
    //id gives the method identification for the rectangle 
    //newWidth gives a new value for width to be set to*/    
    public void setWidth(int newWidth) 
    {

        System.out.printf("Running setter of width for %s with value %d\n", id, newWidth);
        width = newWidth;
    }

    //*The toString method creates a String similar to "<id> with height <height> and width <width> at position (<x>, <y>)", prints "Running toString() for " concatenated with that String, then returns that String.
    //return stringCheese which holds an english sentence with all the variables' values*/
    public String toString() 
    {
        String stringCheese = String.format("%s with height %d and width %d at position (%d, %d)\n", id, height, width, x, y);
        System.out.printf("\nRunning toString() for %s\n", stringCheese);
        return(stringCheese);        
    }
}
