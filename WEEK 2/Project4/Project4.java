/**
 * Project4.java - Write a program that displays RED Envelope for Chinese New Year
 * Module:     2
 * Project:    Homework 2 Project 4
 * Problem Statement: Using Java's graphics packages, write a program that displays
 * RED Envelope for Chinese New Year
 
 * Algorithm:
 *
 * In main:
 *   1. Create a JFrame
 *   2. Set the JFrame's title "Lucky Money"
 *   3. Set the JFrame' width (500) and height (620)
 *   4. Set the JFrame to close-on-exit
 *   5. Set the Jframe's location relative to null
 *   6. Make the JFrame visible
 *
 * In paint:
 *   7. Create a big RED rectangle
 *   8. Create a smaller YELLOW rectangle on top of RED rectangle
 *   9. Add a smaller RED rectangle on the YELLOW rectangle
 *   10. Create a small YELLOW oval 
 *   11. Finally add smaller RED oval
 */

import java.awt.Color ;
import java.awt.Graphics ;
import javax.swing.JFrame ;

public class Project4 extends JFrame {

    // Set up constants for the title, height, and width of the JFrame
    final static String TITLE = "Lucky Money" ;
    final static int WIDTH = 500,           // width of JFrame (including borders)
                     HEIGHT = 620;         // height of JFrame (borders and controls)

    public void paint(Graphics canvas) 
    
    {
        //Make a big red rectangle
        canvas.setColor(Color.RED);
        canvas.fillRect(125, 75, 250, 400);
        
        //Make the second smaller yellow rectangle
        canvas.setColor(Color.YELLOW);
        canvas.fillRect(150, 100, 200, 350);
        
        //Make the third smaller red rectangle
        canvas.setColor(Color.RED);
        canvas.fillRect(175, 125, 150, 300);
        
        //Make a small yellow circle 
        canvas.setColor(Color.YELLOW);
        canvas.fillOval(200, 150, 100, 250);
        
        //Make final smaller red circle
        canvas.setColor(Color.RED);
        canvas.fillOval(225, 175, 50, 200);
        
        
    }

    public static void main(String[] args) {

        // Create the JFrame and set its size, title, close operation, and location.
        Project4 frame = new Project4() ;
        frame.setSize(WIDTH, HEIGHT) ;
        frame.setTitle(TITLE) ;                     // set the title in upper-left corner
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;       // close when X is clicked
        frame.setLocationRelativeTo(null) ;         // center JFrame on user's screen

        // Make everything visible
        frame.setVisible(true) ;
    }
}