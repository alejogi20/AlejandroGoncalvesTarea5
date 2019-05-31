
package alejandrogoncalvestarea5;

/**
 *
 * @author Alejandro Goncalves
 */
public abstract class FrozenProduct extends Product{
    
    protected String  packagingDate, originCountry;
    protected int recommendedTemp;

    public FrozenProduct(String packagingDate, String originCountry, int recommendedTemp, String expDate, String name, int numLot, int price) {
        super(expDate, name, numLot, price);
        this.packagingDate = packagingDate;
        this.originCountry = originCountry;
        this.recommendedTemp = recommendedTemp;
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

    public int getRecommendedTemp() {
        return recommendedTemp;
    }

    public void setRecommendedTemp(int recommendedTemp) {
        this.recommendedTemp = recommendedTemp;
    }
    
    
}
