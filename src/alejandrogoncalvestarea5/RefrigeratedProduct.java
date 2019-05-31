
package alejandrogoncalvestarea5;

/**
 *
 * @author Alejandro Goncalves
 */
public class RefrigeratedProduct extends Product{
    
    private String foodSupervisionCode, packagingDate, originCountry;
    private int recommendedTemp;

    public RefrigeratedProduct(String foodSupervisionCode, String packagingDate, String originCountry, int recommendedTemp, String expDate, String name, int numLot, int price) {
        super(expDate, name, numLot, price);
        this.foodSupervisionCode = foodSupervisionCode;
        this.packagingDate = packagingDate;
        this.originCountry = originCountry;
        this.recommendedTemp = recommendedTemp;
    }
    
    public String getFoodSupervisionCode() {
        return foodSupervisionCode;
    }

    public void setFoodSupervisionCode(String foodSupervisionCode) {
        this.foodSupervisionCode = foodSupervisionCode;
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
