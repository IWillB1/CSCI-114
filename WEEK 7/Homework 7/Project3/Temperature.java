/**
 * <h2>Temperature.java - Contains methods that will be utilized in ConversionTester.java class </h2>
 *
 * <h3>Instance variables:</h3>
 * <ul>
 *     <li> <code>degrees</code> (<b>double</b>) - number of degrees in this temperature
 *     <li> <code>scale</code> (<b>char</b>) - 'C' = Celsius, 'F' = Fahrenheit
 * </ul>
 *
 * @author Will Bouasisavath
 * @version Module 7 Homework Project 3
 *
 */

public class Temperature 
{

    private double degrees = 0 ;         // number of degrees in this temperature
    private char scale ;                 // 'C'=Celsius, 'F'=Fahrenheit

    /**
     * Constructor w/o a parameter sets <code>degrees</code> to 0 and <code>scale</code> to 'C'
     */
    public Temperature() 
    {
        this(0.0, 'C') ;
    }

    /**
     * Constructor with one parameter
     * @param degrees is used to set <code>this.degrees</code> to, and <code>scale</code> is set to 'C' again
     */
    public Temperature(double degrees) 
    {
        this(degrees, 'C') ;
    }

    /**
     * Constructor with one parameter
     * @param scale is used to set <code>scale</code> to either 'C' or 'F', and <code>degrees</code> is set to 0
     */
    public Temperature(char scale) 
    {
        this(0.0, scale) ;
    }

    /**
     * Constructor with two parameters
     * @param degrees is used to set <code>this.degrees</code> to
     * @param scale is used to set <code>this.scale</code> to
     */
    public Temperature(double degrees, char scale) 
    {
        setDegrees(degrees) ;
        setScale(scale) ;
    }

    /**
     * Setter for <code>degrees</code> variable
     * @param degrees is used to set <code>this.degrees</code> to
     */
    public void setDegrees(double degrees) 
    {
        this.degrees = degrees ;
    }

    /**
     * Getter for the <code>degrees</code> variable
     * @return degrees (double)
     */
    public double getDegrees() 
    {
        return degrees ;
    }

    /**
     * Setter for <code>scale</code> variable
     * @param scale is used to set <code>this.scale</code> to
     */
    public void setScale(char scale) 
    {
        this.scale = scale ;
    }

    /**
     * Getter for <code>scale</code> variable
     * @return scale (double)
     */
    public char getScale() 
    {
        return scale ;
    }

    /**
     * Setter for <code>degrees</code> and <code>scale</code>
     * @param degrees will be utilized in a <code>setDegrees()</code> method
     * @param scale will be utilized in a <code>setScale()</code> method
     */
    public void setTemperatureAndScale(double degrees, char scale) 
    {
        setDegrees(degrees) ;
        setScale(scale) ;
    }

    /**
     * Method that returns a fahrenheit value of the temperature
     * @return <code>degrees</code> if <code>scale</code> is already 'F'. Otherwise, return <code>Math.Round</code> to round to 2 decimal places with <code>degrees</code> as the 'C' in the formula F = 9/5 C + 32 for all other cases
     */
    public double getFahrenheit() 
    {
        if (scale == 'f' || scale == 'F') 
        {
            return degrees ;
        }
        return Math.round((degrees * (9.0 / 5.0) + 32.0) * 100.0) / 100.0 ;   // round to 2 decimals
    }

    /**
     * Method that returns a celsius value of the temperature
     * @return <code>degrees</code> if <code>scale</code> is already 'C', otherwise return the <code>Math.Round</code> to round to 2 decimal places with <code>degrees</code> as the 'F' in the formula C = 9/5 ( F - 32 )
     */
    public double getCelsius() 
    {
        if (scale == 'c' || scale == 'C') 
        {
            return degrees ;
        }
        return Math.round((degrees - 32.0) * (5.0 / 9.0) * 100.0) / 100.0 ;   // round to 2 decimals
    }

    /**
     *
     * @param another is another <code>Temperature</code> object
     * @return true if both of the celsius values are equal, otherwise return false
     */
    public boolean equals(Temperature another) 
    {
        if (another.getCelsius() == getCelsius()) 
        {
            return true;
        }
        else 
        {
            return false;
        }

    }

    /**
     * A method that returns a string with a Temperature object's relevant data presented in proper format
     *
     * @return a String that displays the <code>degree</code> value rounded to one decimal place, along with a degree symbol, and the <code>scale</code> value ('C' or 'F')
     */
    public String toString() 
    {
        return String.format("%.1f\u00b0%c", degrees, scale) ;
    }

} // end of Temperature class