/**
 * <h2>Square.java - Square a child of class Rectangle</h2>
 *
 * @author Will Bouasisavath
 * @version @version Module 15, Lab 1
 */

public class Square extends Rectangle {

    /**
     * Constructor for Square
     */    
    public Square(double side) {
        super(side, side);
        calculatePerimeter();
        calculateArea();
    }

    /**
     * toString method
     */    
    public String toString() {      
        String desc= String.format
            ("Square has side %3.2f (%d sides).\n",getHeight(),getNumberOfSides())
            +String.format
            ("Its perimeter is %3.2f and its area is %3.2f.",
                getperimeter(),getarea());

        return desc;
    }

}