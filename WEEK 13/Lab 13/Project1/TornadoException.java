/**
 * <h2>TornadoException.java - An exception that occurs when a tornado appears</h2>
 * 
 * <h3>Problem Statement:</h3>
 * <p>Design a class that notifies the user of a tornado approaching </p>
 *
 * <h3>Algorithm:</h3>
 * <p>In main:</p>
 * <ol>
 *     <li>Create an exception class named <b>TornadoException</b> 
 *     <li>Create two constructors which allow <code><b>getMessage</b></code> to retrieve the message
 *     <li>The second constructor, which takes a single parameter, <>b>m</b>, of type <b>int</b>
 *     <li>If the exception is thrown using this constructor, then <b>getMessage</b> should retrieve message
 * </ol>
 *
 * @author Will Bouasisavath
 * @version Module 13 Lab Project 1
 */

public class TornadoException extends Exception
{
    public TornadoException() {
        super("Tornado! Please take cover!");
    }

    public TornadoException(int m){
        super("Tornado is " + m + " miles away and headed this way!");
    }
}