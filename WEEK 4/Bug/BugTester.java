/** 
 * BugTester.java - will utilize the objects from Bug class
 * Author: Will Bouasisavath
 * Module: 4
 * Project: Homework Project2
 * Problem statement: Implement a class named Bug that models a bug walking along a wire
 * 
 * Algorithm:  
 *      1. Create Two Bug, the first starting at 5 and the second at 10.
 *      2. Move the first bug 3 times.
 *      3. Print the position of the first bug.
 *      4. Turn the second bug and move 2 times.
 *      5. Print the position of the second bug.
 */
public class BugTester
{
  
    public static void main(String[] args) {
        
        //creating two bugs 
        Bug buggyOne = new Bug(5);
        Bug bugsyTwo = new Bug(10);
        
        //moving bugOne 3 times
        for (int i = 0; i < 3; i++) 
        {
            buggyOne.move();
        }
        
        //printing the position of bugOne
        System.out.printf("The position of the first bug is %d\n\n", buggyOne.getCurrentPosition());
        
        //turning bugTwo and moving her 2 times
        bugsyTwo.turn();
        bugsyTwo.move();
        bugsyTwo.move();
        
        //printing the position of bugTwo
        System.out.printf("The position of the second bug is %d", bugsyTwo.getCurrentPosition());        
        
    }
}
