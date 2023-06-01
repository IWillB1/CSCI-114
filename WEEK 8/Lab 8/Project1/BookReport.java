/**
 * <h2>BookReport.java - Representing some of our favorite literary masterpieces</h2>
 *
 * @author Will Bouasisavath
 * @version Module 8, Lab Project 1
 */

public class BookReport 
{

    private static final String FORMAT_STRING = "%-30s  %-20s  %,7d\n";

    public static void main(String[] args) 
    {
        Book[] array = new Book[5];
        int totalPages = 0;

        Book bookOne = new Book("Lord of the Rings", "J.R.R Tolkien", 1178);
        Book bookTwo = new Book("Ender's Game", "Orson Scott Card", 324);
        Book bookThree = new Book("Odyssey", "Homer", 442);
        Book bookFour = new Book("The Last Samurai", "Helen DeWitt", 530);
        Book bookFive = new Book("A Song of Ice and Fire", "George R.R. Martin", 694);

        array = new Book[] {bookOne, bookTwo, bookThree, bookFour, bookFive};

        System.out.println("          Book Title                   Author          Pages");

        System.out.println("______________________________  ____________________  _______");

        for (Book book : array)
        {

            System.out.printf(FORMAT_STRING, book.getTitle(), book.getAuthor(), book.getPages());
            totalPages += book.getPages();

        }
        System.out.printf("%61s\n", "======");
        System.out.printf("%42s %18d", "Total", totalPages);

     }
}
