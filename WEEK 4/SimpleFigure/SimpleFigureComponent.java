/**
 * SimpleFigureComponent.java - Contains one SimpleFigure object
 * Author:     Will Bouasisavath
 * Module:     4
 * Project:    Lab, Phase 1
 * Description: Instantiate one SimpleFigure object on this JComponent.
 *
 */

import java.awt.Graphics ;
import java.awt.Graphics2D ;
import javax.swing.JComponent ;

public class SimpleFigureComponent extends JComponent 
{
    // Paints a picture of a Rectangle / Circle figure on the canvas.  All info about
    // the rectangle and circle are hard-coded in Simplefigure.
    public void paintComponent(Graphics g) 
    {
        // Extend using the Graphics2D library so we can add objects to the canvas
        Graphics2D g2 = (Graphics2D) g;

        // Create one SimpleFigure object and draw
        SimpleFigure figure1 = new SimpleFigure(100, 100, 1.0) ;
        figure1.draw(g2) ;

        //Create another SimpleFigure object and draw
        int x = (int) (this.getWidth() * 2.0 / 3.0); // Question in lab: Do you need to include the "this." in the code?
        int y = (int) (this.getHeight() * 2.0 / 3.0); // Answer: no, you do not. getWidth() and getHeight() do the same thing as this.getWidth() and this.getHeight()
        SimpleFigure figure2 = new SimpleFigure(510, 375, 1.0 / 3.0) ;
        figure2.draw(g2) ;
    }
}

