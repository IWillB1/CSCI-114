
/**
 * <h2>GreatestCommonDenominator.java - Find GCD</h2>
 *
 * @author Will Bouasisavath
 * @version Module 14, Lab project 2
 */

public class GreatestCommonDenominator 
{

    // Print and display results greatest common denominator recursive/iterative
    public static void main(String[] args) {
        
        System.out.printf("Using recursion, GCD of %d and %d: %d\n", 13, 11, recursiveFindGCD(13, 11));
        System.out.printf("Using iteration, GCD of %d and %d: %d\n", 13, 11, iterativeFindGCD(13, 11));
        
        System.out.printf("Using recursion, GCD of %d and %d: %d\n", 17, 51, recursiveFindGCD(17, 51));
        System.out.printf("Using iteration, GCD of %d and %d: %d\n", 17, 51, iterativeFindGCD(17, 51));
        
        System.out.printf("Using recursion, GCD of %d and %d: %d\n", 9, 27, recursiveFindGCD(9, 27));
        System.out.printf("Using iteration, GCD of %d and %d: %d\n", 9, 27, iterativeFindGCD(9, 27));
        
        System.out.printf("Using recursion, GCD of %d and %d: %d\n", 100, 2550, recursiveFindGCD(100, 2550));
        System.out.printf("Using iteration, GCD of %d and %d: %d\n", 100, 2550, iterativeFindGCD(100, 2550));
        
        System.out.printf("Using recursion, GCD of %d and %d: %d\n", 111, 259, recursiveFindGCD(111, 259));
        System.out.printf("Using iteration, GCD of %d and %d: %d\n", 111, 259, iterativeFindGCD(111, 259));

    }

    // Creates a recursive method
    private static int recursiveFindGCD(int a, int b) {

        if (b != 0) {
            return recursiveFindGCD(b, a % b);
        }
        else {
            return a;
        }

    }

    // Creates an iterative method
    private static int iterativeFindGCD(int a, int b) {

        int answer = 0;
        
        for (int i = 1; i <= a && i <= b; i++) {
            
            if (a % i == 0 && b % i == 0) {
                answer = i;
            }
        }
        return answer;
    }
}