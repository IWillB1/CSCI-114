
/**
 * <h2>Tester.java - which tests all classes</h2>
 * 
 * <h3>Is the default (no-arg) constructor for the  Figure  class necessary?  How can you get around providing this?</h3>
 * <p>Yes it is necessary for the Figure default constructor because of its private variables. As long as all class is public with no private variables they can inherit from Figure class.</p>
 *   
 * <h3>What methods does the  Square  class inherit from  Figure?  Which does it inherit from  Rectangle?</h3>
 * <p>The Square class inherits from parent class Figure Area/Perimeter Getter and Setters. From Rectangle inherits Length/Width ,equals, and NumberOfSides.</p>
 * 
 * <h3>How would you change the design of this lab so that the perimeter and area of the object being created or modified are always correct (without having to invoke  calculatePerimeter  and  calculateArea)?  Do you remember what this condition is called?</h3>
 * <p>The constructor and the setters in each class call calcArea and calcPerimiter automatically.  You could then make those two functions private.</p>
 * @author Will Bouasisavath
 * @version Module 15, Lab 1
 */

public class Tester {

    public static void main(String[] args) {

        // Create an array of Figure Objects
        Figure[] figures = new Figure[8];
        
        // Instantiate two Rectangle Objects both with height = 10.3 and width = 8.0.
        figures[0]=new Rectangle(10.30, 8.0);
        figures[1]=new Rectangle(10.30, 8.0);
        
        // Instantiate a  Square  with a side of 20 and put into element #2
        figures[2]=new Square(20.0);
        
        // Instantiate a triangle with sides of 6.5, 14.9, and 11.3 Put into element #3
        figures[3]=new Triangle(6.50, 14.90, 11.30);
        
        // Instantiate a circle with radius of 4.31 and put into element #4
        figures[4]=new Circle(4.31);
        // Instantiate another circle with radius of 8.15 and put into element #5
        figures[5]=new Circle(8.25);
        
        // Right Triangles Objects
        figures[6]=new RightTriangle(3.0, 4.0);
        figures[7]=new RightTriangle(5.0, 12.0);

        int i=1;

        // Write a loop that spins through all of the elements in the array
        for (Figure figure : figures) {
            System.out.println("Figure"+i);
            System.out.println(figure);
            i++;      
        }

        // Compare the Rectangle objects in elements 0 and 1 and determine if they are equal
        System.out.println("\n\nTest equals() methods");
        if(figures[0].equals(figures[1])) {
            System.out.println("Rectangles 1 and 2 are equal");
        }

        // Compare the Circle objects in elements 4 and 5 and show if they are equal
        if(figures[4].equals(figures[5])) {
            System.out.println("Circles 5 and 6 are equal");
        } else { 
            System.out.println("Circles 5 and 6 are not equal");
        }

        // Compare the Circle object determine if they are equal to itself
        if(figures[4].equals(figures[4])) {
            System.out.println("Circle 5 equal to itself ? yes");
        } else {
            System.out.println("Circle 5 equal to itself ? No");
        }
        
        // Compare the Triangle object in element 3 with the Square in element 2 and determine if they are equal
        if(figures[3].equals(figures[2])) {
            System.out.println("Triangle 4 and Square 3 are equal");
        } else {
            System.out.println("Triangle 4 and Square 3 are NOT equal");
        }
        
        // new line
        System.out.println("\n");
        
        // Test and Print original right-triangle reassignments
        System.out.println("Test right-triangle reassignments");
        RightTriangle r=new RightTriangle(3, 4);
        System.out.printf("Original :");
        System.out.printf("Right triangle has sides %2.2f,%2.2f, and %2.2f",r.getSide1(),
        r.getSide2(),r.getSide3());

        // Set sides to 6.0 and 8.0
        r.setSide1(6.0);
        r.setSide2(8.0);

        // Print revised RightTriangle
        System.out.printf("\nRevised :");
        System.out.printf("Right triangle has sides %2.2f,%2.2f, and %2.2f",r.getSide1(),
        r.getSide2(),r.getSide3());

    }
}