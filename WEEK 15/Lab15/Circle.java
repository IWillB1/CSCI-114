/**
 * <h2>Circle.java - Circle a child of class Figure</h2>
 *
 * <p>Algorithm:</p>
 * <p>In main:</p>
 * <ol>
 *     <li> Create one instance variables <b>private double</b>, the radius of this circle object
 *     <li> Getters and Setters for the radius of the circle being described
 *     <li> One constructor which takes the radius of the circle as its lone parameter
 *     <li> A <b>toString()</b> method which shows the radius of the circle, its perimeter (or its “circumference”), and its area (All numbers should be printed to two decimal places)
 *     <li> An <b>equals(Object)</b> method which compares the radius of two circle objects and returns <b>true</b> if the radii are equal
 *     <li> A method named <b>calculatePerimiter</b> which calculates the perimeter of the circle and uses the setter method in <code><b>Figure</b></code> to store its value (Perimeter = 2 π r)
 *     <li> A method named <b>calculateArea</b> which computes the area of the circle and uses the setter method in  Figure  to store its value (Area = π r2)
 * </ol>
 * 
 * @author Will Bouasisavath
 * @version @version Module 15, Lab 1
 */

public class Circle extends Figure {

    // instance variable
    private double radius;
    
    /**
     * Constructor for Triangle
     */    
    public Circle(double radius) {
        setRadius(radius);
        calculatePerimeter();
        calculateArea();
    }
    
    /**
     * Setter for Radius
     * @param radius - sets <this.radius</code>
     */
    public void setRadius(double radius){
        this.radius=radius;
    }
    
    /**
     * Getter for Radius
     * @return <code>radius</code>
     */
    public double getRadius(){
        return radius;
    }
    
    /**
     * toString Method
     */
    public String toString() {      
        String desc= String.format
            ("Circle has radius %3.2f \n",getRadius())
            +String.format
            ("Its perimeter is %3.2f and its area is %3.2f.",
                getperimeter(),getarea());

        return desc;
    }
    
    /**
     * Equals method for Object of Circle
     */
    public boolean equals(Object objCircle) {
        if ((objCircle == null) || getClass() != objCircle.getClass())
        {
            return false;
        }
        Circle c = (Circle)objCircle;      
        return radius == c.getRadius();              
    }
    
    /**
     * Method calculate the perimter of Circle
     */
    public void calculatePerimeter() {   
        setperimeter(2*Math.PI*radius);

    }
    
    /**
     * Method computes area of the Circle
     */
    public void calculateArea() {
        setarea(Math.PI*radius*radius);

    }
}