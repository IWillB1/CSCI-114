import java.awt.Graphics2D ;
import java.awt.Graphics ;
import java.awt.geom.Ellipse2D ;
import java.awt.Rectangle ;
import java.awt.Color ;

/**
 * <h2>ConcentricCircles.java - Draw a darker and smaller concentric circle stack with recursion</h2>
 * <p>Instance variables:</p>
 * <ul>
 *   <li>startDiameter - the diameter of the initial (outer) circle</li>
 *   <li>deltaDiameter - the number of pixels (or percent) to decrease each smaller circle will be decreased</li>
 *   <li>xStart - the x-coordinate of the outer-most circle's upper-left corner</li>
 *   <li>yStart - the y-coordinate of the outer-most circle's upper-left corner</li>
 * </ul>
 * @author Will Bouasisavath
 * @version Module 14, Project 1
 */

public class ConcentricCircles {

    // Instance variables
       int startDiameter = 0,                      // diameter of largest circle
           deltaDiameter = 0,                      // difference between successively smaller circles
           startX = 0,                             // x-coordinate of upper-left corner of first circle
           startY = 0 ;                            // y-coordinate of upper-left corner of first circle

    /**
     * Constructor just sets the values of the four instance variables.
     *
     * @param start diameter (in pixels)
     * @param number of pixels to reduce diameter in each call
     * @param starting x-coordinate in JFrame
     * @param starting y-coordinate in JFrame
     */
    public ConcentricCircles(int startDiameter, int deltaDiameter, int startX, int startY) {
        this.startDiameter = startDiameter ;
        this.deltaDiameter = deltaDiameter ;
        this.startX = startX ;
        this.startY = startY ;
    }


    /**
     * Initial call to begin first type of recursion with the initial values (from the constructor)
     * @param the graphics object to draw on
     */
     public void drawFirst(Graphics2D g2) {
        drawFirstCircles(startDiameter, startX, startY, g2) ;
     }

    /**
     * Initial call to begin second type of recursion with the initial values (from the constructor)
     * @param the graphics object to draw on
     */
     public void drawSecond(Graphics2D g2) {
        drawSecondCircles(startDiameter, startX, startY, g2) ;
     }

    /**
     * Recursive method to draw concentric circles.  Base case is when the diameter is less than 20 pixels, decreasing size by 20px and shade by 20 hues each time.
     * @param the diameter (in pixels) of circle to draw
     * @param upper-left x-coordinate of circle
     * @param upper-right y-coordinate of circle
     * @param graphics object on which to draw circle
     */
    private void drawFirstCircles(int diameter, int xCorner, int yCorner, Graphics2D g2) {

        // Fill in circle, then draw a black circle around its border.
        Ellipse2D.Double circle = new Ellipse2D.Double(xCorner, yCorner, diameter, diameter);
        Color circleColor = new Color(diameter, diameter, diameter);
        g2.setColor(circleColor) ;
        g2.fill(circle) ;
        g2.draw(circle) ;

        if (diameter >= 20) {
            drawFirstCircles(diameter - deltaDiameter, xCorner + deltaDiameter / 2,
                                 yCorner + deltaDiameter / 2, g2) ;
        }
    }

    /**
     * Recursive method to draw concentric circles.  Base case is when the diameter is less than 20 pixels, decreasing size by 10% and shade by 10% each time
     * @param the diameter (in pixels) of circle to draw
     * @param upper-left x-coordinate of circle
     * @param upper-right y-coordinate of circle
     * @param graphics object on which to draw circle
     */
    private void drawSecondCircles(int diameter, int xCorner, int yCorner, Graphics2D g2) {


        Ellipse2D.Double circle = new Ellipse2D.Double(xCorner, yCorner, diameter, diameter);
        System.out.println(diameter);
        Color circleColor = new Color(diameter, diameter, diameter);
        g2.setColor(circleColor) ;
        g2.fill(circle) ;
        g2.draw(circle) ;


        int percent = 100 - deltaDiameter;

        if (diameter >= 20) {
            drawSecondCircles((diameter * percent)/100, xCorner + (diameter - ((diameter * percent)/100)) / 2,
                    yCorner + (diameter - ((diameter * percent)/100)) / 2, g2) ;
        }
    }
}