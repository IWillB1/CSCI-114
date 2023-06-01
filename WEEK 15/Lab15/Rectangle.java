/**
 * <h2>Rectangle.java - Rectangle a child of class Figure</h2>
 *
 * <p>Algorithm:</p>
 * <p>In main:</p>
 * <ol>
 *     <li> Create two instance variables <b>private double</b>, representing the the <i>height</i> and <i>width</i> of this rectangle object
 *     <li> Getters and Setters for the height and width of the rectangle object being described
 *     <li> One constructor which takes the lengths of the two dimensions as its parameters
 *     <li> A method named <b>getNumberOfSides()</b> which returns the integer 4
 *     <li> A <b>toString()</b> method which shows the lengths of its two dimensions, its perimeter, and its area (All numbers should be printed to two decimal places)
 *     <li> An <b>equals(Object)</b> method which compares the height and width of this rectangle with the height and width of another rectangle and returns <b>true</b>  if both are equal
 *     <li> A method named <b>calculatePerimiter</b> which calculates the perimeter of the rectangle and uses the setter method in <code><b>Figure</b></code> to store its value
 *     <li> A method named <b>calculateArea</b> which computes the area of the rectangle and uses the setter method in <code><b>Figure</b></code> to store its value 
 * </ol>
 * 
 * @author Will Bouasisavath
 * @version @version Module 15, Lab 1
 */

public class Rectangle extends Figure {

    private double height;
    private double width;

    /**
     * Constructor for Rectangle
     */
    
    public Rectangle(double height, double width) {
        setHeight(height);
        setWidth(width);
        calculatePerimeter();
        calculateArea();
    }

    /**
     * Setter for Height
     * @param height - sets <this.height</code>
     */
    public void setHeight(double height) {
        this.height=height;
    }
    
    /**
     * Setter for Width
     * @param width - sets <this.width</code>
     */
    public void setWidth(double width) {
        this.width=width;      
    }

    /**
     * Getter for Height
     * @return <code>height</code>
     */   
    public double getHeight() {
        return height;
    }

    /**
     * Getter for width
     * @return <code>width</code>
     */    
    public double getWidth() {
        return width;      
    }

    /**
     * toString method
     */
    public String toString() {      
        String desc= String.format
            ("Rectangle has height %3.2f and width %3.2f (%d sides).\n",
                height,width,getNumberOfSides())
            +String.format
            ("Its perimeter is %3.2f and its area is %3.2f.",
                getperimeter(),getarea());

        return desc;
    }

    /**
     * Equals method for Object of Rectangle
     */
    public boolean equals(Object objRectangle) {
        if ((objRectangle == null) || getClass() != objRectangle.getClass()) {
            return false;
        }
        Rectangle r=(Rectangle)objRectangle;

        return height==r.getHeight()&&
        width==r.getWidth();
    }

    /**
     * Getter for NumberOfSides
     */
    public int getNumberOfSides()
    {
        return 4;
    }

    /**
     * Method calculate the perimter of Rectangle
     */    
    public void calculatePerimeter() {      
        setperimeter(2*(width+height));

    }

    /**
     * Method computes area of the Rectangle
     */    
    public void calculateArea() {
        setarea(width*height);      
    }
}