/**
 * VendingMachine.java - Interface will utilize objects from this class
 * Author: Will Bouasisavath
 * Module: 5
 * Project: Homework Project2
 * Problem statement: 
     * Write a program that determines the change to be dispensed from a vending machine.
     * An item in the machine can cost between 5 cents and 1 dollar,
     * in 5-cent increments (5, 10, 15, 20, . . . 95, or 100),
     * and the machine accepts only a single dollar bill to pay for the item.
 *
 * Algorithm:
     * Instance variables:
         * dollar (int), holds the val of a dollar
         * cost (int), holds the cost
         * change (int), the difference of the cost from the dollar
         * quarters (int), the # of quarters to give from the change
         * dimes (int), the # of dimes to give from the change
         * nickels (int), the # of nickels to give from the change
 * 
 * Constant variables:
         * qVal (int), holds the val of a quarter
         * dVal (int), holds the val of a dime
         * nVal (int), holds the val of a nickel
 *
 * Methods:
          * Constructor Process() takes on the parameter cost which and sets it to the instance variable named cost
          * Calculate() literally calculates and returns a string with all of the coin values. Acts like a toString()
          * getChange() a getter for change var
          * getQuarters() a getter for quarters var
          * getDimes() a getter for dimes var
          * getNickels() a getter for nickels var
          * setChange() a setter for the change var
          * setQuarters() a setter for the quarters var
          * setDimes() a setter for the dimes var
          * setNickels() a setter for the nickels var
*/

public class VendingMachine
{
    //Constant variables
    static final int qVal = 25, dVal = 10, nVal = 5;

    // instance variables
    private int dollar = 100, cost = 100, change = 0, quarters = 0, dimes = 0, nickels = 0;

    public VendingMachine(int cost) 
    {
        this.cost = cost;
    }

    // calculates the following 
    public String calculate() 
    {

        //Change value, which is the cost from the dollar
        change = dollar - cost;

        //As long as not negative, subtract 25 from change, adding 1 to quarters
        //Gives us the amt of quarters
        while ((change - qVal) >= 0) 
        {
            change -= qVal;
            quarters++;
        }

        //As long as not negative, subtract 10 from change, adding 1 to dimes
        //Gives us the amt of dimes
        while ((change - dVal) >= 0) 
        {
            change -= dVal;
            dimes++;
        }

        //As long as not negative, subtract 5 from change, adding 1 to dimes
        //Gives us the amt of dimes
        while ((change - nVal) >= 0) 
        {
            change -= nVal;
            nickels++;
        }

        //Return a string with explanations of coin amounts
        return quarters + " quarter(s), " + dimes + " dime(s), and " + nickels + " nickel(s).";
    }

    //Getters for variables
    public int getChange() 
    {
        change = dollar - cost;
        return change;
    }

    public int getQuarters() 
    {
        return quarters;
    }

    public int getDimes() 
    {
        return dimes;
    }

    public int getNickels() 
    {
        return nickels;
    }

    //Setters for variables
    public void setChange(int change) 
    {
        this.change = change;
    }

    public void setQuarters(int quarters) 
    {
        this.quarters = quarters;
    }

    public void setDimes(int dimes) 
    {
        this.dimes = dimes;
    }

    public void setNickels(int nickels) 
    {
        this.nickels = nickels;
    }
}