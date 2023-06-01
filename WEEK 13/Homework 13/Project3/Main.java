import java.util.Scanner;

/**
 * <h2>Main.java - SSN exceptions</h2>
 *
 * <h3>Problem Statement:</h3>
 * <p>Create a list of employees, throwing exceptions for invalid Social Security Numbers (SSN) and salary amounts. </p>
 *
 * <h3>Algorithm:</h3>
 * <p>In main:</p>
 * <ol>
 *     <li>Create an <code>array</code> of <code>Employee</code>s, instantiated with 100 slots
 *     <li>Create an <b>String</b> labeled <code>name</code>
 *     <li>Create an <b>int</b> labeled <code>i</code>
 *     <li>Invoke <code>setArray</code> method for the arrays, with the appropriate file locations as the other parameter
 *     <li>Set <code>name</code> using the <code>setName</code> method with <code>i</code> as the parameter
 *     <li>While <code>name</code> input is not 'q' and <code>i</code> is less than one hundred, loop:
 *     <ul>
 *         <li>Create an <code>Employee</code> object labeled <code>employee</code>
 *         <li>Invoke the <code>setBirthday</code> method with <code>employee</code> and <code>name</code> as parameters
 *         <li>Invoke the <code>setSSN</code> method with <code>employee</code> as the parameter
 *         <li>Invoke the <code>setSalary</code> method with <code>employee</code> as the parameter
 *         <li>Set <code>employees[i]</code> to <code>employee</code>
 *         <li>Increase <code>i</code> by one
 *         <li>Set <code>name</code> using the <code>setName</code> method with <code>i</code> as the parameter
 *     </ul>
 *     <li>Invoke <code>quickbooks</code> with <code>employees</code> and <code>i</code> as parameters
 * </ol>
 *
 * @author Will Bouasisavath
 * @version Homework 13, Project 3
 */
public class Main 
{

    public static void main(String[] args) {

        // Create an array of employees
        Employee[] employees = new Employee[100];
        String name = "";
        int i = 0;

        // Create a String labeled name
        name = setName(i);
        while ((!name.toLowerCase().equals("q") && (i < 100))) {

            Employee employee = new Employee();
            setBirthday(employee, name);
            setSSN(employee);
            setSalary(employee);

            employees[i] = employee;

            i++;
            name = setName(i);
        }

        quickbooks(employees, i);
    }

    /**
     * Set's salary
     * @param employee is given to set the salary for
     * <br>
     * <h2>Algorithm</h2>
     *                 <ol>
     *                 <li>Create a <code>Scanner</code> object named <code>in</code>
     *                 <li>Ask user for employee salary
     *                 <li>Try to <code>setSalary</code> of <code>employee</code> with the next line as parameter
     *                 <li>Catch, displaying error message and calling the method again
     *                 </ol>
     */

    public static void setSalary(Employee employee) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter employee's salary:  ");
        try {
            employee.setSalary(in.nextLine());

        } catch (Exception e) {
            System.out.println(e.getMessage());
            setSalary(employee);
        }
    }

    /**
     * Creates a scanner, prompts user, returns input
     * @param i -used to tell which employee the user is entering info for
     * @return -the next line, which is the name
     */
    public static String setName(int i) {
        Scanner in = new Scanner(System.in);

        System.out.println("\nEntering info for employee #" + (i+1));
        System.out.print("Enter employee name (or Q to finish):  ");

        return in.nextLine();
    }

    /**
     * Sets the birthday
     * @param employee - Birthday it is assigning to
     * @param name - Also sets name
     * <br>
     * <h2>Algorithm</h2>
     *                 <ol>
     *                 <li>Create a <code>Scanner</code> object named <code>in</code>
     *                 <li>Create a <code>Date</code> named <code>birthday</code>
     *                 <li>Ask user for employee salary
     *                 <li>Try to <code>setDate</code> of <code>birthday</code> with the user's input, then set birthday and name of <code>employee</code>
     *                 <li>Catch, displaying error message and calling the method again
     *                 </ol>
     */
    public static void setBirthday(Employee employee, String name){
        Scanner in = new Scanner(System.in);
        Date birthday = new Date();

        System.out.print("Enter birth month, day, year (no commas):  ");

        try {
            birthday.setDate(in.next(), in.nextInt(), in.nextInt());
            employee.setBirthDate(birthday);
            employee.setName(name);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            setBirthday(employee, name);
        }

    }

    /**
     * Sets the SSN
     * @param employee - Who SSN is assigned to
     * <br>
     * <h2>Algorithm</h2>
     *                 <ol>
     *                 <li>Create a <code>Scanner</code> object named <code>in</code>
     *                 <li>Ask user for SSN
     *                 <li>Try to <code>setSSN</code> of <code>employee</code> with the next line as parameter
     *                 <li>Catch, displaying error message and calling the method again
     *                 </ol>
     */
    public static void setSSN(Employee employee) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a 9-digit SSN:  ");

        try {
            employee.setSSN(in.nextLine());

        } catch (SSNLengthException | SSNCharacterException e) {
            System.out.println(e.getMessage());
            setSSN(employee);

        }
    }

    /**
     * Displaying outputs
     * @param employees - array of <code>Employee[]</code>
     * @param i - amt of slots used in that array
     * <br>
     * <h2>Algorithm</h2>
     *                 <ol>
     *                 <li>Create an <b>int</b> named <code>average</code> set to 0
     *                 <li>Loop through <code>employees</code>, adding <code>getSalary</code> to <code>average</code>
     *                 <li>Set <code>average</code> itself divided by <code>i</code>
     *                 <li>Display a nicely formatted output using <code>printf</code> and looping through <code>employees</code> again
     *                 <li>Display <code>toString</code> for each employee in <code>employees</code>
     *                 </ol>
     */
    public static void quickbooks(Employee[] employees, int i) {

        int average = 0;
        for (int j = 0; j < i; j++) {
            average += employees[j].getSalary();
        }
        average = average / i;

        System.out.println("\n\nThe average salary is $" + String.format("%,.2f", (average / 100.00)*100) + "\n");

        System.out.printf("\n%-5s %s %10s %20s %15s %15s\n", "No.", "Employee-Name", "SSN", "Birth-date", "Salary", "to Avg.");
        System.out.printf("%-5s %s %10s %20s %15s %15s\n", "---", "-------------", "---", "----------", "------", "-------");

        for (int l = 0; l < i; l++) {

            if (employees[l].getSalary() > average){System.out.printf("  %-3d %-17s %-15d %-20s %-15s %-20s\n", (l+1), employees[l].getName(), employees[l].getSsn(), employees[l].getBirthDate().toString(), String.format("%,.2f", (employees[l].getSalary() / 100.00)*100), "Over"); }
            if (employees[l].getSalary() < average){System.out.printf("  %-3d %-17s %-15d %-20s %-15s %-20s\n", (l+1), employees[l].getName(), employees[l].getSsn(), employees[l].getBirthDate().toString(), String.format("%,.2f", (employees[l].getSalary() / 100.00)*100), "Under"); }
            if (employees[l].getSalary() == average){System.out.printf("  %-3d %-17s %-15d %-20s %-15s %-20s\n", (l+1), employees[l].getName(), employees[l].getSsn(), employees[l].getBirthDate().toString(), String.format("%,.2f", (employees[l].getSalary() / 100.00)*100), "On the dot!"); }

        }

        System.out.println("\nUsing toString():");
        for (int k = 0; k < i; k++) {
            System.out.println("  " + employees[k].toString());

        }

    }
}