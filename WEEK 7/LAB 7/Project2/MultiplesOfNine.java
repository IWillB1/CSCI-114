import java.util.Scanner;

/**
 * <h2>NineDivider.java - determines the multiple of 9</h2>
 *
 * <h3>Problem Statement:</h3>
 * <p>Write a program which prompts for and reads an int between 0 and 9 from the user, then calculates and displays that number multiplied by 9.</p>
 *
 * <h3>Algorithm:</h3>
 * 
 * <ol>
 *     <li>Prompt the user for a whole number between 0 and 9 inclusive and read the user's input into an <b>int</b> variable named <code>input</code>
 *     <li>Continue unless sentinel -1 is entered. End program if sentinel is entered
 *     <li>If <code>input</code> is greater than or equal to 1 AND is less than or equal to 9
 *          <ul>
 *              <li> create an <b>int</b> named <code>number1</code> and set it equal to ten times the result of <code>input</code> minus 1
 *              <li> create another <b>int</b> named <code>number2</code> and set it equal to 9  minus <code>number1</code>
 *              <li> create another <b>int</b> named <code>multiple</code> equal to <code>number1</code> plus <code>number2</code>
 *              <li>Tell the user that 9 * <code>input</code> = multiple
 *          </ul>
 *     <li>Else if <code> input</code> is equal to 0
 *          <ul>
 *              <li>Tell the user that 9 * 0 = 0.
 *          </ul>
 *     <li>Else
 *     <ul>
 *         <li>Tell the user that their input is out of range, and to please try again
 *     </ul>
 *
 * </ol>
 *
 * @author Will Bouasisavath
 * @version Module 7, Lab Project 2
 */

public class MultiplesOfNine 
{

    private static final int SENTINEL = -1;

    public static void main(String[] args) 
    {

        Scanner in = new Scanner(System.in);

        System.out.print("\nPlease enter a number from 0 to 9 (or -1 to quit):");

        int input = in.nextInt();

        while (input != SENTINEL) 
        {

            if (input >= 1 && input <= 9) 
            {

                int number1 = input - 1;
                int number2 = 9 - number1;
                int multiple = (10 * number1) + number2;

                System.out.println("9 * " + input + " = " + multiple);

            }

            else if (input == 0) {

                System.out.println("9 * 0 = 0");

            }

            else {

                System.out.println("Your number is out of range. Please try again");
            }

            System.out.print("\nPlease enter a number from 0 to 9 (or -1 to quit):");
            input = in.nextInt();
        }
    }
}