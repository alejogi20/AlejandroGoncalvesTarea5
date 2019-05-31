/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alejandrogoncalvestarea5;

/**
 *
 * @author Alejandro Goncalves
 */
public class ProductFrozenByAir extends FrozenProduct{
    
    private int percentNitrogen, percentOxigen, percentCarbonDioxide, percentWaterSteam; // Frozing Air composition; 

    public ProductFrozenByAir(int percentNitrogen, int percentOxigen, int percentCarbonDioxide, int percentWaterSteam, String packagingDate, String originCountry, int recommendedTemp, String expDate, String name, int numLot, int price) {
        super(packagingDate, originCountry, recommendedTemp, expDate, name, numLot, price);
        this.percentNitrogen = percentNitrogen;
        this.percentOxigen = percentOxigen;
        this.percentCarbonDioxide = percentCarbonDioxide;
        this.percentWaterSteam = percentWaterSteam;
    }

    public int getPercentNitrogen() {
        return percentNitrogen;
    }

    public void setPercentNitrogen(int percentNitrogen) {
        this.percentNitrogen = percentNitrogen;
    }

    public int getPercentOxigen() {
        return percentOxigen;
    }

    public void setPercentOxigen(int percentOxigen) {
        this.percentOxigen = percentOxigen;
    }

    public int getPercentCarbonDiox() {
        return percentCarbonDioxide;
    }

    public void setPercentCarbonDiox(int percentCarbonDiox) {
        this.percentCarbonDioxide = percentCarbonDiox;
    }

    public int getPercentWaterSteam() {
        return percentWaterSteam;
    }

    public void setPercentWaterSteam(int percentWaterSteam) {
        this.percentWaterSteam = percentWaterSteam;
    }
    
    
    
}
