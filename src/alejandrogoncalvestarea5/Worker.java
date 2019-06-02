
package alejandrogoncalvestarea5;

import java.util.Scanner;

/**
 *
 * @author Alejandro Goncalves
 */
public class Worker extends Employee{
 
    private final Scanner sc = new Scanner(System.in);
    private boolean takeInput;
    
    public Worker(int salary) {
        super(salary);
    }
    
    public void menu(){
        System.out.println("Hello boss! This is what I can do for you:");
        
        takeInput = true;
        
        while(this.takeInput){
            System.out.print("\nEnter 1 - To know information about the products on stock" +
                             "\nEnter 2 - to know my salary" +
                             "\nEnter 3 - To go back and talk to another employee"+
                             "\nWhat do you want me to do? : ");
                        
            int option = sc.nextInt();

            switch(option){
                case 1:
              
                    this.showProductInfo();
                    
                    break;
                case 2:
                    
                    System.out.println("My salary is " + this.salary + "$ daily");
                    
                    break;
                case 3:
                    
                    this.takeInput = false;
                    
                    break;
                default:
                    
                    System.out.println("Excuse me, Sir? I don´t know what you mean, try again.");
                    break;
            }
        }
    }
    
    public boolean checkFreshProductStock(FreshProduct[] freshProductStock){
        
        int freeSpaces = 0;
        
        for (FreshProduct freshProductStock1 : freshProductStock) {
            if (freshProductStock1 == null) freeSpaces++;
        }
        
        if(freeSpaces == 0){
            System.out.println("Your worker says: Boss, our Fresh Products stock is full.");
            return false;
        }else{
            System.out.println("Your worker says: There is enough space for " + freeSpaces + " more fresh products.");
            return true;
        }
    }
    
    public void addFreshProductToStock(FreshProduct freshProduct){
        
        for(int i = 0; i < Plant.getFreshProductStock().length; i++){
            if(Plant.getFreshProductStock()[i] == null){
                Plant.getFreshProductStock()[i] = freshProduct;
                break;
            }
        } 
    }
    
    public boolean checkRefrigeratedProductStock(RefrigeratedProduct[] refrigeratedProductStock){
        
        int freeSpaces = 0;
        
        for (RefrigeratedProduct refrigeratedProduct1 : refrigeratedProductStock) {
            if (refrigeratedProduct1 == null) freeSpaces++;
        }
        
        if(freeSpaces == 0){
            System.out.println("Your worker says: Boss, our refrigerated Product Stock is full.");
            return false;
        }else{
            System.out.println("Your worker says: There is enough space for " + freeSpaces + " more refrigerated Products.");
            return true;
        }
    }
    
    public void addRefrigeratedProductToStock(RefrigeratedProduct refrigeratedProduct, RefrigeratedProduct[] refrigeratedProductStock){
        
        for(int i = 0; i < refrigeratedProductStock.length; i++){
            if(refrigeratedProductStock[i] == null){
                Plant.getRefrigeratedProductStock()[i] = refrigeratedProduct;
                break;
            }
        } 
    }

    public boolean checkFrozenAirProductStock(ProductFrozenByAir[] frozenByAirProductStock) {
        int freeSpaces = 0;
        
        for (ProductFrozenByAir frozenByAirProduct1 : frozenByAirProductStock) {
            if (frozenByAirProduct1 == null) freeSpaces++;
        }
        
        if(freeSpaces == 0){
            System.out.println("Your worker says: Boss, our refrigerated Product Stock is full.");
            return false;
        }else{
            System.out.println("Your worker says: There is enough space for " + freeSpaces + " more frozen By Air Products.");
            return true;
        }
    }
    
    public void addFrozenAirProductToStock(ProductFrozenByAir frozenByAirProduct, ProductFrozenByAir[] frozenByAirProductStock){
        
        for(int i = 0; i < frozenByAirProductStock.length; i++){
            if(frozenByAirProductStock[i] == null){
                frozenByAirProductStock[i] = frozenByAirProduct;
                break;
            }
        } 
    }
    
    public boolean checkFrozenWaterProductStock(ProductFrozenByWater[] frozenByWaterProductStock) {
        int freeSpaces = 0;
        
        for (ProductFrozenByWater frozenByWaterProduct1 : frozenByWaterProductStock) {
            if (frozenByWaterProduct1 == null) freeSpaces++;
        }
        
        if(freeSpaces == 0){
            System.out.println("Your worker says: Boss, our refrigerated Product Stock is full.");
            return false;
        }else{
            System.out.println("Your worker says: There are enough space for " + freeSpaces + " frozen By water Products.");
            return true;
        }
    }
    
    public void addFrozenWaterProductToStock(ProductFrozenByWater frozenByWaterProduct, ProductFrozenByWater[] frozenByWaterProductStock){
        
        for(int i = 0; i < frozenByWaterProductStock.length; i++){
            if(frozenByWaterProductStock[i] == null){
                frozenByWaterProductStock[i] = frozenByWaterProduct;
                break;
            }
        } 
    }
    
    public boolean checkFrozenNitrogenProductStock(ProductFrozenByNitrogen[] frozenByNitrogenProductStock) {
        int freeSpaces = 0;
        
        for (ProductFrozenByNitrogen frozenByNitrogenProduct1 : frozenByNitrogenProductStock) {
            if (frozenByNitrogenProduct1 == null) freeSpaces++;
        }
        
        if(freeSpaces == 0){
            System.out.println("Your worker says: Boss, our refrigerated Product Stock is full.");
            return false;
        }else{
            System.out.println("Your worker says: There is enough space for " + freeSpaces + " frozen by nitrogen Products.");
            return true;
        }
    }
    
    public void addFrozenNitroProductToStock(ProductFrozenByNitrogen frozenByNitroProduct, ProductFrozenByNitrogen[] frozenByNitroProductStock){
        
        for(int i = 0; i < frozenByNitroProductStock.length; i++){
            if(frozenByNitroProductStock[i] == null){
                frozenByNitroProductStock[i] = frozenByNitroProduct;
                break;
            }
        } 
    }
    
    public void showProductInfo(){
        
        for (FreshProduct freshProductAux : Plant.getFreshProductStock()) {
            if (freshProductAux != null) {
                System.out.println("=================================================================");
                System.out.println("Name: " + freshProductAux.getName());
                System.out.println("expiration date/Best Before: " + freshProductAux.getExpDate());
                System.out.println("Origin Country: " + freshProductAux.getOriginCountry());
                System.out.println("Packaging date: " + freshProductAux.getPackagingDate());
                System.out.println("Numero de lote" + freshProductAux.getNumLot());
                System.out.println("Price: " + freshProductAux.getPrice() + "$");
                System.out.println("=================================================================");
                
            }
        }
          
       
        
        for (RefrigeratedProduct refriProductAux: Plant.getRefrigeratedProductStock()){
            
                if (refriProductAux != null){
                    System.out.println("=================================================================");
                    System.out.println("Name: " + refriProductAux.getName());
                    System.out.println("expiration date/Best Before: " + refriProductAux.getExpDate());
                    System.out.println("Origin Country: " + refriProductAux.getOriginCountry());
                    System.out.println("Packaging date: " + refriProductAux.getPackagingDate());
                    System.out.println("Lot number: " + refriProductAux.getNumLot());
                    System.out.println("Price: " + refriProductAux.getPrice() + "$");
                    System.out.println("Recommended storage temperature: " +refriProductAux.getRecommendedTemp() + " celsius");
                    System.out.println("Registered under: " + refriProductAux.getFoodSupervisionCode());
                   System.out.println("=================================================================");
                }
            }      
        
        
             
        for (ProductFrozenByNitrogen nitroProductAux : Plant.getProductFrozenByNitrogenStock()) {
            
                if (nitroProductAux != null) {
                    
                    System.out.println("=================================================================");
                    System.out.println("Name: " + nitroProductAux.getName());
                    System.out.println("expiration date/Best Before: " + nitroProductAux.getExpDate());
                    System.out.println("Origin Country: " + nitroProductAux.getOriginCountry());
                    System.out.println("Packaging date: " + nitroProductAux.getPackagingDate());
                    System.out.println("Lot number: " + nitroProductAux.getNumLot());
                    System.out.println("Price: " + nitroProductAux.getPrice() + "$");
                    System.out.println("Recommended storage temperature: " + nitroProductAux.getRecommendedTemp() + " celsius");
                    System.out.println("Refrigeration method: " + nitroProductAux.getFrozingMethod());
                    System.out.println("Exposition time to nitrogen: " + nitroProductAux.getNitrogenExposition() + " minutes");
                    System.out.println("=================================================================");
                }
            }      
              
        for (ProductFrozenByAir airProductAux : Plant.getFrozenByAirProductStock()) {
            
            if (airProductAux != null) {
                    
                System.out.println("=================================================================");
                System.out.println("Name: " + airProductAux.getName());
                System.out.println("expiration date/Best Before: " + airProductAux.getExpDate());
                System.out.println("Origin Country: " + airProductAux.getOriginCountry());
                System.out.println("Packaging date: " + airProductAux.getPackagingDate());
                System.out.println("Lot number: " + airProductAux.getNumLot());
                System.out.println("Price: " + airProductAux.getPrice() + "$");
                System.out.println("Recommended storage temperature: " + airProductAux.getRecommendedTemp() + " celsius");
                System.out.println("Frozing Air composition: ");
                System.out.println("%" + airProductAux.getPercentCarbonDiox() + "Carbon dioxide");
                System.out.println("%" + airProductAux.getPercentNitrogen() + "Nitrogen");
                System.out.println("%" + airProductAux.getPercentOxigen() + "Oxigen");
                System.out.println("%" + airProductAux.getPercentWaterSteam() + "Water Steam");
               System.out.println("=================================================================");
            }
        }     
       
            
        for (ProductFrozenByWater waterProductAux : Plant.getProductFrozenByWaterStock()) {
                if (waterProductAux != null) {
                    System.out.println("=================================================================");
                    System.out.println("Name: " + waterProductAux.getName());
                    System.out.println("expiration date/Best Before: " + waterProductAux.getExpDate());
                    System.out.println("Origin Country: " + waterProductAux.getOriginCountry());
                    System.out.println("Packaging date: " + waterProductAux.getPackagingDate());
                    System.out.println("Lot number: " + waterProductAux.getNumLot());
                    System.out.println("Price: " + waterProductAux.getPrice() + "$");
                    System.out.println("Recommended storage temperature: " + waterProductAux.getRecommendedTemp() + " celsius");
                    System.out.println("Salinity of the frozing water: " + waterProductAux.getSalinity() + " grams of salt/ water litre");
                   System.out.println("=================================================================");
                }
        }     
                           
    }            
        
}
    
    

