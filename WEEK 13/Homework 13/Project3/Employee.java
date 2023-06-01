import java.util.Objects;
/**
 * <h2>Employee.java - represents a person who is employed</h2>
 *
 * <h3>Instance variables:</h3>
 *
 * <ul>
 *     <li><b>int</b> ssn - Social Security Number
 *     <li><b>int</b> salary - How much moola they are brining home
 * </ul>
 *
 * @author Will Bouasisavath
 * @version Homework 13, Project 3
 */

public class Employee extends Person {
    private int ssn;
    private int salary;

    /**
     * Null constructor
     */
    public Employee() {}

    /**
     * Setter for <code>SSN</code>
     * @param ssn - User input for SSN
     * @throws SSNLengthException - if length is not 9
     * @throws SSNCharacterException - if contains any non-numeric characters
     * <br>
     * <h2>Algorithm</h2>
     *                 <ol>
     *                 <li>Create variable <code>len</code> set to the length of <code>ssn</code>
     *                 <li>If <code>len</code> is not equal to 9, throw <code>SSNLengthException</code>
     *                 <li>Try <code>parseInt</code>, catch with a <code>NumberFormatException</code>, throwing a new <code>SSNCharacterException</code>
     *                 <li>set <code>this.ssn</code> to the <code>parseInt</code> with <code>ssn</code> as a parameter
     *                 </ol>
     */
    public void setSSN(String ssn) throws SSNLengthException, SSNCharacterException {

        int len = ssn.length();

        if (len != 9) {
            throw new SSNLengthException();
        }

        try {
            int num = Integer.parseInt(ssn);

        } catch (NumberFormatException e) {
            throw new SSNCharacterException();

        }

        this.ssn = Integer.parseInt(ssn);

    }

     /**
     * Setter for <code>salary</code>
     * @param salary - User input for salary
     * @throws InvalidSalaryText - if contains any non-numeric characters
     * @throws InvalidSalaryOption - if contains a negative, slightly redundant but also unique.
     * <br>
     * <h2>Algorithm</h2>
     *                 <ol>
     *                 <li>If the first slot in the string is a '-', throw a new <code>InvalidSalaryOption</code>
     *                 <li>Try to <code>parseInt</code> with <code>salary</code> as paramater, catch with <code>NumberFormatException</code>, throwing new <code>InvalidSalaryText</code> exception
     *                 <li>Set <code>this.salary</code> to the <code>parseInt</code> with <code>salary</code> as paramater
     *                 </ol>
     */
    public void setSalary(String salary) throws InvalidSalaryText, InvalidSalaryOption {


        if (salary.charAt(0) == '-') {
            throw new InvalidSalaryOption();
        }

        try {
            int num = Integer.parseInt(salary);

        } catch (NumberFormatException e) {
            throw new InvalidSalaryText();

        }


        this.salary = Integer.parseInt(salary);

    }

    /**
     * Getter for SSN
     * @return ssn
     */
    public int getSsn() {
        return ssn;
    }

    /**
     * Getter for salary
     * @return salary
     */
    public int getSalary() {
        return salary;
    }


    /**
     * Evaluating if two objects are the same
     * @param o - Object that is cast into a <code>Employee</code>, compared with
     * @return <b>true</b> if equal, <b>false</b> if not equal
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return ssn == employee.ssn &&
                salary == employee.salary;
    }


    /**
     * Compiles a string with useful values
     * @return <b>String</b> with <code>super.toString</code> along with variables from <code>Employee</code> class
     */
    public String toString() {
        return super.toString() +
                ", SSN: " + ssn +
                ", Salary: " + String.format("%,.2f", (salary / 100.00)*100);
    }
}