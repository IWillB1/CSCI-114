/**
 * Project3.java - Write a program that displays a Avocado and cut Avocado
 * Author:     Will Bouasisavath
 * Module:     2
 * Project:    Homework 2 Project 3
 * Problem Statement: Using Java's graphics packages, write a program that displays
 * a Avocado and a cut open Avocado
 
 * Algorithm:
 *
 * In main:
 *   1. Create a JFrame
 *   2. Set the JFrame's title "Avocado and cut Avocado"
 *   3. Set the JFrame' width (500) and height (620)
 *   4. Set the JFrame to close-on-exit
 *   5. Set the Jframe's location relative to null
 *   6. Make the JFrame visible
 *
 * In paint:
 *   7. Create an uncut Avocado with a Dark Gray Oval
 *   8. Create a cut open Avocado with the same outline below the first one
 *   9. Add a GREEN Oval over the cut open Avocado
 *   10. Finally, add an ORANGE circle for the cut open Avocado the GREEN one
 */

import java.awt.Color ;
import java.awt.Graphics ;
import javax.swing.JFrame ;

public class Project3 extends JFrame {

    // Set up constants for the title, height, and width of the JFrame
    final static String TITLE = "Avocados and cut Avocado" ;
    final static int WIDTH = 500,           // width of JFrame (including borders)
                     HEIGHT = 620;         // height of JFrame (borders and controls)

    public void paint(Graphics canvas) 
    
    {
        //Make the Avocado oval
        canvas.setColor(Color.DARK_GRAY);
        canvas.fillOval(175, 50, 140, 200);
        
        //Make the cut avocado with the outline
        canvas.setColor(Color.DARK_GRAY);
        canvas.fillOval(175, 375, 140, 200);
        
        //Add a green oval over the outline
        canvas.setColor(Color.GREEN);
        canvas.fillOval(175, 375, 125, 200);
     
        //Add an orange pit with another green oval over the original oval
        canvas.setColor(Color.ORANGE);
        canvas.fillOval(175, 430, 75, 75);
        
    }

    public static void main(String[] args) {

        // Create the JFrame and set its size, title, close operation, and location.
        Project3 frame = new Project3() ;
        frame.setSize(WIDTH, HEIGHT) ;
        frame.setTitle(TITLE) ;                     // set the title in upper-left corner
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;       // close when X is clicked
        frame.setLocationRelativeTo(null) ;         // center JFrame on user's screen

        // Make everything visible
        frame.setVisible(true) ;
    }
}