import java.util.Scanner;

/**
 * <h2>Main.java - Check for palindromes</h2>
 *
 * @author Will Bouasisavath
 * @version Module 14, Lab project 1
 */

public class Main 
{
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            // Step 1
            Scanner scanner = new Scanner(System.in);

            System.out.print("\nEnter a phrase: ");

            // Convert the test String to all upper-case
            String input = scanner.nextLine().toUpperCase();
            scanner = new Scanner(input);

            // Create a new String which containts only letters or digits
            String inputJustLetters = "";

            scanner.useDelimiter("[^0-9a-zA-Z]");

            while (scanner.hasNext())
            {
                inputJustLetters += scanner.next();
            }

            System.out.printf("%s %s a palindrome.", input, checkPalindromeIterative(inputJustLetters) ? "is" : "is not");
            System.out.printf("\n%s %s a palindrome.\n", input, checkPalindromeRecursive(inputJustLetters) ? "is" : "is not");
        }
    }

    // Step 2
    private static boolean checkPalindromeRecursive(String phrase) {
        // Create a recursive method which takes a String as an input parameter and returns a boolean value
        
        if (phrase.length() < 2) {
            // return true if the length of the parameter String is less than 2
            return true;
        }
        else if (phrase.charAt(0) != phrase.charAt(phrase.length() - 1)) {
            // return false if the first and last characters in the parameter String are different
            return false;
        } 
        else {
            // return the value obtained by invoking recursive method
            // using the paramter String minus the first and last characters
            String newPortion = phrase.substring(1, phrase.length() - 1);
            return checkPalindromeRecursive(newPortion);
        }
    }

    // Test the String by using it as input to recursive method
    private static boolean checkPalindromeIterative(String phrase) {
        // Create an interative method which takes a String as an input parameter and returns a boolean value
        // Create an int variable which will be the index of the character on the left side of the String set to 0
        // Create another in variable which will be the index of the character on the right side of the String set String minus 1
        // Compare characters moving in from the left using the first index variable 
        // and in from the right side using the second index variable
        // until either find two characters that don't match or run out of characters to test
        for (int i = 0, j = phrase.length() - 1; i < phrase.length(); i++, j--)
        {
            if (phrase.charAt(i) != phrase.charAt(j)) {
                return false;
            }
        }

        return true;

    }
}