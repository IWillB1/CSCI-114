import java.util.Objects;
/**
 *
 * <h2>Stock.java - Represents a stock in the Stock Market</h2>
 *
 * <h3>Instance variables:</h3>
 * <ul>
 *     <li><b>String</b> name - The name of the stock
 *     <li><b>String</b> symbol - The stock's market symbol
 *     <li><b>double</b> price - The price per unit of this stock
 * </ul>
 *
 * @author Will Bouasisavath
 * @version Module 12 Lab
 */

public class Stock 
{

    private String name;
    private String symbol;
    private double price;

    /**
     * Constructor that creates a new <b>Stock</b> and sets each instance variable
     * @param name The name for this stock
     * @param symbol This <b>Stock</b>'s market symbol
     * @param price The price per individual unit of this stock, in dollars
     */
    public Stock(String name, String symbol, double price) {
        this.name = name;
        this.symbol = symbol;
        this.price = price;
    }

    /**
     * Get the name of this <b>Stock</b>
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * Updates this <b>Stock</b>'s name to the given value</b>
     * @param name The new name for this <b>Stock</b></b>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get this <b>Stock</b>'s market symbol
     * @return The market symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Setter for <code>symbol</code>
     * @param symbol sets <code>symbol</code>
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Getter for <code>price</code>
     * @return <code>price</code>
     */
    public double getPrice() {
        return price;
    }

    /**
     * Setter for <code>price</code>
     * @param price sets <code>this.price</code>
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Equals method compares to objects
     * @param o is an <b>Object</b>
     * @return <b>true</b> if the objects are equal, otherwise return <b>false</b>
     */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Stock stock = (Stock) o;
        return Double.compare(stock.price, price) == 0 &&
                Objects.equals(name, stock.name) &&
                Objects.equals(symbol, stock.symbol);
    }

    /**
     * Classic toString method
     * @return s a <b>String</b> with useful information
     */
    public String toString() {
        return "Stock name: " + name + ", Symbol: " + symbol + ", Price: " + price;
    }
}