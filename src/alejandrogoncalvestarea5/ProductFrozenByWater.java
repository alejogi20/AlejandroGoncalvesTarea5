
package alejandrogoncalvestarea5;

/**
 *
 * @author Alejandro Goncalves
 */
public class ProductFrozenByWater extends FrozenProduct{
    
    private int salinity; // concentration of salt, in Salt grams/Water litre

    public ProductFrozenByWater(int salinity, String packagingDate, String originCountry, int recommendedTemp, String expDate, String name, int numLot, int price) {
        super(packagingDate, originCountry, recommendedTemp, expDate, name, numLot, price);
        this.salinity = salinity;
    }

    public int getSalinity() {
        return salinity;
    }

    public void setSalinity(int salinity) {
        this.salinity = salinity;
    }
    
    
}
