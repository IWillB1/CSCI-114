import java.awt.Point;
/**
 * <h2>Robot.java - Contains methods that will be utilized in Main.java class </h2>
 *
 * <h3>Instance variables:</h3>
 * <ul>
 *     <li> <code>point</code> (<b>double</b>) - a <code>Point</code> object with <b>x</b> and <b>y</b> values that store the Robot's location in the 2-dimensional plane
 *     <li> <code>direction</code> (<b>char</b>) - contains a string with a character that represents either north, south, east or west
 * </ul>
 *
 * @author Will Bouasisavath
 * @version Module 10, Homework Project 1
 *
 */
public class Robot {

     //Instance vars
     private Point point = new Point();
     private String direction;

     /**
      * Constructor initializes vars <code>point</code> and <code>location</code> to <b>(0,0)</b> and <b>"N"</b> respectively
      */
     public Robot() {
          point.setLocation(0,0);
          direction = "N";
     }

     /**
      * Getter for <code>direction</code>
      * @return <b>string</b> <code>direction</code>
      */
     public String getDirection() {
          return direction;
     }

     /**
      * Getter for the location of the robot
      * @return <code>point</code>
      */
     public Point getLocation() {
          return point;
     }

     /**
      * equals compares to see if two robot's <code>direction</code> and <cdoe>location</cdoe> are equal.
      * @param robot
      * @return If equal, it returns <b>true</b>, otherwise <b>false</b>
      */
     public boolean equals(Robot robot) {
          if (robot.getDirection() == this.direction && robot.getLocation() == this.point) {
               return true;
          }
          else return false;
     }

     /**
      * Method that changes the <code>direction</code> to be a string that represents a direction counterclockwise of itself
      */
     public void turnLeft() {
          switch (direction) {
               case "N":
                    direction = "W";
                    break;
               case "W":
                    direction = "S";
                    break;
               case "S":
                    direction = "E";
                    break;
               case "E":
                    direction = "N";
                    break;
          }
     }

     /**
      * Method that changes the <code>direction</code> to be a string that represents a direction clockwise of itself
      */
     public void turnRight() {
          switch (direction) {
               case "N":
                    direction = "E";
                    break;
               case "E":
                    direction = "S";
                    break;
               case "S":
                    direction = "W";
                    break;
               case "W":
                    direction = "N";
                    break;
          }
     }

     /**
      * Method that moves the robot forward with respect to it's direction
      */
     public void move() {
               switch (direction) {
                    case "N":
                         point.setLocation(point.getX(), (point.getY()+1));
                         break;
                    case "W":
                         point.setLocation((point.getX()-1), point.getY());
                         break;
                    case "S":
                         point.setLocation(point.getX(), (point.getY()-1));
                         break;
                    case "E":
                         point.setLocation((point.getX()+1), point.getY());
                         break;
               }
     }

     /**
      * Method that returns a string informing user of data regarding the robot
      * @return a string with the <code>location</code> and <code>direction</code> of the robot
      */
     public String toString() {
          return "Robot is now at (" + point.getX() + "," + point.getY() + ") and is facing in the direction of " + direction;
     }

}