/**
 * <h2>Triangle.java - Triangle a child of Figure</h2>
 * 
 * <p>Algorithm:</p>
 * <p>In main:</p>
 * <ol>
 *     <li> Create three instance variables, all <b>private double</b>, representing the lengths of the three sides
 *     <li> Getters and Setters for the three sides of the triangle object being described
 *     <li> A single constructor which takes the lengths of the three sides as its parameters
 *     <li> A method named <b>getNumberOfSides()</b>  which returns the integer 3
 *     <li> A <b>toString()</b>  method which shows the lengths of its three sides of the triangle, its perimeter, and its area (All numbers should be printed to two decimal places)
 *     <li> An <b>equals(Object)</b>  method which compares the sides of this triangle with the sides of another triangle (in order) and returns <b>true</b> if the three sides of both triangles are equal
 *     <li> A method named <b>calculatePerimiter</b>  which calculates the perimeter of the triangle (the sum of the lengths of the sides) and uses the setter method in <code><b>Figure</b></code> to store its value
 *     <li> A method named <b>calculateArea</b>  which computes the area of the triangle and uses the setter method in <code><b>Figure</b></code> to store its value
 * </ol>
 * 
 * 
 * @author Will Bouasisavath
 * @version Module 15, Lab 1
 */
public class Triangle extends Figure {

    // Instance variables
    private double a;
    private double b;
    private double c;

    /**
     * Constructor for Triangle
     */
    public Triangle(double a,double b,double c) {
        setSide1(a);
        setSide2(b);
        setSide3(c);
        calculatePerimeter();
        calculateArea();
    }

    /**
     * Setter for sides A
     * @param Side1 - sets <this.a</code>
     */
    public void setSide1(double a) {
        this.a = a;      
    }

    /**
     * Setter for sides B
     * @param Side2 - sets <this.b</code>
     */
    public void setSide2(double b) {
        this.b = b;      
    }

    /**
     * Setter for sides C
     * @param Side3 - sets <this.c</code>
     */
    public void setSide3(double c) {
        this.c = c;  
    }

    /**
     * Getter for getSide1
     * @return <code>a</code>
     */
    public double getSide1() {
        return a;
    }

    /**
     * Getter for getSide2
     * @return <code>b</code>
     */
    public double getSide2() {
        return b;
    }

    /**
     * Getter the getSides3
     * @return <code>c</code>
     */
    public double getSide3() {
        return c;
    }

    /**
     * toString Method
     */
    public String toString() {      
        String desc= String.format
            ("Triangle has sides %3.2f , %3.2f and %3.2f (%d sides).\n",
                a,b,c,getNumberOfSides())
            +String.format
            ("Its perimeter is %3.2f and its area is %3.2f.",
                getperimeter(),getarea());

        return desc;
    }

    /**
     * Getter for NumberOfSides
     */
    public int getNumberOfSides()
    {
        return 3;
    }

    /**
     * Equals method for Object of Triangle
     */
    public boolean equals(Object objTriangle) {
        if(objTriangle == null){
            return false;
        }
        else if(getClass() != objTriangle.getClass()) {
            return false;
        }
        else {
            Triangle t = (Triangle)objTriangle;
            return  a == t.getSide1() &&
            b==t.getSide2() &&
            c==t.getSide3() ;
        }
    }

    /**
     * Method calculate the perimter of Triangle
     */
    public void calculatePerimeter() {
        double perimeter = (a+b+c);
        setperimeter(perimeter);

    }

    /**
     * Method computes area of the Triangle
     */
    public void calculateArea() {
        double p=getperimeter();      
        double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        setarea(area);
    }
}