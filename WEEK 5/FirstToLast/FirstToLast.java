/**
 * FirstToLast.java
 * Author: Will Bouasisavath
 * Module: 5
 * Project: Homework Project1
 * Problem statement: A program to read in a line of text as input from the user, then output the line with the first word moved to the end of the line.
 *
 * Algorithm:
 *      1. Create a scanner and set the input to a string
 *      2. Find length and spaces in string
 *      3. Based on those values, create two substrings which are the first and last words
 *      4. Create new substrings based off of the substrings, which make the first word lowercase and the last word's first letter capitalized
 *      5. Replace the values of the original substrings with the new values of the opposite substrings
 *      6. Display the rearranged sentence
 *      7. Bundle the previous steps in a for loop that repeats twice
 *
 */

import java.util.Scanner;

public class FirstToLast
{

    public static void main(String[] args) 
    {

        for (int i = 0; i < 2; i++) 
        {
            //Create a scanner
            Scanner in = new Scanner(System.in) ;

            //Ask user for input, saving it to String one
            System.out.print("Please enter a line of text without punctuation: ");
            String one = in.nextLine() ;

            //Find length of string, first and last spaces too.
            int length = one.length() ;
            int firstSpace = one.indexOf(" ") ;
            int lastSpace = one.lastIndexOf(" ") ;

            //Set first and second words to their respective substrings
            String firstWord = one.substring(0, firstSpace) ;
            String secondWord = one.substring((lastSpace + 1), length) ;

            //Reformat the words based on new position
            String newFirstWord = firstWord.substring(0, 1).toLowerCase() + firstWord.substring(1) ;
            String newSecondWord = secondWord.substring(0, 1).toUpperCase() + secondWord.substring(1) ;

            //Replace one word with the other.
            one = one.replace(firstWord, newSecondWord) ;
            one = one.replace(secondWord, newFirstWord) ;

            //Display results
            System.out.printf("I have rephrased that line to read: %s\n", one);
        }

    }

}