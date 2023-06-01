/** 
 * StringNumberString.java - Converts a string to a number, to a string.
 * Author: Will Bouasisavath
 * Module: 5
 * Project: Lab 5
 * Problem statement: In this lab, you will create a program which:
     * reads a String from the user which contains two characters, both digits (0 - 9)
     * converts each digit in the String to a separate number, stored as an int
     * prints the two numbers, their sum, and their product on the console
     * adds one to the first number, then consolidates the two numbers back into a single number and prints on the console
 *
 * Algorithm:
     * 1. Determine and print the ASCII / Unicode value of the character ‘0’ (zero) and store in a constant int
            a. Set the constant to the value '0' by typecasting.  (Is the typecasting required?)
            b. Print the ASCII / Unicode value of the constant on the console;
     * 2. Create a Scanner object which reads from the system console, prompts the user for a 2-digit number, then reads the response into a String variable using the nextLine() method for the Scanner object.
            a. Assume that the input contains two digits
            b. For numbers less than 10, the user should place a 0 in front of the number.  For example, for the number 5, the user should enter 05
     * 3. Calculate the equivalent numeric value of the first digit in the String and store in an int.
            a. Use the charAt() method (which index are you going to use?)
                Subtract the integer variable calculated in step #1
     * 4. Calculate the numeric value of the second digit and store in an int
            a. Use the charAt() method (which index are you going to use?)
            b. Subtract the integer variable calculated in step #1
     * 5. Print a message on the console telling the user what the first and second digits of the number are using the int’s calculated in steps 3 and 4 above.
     * 6. Print a message on the console showing the user the sum of the first and second digits.
     * 7. Print a message on the console showing the user the product of the first and second digits.
     * 8. Increment the int holding the value of the first digit by 1 (use the  ++  operator).
     * 9. Create a new int variable, then assign it a value by multiplying the first digit (from step #9 above) by 10, then adding the second digit.
     * 10. Print a message telling the user the value of the new number from step #10, and notice that it’s the first number they entered plus 10.
 */

import java.util.Scanner;

public class StringNumberString 
{

    //Adding the constant ASCII_0
    private final static int ASCII_0 = (int)'0';

    public static void main(String[] args) 
    {

        //Printing out constant
        System.out.println("The value of character '0' converted to an int is " + ASCII_0) ;

        //Creating a scanner
        Scanner in = new Scanner(System.in) ;

        //Asking user for input
        System.out.print("Please enter a two-digit number:") ;

        //Creating String input and setting it to the input
        String input = in.nextLine() ;

        //Creating variables and setting them to the first and second numbers of the input respectively
        int firstDigit = input.charAt(0) ;
        int secondDigit = input.charAt(1) ;

        //Subtracting the constant ASCII_0 value from the variables
        firstDigit -= ASCII_0 ;
        secondDigit -= ASCII_0 ;

        //Printing the variables
        System.out.println("The first digit is " + firstDigit + " and the second digit is " + secondDigit) ;

        //Printing the sum of the variables
        System.out.println("The sum of those two digits is: " + (firstDigit + secondDigit)) ;

        //Printing the product of the variables
        System.out.println("The product of those two digits is: " + firstDigit * secondDigit) ;

        //Increasing firstDigit by one
        firstDigit++ ;

        //Creating a new integer and setting it equal to 10 times firstDigit, added to secondDigit
        int newInt = (firstDigit * 10) + secondDigit ;

        //Print out the newInt
        System.out.println("When 10 is added to your number, the new number is " + newInt) ;

    }
}