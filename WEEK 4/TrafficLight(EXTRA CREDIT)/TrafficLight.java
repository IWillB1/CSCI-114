/**
 * TrafficLight.java - Draw a nice Rectangle2D and an overlapping Ellipse2D object
 * Author:     Will Bouasisavath
 * Module:     4
 * Project:    Lab, Phase 1 extra credit
 * Description: Draw a single rectangle / 3 circle on the graphic
 *
 * Instance variables:
 *   *  xLeft (int) - the X coordinate of the top-left corner of the image
 *   *  yTop (int) - the Y coordinate of the top-left corner of the image
 *   *  scale (double) - the scale of the figure
 *
 * Methods:
 *   *  draw(), which actually draws the Circle (oval) and Rectangle on the underlying
 *       graphics object
 */

import java.awt.Graphics2D ;
import java.awt.Graphics ;
import java.awt.geom.Ellipse2D ;
import java.awt.Rectangle ;
import java.awt.Color ;

public class TrafficLight
{
    // constants
    private static final int CIRCLE_X_OFFSET = 25, CIRCLE_Y_OFFSET = 25;
    private static final int RECTANGLE_WIDTH = 150,
                             RECTANGLE_HEIGHT = 400,
                             CIRCLE_DIAMETER = 100;

    // Instance variables
    private int xLeft = 0 ;
    private int yTop = 0 ;
    private double scale = 1.0;

    // Draw a black rectangle in the top-left corner of this figure, then move over a few pixels and
    public void draw(Graphics2D figure) 
    {
        // Create a Rectangle object with upper-left corner the same as the upper-left corner of
        // this object.  Add the resulting Rectangle object to the graphics object of the JFrame

        int rectangleWidth = (int) (RECTANGLE_WIDTH * scale);
        int rectangleHeight = (int) (RECTANGLE_HEIGHT * scale);

        Rectangle rectangle = new Rectangle(xLeft, yTop, rectangleWidth, rectangleHeight) ;
        figure.setColor(Color.BLACK) ;
        figure.fill(rectangle) ;

        // Create the 3 Circle object that is on from the Rectangle object, scaled like the Rectangle object
        // is scaled, and add to the graphics object

        int circleX = (int) (xLeft + CIRCLE_X_OFFSET * scale);
        int circleY = (int) (yTop + CIRCLE_Y_OFFSET * scale);
        int circleDiameter = (int) (CIRCLE_DIAMETER * scale);
        
        // The Red Circle object
        Ellipse2D.Double redLight = new Ellipse2D.Double(circleX, circleY, circleDiameter, circleDiameter) ;
        figure.setColor(Color.RED) ;
        figure.fill(redLight) ;
        
        // The Yellow Circle object
        Ellipse2D.Double yellowLight = new Ellipse2D.Double(xLeft + (25 * scale), yTop + (150 * scale) , circleDiameter, circleDiameter) ;
        figure.setColor(Color.YELLOW) ;
        figure.fill(yellowLight) ;
        
        // The Green Circle object
        Ellipse2D.Double greenLight = new Ellipse2D.Double(xLeft + (25 * scale), yTop + (275 * scale) , circleDiameter, circleDiameter) ;
        figure.setColor(Color.GREEN) ;
        figure.fill(greenLight) ;

    }

    // Constructor which updates instance variables
    public TrafficLight(int xLeft, int yTop, double scale) 
    {
        this.xLeft = xLeft ;
        this.yTop = yTop ;
        this.scale = scale;
    }
}