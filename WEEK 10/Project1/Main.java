/**
 * <h2>Main.java - Creates two Robot objects that move in a 2-dimensional plane</h2>
 *
 * <h3>Problem Statement:</h3>
 * <p>Implement a class named Robot that simulates a robot wandering on an infinite two-dimensional plane. The robot is located at an X-Y point with coordinates and faces north, east, south, or west</p>
 *
 * <h3>Algorithm:</h3>
 * <p>In main:</p>
 * <ol>
 *     <li>create a <b>Robot</b> object
 *     <li>move two units to the north and display its current location
 *     <li>turn to the right, move two units, and display its location
 *     <li>turn to the left, move three units, and displays its location
 *     <li>create a second <b>Robot</b> object
 *     <li>turn the second robot to the left, move two units, and display its location
 *     <li>turn the second robot to the left again, move two units, and display its location
 * </ol>
 *
 * @author Will Bouasisavath
 * @version Module 10, Homework Project 1
 */
public class Main 
{
    
    public static void main(String[] args) 
    {

        // create a robot object
        System.out.println("\nRobot1");
        Robot robot1 = new Robot();

        // intruct the robot to move two units north
        robot1.move();
        robot1.move();

        // toString to display its current location
        System.out.println(robot1.toString());

        // intruct the robot right, move two units, and display its location 
        robot1.turnRight();
        robot1.move();
        robot1.move();
        System.out.println(robot1.toString());

        // turn to the left, move three units, and displays its location
        robot1.turnLeft();
        robot1.move();
        robot1.move();
        robot1.move();
        System.out.println(robot1.toString());

        // create a second robot object
        System.out.println("\nRobot2");
        Robot robot2 = new Robot();

        // turn the second robot to the left, move two units, and display its location
        robot2.turnLeft();
        robot2.move();
        robot2.move();
        System.out.println(robot2.toString());

        // turn the second robot to the left again, move two units, and display its location
        robot2.turnLeft();
        robot2.move();
        robot2.move();
        System.out.println(robot2.toString());

    }
    
}