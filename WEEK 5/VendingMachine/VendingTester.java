/**
 * VendingTester.java - will utilize the objects from VendingTester class
 * Author: Will Bouasisavath
 * Module: 5
 * Project: Homework Project2
 * Problem statement: Write a program that determines the change to be dispensed from a vending machine.
 * An item in the machine can cost between 5 cents and 1 dollar,
 * in 5-cent increments (5, 10, 15, 20, . . . 95, or 100),
 * and the machine accepts only a single dollar bill to pay for the item.
 *
 * Algorithm:
 *      1. Create a scanner object
 *      2. Print a statement to ask user for cost
 *      3. If scanner receives an int, set it to var cost
 *      4. Create a Process object named machine, int cost as parameter
 *      5. Print a statement with the values of the cost and change
 *      6. call and print the calculate() function, which will display a prepared string with the coin amounts
 *      7. Encapsulate steps 2-6 in a for loop that repeats 3 times
 */

import java.util.Scanner;

public class VendingTester
{

    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) 
        {
            System.out.print("\nEnter item price (From 5 cents to $1, in 5-cent increments): ");
            
            if (input.hasNextInt()) 
            {
                int cost = input.nextInt();
                VendingMachine machine = new VendingMachine(cost);
                System.out.printf("Your item cost %d cents. From $1, your change is %d cents: \n", cost, machine.getChange());
                System.out.println(machine.calculate());
            }
        }
    }
}