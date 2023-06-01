import java.util.ArrayList;

/**
 * <h2>main.java - Utilizing Arraylists</h2>
 * <ul>
 * <p>Program that utilizes class named College to store information about serveral local colleges, then place them in an ArrayList</p>
 *
 * <h3>Algorithm:</h3>
 * <p>In main:</p>
 * <ol>
 *     <li>create 6 <b>College</b> objects
 *     <li>create <code>ArrayList</code> with initial capacity 3
 *     <li>add <b>Palomar</b>, <b>MiraCosta</b> and <b>Grossmont</b> college objects in <code>ArrayList</code> called <code>schoolList</code>
 *     <li>insert <b>Saddleback</b> object to <code>schoolList</code> at position 1 using the <code><b>add method</b></code>
 *     <li>insert the <b>Mesa</b> object to <code>schoolList</code> at position 2 using the <code><b>add method</b></code>
 *     <li>determine the index of <b>Grossmont</b> object using the <code>indexOf method</code> and store as in <code><b>int</b></code> variable
 *     <li>replace <b>Grossmont</b> object with the <b>Southwestern</b? object using <code><b>set method</b></code>
 *     <li>remove <b>MiraCosta</b> and <b>Saddleback</b> using <code><b>remove method</b></code>
 *     <li>invoke the method to display <b>College</b> objects in <code>schoolList</code>
 *     <li>print <code>schoolList</code> variable
 *     <li>empty <code>schoolList</code> using the <code><b>clear method</b></code>
 *     <li>reduce the capacity of <code>schoolList</code> using <code><b>trimToSize method</b></code>
 *     <li>invoke the <code><b>showschools method</b></code> to display the <b>College</b> objects in <code>schoolList</code>
 * </ol>
 * @author Will Bouasisavath
 * @version Module 9, Lab Project 1
 */
public class main 
{
    public static void main(String[] args) 
    {
        // create 6 college objects
        
        College palomar = new College("Palomar", "San Marcos", 26000, 1943);
        College miracosta = new College("MiraCosta", "Oceanside", 19000, 1934);
        College grossmont = new College("Grossmont", "El Cajon", 18000, 1968);
        College saddleback = new College("Saddleback", "Mission Viejo", 26000, 1934);
        College mesa = new College("Mesa", "San Diego", 25000, 1958);
        College southwestern = new College("Southwestern", "Chula Vista", 27000, 1961);

        // create ArrayList with initial capacity 3
        ArrayList<College> schoolList = new ArrayList(3);

        // add Palomar, MiraCosta and Grossmont college objects in schoolList
        schoolList.add(palomar);
        schoolList.add(miracosta);
        schoolList.add(grossmont);

        // insert Saddleback object to schoolList at position 1
        // and the Mesa object to schoolList at position 2
        // using the add method
        schoolList.add(1, saddleback);
        schoolList.add(2, mesa);

        // displays schoolList checking for changes
        showSchools(schoolList);

        // determine the index of Grossmont object using the indexOf method
        // and store in an int variable
        int grossmontIndex = schoolList.indexOf(grossmont);

        // replace Grossmont object with the Southwestern object 
        // using the set method
        schoolList.set(grossmontIndex, southwestern);

        // remove MiraCosta and Saddleback
        // using the remove object method
        schoolList.remove(miracosta);
        schoolList.remove(saddleback);

        // invoke the method to display College objects in schoolList
        showSchools(schoolList);

        // print schoolList variable
        System.out.println(schoolList);

        // empty schoolList using the clear method
        schoolList.clear();

        // reduce the capacity of schoolList
        // using trimToSize method
        schoolList.trimToSize();

        // invoke the showschools method to display the 
        // College objects in schoolList
        showSchools(schoolList);

    }

    // a method to display on the console all of the college objects in the ArrayList passed as a parameter
    private static void showSchools(ArrayList<College> list) {
        System.out.printf("\n%-12s %-13s %8s %6s","   College", "    City", "Students", "Est.");
        System.out.printf("\n%-12s %-13s %8s %6s","------------", "-------------", "--------", "----");

        for (var school : list) 
        {
            System.out.printf("\n%-12s %-13s %,8d %6d", school.getName(), school.getCity(), school.getStudents(), school.getEstablished());
        }
        System.out.println("\n\nNumber of schools: " + list.size());

    }
}