/**
 * <h2>DecimalToBinary.java - Convert Decimal to Binary</h2>
 *
 * @author Will Bouasisavath
 * @version Module 14, Lab project 3
 */

public class DecimalToBinary {
    
    public static void main(String[] args){

        // Print and displays output result of Decimal to Binary Recurseive/Iterative
        System.out.printf("With recursion, Decimal: %d. Binary: %s.\n", 0, decimalToBinaryRecursive(0).equals("") ? "0" : decimalToBinaryRecursive(0));
        System.out.printf("With iteration, Decimal: %d. Binary: %s.\n", 0, decimalToBinaryIterative(0).equals("") ? "0" : decimalToBinaryIterative(0));
        System.out.printf("With recursion, Decimal: %d. Binary: %s.\n", 5, decimalToBinaryRecursive(5));
        System.out.printf("With iteration, Decimal: %d. Binary: %s.\n", 5, decimalToBinaryIterative(5));
        System.out.printf("With recursion, Decimal: %d. Binary: %s.\n", 32, decimalToBinaryRecursive(32));
        System.out.printf("With iteration, Decimal: %d. Binary: %s.\n", 32, decimalToBinaryIterative(32));
        System.out.printf("With recursion, Decimal: %d. Binary: %s.\n", 240, decimalToBinaryRecursive(240));
        System.out.printf("With iteration, Decimal: %d. Binary: %s.\n", 240, decimalToBinaryIterative(240));
        System.out.printf("With recursion, Decimal: %d. Binary: %s.\n", 682, decimalToBinaryRecursive(682));
        System.out.printf("With iteration, Decimal: %d. Binary: %s.\n", 682, decimalToBinaryIterative(682));

    }

    // Create a recursive method 
    private static String decimalToBinaryRecursive(int number)
    {
        String answer = null;

        if (number > 0) {
            answer = decimalToBinaryRecursive(number / 2) + number % 2;
        } else {
            return "";
        }

        return answer;
    }

    // Create a iterative method
    private static String decimalToBinaryIterative(int number) {
        String binary = "";

        while (number > 0) {
            binary = (number % 2) + binary;
            number = number / 2;
        }

        return binary;
    }
}
