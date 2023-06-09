/**
 * SimpleFigure.java - Draw a nice Rectangle2D and an overlapping Ellipse2D object
 * Author:     Will Bouasisavath
 * Module:     4
 * Project:    Lab, Phase 1
 * Description: Draw a single rectangle / circle on the graphic
 *
 * Instance variables:
 *   *  xLeft (int) - the X coordinate of the top-left corner of the image
 *   *  yTop (int) - the Y coordinate of the top-left corner of the image
 *   *  scale (double) - the scale of the figure
 *
 * Methods:
 *   *  draw(), which actually draws the Circle (oval) and Rectangle on the underlying
 *       graphics object
 *   * SimpleFigure(), which is the constructor that updates the instance variables    
 */


import java.awt.Graphics2D ;
import java.awt.Graphics ;
import java.awt.geom.Ellipse2D ;
import java.awt.Rectangle ;
import java.awt.Color ;


public class SimpleFigure 
{
    // constants
    private static final int CIRCLE_X_OFFSET = 75, CIRCLE_Y_OFFSET = 75 ;
    private static final int RECTANGLE_WIDTH = 250,
                             RECTANGLE_HEIGHT = 200,
                             CIRCLE_DIAMETER = 220;

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

        // Create a red Circle object that is offset from the Rectangle object, scaled like the Rectangle object
        // is scaled, and add to the graphics object

        int circleX = (int) (xLeft + CIRCLE_X_OFFSET * scale);
        int circleY = (int) (yTop + CIRCLE_Y_OFFSET * scale);
        int circleDiameter = (int) (CIRCLE_DIAMETER * scale);

        Ellipse2D.Double circle = new Ellipse2D.Double(circleX, circleY, circleDiameter, circleDiameter) ;
        figure.setColor(Color.RED) ;
        figure.fill(circle) ;
    }

    // Constructor which updates instance variables
    public SimpleFigure(int xLeft, int yTop, double scale) {
        this.xLeft = xLeft ;
        this.yTop = yTop ;
        this.scale = scale;
    }
}