
package alejandrogoncalvestarea5;

/**
 *
 * @author Alejandro Goncalves
 */
public abstract class Product {
    
    protected String expDate, name; //expiration date
    protected int numLot, price;     // lot number

    public Product(String expDate, String name, int numLot, int price) {
        this.expDate = expDate;
        this.name = name;
        this.numLot = numLot;
        this.price = price;
    }
    
    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public int getNumLot() {
        return numLot;
    }

    public void setNumLot(int numLot) {
        this.numLot = numLot;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
