/**
 * <h2>ConversionTester.java - Create and compare <code>Temperature</code> objects</h2>
 *
 * <h3>Problem Statement:</h3>
 * <p> Write a program that creates ten <code>Temperature</code> objects and utilizes the <code>equals</code> method to compare them two by two</p>
 *
 * <h3>Algorithm:</h3>
 * <ul>
 *   <li>Create a constant <b>char</b> named <code>DEGREE</code> set equal to the <b>char</b> equivalent of the degree symbol (\u00b0)
 * </ul>
 *
 * <p>In main:</p>
 * <ol>
 *
 *     <li> Instantiate ten <code>Temperature</code> objects with the following values: 0 C, 32 F, 100 C, 212 F, 50 C, 75 F, 69 C, 95 F
 *     <li> Display five statements (sequentially by pairs) comparing the newly created <code>Temperature</code> objects using the <code>equals</code> method
 *
 * </ol>
 *
 * @author Will Bouasisavath
 * @version Module 7 Homework Project 3
 *
 */

public class ConversionTester 
{

    public static char DEGREE = '\u00b0' ; // degree symbol

    public static void main(String[] args) 
    {

        Temperature freezeCelsius = new Temperature() ;
        Temperature freezeFahrenheit = new Temperature(32, 'F') ;

        Temperature boilCelsius = new Temperature(100) ;
        Temperature boilFahrenheit = new Temperature(212, 'F') ;

        Temperature fiftyCelsius = new Temperature(50) ;
        Temperature fiftyFahrenheit = new Temperature(50, 'F') ;

        Temperature minusFortyCelsius = new Temperature(-40.0) ;
        Temperature minusFortyFahrenheit = new Temperature(-40.0, 'F') ;

        Temperature sixtyNineCelsius = new Temperature(69);
        Temperature ninetyFiveFahrenheit = new Temperature(95, 'F');

        System.out.println("To say that " + freezeCelsius + " and " + freezeFahrenheit + " are equal is " + freezeCelsius.equals(freezeFahrenheit));
        System.out.println("To say that " + boilCelsius + " and " + boilFahrenheit + " are equal is " + boilCelsius.equals(boilFahrenheit));
        System.out.println("To say that " + fiftyCelsius + " and " + fiftyFahrenheit + " are equal is " + fiftyCelsius.equals(fiftyFahrenheit));
        System.out.println("To say that " + minusFortyCelsius + " and " + minusFortyFahrenheit + " are equal is " + minusFortyCelsius.equals(minusFortyFahrenheit));
        System.out.println("To say that " + sixtyNineCelsius + " and " + ninetyFiveFahrenheit + " are equal is " + sixtyNineCelsius.equals(ninetyFiveFahrenheit));

    } // end of main
} // end of ConversionTester class