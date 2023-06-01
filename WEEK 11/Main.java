/**
 * <h2>Main.java - Creates many Players objects</h2>
 *
 * <h3>Problem Statement:</h3>
 * <p>Rewrite the given code so that it promotes encapsulation and uses inheritance to represent the different types of aliens instead of a “type” parameter.</p>
 *
 * <h3>Algorithm:</h3>
 * <p>In main:</p>
 * <ol>
 *     <li>create an array of <code>Player</code> named "team" which can hold up to 10 <code>Player</code> objects.
 *     <li>add at least two of each type of <code>Player</code> (a AllStar, a Pro, and an Scrub) to the team array.
 *     <li>use the <code>printTeam</code> method to print report of all of the players in the team array.  Use nicely-formatted columns labelled "Player Name", "Score" and "Class".
 *     <li>use the <code>calculateScore</code> method calculate the total score that the players in the team array can achieve, and print below the report.
 * </ol>
 *
 * @author Will Bouasisavath
 * @version Module 11, Homework Project 1
 */

public class Main 
{
    public static void main(String[] args) 
    {

        Player[] team = new Player[10];

        team[0] =  new AllStar("Lebron") ;
        team[1] =  new AllStar("Anthony") ;
        team[2] =  new Pro("Dennis") ;
        team[3] =  new Pro("Andre") ;
        team[5] =  new Pro("Montrezi") ;
        team[6] =  new Scrub("Kyle") ;
        team[7] =  new Scrub("Alex") ;
        team[9] =  new Scrub("Wesley") ;
        
        int totalScore = calculateScore(team) ;

        printTeam(team);
        System.out.println("\nThe total Score for all the players is: " + calculateScore(team));

    }

    public static void printTeam(Player[] players) {

        System.out.printf("\n%s %19s %22s\n",  "Player Name", "Score", "Class");
        System.out.printf("%s %19s %22s\n",  "-----", "----", "------");

        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                System.out.printf("%-20d %-20s %-20d\n", i+1, players[i].getName(), players[i].getScore());
            }
        }
    }

    private static int calculateScore(Player[] team) {

        // Calculate the total score that can be achieved by a
        // team of players.
        int total_score = 0;

        for (int i = 0; i < team.length ; i++) {
          if (team[i] != null){
              total_score += team[i].getScore();
            }
        }
        
        return total_score;
    }
}