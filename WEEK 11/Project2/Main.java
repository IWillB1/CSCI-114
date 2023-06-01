/**
 * <h2>Main.java - Describe two vehicles, one an object of a Vehicle class, and the other a Truck (child of Vehicle)</h2>
 *
 * <h3>Problem Statement:</h3>
 * <p>Include a main method that invokes the methods of <code>Vehicle</code>, <code>Truck</code>, and <code>Truck</code> in your class.</p>
 *
 * <h3>Algorithm:</h3>
 * <p>In main:</p>
 * <ol>
 *     <li>Create two <code>Person</code>s, names of student and professor
 *     <li>Create a <code>Vehicle</code> with <code>professor</code> as the <code>Person</code> parameter
 *     <li>Create a <code>Truck</code> with <code>student</code> as the <code>Person</code> parameter
 *     <li>Display getters for both the <code>Truck</code> and <code>Vehicle</code>
 *     <li>Display the <code>equals</code> method results when comparing the two cars
 * </ol>
 *
 * @author Will Bouasisavath
 * @version Module 11, Homework Project 2
 */

public class Main 
{
    public static void main(String[] args) 
    {

        Person professor = new Person("Chris Merrill");
        Person student = new Person("Will Bouasisavath");

        Vehicle profCar = new Vehicle("Tesla", 0, professor);
        Truck studentCar = new Truck("Toyota", 6, student, 69.95, 4414);

        System.out.print("\nGet Owner Name for profCar:  ");
        System.out.println(profCar.getOwnerName());

        System.out.print("Get Manufacturer name for profCar:  ");
        System.out.println(profCar.getManufacturerName());

        System.out.print("Get Engine Cylinders for profCar:  ");
        System.out.println(profCar.getEngineCylinders());

        System.out.print("toString for profCar:  ");
        System.out.println(profCar.toString());

        System.out.print("\nGet Owner Name for studentCar:  ");
        System.out.println(studentCar.getOwnerName());

        System.out.print("Get Manufacturer name for studentCar:  ");
        System.out.println(studentCar.getManufacturerName());

        System.out.print("Get Engine Cylinders or studentCar:  ");
        System.out.println(studentCar.getEngineCylinders());

        System.out.print("Get Load Capacity for studentCar:  ");
        System.out.println(studentCar.getLoadCapacity());

        System.out.print("Get Tow Capacity for studentCar:  ");
        System.out.println(studentCar.getTowCapacity());

        System.out.print("toString for studentCar:  ");
        System.out.println(studentCar.toString());

        System.out.println("\nstudentCar equals profCar?   " + profCar.equals(studentCar));

    }
}
