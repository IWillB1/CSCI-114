/**
 * Project2.java - Write a program that displays a bulls-eye pattern with a circle in the middle and five (5) concentric circles around it.
 * Author:     Will Bouasisavath
 * Module:     2
 * Project:    Homework 2 Project 2
 * Problem Statement: Using Java's graphics packages, write a program that displays a bulls-eye pattern 
 * with a circle in the middle and five (5) concentric circles around it.
 * Fill the circles with alternating colors of your choice.  
 * For example, your output might look like the following, but using Palomar's colors (black and red) or your favorite two colors instead.
 * Algorithm:
 *
 * In main:
 *   1. Create a JFrame
 *   2. Set the JFrame's title "Bullseye"
 *   3. Set the JFrame' width (500) and height (620)
 *   4. Set the JFrame to close-on-exit
 *   5. Set the Jframe's location relative to null
 *   6. Make the JFrame visible
 *
 * In paint:
 *   7. Make the first black circle (100, 100, 300, 300)
 *   8. Make the second smaller green circle (125, 125, 250, 250)
 *   9. Make the third smaller black circle (150, 150, 200, 200)
 *   10. Make the fourth smaller green circle (175, 175, 150, 150)
 *   11. Make the fifth smaller black circle (200, 200, 100, 100)
 *   12. Make the final smallest green circle (225, 225, 50, 50)
 */

import java.awt.Color ;
import java.awt.Graphics ;
import javax.swing.JFrame ;

public class Project2 extends JFrame {

    // Set up constants for the title, height, and width of the JFrame
    final static String TITLE = "Bullseye" ;
    final static int WIDTH = 500,           // width of JFrame (including borders)
                     HEIGHT = 620;         // height of JFrame (borders and controls)

    public void paint(Graphics canvas) {
        
        //make the first black circle        
        canvas.setColor(Color.BLACK);
        canvas.fillOval(100, 100, 300, 300);
        
        //make the second smaller green circle
        canvas.setColor(Color.GREEN);
        canvas.fillOval(125, 125, 250, 250);
        
        //make the third smaller black circle
        canvas.setColor(Color.BLACK);
        canvas.fillOval(150, 150, 200, 200);
        
        //make the fourth smaller green circle
        canvas.setColor(Color.GREEN);
        canvas.fillOval(175, 175, 150, 150);
        
        //make the fifth smaller black circle 
        canvas.setColor(Color.BLACK);
        canvas.fillOval(200, 200, 100, 100);
        
        //make the final smallest green circle
        canvas.setColor(Color.GREEN);
        canvas.fillOval(225, 225, 50, 50);
        
    }

    public static void main(String[] args) {

        // Create the JFrame and set its size, title, close operation, and location.
        Project2 frame = new Project2() ;
        frame.setSize(WIDTH, HEIGHT) ;
        frame.setTitle(TITLE) ;                     // set the title in upper-left corner
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;       // close when X is clicked
        frame.setLocationRelativeTo(null) ;         // center JFrame on user's screen

        // Make everything visible
        frame.setVisible(true) ;
    }
}