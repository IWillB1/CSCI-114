package Homework15;

//rectangle.java
import java.text.DecimalFormat;

public class Rectangle extends Figure {

    //decimal formatter
    DecimalFormat decimalformatRectangle = new DecimalFormat("0.00");

    private double height = 0;
    private double width = 0;

    //constructor
    public Rectangle(double newHeight, double newWidth) {
        setHeight(newHeight);
        setWidth(newWidth);
    }

    //get height
    public double getHeight() {
        return height;
    }
    //get width
    public double getWidth() {
        return width;
    }
    // set height
    public void setHeight(double newHeight){
        height = newHeight;
        calculatePerimeter();
        calculateArea();
    }
    //set width
    public void setWidth(double newWidth) {
        width = newWidth;
        calculatePerimeter();
        calculateArea();
    }
   //get number of sides of rectangle
    public int getNumberOfSides() {
        return 4;
    }
    // method to calculate Perimeter
    public void calculatePerimeter() {
        super.setPerimeter((height + width) * 2);
    }
    // method calculate Area
    public void calculateArea() {
        super.setArea(height * width);
    }

    // toString
    public String toString() {
        return "Rectangle has height " + decimalformatRectangle.format(height)
                + " and width " + decimalformatRectangle.format(width)
                + " (" + getNumberOfSides() + " sides)\n"
                + "Its perimeter is " + decimalformatRectangle.format(getPerimeter())
                + " and its area is " + decimalformatRectangle.format(super.getArea());
    }

    // equals
    public boolean equals(Object rectangleObject) {
        if ((rectangleObject == null) || getClass() != rectangleObject.getClass())
            return false;
        Rectangle otherRectangle = (Rectangle) rectangleObject;
        return (height == otherRectangle.height
                && width == otherRectangle.width);
    }

}