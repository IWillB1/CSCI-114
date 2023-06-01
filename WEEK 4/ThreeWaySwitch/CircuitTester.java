
/**
 * CircuitTester.java - will utilize the objects from ThreeWaySwitch class
 * Author: Will Bouasisavath
 * Module: 4
 * Project: Homework Project1
 * Problem statement: Create a Java class which describes a 3-way light switch. Each object of this class will have two switches (up or down), then calculate the state of the light they control (on or off).
 * 
 * Algorithm:  
 *      1.Create four ThreeWaySwitch objects, each with different combo of starting switch patterns
 *      2.Sequentially test the 4 combos (up/down, down/up, up/up, down/down) for each of the objects, printing the results each time something is toggled. 
 * 
 */
public class CircuitTester
{

    public static void main(String[] args) 
    {

        //creating four objects 
        ThreeWaySwitch one = new ThreeWaySwitch(0, 0);
        ThreeWaySwitch two = new ThreeWaySwitch(1, 0);
        ThreeWaySwitch three = new ThreeWaySwitch(0, 1);
        ThreeWaySwitch four = new ThreeWaySwitch(1, 1);

        //testing all four combos for each of the objects 0 = off, 1 = on
        System.out.print("First Case/Object\n");
        System.out.printf("When both of the switches are down, the light is %d\n", one.getLightState());
            one.toggleFirstSwitch();
        System.out.printf("When this switch is down but that switch is up, the light is %d\n", one.getLightState());
            one.toggleSecondSwitch();
        System.out.printf("When both of the switches are up, the light is %d\n", one.getLightState());
            one.toggleFirstSwitch();
        System.out.printf("When that switch is down and this switch is up, the light is %d\n", one.getLightState());

        System.out.print("\nSecond Case/Object\n");
        System.out.printf("When that switch is down and this switch is up, the light is %d\n", two.getLightState());
            two.toggleSecondSwitch();
        System.out.printf("When both of the switches are up, the light is %d\n", two.getLightState());
            two.toggleFirstSwitch();
        System.out.printf("When this switch is down but that switch is up, the light is %d\n", two.getLightState());
            two.toggleSecondSwitch();
        System.out.printf("When both of the switches are down, the light is %d\n", two.getLightState());

        System.out.print("\nThird Case/Object\n");
        System.out.printf("When this switch is down but that switch is up, the light is %d\n", three.getLightState());
            three.toggleFirstSwitch();
        System.out.printf("When both of the switches are up, the light is %d\n", three.getLightState());
            three.toggleSecondSwitch();
        System.out.printf("When that switch is down and this switch is up, the light is %d\n", three.getLightState());
            three.toggleSecondSwitch();
        System.out.printf("When both of the switches are down, the light is %d\n", three.getLightState());

        System.out.print("\nFourth Case/Object\n");
        System.out.printf("When both of the switches are up, the light is %d\n", four.getLightState());
            four.toggleFirstSwitch();
        System.out.printf("When this switch is down but that switch is up, the light is %d\n", four.getLightState());
            four.toggleSecondSwitch();
        System.out.printf("When both of the switches are down, the light is %d\n", four.getLightState());
            four.toggleFirstSwitch();
        System.out.printf("When that switch is down and this switch is up, the light is %d\n", four.getLightState());

    }
}