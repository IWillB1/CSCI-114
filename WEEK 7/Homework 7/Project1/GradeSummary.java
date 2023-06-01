import java.util.Scanner;

/**
 * <h2>GradeSummary.java - reads exam scores and </h2>
 *
 * <h3>Problem Statement:</h3>
 * <p> Write a program to read from the user a list of exam scores (integer percentages in the range 0 to 100) and to output: </p>
 * <ul>
 *     <li>the total number of grades entered
 *     <li>the number of grades in each letter-grade category (90 - 100 = A, 80 - 89 = B, 70 - 79 = C, 60 - 69 = D, and 0 - 59 = F)
 *     <li>the percentage of the total grades each letter grade represents
 * </ul>
 *
 * <h3>Algorithm:</h3>
 * 
 * <ol>
 *     <li>Create a constant named SENTINEL equal to -1
 *     <li>Create Scanner named <code>in</code>
 *     <li>Create 6 doubles (a, b, c, d, f, and counter) all set to 0
 *     <li>Prompt user for a grade from 0 to 100, or -1 to quit
 *     <li>Store the answer in a <b>int</b> called <code>grade</code>
 *     <li>While <code>grade</code> is not SENTINEL
 *     <ul>
 *         <li>Increase <code>counter</code> by one
 *         <li>If <code>grade</code> is less than or equal to 60, increase <code>f</code> by one
 *         <li>If <code>grade</code> is greater than or equal to 60 and less than 70, increase <code>d</code> by one
 *         <li>If <code>grade</code> is greater than or equal to 70 and less than 80, increase <code>c</code> by one
 *         <li>If <code>grade</code> is greater than or equal to 80 and less than 90, increase <code>b</code> by one
 *         <li>If <code>grade</code> is greater than or equal to 90 and less than or equal to 100, increase <code>a</code> by one
 *         <li>Prompt user for a grade from 0 to 100, or -1 to quit
 *         <li>Store the answer in <code>grade</code>
 *     </ul>
 *     <li>If the counter is greater than one, display how many grades there were, in addition to how many a-f grades their were with their overall percentage respectively
 *     <li>Else, display a statement that tells the user that they did not enter any grades
 * </ol>
 *
 * @author Will Bouasisavath
 * @version Module 7 Homework Project 1
 *
 */

public class GradeSummary 
{
    
    public static final int SENTINEL  = -1;

    public static void main(String[] args) 
    {

        Scanner in = new Scanner(System.in);
        
        double a = 0, b = 0, c = 0, d = 0, f = 0, counter = 0;

        System.out.print("Please enter a grade from 0 and 100 (or -1 to quit):");
        int grade = in.nextInt();
        
        while (grade != SENTINEL) 
        {
            counter++;
            
            if (grade <= 60) {
                f++;
            }
            else if (grade > 60 && grade < 70) {
                d++;
            }
            else if (grade >= 70 && grade < 80) {
                c++;
            }
            else if (grade >= 80 && grade < 90) {
                b++;
            }
            else if (grade >= 90 && grade <= 100) {
                a++;
            }
            
            System.out.print("Please enter a grade from 0 and 100(or -1 to quit):");
            grade = in.nextInt();
            
        }
        
        if (counter > 1) 
        {

            System.out.println("\nTotal number of grades:" + counter);
            System.out.printf("\nNumber of A's = %.0f which is %.1f%%", a , ((a/counter)*100));
            System.out.printf("\nNumber of B's = %.0f which is %.1f%%", b , ((b/counter)*100));
            System.out.printf("\nNumber of C's = %.0f which is %.1f%%", c , ((c/counter)*100));
            System.out.printf("\nNumber of D's = %.0f which is %.1f%%", d , ((d/counter)*100));
            System.out.printf("\nNumber of F's = %.0f which is %.1f%%", f , ((f/counter)*100));

        }
        
        else {
            System.out.print("You didn't enter any grades.");
        }
    }
}