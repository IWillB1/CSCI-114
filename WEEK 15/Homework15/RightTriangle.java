package Homework15;

//RightTriangle.java

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class RightTriangle extends Triangle {

    public RightTriangle(double lengthA, double lengthB) {
        super(lengthA, lengthB, 0.0);
        calculateHypotenuse();
    }

    public void setLengthA(double lengthA) {
        super.setLengthA(lengthA);
        calculateHypotenuse();
    }

    public void setLengthB(double lengthB) {
        super.setLengthB(lengthB);
        calculateHypotenuse();
    }

    // method to calculate hypotenuse
    public void calculateHypotenuse() {
        setLengthC(sqrt(pow(getLengthA(), 2) + pow(getLengthB(), 2)));
    }

    // toString method
    public String toString() {
        return "Right " + super.toString();
    }

}