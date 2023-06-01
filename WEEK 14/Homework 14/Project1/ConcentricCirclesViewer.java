import javax.swing.JFrame;
import java.awt.*;

/**
 * <h2>ConcentricCirclesViewer.java - Create concentric circles using recursive methods.</h2>
 * <p>Problem Statement: Create a graphics application which draws two sets of concentric circles.</p>
 * <p>Algorithm:</p>
 * <ol>
 *   <li>Create a <code>ConcentricCirclesViewer</code> class which will create start the process.
 *     <ul>
 *       <li>The class will extend a JFrame (meaning that it will be a <code>JFrame</code> with
 *           added properties and/or methods).</li>
 *     </ul>
 *   </li>
 *   <li>This class contains the main method, which creates a new <code>JFrame</code> (an object of this class),
 *       sets the size, close-button behavior, and location relative to the upper-left corner of the
 *       screen, and makes this object (JFrame) visible</li>
 *   <li>Create a <code>ConcentricCircles</code> class, which will hold two graphics figure - two concentric circles with different algorithms
 *       drawn recursively on the left, and another on the right.  This class will have one method
 *       named <code>paint</code> which is invoked every time the <code>JComponent</code> changes.</li>
 *   <li>Create a <code>ConcentricCircles</code> class which will actually draw concentric circles  in one of two ways</li>
 *   <li>The constructor takes four parameters, all ints
 *     <ul>
 *       <li>the diameter of the largest circle comprising the bullseye (in pixels)</li>
 *       <li>the difference between successively smaller circles (in pixels or percent)</li>
 *       <li>the x-coordinate of the upper-left corner of the initial circle</li>
 *       <li>the y-coordinate of the upper-left corner of the initial circle</li>
 *     </ul>
 *   </li>
 *
 * </ul>
 * @author Will Bouasisavath
 * @version Homework 14, Project 1
 */
public class ConcentricCirclesViewer {

    public static final String TITLE = "Concentric Circles" ;
    public static final int CANVAS_WIDTH = 650,
    CANVAS_HEIGHT = 400;
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle(TITLE);
        frame.getContentPane().setBackground(Color.white);
        frame.setSize(CANVAS_WIDTH, CANVAS_HEIGHT) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null) ;
        frame.add(new ConcentricCirclesComponent());
        frame.setVisible(true);

    }
}