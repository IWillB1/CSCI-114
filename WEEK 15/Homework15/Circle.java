//Circle.java
import java.text.DecimalFormat;
import java.lang.Math;

public class Circle extends Figure
{
    private double radius;

    // Get/Set methods
    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double inputRadius)
    {
        this.radius = inputRadius;
    }

    // Constructor
    public Circle(double radius)
    {
        setRadius(radius);
    }

    // method to calculate perimeter
    public void calculatePerimeter()
    {
        setPerimeter(radius * 2 * Math.PI);
    }

    // method to calculate area
    public void calculateArea()
    {
        setArea(radius * radius * Math.PI);
    }

    // toString method
    public String toString()
    {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        return "Circle has radius " + decimalFormat.format(radius) + "\n" +
                "Its perimeter is " + decimalFormat.format(getPerimeter()) +
                " and its area is " + decimalFormat.format(getArea());
    }

    // Equals method
    public boolean equals(Object circleObject)
    {
        if ((circleObject == null) || getClass() != circleObject.getClass())
        {
            return false;
        }
        Circle otherCircle = (Circle) circleObject;
        return radius == otherCircle.getRadius();
    }


}