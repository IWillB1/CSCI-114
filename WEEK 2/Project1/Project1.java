/**
 * Project1.java - Write a graphics program to display a square containing a circle.
 * Author:     Will Bouasisavath
 * Module:     2
 * Project:    Homework 2 Project 1
 * Problem Statement: Using Java's graphics packages, write a graphics program to display a square containing a circle.
 * Make the diameter of the circle and the length of the square’s side equal, so that the circle just touches each side of the square.
 * Use one color to fill the circle, and another color for the part of the square not covered by the circle. 
 * Draw a two-line border around the image, each line 1 pixel wide.
 * Choose any color scheme you wish.
 * Algorithm:
 *
 * In main:
 *   1. Create a JFrame
 *   2. Set the JFrame's title "Circle in Square"
 *   3. Set the JFrame' width (500) and height (620)
 *   4. Set the JFrame to close-on-exit
 *   5. Set the Jframe's location relative to null
 *   6. Make the JFrame visible
 *
 * In paint:
 *   7. Make a big grey square
 *   8. Outline the big grey square
 *   9. Make a smaller outline in the big square
 *   10. Make a blue square inside that smaller outline. 
 *   11. Make a red circle inside that green square, making sure that it is touching the edges of the square.
 */

import java.awt.Color ;
import java.awt.Graphics ;
import javax.swing.JFrame ;

public class Project1 extends JFrame {

    // Set up constants for the title, height, and width of the JFrame
    final static String TITLE = "Circle in Square" ;
    final static int WIDTH = 500,           // width of JFrame (including borders)
                     HEIGHT = 620;         // height of JFrame (borders and controls)

    public void paint(Graphics canvas) 
    
    {
        //add big grey square
        canvas.setColor(Color.LIGHT_GRAY);
        canvas.fillRect(20, 50, 400, 400);
        
        //make black outlines for the bigger and smaller squares. 
        canvas.setColor(Color.BLACK);
        canvas.drawRect(20, 50, 400, 400);
        canvas.drawRect(30, 60, 380, 380);
        
        //make the blue square
        canvas.setColor(Color.BLUE);
        canvas.fillRect(45, 75, 350, 350);
               
        //make the red circle
        canvas.setColor(Color.RED);
        canvas.fillOval(45, 75, 350, 350);

    }

    public static void main(String[] args) {

        // Create the JFrame and set its size, title, close operation, and location.
        Project1 frame = new Project1() ;
        frame.setSize(WIDTH, HEIGHT) ;
        frame.setTitle(TITLE) ;                     // set the title in upper-left corner
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;       // close when X is clicked
        frame.setLocationRelativeTo(null) ;         // center JFrame on user's screen

        // Make everything visible
        frame.setVisible(true) ;
    }
}
