import java.util.Scanner;

/**
 * <h2>PrintTriangles.java - Print triangles with asterisks</h2>
 *
 * <h3>Problem Statement:</h3>
 * <p>Write a program that asks the user to enter the size of a triangle to print (an integer from 1 to 20), then print the triangle by printing a series of lines consisting of asterisks.</p>
 *
 * <h3>Algorithm:</h3>
 * 
 * <ol>
 *     <li>Create scanner and prompt the user for a whole number from 1 to 20
 *     <li>Create an <b>int</b> named <code>triangleSize</code> equal to the input from the scanner
 *     <li>While <code>triangleSize</code> is not equal to <code>SENTINEL</code> (0)
 *          <ul>
 *              <li>If <code>triangleSize</code> is less than 1 or greater than 20, print an error message to the user
 *              <li> Else, call method <code>drawTriangle</code> with <code>triangleSize</code> as the parameter
 *              <li>Prompt user and get set next input to <code>triangleSize</code>
 *          </ul>
 * </ol>
 *
 * <p>In drawTriangle:</p>
 * <ol>
 *     <li>In a for loop with index of <code>i</code>, increasing from 1 to <code>largestRow</code> in increments of 1,
 *          <ul>
 *              <li>In a for loop with index of <code>j</code>, increasing from 1 to <code>i</code> in increments of 1,
 *                  <ul>
 *                      <li>Draw <code>j</code> asterisks on one line
 *                  </ul>
 *                 <li>Start a new line on the console
 *          </ul>
 *     <li>In a for loop with index of <code>i</code>, decreasing from <code>largestRow - 1</code> to 1 in increments of 1,
 *          <ul>
 *              <li>In a for loop with index of <code>j</code>, decreasing from <code>i</code> to 1 in increments of 1,
 *                  <ul>
 *                      <li>Draw <code>j</code> asterisks on one line
 *                  </ul>
 *              <li>Start a new line on the console
 *          </ul>
 * </ol>
 *
 * @author Will Bouasisavath
 * @version Module 7, Lab Project 3
 */

public class PrintTriangles 
{

    private static final int SENTINEL = 0;

    public static void main(String[] args) 
    {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a whole number from 1 to 20 (or 0 to quit):");
        int triangleSize = in.nextInt();

        while (triangleSize != SENTINEL) 
        {

            if (triangleSize < 1 || triangleSize > 20) {
                System.out.println("Your number is out of the range. Please try again");
            }

            else {
                drawTriangle(triangleSize);
            }

            System.out.print("\nPlease enter another whole number from 1 to 20 (or 0 to quit):");
            triangleSize = in.nextInt();

        }

    }


    /**
     * Draws a triangle out of stars, with the specified size
     * @param largestRow The number of stars in the largest row of the triangle
     */
    public static void drawTriangle(int largestRow)
    {
        
        // Stars from 1 to largestRow
        for (int i = 1; i <= largestRow; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // Stars from largestRow - 1 to 1
        for (int i = largestRow - 1; i > 0; i--)
        {
            for (int j = i; j > 0; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}