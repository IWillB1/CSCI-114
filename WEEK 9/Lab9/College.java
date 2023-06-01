/**
 * <h2>Represents a college with name, city, students, and date established</h2>
 * <p>Description:</p>
 * <ul>
 *   <li>Instance variables:
 *     <ul>
 *        <li>name (<code>String</code>) - Name of the College</li>
 *        <li>city (<code>String</code>) - City of main campus</li>
 *        <li>students (<code>int</code>) - estimated number of students</li>
 *        <li>established (<code>String</code>) - date established</li>
 *     </ul>
 *   </li>
 * </ol>
 * @author Will Bouasisavath
 * @version Module 9, Lab
 */

public class College {

    // Instance variables
    private String name = "" ;
    private String city = "" ;
    private int students = 0 ;
    private int established = 1900 ;

   /**
    * Full constructor sets all four instance variables.
    * @param name the name of the College
    * @param city the city in which the main campus resides
    * @param students the number of students attending this College
    * @param year the year in which the College was established
    */ // Full constructor
    public College(String name, String city, int students, int established) {
        this.name = name ;
        this.city = city ;
        this.students = students ;
        this.established = established ;
    }

   /**
    * Getter for the name of the College
    * @return the name of the College
    */
    public String getName() {
        return name ;
    }
   /**
    * Setter for the name of the College
    * @param the new name for this College
    */
    public void setName(String newName) {
        name = newName ;
    }
   /**
    * Getter for the name of the city in which the main campus is in
    * @return city the name of the city of the main campus
    */
    public String getCity() {
        return city ;
    }
   /**
    * Setter for the name of the city of the main campus
    * @param the name of the city where the main campus is located
    */
    public void setCity(String newCity) {
        city = newCity ;
    }
   /**
    * Getter for the number of active students at the College
    * @return students the number of students at this College
    */
    public int getStudents() {
        return students ;
    }
   /**
    * Setter for the number of active students at the College
    * @param the number of students actively attending this College
    */
    public void setStudents(int newStudents) {
        students = newStudents ;
    }
   /**
    * Getter for the year in which the College was established
    * @return the year in which this College was established
    */
    public int getEstablished() {
        return established ;
    }
   /**
    * Setter for the year the College was established
    * @param the year the College was established
    */
    public void setEstablished(int newEstablished) {
        established = newEstablished ;
    }

   /**
    * Test for equality between two Colleges, checking that the College
    * names, city (main campus), number of students, and year established
    * are the same
    * @return true if the name, city, number of students and year established
    *  are the same for the calling object and the parameter College object.
    */
    public boolean equals(College anotherCollege) {
        return ((name.equals(anotherCollege.name)) &&
                (city.equals(anotherCollege.city)) &&
                (students == anotherCollege.students) &&
                (established == anotherCollege.established)) ;
    }

    /**
     * Returns all instance variables (with labels) as a String
     * @return a String with the College name, city (main campus), number of students,
     *  and year established
     */
    public String toString() {
        return "Name: " + name + "  City: " + city + "  Students: " + students + "  Est.: " + established ;
    }
}