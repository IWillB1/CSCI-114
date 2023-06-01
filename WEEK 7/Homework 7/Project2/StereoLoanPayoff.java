/**
 * <h2>StereoLoanPayoff.java - Determines how many months and how much interest it takes to payoff the loan</h2>
 *
 * <h3>Problem Statement:</h3>
 * <p>You have just purchased a stereo system that cost $1,000 on the following credit plan:</p>
 * <ul>
 *     <li>No down payment
 *     <li>An interest rate of 18 percent per year
 *     <li>Monthly payments of 50 dollars
 * </ul>
 * <p>Write a program that tells you:</p>
 * <ul>
 *     <li>How many months it will take you to payoff the loan
 *     <li>The total amount of interest paid over the life of the loan
 * </ul>
 *
 * <h3>Algorithm:</h3>
 * 
 * <ol>
 *     <li>Create 3 <b>double</b> constants named <code>initialLoadAmount</code>, <code>payment</code>, and <code>annualInterest</code> set to 1000, 50, and 0.18 respectively
 *     <li>Create a few <b>double</b> variables named <code>monthlyInterest</code>, <code>loadAmount</code>, <code>interest</code>, <code>principal</code>, <code>amount</code>, set to <code>annualInterest</code>/12, initialLoadAmount, 0, 0, and 0 respectively.
 *     <li>Create an <b>int</b> named <code>month</code> set to 1. This will keep track of how many monthly payments will be needed
 *     <li>While <code>loadAmount</code> is greater than or equal to <code>payment</code>
 *          <ul>
 *              <li> Create a <b>double</b> named <code>interestTemp</code> set equal to <code>loadAmount</code> times <code>monthlyInterest</code>
 *              <li> Create a <b>double</b> named <code>principalTemp</code> set equal to <code>payment</code> minus <code>interestTemp</code>
 *              <li> Add <code>payment</code> to <code>amount</code>
 *              <li> Add <code>interestTemp</code> to <code>interest</code>
 *              <li> Add <code>principal</code> to <code>principalTemp</code>
 *              <li> Subtract <code>principalTemp</code> from <code>loadAmount</code>
 *              <li> Increase <code>month</code> by one
 *          </ul>
 *     <li> Create a <b>double</b> named <code>interestTemp</code> set equal to <code>loadAmount</code> times <code>monthlyInterest</code>
 *     <li> Create a <b>double</b> named <code>principalTemp</code> set equal to <code>loadAmount</code>
 *     <li> Add <code>interestTemp</code> to <code>interest</code>
 *     <li> Subtract <code>principal</code> from <code>loadAmount</code>
 *     <li> Add <code>principalTemp</code> and <code>interestTemp</code> to <code>amount</code>
 *     <li> Add <code>principalTemp</code> to <code>principal</code>
 * </ol>
 *
 * @author Will Bouasisavath
 * @version Module 7, Homework Project 2
 */

public class StereoLoanPayoff 
{

    private static final double initialLoadAmount = 1000;
    private static final double payment = 50;
    private static final double annualInterest = 0.18;

    public static void main(String[] args) 
    {

        double monthlyInterest = annualInterest/12;
        double loadAmount = initialLoadAmount;
        double interest = 0, principal = 0, amount = 0;
        int month = 1;

        while (loadAmount >= payment) 
        {
            //System.out.print("Month" + month + " starting balance is " + loadAmount);
            double interestTemp = loadAmount * monthlyInterest;
            double principalTemp = payment - interestTemp;
            amount += payment;
            interest += interestTemp;
            principal += principalTemp;
            loadAmount -= principalTemp;
             //System.out.println(" and the interest is " + interestTemp + " and the principal  is " + principalTemp + " new amount is " + loadAmount);
            month++;
        }

        //System.out.print("Month" + month + " starting balance is " + loadAmount);
        double interestTemp = loadAmount * monthlyInterest;
        double principalTemp = loadAmount;
        interest += interestTemp;
        loadAmount -= principal;
        amount += principalTemp + interestTemp;
        principal += principalTemp;
        //System.out.println(" and the interest is " + interestTemp + " and the principal  is " + principalTemp + " new amount is " + loadAmount);

        System.out.printf("\nMonthly interest %.2f and total monthly payments is %.2f and principal is %.2f", interest, amount, principal);   }
}