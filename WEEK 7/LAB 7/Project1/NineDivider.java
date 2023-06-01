import java.util.Scanner;

/**
 * <h2>NineDivider.java - determines if a number is divisible by 9</h2>
 *
 * <h3>Problem Statement:</h3>
 * <p>To determine if a number is evenly divisible by 9, simply add all of the digits in that number.  If the sum is divisible by 9, then the original number also is divisible by 9.</p>
 *
 * <h3>Algorithm:</h3>
 * 
 * <ol>
 *     <li> Prompt the user for a whole number and read the user's input into a <b>long</b> variable
 *     <li>Convert the number to a <b>String</b>
 *     <li>Calculate the sum of the digits in the number using the loop <code>for (int i = 0; i less than input.length; i++)</code>
 *          <ul>
 *              <li>Convert the current digit from a <b>char</b> to an <b>int</b>
 *              <li>Increase <code>sum</code> by the value of the digit
 *          </ul>
 *     <li>If <code>sum</code> equals 0, exit the program
 *     <li>Else, determine if <code>sum</code> is evenly divisible by 9 (<code>sum % 9 == 0)</code>
 *     <li>Using that result, print a message to the user indicating whether the original number is divisible by 9
 *     <li>Go back to step 1
 * </ol>
 *
 * @author Will Bouasisavath
 * @version Module 7, Lab Project 1
 */

public class NineDivider 
{

    private static final int ZERO = '0';

    public static void main(String[] args) 
    {

        Scanner in = new Scanner(System.in);

        while (true) 
        {
            System.out.print("\n\nPlease enter any whole number (or 0 to quit):");
            long input = in.nextLong();

            String inputString = input + "";

            int sum = 0;

            for (int i = 0; i < inputString.length(); i++) 
            {
                
                int currentDigit = inputString.charAt(i);
                currentDigit -= ZERO;
                sum += currentDigit;

            }

            if (sum == 0) 
            {

                return;

            } 
            else 
            {

                System.out.print(input + " is " + (sum % 9 == 0 ? "" : "not ") + "divisible by 9");

            }
        }
    }
}