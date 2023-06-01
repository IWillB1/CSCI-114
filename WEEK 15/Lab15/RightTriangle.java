
/**
 *  <h2>RightTriangle.java - Create a class RightTriangle which is triangle with one of its angles equal to 90º – a “right angle”.</h2>
 *
 * @author Will Bouasisavath
 * @version Module 15, Lab 1
 */
public class RightTriangle extends Triangle {

    public RightTriangle(double a,double b) {
        super(a, b,Math.sqrt(a * a + b * b)) ;  
        calculatePerimeter() ;
        calculateArea() ;
    }

    public void setSide1(double a) {
        super.setSide1(a) ;  
        setSide3(Math.sqrt(getSide1()*getSide1()+getSide2()*getSide2())) ;
    }

    public void setSide2(double b) {
        super.setSide2(b) ;      
        setSide3(Math.sqrt(getSide1()*getSide1()+getSide2()*getSide2())) ;
    }

    // toString method
    public String toString() {      
        String desc= String.format
            ("Right triangle has sides %3.2f , %3.2f and %3.2f (%d sides).\n",
                getSide1(),getSide2(),getSide3(),getNumberOfSides())
            +String.format
            ("Its perimeter is %3.2f and its area is %3.2f.",
                getperimeter(),getarea()) ;

        return desc ;
    }
}