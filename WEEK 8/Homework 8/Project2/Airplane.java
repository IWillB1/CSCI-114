import java.util.Scanner;

/**
 * <h2>Airplane.java - Write a program to assign passenger's seats in a small airplane.</h2>
 *
 * @author Will Bouasisavath
 * @version Module 8, Homework Project 2
 */

public class Airplane 
{

    private static final int MAXIMUM_SEATS = 7 * 4 ;
    private static final int SENTINEL = -1 ;

    public static void main(String[] args) 
    {
        // rows for seating
        char[][] airplaneSeats = new char[7][4] ;

        int numberOfSeatsFilled = 0 ;

        for (int i = 0; i < airplaneSeats.length; i++)
        {
            airplaneSeats[i] = new char[]{'A', 'B', 'C', 'D'} ;
            displaySeating(airplaneSeats) ;
        }

        while (numberOfSeatsFilled < MAXIMUM_SEATS)
        {
            if (getInput(airplaneSeats)) 
            {
                displaySeating(airplaneSeats) ;
                numberOfSeatsFilled++ ;
                System.out.println("\nThere are " + (MAXIMUM_SEATS - numberOfSeatsFilled) + " seats left.") ;
            }
            else 
                break ;
        }
    }

    private static boolean getInput(char[][] airplaneSeats)
    {
        // if we get a valid input, returns true
        // if we get sentinel, returns false
        Scanner in = new Scanner(System.in) ;
        System.out.print("Please enter the row (or " + SENTINEL + " to quit):  ") ;

        int inputRow = in.nextInt() ;
        if (inputRow == SENTINEL) 
        {
            return false;
        }

        while ((inputRow < 1 || inputRow > 7) || isRowFull(airplaneSeats, inputRow)) 
        {
            if (inputRow == SENTINEL)
            {
                return false ;
            }

            // displays which row 1-7
            System.out.print("That is not a valid row. Please enter a row number between 1 and 7: ") ;
            inputRow = in.nextInt() ;
        }

        inputRow--;

        // displays columns
        System.out.print("Please enter the column letter ( or " + SENTINEL + " to quit):  ") ;
        char inputColumn = in.next().toUpperCase().charAt(0) ;

        if (inputColumn == '-')
        {
            return false;
        }

        while ((inputColumn < 'A' || inputColumn > 'D') || isSeatTaken(airplaneSeats, inputRow, inputColumn))
        {

            if (inputColumn == '-')
            {
                return false ;
            }

            if (inputColumn < 'A' || inputColumn > 'D')
            {
                System.out.print("That is not a valid seat. Please enter a new column letter: ") ;
            }
            else if (isSeatTaken(airplaneSeats, inputRow, inputColumn)) 
            {
                System.out.print("Unfortunately, this seat is taken. Please enter another column letter: ") ;
            }
            else 
            {
                System.out.print("That is not a valid seat letter. Please enter a seat between A and D: ") ;
            }

            inputColumn = in.next().toUpperCase().charAt(0) ;

        }

        assignSeat(airplaneSeats, inputRow, inputColumn) ;
        return true;

    }

    private static boolean isRowFull(char[][] airplaneSeats, int rowNumber) 
    {

        rowNumber-- ;

        for (char seat : airplaneSeats[rowNumber]) 
        {
            if (seat != 'X') 
            {

                return false ;

            }
        }

        // user input for seat is full
        System.out.print("The row you entered is full. ") ;
        return true;

    }

    private static void assignSeat(char[][] airplaneSeats, int row, char column) 
    {
        // displays the seat is take
        airplaneSeats[row][seatColumnAsNumber(column)] = 'X' ;

    }

    private static boolean isSeatTaken(char[][] airplaneSeats, int row, char column) 
    {
        // tells the user that the seat is taken or not
        return (airplaneSeats[row][seatColumnAsNumber(column)] == 'X') ;

    }

    private static int seatColumnAsNumber(char column)
    {
        // seat column and number
        switch(column)
        {
            case 'A' : return 0 ;
            case 'B' : return 1 ;
            case 'C' : return 2 ;
            case 'D' : return 3 ;
            default : return -1 ;
        }
    }

    private static void displaySeating(char[][] airplaneSeats)
    {
        // input user for row seating
        System.out.println("Row") ;

        for (int i = 0; i < airplaneSeats.length; i++)
        {

            System.out.print((i + 1) + "  ") ;

            for (int j = 0; j < airplaneSeats[i].length; j++)
            {

                System.out.print(airplaneSeats[i][j] + " ") ;

            }

            System.out.println() ;
        }
    }
}
