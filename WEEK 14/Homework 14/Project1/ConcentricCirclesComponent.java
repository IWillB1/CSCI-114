import java.awt.*;

/**
 * <h2>ConcentricCirclesComponent.java - Draws two ConcentricCircles objects</h2>
 * <p>Description: Instantiate and place one concentric circle group on the left of a JFrame using the first recursive method, and another on the right using the
 * second recursive method.</p>
 *
 * <ul>
 *     <li>Create the first <code>ConcentricCircles</code> object, with a diameter of 255, delta of 10, starting at (300, 35)
 *     <li>Invoke the <code>drawSecond</code> method, which will recursively draw concentric circles 10% smaller and of darker shade than that before it until the diameter is less than 20.
 *     <li>Create the second <code>ConcentricCircles</code> object, with a diameter of 255, delta of 20, starting at (50, 35)
 *     <li>Invoke the <code>drawFirst</code> method, which will recursively draw concentric circles 20px smaller and of darker shade than that before it until the diameter is less than 20.
 * </ul>
 * @author Will Bouasisavath
 * @version Module 14, Project 1
 */
public class ConcentricCirclesComponent extends Component {

    /**
     * Overrides <code>paint</code> in <code>JComponent</code> class.
     * @param g - <code>Graphics</code> object on which all the drawing is done
     */
    public void paint(Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g;

        ConcentricCircles eye1 = new ConcentricCircles(255, 10, 300, 35);
        eye1.drawSecond(g2);

        ConcentricCircles eye2 = new ConcentricCircles(255,  20, 50, 35);
        eye2.drawFirst(g2);
    }
}