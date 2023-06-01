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

    // two instance variables
    private double area;
    private double perimeter;

    /**
     * Constructor for Figures
     */
    public Figure() {
        // sets both variables to 0
        area=0;
        perimeter=0;
    }

    /**
     * Setter for <code>area</code>
     * @param area - sets <this.area</code>
     */
    public void setarea(double area){
        this.area=area;
    }

    /**
     * Setter for <code>perimeter</code>
     * @param perimeter - sets <code>this.perimeter</code>
     */
    public void setperimeter(double perimeter){
        this.perimeter=perimeter;
    }

    /**
     * Getter for <code>area</code>
     * @return <code>area</code>
     */
    public double getarea(){
        return area;
    }

    /**
     * Getter for <code>perimeter</code>
     * @return <code>perimeter</code>
     */
    public double getperimeter(){
        return perimeter;
    }

    // Abstract methods toString and equals method
    public abstract String toString();
    public abstract boolean equals(Object obj);

    // Abstract calculates area and perimeter
    public abstract void calculateArea();
    public abstract void calculatePerimeter();

    /**
     * A method with signature public int which will return the number of sides for a specific shape
     * Getter for <code>NumberOfSides</code>
     * @return <code>NumberOfSides</code>
     */
    public int getNumberOfSides()
    {
        return 0;
    }
}