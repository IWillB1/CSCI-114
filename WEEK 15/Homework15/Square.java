//Square.java

import java.text.DecimalFormat;

public class Square extends Rectangle {


    //decimal formatter
    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    //constructor
    public Square (double length) {
        super(length, length);
    }

    //get length
    public double getLength() {
        return getHeight();
    }

    //set length
    public void setLength(int length) {
        setWidth(length);
        setHeight(length);
    }

    //to string method
    public String toString() {
        return "Square has sides " + decimalFormat.format(getHeight())
                + " (" + getNumberOfSides() + " sides)\n"
                + "Its perimeter is " + decimalFormat.format(getPerimeter())
                + " and its area is " + decimalFormat.format(super.getArea());
    }

    //equal method to check if two square objects are equal or not
    public boolean equals(Object rectangleObject) {
        if ((rectangleObject == null) || getClass() != rectangleObject.getClass())
        {
            return false;
        }
        Square otherSquare = (Square) rectangleObject;
        return getLength() == otherSquare.getLength();
    }
}