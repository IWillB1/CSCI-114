package Homework15;

//Triangle.java

import java.text.DecimalFormat;

public class Triangle extends Figure{
    private double lengthA;
    private double lengthB;
    private double lengthC;

    // Constructor
    public Triangle(double lengthA, double lengthB, double lengthC) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    // get length of side A
    public double getLengthA() {
        return lengthA;
    }

    // set length of side A
    public void setLengthA(double lengthA) {
        this.lengthA = lengthA;
    }

    //// get length of side B
    public double getLengthB() {
        return lengthB;
    }

    //// set length of side b
    public void setLengthB(double lengthB) {
        this.lengthB = lengthB;
    }

    // get length of side C
    public double getlengthC() {
        return lengthC;
    }

    // set length of side C
    public void setLengthC(double lengthC) {
        this.lengthC = lengthC;
    }

    // method to get number of sides for triangle
    public int getNumberOfSides() {
        return 3;
    }

    // Method calculates the perimeter of triangle
    public void calculatePerimeter() {
        setPerimeter(lengthA + lengthB + lengthC);
    }

    // Method computes the area of the triangle
    public void calculateArea() {

        double halfPerimeter = (lengthA + lengthB + lengthC)/2;

        setArea(Math.sqrt(halfPerimeter*(halfPerimeter-lengthA)*(halfPerimeter-lengthB)*(halfPerimeter-lengthC)));
    }

    // equals method
    public boolean equals(Object triangleObject) {
        if(triangleObject == null)
            return false;
        else if(getClass() != triangleObject.getClass())
            return false;
        else {
            Triangle other = (Triangle)triangleObject;
            return (lengthA == other.lengthA &&
                    lengthB == other.lengthB &&
                    lengthC == other.lengthC);
        }
    }

    // toString
    public String toString() {

        DecimalFormat df = new DecimalFormat("0.00");
        calculateArea();
        calculatePerimeter();
        return "Triangle has " + getNumberOfSides() + " sides, " + df.format(lengthA) + ", " + df.format(lengthB) + " and " + df.format(lengthC) + "\nIts perimeter is "
                + df.format(getPerimeter()) + " and its area is " + df.format(getArea());
    }

}