/**
 * TrafficLightComponent.java - Contains one TrafficLight object
 * Author:     Will Bouasisavath
 * Module:     4
 * Project:    Lab, Phase 1 extra credit
 * Description: Instantiate one TrafficLight object on this JComponent.
 *
 */

import java.awt.Graphics ;
import java.awt.Graphics2D ;
import javax.swing.JComponent ;

public class TrafficLightComponent extends JComponent 
{
    // Paints a picture of a Rectangle / Circle figure on the canvas.  All info about
    // the rectangle and circle are hard-coded in Simplefigure.
    public void paintComponent(Graphics g) 
    {
        // Extend using the Graphics2D library so we can add objects to the canvas
        Graphics2D g2 = (Graphics2D) g;

        // Create one TrafficLight object and draw
        TrafficLight figure1 = new TrafficLight(100, 100, 1.0) ;
        figure1.draw(g2) ;

        //Create another TrafficLight object and draw
        int x = (int) (getWidth() * 2.0 / 3.0); // Question in lab: Do you need to include the "this." in the code?
        int y = (int) (getHeight() * 2.0 / 3.0); // Answer: no, you do not. getWidth() and getHeight() do the same thing as this.getWidth() and this.getHeight()
        TrafficLight figure2 = new TrafficLight(500, 350, 1.0 / 3.0) ;
        figure2.draw(g2) ;
        
    }
}
