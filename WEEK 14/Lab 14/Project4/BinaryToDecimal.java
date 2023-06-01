/**
 * <h2>BinaryToDecimal.java - Convert Binary to Decimal</h2>
 *
 * @author Will Bouasisavath
 * @version Module 14, Lab project 4
 */

public class BinaryToDecimal 
{
    
    public static void main(String[] args){

        System.out.printf("Using Iteration, Binary: %s. Decimal: %d.\n", "0", binaryToDecimalIterative("0"));
        System.out.printf("Using Recursive, Binary: %s. Decimal: %d.\n", "0", binaryToDecimalRecursive("0"));

        System.out.printf("Using Iteration, Binary: %s. Decimal: %d.\n", "101", binaryToDecimalIterative("101"));
        System.out.printf("Using Recursive, Binary: %s. Decimal: %d.\n", "101", binaryToDecimalRecursive("101"));

        System.out.printf("Using Iteration, Binary: %s. Decimal: %d.\n", "100000", binaryToDecimalIterative("100000"));
        System.out.printf("Using Recursive, Binary: %s. Decimal: %d.\n", "100000", binaryToDecimalRecursive("100000"));

        System.out.printf("Using Iteration, Binary: %s. Decimal: %d.\n", "11110000", binaryToDecimalIterative("11110000"));
        System.out.printf("Using Recursive, Binary: %s. Decimal: %d.\n", "11110000", binaryToDecimalRecursive("11110000"));

        System.out.printf("Using Iteration, Binary: %s. Decimal: %d.\n", "1010101010", binaryToDecimalIterative("1010101010"));
        System.out.printf("Using Recursive, Binary: %s. Decimal: %d.\n", "1010101010", binaryToDecimalRecursive("1010101010"));


        // note from Decimal to Binary
        //System.out.printf("With recursion, Decimal: %d. Binary: %s.\n", 0, binaryToDecimalRecursive(0).equals("") ? "0" : decimalToBinaryRecursive(0));
        //System.out.printf("With iteration, Decimal: %d. Binary: %s.\n", 0, binaryToDecimalIterative(0).equals("") ? "0" : decimalToBinaryIterative(0));


    }

    private static int binaryToDecimalRecursive(String binary)
    {
        int sum = 0;

        int length = binary.length();

        char character = binary.charAt(length - 1);

        int digit = (character - '0');

        if (length > 1)
        {
            return binaryToDecimalRecursive(binary.substring(0, length - 1)) * 2 + digit;

        } else {
            return digit;
        }

        /*
        1100100 -> 1 = 1 -- returns 2 * 1 + nextDigit
        100100 -> 1 = 1 -- returns 2 * 1 + nextDigit
        00100
        0100
        100
        00 (~~ * 2) + 0
        0 -> 0
         */

    }

    private static int binaryToDecimalIterative(String binary)
    {
        int x = Integer.parseInt(binary);

        int num = 0;
        int decimal = 1;

        for (int i = 1; i < x; i *= 10) {
            int binaryDigit = x/i%10;
            num += decimal * binaryDigit;
            decimal *= 2;
        }

        return num;

    }
}