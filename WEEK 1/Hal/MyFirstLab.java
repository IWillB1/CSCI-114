/**
 * MyFirstLab.java - A brief dialog with Hal from 2001
 * Author:     Will Bouasisavath
 * Module:     1
 * Project:    Lab Project 1
 * Problem Description: Carry a very brief conversation with Hal
 *    similar to that shown in the movie clip (2001 A Space Odyssey).
 *
 *   Prompt the user for their name, then ask what they would like
 *   the program to do.  Once entered, reply
 *          "I'm sorry Will Bouasisavath.  I'm afraid I can't do that."
 *
 * Algorithm:
 *    1. Use a JOptionPane to mimic Hal asking for my name. Capture
 *       the response in a String and and print on the console:
 *                           "Hello " + Will Bouasisavath
 *    2. Have Hal respond using another JOptionPane:
 *                  "My name is Hal! What would you like me to do?"
 *    3. Ignore the user's response and print on the console:
 *              "I'm sorry Will BOuasisavath, I'm afraid I can't do that."
 */

import javax.swing.JOptionPane ;

public class MyFirstLab 
{
    public static void main(String[] args)
    {
        // Hal Prompts me for my name

        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println("Hello " + name) ;

        // Hal wants to know what I want him to do (ignore response).

        JOptionPane.showInputDialog(
            "My name is Hal! What would you like me to do?");

        // Hal responds that he can't do that.

        System.out.println(
            "I'm sorry, " + name + ", I'm afraid I can't do that.") ;
    }
}