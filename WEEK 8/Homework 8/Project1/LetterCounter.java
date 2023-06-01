import java.util.Scanner;

/**
 * <h2>LetterCounter.java - Calculates the number of each letter in a long series of inputs from the user</h2>
 *
 * <h3>Problem Statement:</h3>
 * <p>Write a program that will read in multiple lines of text from the user and display a list of all the letters that occur in the text, along with the number of times each letter occurs.</p>
 *
 * <h3>Algorithm:</h3>
 * 
 * <ol>
 *     <li>Create a <b>scanner</b> named <code>in</code>
 *     <li>Create 2 <b>list</b>s named <code>letter</code> and <code>number</code> initialized with the alphabet characters and 0s respectively
 *     <li>Create an empty <b>string</b> named <code>input</code>, along with an <b>int</b> named <code>i</code> set to 1
 *     <li>Ask user for several lines of text to analyze, adding valid inputs to <code>input</code>, and stops asking after a period is entered
 *     <li>Use <code>replaceAll</code> with <code>input</code> to remove all spaces, dashes, and commas
 *     <li>Create a <b>for</b> loop that repeats for as many characters there are in <code>input</code>
 *     <ul>
 *         <li>Call the <code>process</code> method with <code>input.charAt(j)</code> (<code>j</code> is the increasing variable), <code>letter</code> array and <code>number</code> array as the parameters
 *     </ul>
 *     <li>Call the <code>display</code> method with <code>letter</code> and <code>number</code> as the parameters, this will display the results to the user
 * </ol>
 *
 * @author Will Bouasisavath
 * @version Module 8, Homework Project 1
 */

public class LetterCounter 
{
    public static void main(String[] args) 
    {

        // Create a scanner
        Scanner in = new Scanner(System.in) ;

        // create 2 lists named letter and number
        char[] letter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'} ;
        int[] number = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;

        // Create an empty string named input
        // along with an int named i set to 1
        String input = "" ;
        int i = 1 ;

        // Ask user for several lines of text to analyze, 
        // adding valid inputs to input, 
        // and stops asking after a period is entered
        System.out.println("Please enter several lines of text to analyze. When done, end a line with a period.\n") ;
        System.out.print(i + ":  ") ;
        input = in.nextLine() ;

        while (!input.endsWith(".")) 
        {
            i++ ;
            System.out.print(i + ":  ") ;
            input += in.nextLine() ;
        }


        // Use replaceAll with input to remove all spaces, dashes, and commas
        input = input.replaceAll("\\s+", "") ;
        input = input.replaceAll(",", "") ;
        input = input.replaceAll("-", "") ;

        // Create a for loop that repeats for as many characters there are in input
        for(int j = 0; j < (input.length()-1); j++) 
        {
            // Call the process method with input.charAt(j) j is the increasing variable
            // letter array and number array as the parameters
            process(input.charAt(j), letter, number) ;
        }

        // Call the display method with letter and number as the parameters, 
        // this will display the results to the user
        display(letter, number) ;

    }
    
    private static void process(char character, char[] letter, int[] number) 
    {
        // private variables
        int pos = 0 ;
        boolean found = false ;

        while (pos < letter.length && !found) 
        {
            if (letter[pos] == character) 
            {
                number[pos] = number[pos] + 1 ;
                found = true ;
            }
            else 
            {
                pos++ ;
            }
        }
    }

    private static void display(char[] letter, int[] number) 
    {
        // displays the count of the characters
        System.out.println("\nHere's the count of the characters:\n") ;
        
        for (int i = 0; i < letter.length; i++) 
        {
            if (number[i] != 0) 
            {
                System.out.println(letter[i] + ":  " + number[i]) ;
            }
        }
    }
}