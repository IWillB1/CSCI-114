/**
 * Frosty.java - Draw a picture of a snowman using Swing and Graphics packages
 * Author:     Will Bouasisavath
 * Module:     2
 * Project:    Lab
 * Problem Statement: Using Java's graphics packages, draw a picture of a snowman,
 *    including circles for the body, eyes, and buttons.
 *
 * Algorithm:
 *
 * In main:
 *   1. Create a JFrame
 *   2. Set the JFrame's title "Frosty the Snowman"
 *   3. Set the JFrame' width (500) and height (620)
 *   4. Set the JFrame to close-on-exit
 *   5. Set the Jframe's location relative to null
 *   6. Make the JFrame visible
 *
 * In paint:
 *   7. Set the background to dark blue
 *   8. Refer to Lab for details:
 *     - Draw three circles for head, upper-body, and lower-body (legs)
 *     - Draw two dark magenta circles for eyes
 *     - Draw Frosty's mouth using drawArc
 *     - Draw three buttons on Frosty's upper body
 *     - Draw a black hat
 */

import java.awt.Color ;
import java.awt.Graphics ;
import javax.swing.JFrame ;

public class Frosty extends JFrame 
{

    // Set up constants for the title, height, and width of the JFrame
    final static String TITLE = "(Frosty the Snowman)" ;
    final static int WIDTH = 500,           // width of JFrame (including borders)
                     HEIGHT = 620;         // height of JFrame (borders and controls)

    public void paint(Graphics canvas) 
    
    {
        //adding background to Jframe which will make it dark blue
        canvas.setColor(Color.BLUE.darker());
        canvas.fillRect(0, 0, 10000, 10000);
                
        //draw snowman's arms
        canvas.setColor(Color.GRAY);
        canvas.fillRect(100, 300, 300, 10);
    
        //draw 3 white circles with black outlines for snowman's head and body
        canvas.setColor(Color.WHITE);
        canvas.fillOval(200, 150, 100, 100);
        canvas.setColor(Color.BLACK);
        canvas.drawOval(200, 150, 100, 100);

        //middle of the body
        canvas.setColor(Color.WHITE);
        canvas.fillOval(175, 244, 150, 150);
        canvas.setColor(Color.BLACK);
        canvas.drawOval(175, 244, 150, 150);

        //bottom of the body
        canvas.setColor(Color.WHITE);
        canvas.fillOval(150, 380, 200, 200);
        canvas.setColor(Color.BLACK);
        canvas.drawOval(150, 380, 200, 200);
        
        //draw snowman's magenta colored eyes
        canvas.setColor(Color.MAGENTA.darker());
        canvas.fillOval(225, 175, 15, 15);
        canvas.fillOval(260, 175, 15, 15);
        
        //draw snowman's mouth(smiling)
        canvas.setColor(Color.BLACK);
        canvas.drawArc(225, 205, 50, 25, 180, 180);
        
        //draw 3 buttons on the snowman's body
        canvas.setColor(Color.BLACK);
        canvas.fillOval(245, 285, 15, 15);
        canvas.fillOval(245, 310, 15, 15);
        canvas.fillOval(245, 335, 15, 15);
        
        //draw snowman's hat
        canvas.setColor(Color.BLACK);
        canvas.fillRect(190, 150, 120, 10);
        canvas.fillRect(220, 120, 60, 40);
        
        //draw orange band on the hat
        canvas.setColor(Color.ORANGE);
        canvas.fillRect(220, 140, 60, 10);
        
        //draw the yellow sun
        canvas.setColor(Color.YELLOW);
        canvas.fillOval(0, 0, 150, 150);

    }

    public static void main(String[] args) {

        // Create the JFrame and set its size, title, close operation, and location.
        Frosty frame = new Frosty() ;
        frame.setSize(WIDTH, HEIGHT) ;
        frame.setTitle(TITLE) ;                     // set the title in upper-left corner
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;       // close when X is clicked
        frame.setLocationRelativeTo(null) ;         // center JFrame on user's screen

        // Make the snowman visible
        frame.setVisible(true) ;
    }
}