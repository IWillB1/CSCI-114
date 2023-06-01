/**
 * SeparateRectangle.java - will utilize the objects from Rectangle class
 * Author:   Will Bouasisavath
 * Module:   3
 * Project:  Homework Project 1
 * Problem statement: Create a "strawman" class for drawing Rectangle objects
 * 
 * Algorithm:
 * 
 * 1. Creates two Rectangle objects
 *    - The first should have an id "one", height of 25, width 13, and position x = 4, y = 12
 *    - The second should have id "two", height 7, width 17, and position x = 29, y = -11
 * 2. "draws" each of the Rectangle objects
 * 3. "centers" Rectangle "one"
 * 4. Sets the height and width of "one" to 28 and 16
 * 5. Sets the x and y position of "two" to 15 and -34
 * 6. Invokes the toString metho for each of the Rectangle objects and prints the returned String on the console
 * 
 */
import java.lang.String;

public class SeparateRectangle
{
    /**
     * Constructor for objects of class SeparateRectangle
     */
    public static void main(String[] args) {

        System.out.printf("\n**Creating two Rectangle objects**\n");
        Rectangle one = new Rectangle("one", 4, 12, 13, 25);
        Rectangle two = new Rectangle("two", 29, -11, 17, 7);

        System.out.printf("\n**Drawing both Rectangles**\n");
        one.draw();
        two.draw();

        System.out.printf("\n**Centering first Rectangle**\n");
        one.center();

        System.out.printf("\n**Testing setters**\n");
        one.setHeight(28);
        one.setWidth(16);
        two.setX(15);
        two.setY(-34);

        System.out.printf("\n**Testing toString()**");
        String outputOne = one.toString();
        System.out.printf(outputOne);
        String outputTwo = two.toString();
        System.out.printf(outputTwo);
    }
}