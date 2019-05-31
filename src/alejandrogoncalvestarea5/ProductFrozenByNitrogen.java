
package alejandrogoncalvestarea5;

/**
 *
 * @author Alejandro Goncalves
 */
public class ProductFrozenByNitrogen extends FrozenProduct{
    
    private String FrozingMethod;
    private int NitrogenExposition; //time that the product has been exposed to nitrogen, in seconds 

    public ProductFrozenByNitrogen(String FrozingMethod, int NitrogenExposition, String packagingDate, String originCountry, int recommendedTemp, String expDate, String name, int numLot, int price) {
        super(packagingDate, originCountry, recommendedTemp, expDate, name, numLot, price);
        this.FrozingMethod = FrozingMethod;
        this.NitrogenExposition = NitrogenExposition;
    }

    public String getFrozingMethod() {
        return FrozingMethod;
    }

    public void setFrozingMethod(String FrozingMethod) {
        this.FrozingMethod = FrozingMethod;
    }

    public int getNitrogenExposition() {
        return NitrogenExposition;
    }

    public void setNitrogenExposition(int NitrogenExposition) {
        this.NitrogenExposition = NitrogenExposition;
    }
    
    
}
