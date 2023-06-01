package Homework15;

// Driver.java

public class Tester {

    public static void main (String[] args){

        Figure[] figureObject = new Figure[8];

        // Rectangle objects
        figureObject[0] = new Rectangle(10.3, 8.0);
        figureObject[1] = new Rectangle(10.3, 8.0);
        // Square Object
        figureObject[2] = new Square(20.0);
        // Triangle Object
        figureObject[3] = new Triangle(6.5, 14.9, 11.3);
        // Circles Objects
        figureObject[4] = new Circle(4.31);
        figureObject[5] = new Circle(8.15);
      
        // Right Triangles Objects
        figureObject[6] = new RightTriangle(3.0, 4.0);
        figureObject[7] = new RightTriangle(5.0, 12.0);


        // iterate through each figure array
        for (int i = 0; i < figureObject.length; i++) {
          
            figureObject[i].calculatePerimeter();
            figureObject[i].calculateArea();
          
            // display the figure number and toString for each object
            System.out.println("Figure " + (i + 1) + ": " + figureObject[i].toString());
            System.out.println();
        }
        // Test equals() methods
        System.out.println("Test equals() methods");
      
        // Compare Rectangles
        System.out.println(" Rectangle 1 is " + (figureObject[0].equals(figureObject[1]) ? "" : "not ")
                + "equals to Rectangle 2.");
      
        // Compare Circles
        System.out.println(" Circle 5 is " + (figureObject[4].equals(figureObject[5]) ? "" : "not ")
                + "equals to Circle 6.");
      
        // Compare Circle
        System.out.println(" Circle 5 is " + (figureObject[4].equals(figureObject[4]) ? "" : "not ")
                + "equals to Circle 5.");
      
        // Compare Triangle
        System.out.println(" Triangle 4 is " + (figureObject[3].equals(figureObject[2]) ? "" : "not ")
                + "equals to Square 3.");

        // Test right-triangle
        System.out.println("\nTest right-triangle reassignments");
    
    
        RightTriangle revisedRightTriangle = (RightTriangle) figureObject[6];
    
        // Print original RightTriangle
        System.out.println(" Original: " + revisedRightTriangle.toString());
    
        // Set legs to 6.0 and 8.0
        revisedRightTriangle.setLengthA(6.0);
        revisedRightTriangle.setLengthB(8.0);
    
        // Print revised RightTriangle
        System.out.println(" Revised: " + revisedRightTriangle.toString());
    }
}