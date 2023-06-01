import javax.management.monitor.StringMonitor;
import java.io.*;
import java.util.Scanner;

/**
 * <h2>Manipulate a text file containing information about company stocks (company name, stock symbol, and stock price)</h2>
 *
 * @author Will Bouasisavath
 * @version Module 12 Lab
 */

public class StockMarket 
{
    public static void main(String[] args) throws Exception {

        Stock[] stocks = new Stock[100];

        readStocksWithScanner("stocks1.txt", stocks);

        updateStockPrices(2 / 3.0, stocks);

        writeStocks("stocks2.txt", stocks);

        stocks = new Stock[100];

        readStocksWithBufferedReader("stocks2.txt", stocks);

        // multiplier is 3/2 because 2/3 * 3/2 == 1   :)
        updateStockPrices(3 / 2.0, stocks);

    }

    /**
     * Reads <b>Stock</b>s from the input file into the specified array
     *
     * @param fileName        The name of the input text file
     * @param arrayToPopulate A reference to the array to populate
     * @throws Exception This method can throw an exception
     */
    private static void readStocksWithScanner(String fileName, Stock[] arrayToPopulate) throws Exception {

        FileInputStream inputFile = new FileInputStream(fileName);

        Scanner scanner = new Scanner(inputFile);

        for (int i = 0; scanner.hasNextLine(); i++) {
            // Create an empty stock to store input values in
            Stock inputStock = new Stock("", "", 0);

            // Get the stock name and symbol
            scanner.useDelimiter(",");
            inputStock.setName(scanner.next());
            inputStock.setSymbol(scanner.next());

            // Get the stock price
            scanner.useDelimiter("[,\\s]");
            inputStock.setPrice(scanner.nextDouble());

            if (scanner.hasNextLine())
                scanner.nextLine();

            // Populate the next array element with the inputted stock
            arrayToPopulate[i] = inputStock;
            System.out.println(inputStock);

        }

        //out.close();
        scanner.close();
    }

    /**
     * Method to update each <b>Stock</b> price in an array
     *
     * @param multiplier    will be used to determine what to multiply each of the current stock prices by
     * @param arrayToUpdate will be used to read through the array
     */
    private static void updateStockPrices(double multiplier, Stock[] arrayToUpdate) {
        for (int i = 0; i < arrayToUpdate.length; i++) {

            if (arrayToUpdate[i] != null) {

                arrayToUpdate[i].setPrice((Math.round((arrayToUpdate[i].getPrice() * 100 * multiplier)) / 100.0));

            }
        }
    }

    /**
     * Method to write <b>Stocks</b> from a given <b>Array</b> to a new file
     *
     * @param targetFile - Target file location
     * @param stockArray -  The array of <b>Stocks</b>
     * @throws Exception - Throws exception if needed
     */
    private static void writeStocks(String targetFile, Stock[] stockArray) throws Exception {
        PrintWriter writer = new PrintWriter(targetFile);

        for (var stock : stockArray) {
            if (stock == null)
                continue;
            writer.printf("%s,%s,%.2f\n", stock.getName(), stock.getSymbol(), stock.getPrice());
        }

        writer.close();
    }

    /**
     * Reading stocks with buffered reader for many ec points
     *
     * @param fileName - File name to write to
     * @param arrayToPopulate - The array that the method will read from
     * @throws Exception - Throws exception if needed
     */
    private static void readStocksWithBufferedReader(String fileName, Stock[] arrayToPopulate) throws Exception {


        FileReader file = new FileReader(fileName);
        BufferedReader scanner = new BufferedReader(file);

        int i = 0;

        for (String inputLine = scanner.readLine(); inputLine != null; inputLine = scanner.readLine())
        {
            String name = "";
            String symbol = "";
            double price;

            int firstCommaIndex = inputLine.indexOf(',');
            int secondCommaIndex = inputLine.lastIndexOf(',');

            name = inputLine.substring(0, firstCommaIndex);

            symbol = inputLine.substring(firstCommaIndex + 1, secondCommaIndex);
            price = Double.parseDouble(inputLine.substring(secondCommaIndex + 1));

            Stock inputStock = new Stock(name, symbol, price);

            arrayToPopulate[i] = inputStock;

            System.out.println(arrayToPopulate[i]);

            i++;
        }

        scanner.close();
        file.close();
    }
}