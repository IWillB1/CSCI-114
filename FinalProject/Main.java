import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * <h2>Main.java - Interface and calculations for KITT Robotics Scouting System</h2>
 * <h3>Problem Statement:</h3>
 * <p>Create a system that inputs, displays and outputs useful information about robots from the 2020 Los Angeles North Competition.
 *    The system must include 3 classes and a main method in one, inheritance, polymorphism, and text file I/O. </p>
 *
 * <p>Algorithm:</p>
 * <p>In main:</p>
 * <ol>
 *     <li> Create an <b>array</b> of <code>RobotStats</code> with 8 slots
 *     <li> Create a <b>scanner</b> named <code>in</code>
 *     <li> Ask the user for an input file, loading the value of it as a parameter while invoking into <code>readAndPopulateArray</code> along with <code>array</code>
 *     <li> Ask the user for an output file, loading the value of it as a parameter while invoking the method <code>generateReport</code> along with <code>array</code>
 * </ol>
 *
 * @author Will Bouasisavath
 * @version Final Project
 */
public class Main {

    //These static variables hold the values of the number of teams in the array and a team number respectively.
    static int rs = 0;
    static int rt = 0;

    public static void main(String[] args) throws Exception {

        //Creating the array and the Scanner
        RobotStats[] array = new RobotStats[8];
        Scanner in = new Scanner(System.in);

        //Intro, and prompting user for file to read from
        System.out.println("KITT Robotics Scouting System");
        System.out.print("Please enter your scouting data file location:  ");
        readAndPopulateArray("ScountingData.txt" + in.nextLine(), array);

        //Final part, which asks user for file to output to and runs other methods which input into the output file
        System.out.print("Please enter file you would like to hold report:  ");
        generateReport("ScountingReport.txt" + in.nextLine(), array);


    }

    /**
     * Reading a file, populating an array from it (example of text file I/O)
     * @param file - Location of the file it is reading
     * @param array - Array to populate
     * @throws Exception - If something breaks
     *
     * <p>Algorithm:</p>
     * <ol>
     *     <li> Try to do the following
     *     <ul>
     *         <li>Create a <code>FileInputStream</code>, and a <code>Scanner</code> using <code>file</code>
     *         <li>Loop through file while <code>scanner</code> has next line, creating a <code>RobotStats</code> loaded with next lines from the file, pushing it into <code>array</code>
     *         <li>Increase <code>rs</code> each iteration
     *     </ul>
     *     <li> Otherwise catch with the following
     *     <ul>
     *         <li>Display the error message
     *         <li>Create a <code>scanner</code> with <code>System.in</code>
     *         <li>Ask the user for a new file, invoking the method again with the users input as the <code>file</code> parameter
     *     </ul>
     * </ol>
     */
    private static void readAndPopulateArray(String file, Robot[] array) throws Exception {

        //Try to do the following, catch if an exception
        try {

            //Creating FileInputStream and Scanner to read from file given
            FileInputStream inputFile = new FileInputStream("ScoutingData.txt");
            Scanner scanner = new Scanner(inputFile);

            //Adding from file into robot objects into the array
            for (int i = 0; scanner.hasNextLine(); i++){

                RobotStats robot = new RobotStats(Integer.parseInt(scanner.next()),Boolean.parseBoolean(scanner.next()),Boolean.parseBoolean(scanner.next()),Boolean.parseBoolean(scanner.next()),Boolean.parseBoolean(scanner.next()),Boolean.parseBoolean(scanner.next()),Boolean.parseBoolean(scanner.next()),Integer.parseInt(scanner.next()),Integer.parseInt(scanner.next()),Integer.parseInt(scanner.next()),Integer.parseInt(scanner.next()));
                System.out.println("Added: " + robot.toString());
                array[i] = robot;
                rs++;

            }

            //Letting user know the robots are imported
            System.out.println("\nSuccessfully imported all the robots!\n");

            //Closing scanner and input file
            inputFile.close();
            scanner.close();

        } catch (Exception e) {

            //Basically keep calling method until a file can be read
            Scanner in = new Scanner(System.in);
            System.out.println(e.getMessage());
            System.out.print("Please enter a valid file: ");
            readAndPopulateArray("" + in.nextLine(), array);
        }
    }

    /**
     * Method to generate scouting report, output to file given
     * @param file - File name
     * @param array - Array used to generate the scouting report
     * @throws Exception - If something breaks
     * <ol>
     * <p>Algorithm:</p>
     * <li> Try the following
     * <ul>
     *     <li>Create a <code>PrintWriter</code> with <code>file</code> as the paramter
     *     <li>Let the user know the file has been established
     *     <li>Input a header into the file
     *     <li>Input the NPR by calling the <code>npr</code> method and adding a statement into the file
     *     <li>Input the best climbing robot by calling the <code>bestClimb</code> method and adding a statement into the file
     *     <li>Input the best ball robot by calling the <code>bestBall</code> method and adding a statement into the file
     *     <li>Let the user know that everything has been added, and then close the <code>PrintWriter</code>
     * </ul>
     * <li> Otherwise catch with the following
     * <ul>
     *      <li>Display the error message
     *      <li>Create a <code>scanner</code> with <code>System.in</code>
     *      <li>Ask the user for a new file, invoking the method again with the users input as the <code>file</code> parameter
     * </ul>
     * </ol>
     */
    private static void generateReport(String file, RobotStats[] array) throws Exception {

        //Try to do the following, catch with an exception
        try{

            //Creating PrintWriter
            PrintWriter writer = new PrintWriter(file);
            System.out.println("File found!");

            //Inputting title
            System.out.println("KITT Robotics Scouting System Report");
            writer.println("KITT Robotics Scouting System Report\n");

            //Inputting NPR
            System.out.printf("Highest KITT Power Ranking: A score of %d from team #%d.\n", npr(array), array[rt].getTeam());
            writer.printf("Highest KITT Power Ranking: A score of %d from team #%d.\n\n", npr(array), array[rt].getTeam());

            //Inputting best climb robot
            System.out.printf("Best climbing robot: Team #%d with %d/10 climbs.\n", array[bestClimb(array)].getTeam(), array[bestClimb(array)].getClimbs());
            writer.printf("Best baller robot: Team #%d with an average match score of %d balls.\n\n", array[bestClimb(array)].getTeam(), array[bestClimb(array)].getClimbs());

            //Inputting best ball robot
            System.out.printf("Best baller robot: Team #%d with an average match score of %d balls.\n", array[bestBall(array)].getTeam(), array[bestBall(array)].getBallsScore());
            writer.printf("Best baller robot: Team #%d with an average match score of %d balls.\n\n", array[bestBall(array)].getTeam(), array[bestBall(array)].getBallsScore());

            //Closing the writer
            System.out.println("\nSuccessfully generated the report! View here --> " + file);
            writer.close();

        }
        catch (Exception e) {
            //Asks for a new file name if there is an exception
           Scanner in = new Scanner(System.in);
           System.out.println(e.getMessage());
           System.out.print("Please enter a valid file: ");
           generateReport("" + in.nextLine(), array);

        }
    }

    /**
     * Find the robot who scored the highest amount of balls
     * @param array - Array full of robots
     * @return the <code>index</code> of the robot with the highest ball score
     *
     * <p>Algorithm:</p>
     * <ol>
     *     <li>Create a <b>int</b> called <code>index</code> set to 0
     *     <li>Loop for <b>int</b> <code>i</code>, while <code>i</code> is less than <code>rs</code>, increasing i each iteration
     *     <ul>
     *         <li>If the <code>getBallsScore</code> of the array at index <code>i</code> is greater than the index at <code>index</code>, set <code>index</code> to <code>i</code>
     *     </ul>
     *     <li> Return <code>index</code>
     * </ol>
     */
    private static int bestBall(RobotStats[] array) {

        //Loop through the array, saving the index of the robot that has the highest ball score
        int index = 0;
        for (int i = 0; i < rs; i++) {
            if (array[i].getBallsScore() > array[index].getBallsScore()) {
                index = i;
            }
        }

        //returning index var
        return index;
    }

    /**
     * Method to find the robot with the highest NPR score
     * @param array - Array to read through
     * @return the <code>nprScore</code> with <code>array</code> and <code>rt</code> as parameters respectively
     *
     * <p>Algorithm:</p>
     * <ol>
     *     <li>Loop for <b>int</b> <code>i</code>, while <code>i</code> is less than <code>rs</code>, increasing i each iteration
     *     <ul>
     *         <li>If the <code>nprScore</code> of the array and <code>i</code> is greater than the index and <code>rt</code>, set <code>rt</code> to <code>i</code>
     *     </ul>
     *     <li>Return the <code>nprScore</code> of <code>array</code> and <code>rt</code>
     * </ol>
     */
    private static int npr(RobotStats[] array) {

        //looping through the array, saving highest NPR score
        for (int i = 0; i < rs; i++) {
            if (nprScore(array, i) > nprScore(array, rt)){
                rt = i;
            }
        }

        //Return that NPR score
        return nprScore(array, rt);
    }

    /**
     * Calculate the KITT Power Ranking Score based on values extracted from the given array, at index <code>i</code>
     * @param array - Array of <code>RobotStats</code> that will be accessed
     * @param i - Index of the array that will be accessed
     * @return <code>score</code> - The NPR score for the given robot
     *
     * <p>Algorithm:</p>
     * <ul>
     *     <li>Create an <b>int</b> named <code>score</code>
     *     <li>Create a <code>RobotStats</code> object named robot set equal to <code>array</code> at index <code>i</code>
     *     <li>If the robot is functional, add 500 to <code>score</code>
     *     <li>If the robot is tall, add 50 to <code>score</code>
     *     <li>If the robot can climb, add 250 times the climb percentage (out of 10) to <code>score</code>
     *     <li>If the robot can translate (#TranslatorClimbGang), add 100 to <code>score</code>
     *     <li>If the robot can shoot, add 100 times its shooting percentage to <code>score</code>
     *     <li>Return score
     * </ul>
     */
    private static int nprScore(RobotStats[] array, int i) {

        //Out of 1000, determined by capabilities and data
        int score = 0;
        RobotStats robot = array[i];
        if (robot.isFunctional()) {
            score += 500;
        }
        if (robot.isTall()) {
            score += 50;
        }
        if (robot.isClimb()) {
            double climbs = robot.getClimbs()/10.00;
            score += 250 * climbs;
        }
        if (robot.isTranslate()) {
            score += 100;
        }
        if (robot.isShootHigh()) {
            double shooting = robot.getBallsScore() / 100.00;
            score += shooting * 100;
        }

        //return that score
        return score;
    }

    /**
     * Method to find the robot with the best climb score from a given array
     * @param array - The array with <code>RobotStats</code>
     * @return <code>index</code> - The index for the robot with the highest climb score
     *
     * <p>Algorithm:</p>
     * <ol>
     *     <li>Create a <b>int</b> called <code>index</code> set to 0
     *     <li>Loop for <b>int</b> <code>i</code>, while <code>i</code> is less than <code>rs</code>, increasing i each iteration
     *     <ul>
     *         <li>If the <code>getClimbs</code> of the array at index <code>i</code> is greater than the index at <code>index</code>, set <code>index</code> to <code>i</code>
     *     </ul>
     *     <li> Return <code>index</code>
     * </ol>
     */
    private static int bestClimb(RobotStats[] array) {

        //Loop through array to find the best climb
        int index = 0;
        for (int i = 0; i < rs; i++) {
            if (array[i].getClimbs() > array[index].getClimbs()) {
                index = i;
            }
        }

        //Return index of the robot with the highest climb number
        return index;
    }

}