package Homework15;

/**
 * <h2>Figure.java - Parent class named figure</h2>
 * 
 *<h3>Problem Statement:</h3>
 * <p>Create an  <b><i>abstract</i></b>  class called <code><b>Figure</b></code>,  which is the ancestor of several concrete classes</p>
 * 
 * <p>Algorithm:</p>
 * <p>In main:</p>
 * <ol>
 *     <li> Create two instance variables, both <b>private double</b>, named <b>area</b> and <b>perimeter</b>
 *     <li> a single constructor which takes no arguments and sets both instance variables to zero
 *     <li> getter (accessor) and setter (mutator) methods for the two instance variables
 *     <li> abstract methods with headings <b>public String toString()</b>  and <b>public boolean equals(Object)</b>
 *     <li> abstract methods with headings <b>public void calculatePerimiter()</b> and <b>public void calculateArea()</b>
 *     <li> a method with signature public int <b>getNumberOfSides()</b>,  which will return the number of sides for a specific shape
 * </ol>
 * 
 * @author Will Bouasisavath
 * @version Module 15, Lab 1
 */
public abstract class Figure {

    // variables perimeter and area
    private double perimeter;
    private double area;

    // constructor
    public Figure() {
        setPerimeter(0.0);
        setArea(0.0);
    }

    // get perimeter
    public double getPerimeter() {
        return perimeter;
    }
    //get area
    public double getArea() {
        return area;
    }

    // set perimeter
    public void setPerimeter(double newPerimeter) {
        perimeter = newPerimeter;
    }
    //set area
    public void setArea (double newArea) {
        area = newArea;
    }

    // Abstract toString and equals method
    public abstract String toString();
    public abstract boolean equals(Object anObject);

    // Abstract calculate perimeter and area
    public abstract void calculatePerimeter();
    public abstract void calculateArea();

    // abstract method to get number of sides of figures
    public int getNumberOfSides() {
        return 0;
    }

}