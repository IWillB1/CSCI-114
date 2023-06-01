import java.util.Scanner ;

/**
 * <h2>Date.java - Stores month, day, and year of a date</h2>
 * <p>Instance variables:
 * <ul>
 *   <li><code>month</code> - the name of the month ("January", "February...")</li>
 *   <li><code>day</code> - the number of the day (1-31)</li>
 *   <li><code>year</code> - the 4-digit year number</li>
 * </ul>
 * <p>Methods:</p>
 * <ul>
 *   <li>No-argument constructor sets this <code>Date</code> to January 1, 1000</li>
 *   <li>Full constructor takes month <i>number</i>, day, and year values</li>
 *   <li>Full constructor takes month <i>name</i>, day, and year values</li>
 *   <li>Constructor that takes only the year</li>
 *   <li>Copy constructor that takes another <code>Date</code> object</li>
 *   <li><code>setDate</code> that takes month <i>number</i>, day, and year values</li>
 *   <li><code>setDate</code> that takes month <i>name</i>, day, and year values</li>
 *   <li><code>setDate</code> that takes another <code>Date</code> object</li>
 *   <li><code>setYear</code> sets the year only</li>
 *   <li><code>setday</code> sets the day only</li>
 *   <li><code>setMonth</code> sets the month name using the month number</li>
 *   <li><code>setMonth</code> sets the month name using the month name</li>
 *   <li><code>getMonth</code> returns the month number</li>
 *   <li><code>getDay</code> returns the day of the month</li>
 *   <li><code>getYear</code> returns the 4-digit year</li>
 *   <li><code>readInput</code> prompts for and stores month, day, and year</li>
 *   <li><code>equals</code> compares this <code>Date</code> to another <code>Date</code></li>
 *   <li><code>toString</code> returns the month name, day, and year</li>
 * </ul>
 * @author Chris Merrill
 * @version Module 13, Homework Project 3
 */

public class Date {

    private String month ; // "January", "February", "March"...
    private int day ;
    private int year ;     //a four digit number.

   /**
    * No-argument constructor that sets the date to 1/1/1000
    */
    public Date( ) {
        month = "January" ;
        day = 1 ;
        year = 1000 ;
    }
   /**
    * Full constructor takes the month number.
    * @param monthInt the month number (1-12)
    * @param day the day of the month (1-31)
    * @param year the 4-digit year
    */
    public Date(int monthInt, int day, int year) {
        setDate(monthInt, day, year) ;
    }
   /**
    * Full constructor takes month name.
    * @param monthString the name of the month ("January", "February"...)
    * @param day the day of the month (1-31)
    * @param year the 4-digit year
    */
    public Date(String monthString, int day, int year) {
        setDate(monthString, day, year) ;
    }

   /**
    * Constructor that takes only the year (uses January 1).
    * @param year the 4-digit year
    */
    public Date(int year) {
        setDate(1, 1, year) ;
    }

   /**
    * Copy constructor.
    * @param aDate another <code>Date object to use as a template to copy.
    */
    public Date(Date aDate) {

        if (aDate == null) { //Not a real date.
             System.out.println("Fatal Error.") ;
             System.exit(0) ;
        }
        month = aDate.month ;
        day = aDate.day ;
        year = aDate.year ;
    }

   /**
    * Full setter that takes the month <i>number</i> (sets all three instance variables)
    * @param monthInt the number of the month (1-12)
    * @param day the day of the month (1-31)
    * @param year the 4-digit year
    */
    public void setDate(int monthInt, int day, int year) {

        if (dateOK(monthInt, day, year)) {
            this.month = monthString(monthInt) ;
            this.day = day ;
            this.year = year ;
        } else {
            System.out.println("Fatal Error") ;
            System.exit(0) ;
        }
    }

   /**
    * Full setter that takes the month <i>name</i>
    * @param monthString the name of the month ("January", "February", ...)
    * @param day the day of the month (1-31)
    * @param year the 4-digit year
    */
    public void setDate(String monthString, int day, int year) {
        if (dateOK(monthString, day, year)) {
            this.month = monthString ;
            this.day = day ;
            this.year = year ;
        } else {
            System.out.println("Fatal Error") ;
            System.exit(0) ;
        }
    }

   /**
    * Full setter that takes only the year (uses January 1).
    * @param year the 4-digit year
    */
    public void setDate(int year) {
        setDate(1, 1, year) ;
    }

   /**
    * Setter for the year
    * @param year the 4-digit year
    */
    public void setYear(int year) {
        if ( (year < 1000) || (year > 9999) ) {
            System.out.println("Fatal Error") ;
            System.exit(0) ;
        }
        this.year = year ;
    }

   /**
    * Setter for the month using the month number
    * @param monthNumber the number of the month (1-12)
    */
    public void setMonth(int monthNumber) {
        if ((monthNumber <= 0) || (monthNumber > 12)) {
            System.out.println("Fatal Error") ;
            System.exit(0) ;
        }
        month = monthString(monthNumber) ;
    }

   /**
    * Setter for the month using the month name
    * @param monthName the name of the month ("January", "February", "March"...)
    */
    public void setMonth(String monthName) {
        if (!monthOK(monthName)) {
             System.out.println("Fatal Error") ;
             System.exit(0) ;
        }
        month = monthName ;
    }

   /**
    * Setter for the day number
    * @param day the day of the month (1-31)
    */
    public void setDay(int day) {
        if ((day <= 0) || (day > 31)) {
            System.out.println("Fatal Error") ;
            System.exit(0) ;
        }
        this.day = day ;
    }

   /**
    * Getter for the month number (1-12)
    * @return the month number (1-12)
    */
    public int getMonth( ) {
        if (month.equals("January"))
            return 1 ;
        else if (month.equals("February"))
            return 2 ;
        else if (month.equals("March"))
            return 3 ;
        else if (month.equalsIgnoreCase("April"))
           return 4 ;
        else if (month.equalsIgnoreCase("May"))
           return 5 ;
        else if (month.equals("June"))
           return 6 ;
        else if (month.equalsIgnoreCase("July"))
           return 7 ;
        else if (month.equalsIgnoreCase("August"))
           return 8 ;
        else if (month.equalsIgnoreCase("September"))
           return 9 ;
        else if (month.equalsIgnoreCase("October"))
           return 10 ;
        else if (month.equals("November"))
            return 11 ;
        else if (month.equals("December"))
            return 12 ;
        else {
            System.out.println("Fatal Error") ;
            System.exit(0) ;
            return 0 ; //Needed to keep the compiler happy
        }
    }

   /**
    * Getter for the day of the month
    * @return the day number (1-31)
    */
    public int getDay( ) {
        return day ;
    }

   /**
    * Getter for the year
    * @return the 4-digit year
    */
    public int getYear( ) {
        return year ;
    }

   /**
    * Returns the month name, day, and year in a <code>String</code> (mmm dd, yyyy)
    * @return the month name, day, and year (mmm dd, yyyy)
    */
    public String toString( ) {
        return (month + " " + day + ", " + year) ;
    }

   /**
    * Returns <code>true</code> if this <code>Date</code> object is the same as another
    * <code>Date</code> object
    * @return <true> if this <code>Date</code> object is the same as another <code>Date</code> object
    */
    public boolean equals(Date otherDate) {
        return ( (month.equals(otherDate.month))
                  && (day == otherDate.day) && (year == otherDate.year) ) ;
    }

   /**
    * Returns <code> if this date precedes another <code>Date</code> object submitted as a parameter.
    */
    public boolean precedes(Date otherDate) {
        return ( (year < otherDate.year) ||
           (year == otherDate.year && getMonth( ) < otherDate.getMonth( )) ||
           (year == otherDate.year && month.equals(otherDate.month)
                                         && day < otherDate.day) ) ;
    }

   /**
    * Reads the date from the user and storesin this object (entered in "mmm dd year" format)
    */
    public void readInput( ) {
        boolean tryAgain = true ;
        Scanner keyboard = new Scanner(System.in) ;
        while (tryAgain) {
            System.out.println("Enter month name, day, and year: ") ;
            String monthInput = keyboard.next( )
                                        .replace(",", "") ;
            int dayInput = Integer.parseInt(keyboard.next( )
                                                    .replace(",", "")) ;
            int yearInput = keyboard.nextInt( ) ;
            if (dateOK(monthInput, dayInput, yearInput) ) {
                setDate(monthInput, dayInput, yearInput) ;
                tryAgain = false ;
            }
            else
                System.out.println("Illegal date. Reenter input.") ;
         }
    }

    private boolean dateOK(int monthInt, int dayInt, int yearInt) {
        return ( (monthInt >= 1) && (monthInt <= 12) &&
                 (dayInt >= 1) && (dayInt <= 31) &&
                 (yearInt >= 1000) && (yearInt <= 9999) ) ;
    }

    private boolean dateOK(String monthString, int dayInt, int yearInt) {
        return ( monthOK(monthString) &&
                 (dayInt >= 1) && (dayInt <= 31) &&
                 (yearInt >= 1000) && (yearInt <= 9999) ) ;
    }

    private boolean monthOK(String month) {
        return (month.equals("January") || month.equals("February") ||
                month.equals("March") || month.equals("April") ||
                month.equals("May") || month.equals("June") ||
                month.equals("July") || month.equals("August") ||
                month.equals("September") || month.equals("October") ||
                month.equals("November") || month.equals("December") ) ;
    }

    private String monthString(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January" ;
            case 2:
                return "February" ;
            case 3:
                return "March" ;
            case 4:
                return "April" ;
            case 5:
                return "May" ;
            case 6:
                return "June" ;
            case 7:
                return "July" ;
            case 8:
                return "August" ;
             case 9:
                return "September" ;
            case 10:
                return "October" ;
            case 11:
                return "November" ;
            case 12:
                return "December" ;
            default:
                System.out.println("Fatal Error") ;
                System.exit(0) ;
                return "Error" ; //to keep the compiler happy
        }
    }
}