
package alejandrogoncalvestarea5;

/**
 *
 * @author Alejandro Goncalves
 */
public class FreshProduct extends Product{
    
    private String packagingDate, originCountry; 

    public FreshProduct(String packagingDate, String originCountry, String expDate, String name, int numLot, int price) {
        super(expDate, name, numLot, price);
        this.packagingDate = packagingDate;
        this.originCountry = originCountry;
    }
    
    public String getPackagingDate() {
        return packagingDate;
    }

    public void setPackagingDate(String packagingDate) {
        this.packagingDate = packagingDate;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }
    
    
    
}
