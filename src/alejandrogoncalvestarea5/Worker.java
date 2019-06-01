
package alejandrogoncalvestarea5;

import java.util.Scanner;

/**
 *
 * @author Alejandro Goncalves
 */
public class Worker extends Employee{
 
    private final Scanner sc = new Scanner(System.in);
    private boolean takeInput = false;
    
    public Worker(int salary) {
        super(salary);
    }
    
    public void menu(){
        System.out.println("Hello boss! This is what I can do for you:");
        
        while(this.takeInput){
            System.out.print("\nEnter 1 - To know information about a product" +
                             "\nEnter 2 - to know my salary" +
                             "\nEnter 3 - To go back and talk to another employee"+
                             "\nWhat do you want me to do? : ");
                        
            int option = sc.nextInt();

            switch(option){
                case 1:
                 
                    String product;
                    System.out.print("Please enter the name of the product you want to know about:");
                    product = sc.next();
                    
                    
                    this.bringProductByName(product);
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
    
    public void addFreshProductToStock(FreshProduct freshProduct, FreshProduct[] freshProductStock){
        
        for(int i = 0; i < freshProductStock.length; i++){
            if(freshProductStock[i] == null){
                freshProductStock[i] = freshProduct;
                break;
            }
        } 
    }
    
    public boolean checkRefrigeratedProductStock(RefrigeratedProduct[] refrigeratedProductStock){
        
        int freeSpaces = 0;
        
        for (RefrigeratedProduct refrigeratedProduct1 : refrigeratedProductStock) {
            if (refrigeratedProductStock == null) freeSpaces++;
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
                refrigeratedProductStock[i] = refrigeratedProduct;
                break;
            }
        } 
    }

    public boolean checkFrozenAirProductStock(ProductFrozenByAir[] frozenByAirProductStock) {
        int freeSpaces = 0;
        
        for (ProductFrozenByAir frozenByAirProduct1 : frozenByAirProductStock) {
            if (frozenByAirProductStock == null) freeSpaces++;
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
            if (frozenByWaterProductStock == null) freeSpaces++;
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
            if (frozenByNitrogenProductStock == null) freeSpaces++;
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
    
    public void bringProductByName(String productName){
        
        int productFound = 0;
        FreshProduct freshProduct;
        RefrigeratedProduct refriProduct;
        ProductFrozenByNitrogen nitroProduct;
        ProductFrozenByAir  airProduct;     
        ProductFrozenByWater waterProduct;
        
        
            
        for (FreshProduct freshProductAux : Plant.getFreshProductStock()) {
            if (freshProductAux != null) {
                if (freshProductAux.getName().equals(productName)) {
                    productFound = 1;
                    freshProduct = freshProductAux;
                    break;
                }
            }
        }
        
        if(productFound == 0){  
            
            for (RefrigeratedProduct refriProductAux: Plant.getRefrigeratedProductStock()) {
                if (refriProductAux != null) {
                    if (refriProductAux.getName().equals(productName)) {
                        productFound = 2;
                        refriProduct = refriProductAux;
                        break;
                    }
                }
            }  
            
        }else if(productFound == 0){   
            
            
            for (ProductFrozenByNitrogen nitroProductAux : Plant.getProductFrozenByNitrogenStock()) {
                if (nitroProductAux != null) {
                    if (nitroProductAux.getName().equals(productName)) {
                        productFound = 3;
                        nitroProduct = nitroProductAux;
                        break;
                    }
                }
            }  
            
        }else if(productFound == 0){   
              
            
            for (ProductFrozenByAir airProductAux : Plant.getFrozenByAirProductStock()) {
                if (airProductAux != null) {
                    if (airProductAux.getName().equals(productName)) {
                        productFound = 4;
                        airProduct = airProductAux;
                        break;
                    }
                }
            } 
            
        }else if(productFound == 0){  
            
            for (ProductFrozenByWater waterProductAux : Plant.getProductFrozenByWaterStock()) {
                if (waterProductAux != null) {
                    if (waterProductAux.getName().equals(productName)) {
                        productFound = 5;
                        waterProduct = waterProductAux;
                        break;
                    }
                }
            } 
        }
        
        switch        
        
    }
    
    
}
