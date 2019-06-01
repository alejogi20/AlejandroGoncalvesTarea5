
package alejandrogoncalvestarea5;

import java.util.Scanner;
/**
 *
 * @author Alejandro Goncalves
 */
public class Plant {
    private final Scanner sc = new Scanner(System.in);
    private static final Worker worker = new Worker(15);
    private final Supervisor supervisor = new Supervisor(22);
    private final Manager manager = new Manager(18);
    private static FreshProduct[] freshProductStock = new FreshProduct[10];
    private static ProductFrozenByAir[] frozenByAirProductStock = new ProductFrozenByAir[10];
    private static RefrigeratedProduct[] refrigeratedProductStock = new RefrigeratedProduct[10];
    private static ProductFrozenByNitrogen[] productFrozenByNitrogenStock = new ProductFrozenByNitrogen[10];
    private static ProductFrozenByWater[] productFrozenByWaterStock = new ProductFrozenByWater[10];
    private boolean takeInput = true;
    
    public Plant() {}

    public void menu(){
        
        
        System.out.print("Boss, welcome to the plant!");
                     
        while(this.takeInput){
            System.out.print("\nEnter 1 - To talk to the worker" +
                             "\nEnter 2 - To talk to the Supervisor" +
                             "\nEnter 3 - To talk to the Manager" +
                             "\nEnter 4 - To manufacture a new product" +
                             "\nEnter 5 - To Close and watch the bill" +
                             "\n What would you like to do? : ");

            int option = sc.nextInt();

            switch(option){

                case 1:
                    System.out.println("You are talking to the worker....");
                    this.worker.menu();
                    break;
                case 2:
                   System.out.println("You are talking to the Supervisor....");
                   this.supervisor.menu(); 
                    break;
                case 3:
                    System.out.println("You are talking to the Manager....");
                    this.manager.menu();
                    break;
                case 4:
                    this.manufactureMenu();
                
                case 5:
                    
                    System.out.println("Day ended, goodnight employees! This is Today´s bill");
                    this.showBill();
                    
                default: 
                    System.out.println("Not a valid option, please try again!");
                    break;
            }
        }
    }
    
    public void manufactureMenu(){
        
        while(this.takeInput){
            System.out.print("\nEnter 1 - To manufacture a fresh product" +
                             "\nEnter 2 - To manufacture a frozen product" +
                             "\nEnter 3 - To manufacture a refrigerated product" +
                             "\nEnter 4 - To cancel " +
                             "\nWhat would you like to do? : ");

            int option = sc.nextInt();

            switch(option){

                case 1:
                    if(this.worker.checkFreshProductStock(this.freshProductStock)){
                        String name, packagingDate, originCountry, expDate;
                        int numLot, price;
                        
                        System.out.print("Enter name for the product: ");
                        name = sc.next();
                        System.out.print("Enter the product packaging date: ");
                        packagingDate = sc.next();
                        System.out.print("Enter the origin country: ");
                        originCountry = sc.next();
                        System.out.print("Enter an expiration date: ");
                        expDate = sc.next();
                        System.out.print("Enter Lot Number: ");
                        numLot = sc.nextInt();
                        System.out.print("Enter a price for this product: ");
                        price = sc.nextInt();
                        
                        FreshProduct freshProduct = new FreshProduct(name, packagingDate, originCountry, expDate, numLot, price);
                        
                        this.worker.addFreshProductToStock(freshProduct, this.freshProductStock);
                        System.out.println("Fresh Product added to the stock Succesfully!");
                    }
                    
                    break;
                case 2:
                   System.out.print("\nEnter 1 - To manufacture a Product frozen by air" +
                                    "\nEnter 2 - To manufacture a Product frozen by Nitrogen" +
                                    "\nEnter 3 - To manufacture a Product frozen by Water" +
                                    "\nEnter 4 - To cancel " +
                                    "\nWhat would you like to do? : ");
                    
                    break;
                case 3:
                    if(this.worker.checkRefrigeratedProductStock(this.refrigeratedProductStock)){
                        String foodSupervisionCode, packagingDate, originCountry, expDate, name;
                        int recommendedTemp, numLot, price;
                        
                        System.out.print("Enter name for the product: ");
                        name = sc.next();
                        System.out.print("Enter the product packaging date: ");
                        packagingDate = sc.next();
                        System.out.print("Enter the origin country: ");
                        originCountry = sc.next();
                        System.out.print("Enter an expiration date: ");
                        expDate = sc.next();
                        System.out.print("Enter Lot Number: ");
                        numLot = sc.nextInt();
                        System.out.print("Enter a price for this product: ");
                        price = sc.nextInt();
                        System.out.print("Enter The Food Supervision Code: ");
                        foodSupervisionCode = sc.next();
                        System.out.print("Enter the recommended temperature: ");
                        recommendedTemp = sc.nextInt();
                       
                        RefrigeratedProduct refrigeratedProduct = new RefrigeratedProduct(foodSupervisionCode, packagingDate, originCountry, recommendedTemp, expDate, name, numLot, price);
                      
                        this.worker.addRefrigeratedProductToStock(refrigeratedProduct, this.refrigeratedProductStock);
                        System.out.println("Refrigerated Product added to the stock Succesfully!");
                    }
                    
                    break;
                case 4:
                    
                    this.takeInput = false;
                default: 
                    System.out.println("Not a valid option, please try again!");
                    break;
            }
        }
    }
    
    public void FrozenProductMenu(){
       
        boolean aux = true;
        
        while(aux){
            System.out.print("\nEnter 1 - To manufacture a Product frozen by air" +
                             "\nEnter 2 - To manufacture a Product frozen by Nitrogen" +
                             "\nEnter 3 - To manufacture a Product frozen by Water" +
                             "\nEnter 4 - To cancel " +
                             "\nWhat would you like to do? : ");
            
            int option = sc.nextInt();

            switch(option){

                case 1:
                    if(this.worker.checkFrozenAirProductStock(this.frozenByAirProductStock)){
                        int percentNitrogen, percentOxigen, percentCarbonDioxide, percentWaterSteam, recommendedTemp, numLot, price;
                        String packagingDate, originCountry, expDate, name; 
                         
                        
                        System.out.print("Enter name for the product: ");
                        name = sc.next();
                        System.out.print("Enter the product packaging date: ");
                        packagingDate = sc.next();
                        System.out.print("Enter the origin country: ");
                        originCountry = sc.next();
                        System.out.print("Enter an expiration date: ");
                        expDate = sc.next();
                        System.out.print("Enter Lot Number: ");
                        numLot = sc.nextInt();
                        System.out.print("Enter a price for this product: ");
                        price = sc.nextInt();
                        System.out.print("Enter the recommended temperature: ");
                        recommendedTemp = sc.nextInt();
                        System.out.print("Enter the frozing air composition.");
                        System.out.print("% of Oxigen: ");
                        percentOxigen = sc.nextInt();
                        System.out.print("% of Nitrogen: ");
                        percentNitrogen = sc.nextInt();
                        System.out.print("% of Water Steam: ");
                        percentWaterSteam = sc.nextInt();
                        System.out.print("% of Carbon Dioxide: ");
                        percentCarbonDioxide = sc.nextInt();

                        ProductFrozenByAir productFrozenByAir = new ProductFrozenByAir(percentNitrogen, percentOxigen, percentCarbonDioxide, percentWaterSteam, packagingDate, originCountry, recommendedTemp, expDate, name, numLot, price);
                      
                        this.worker.addFrozenAirProductToStock(productFrozenByAir, this.frozenByAirProductStock);
                        System.out.println("Frozen by air Product added to the stock Succesfully!");
                    }
                    
                    break;
                    
                case 2:
                   if(this.worker.checkFrozenNitrogenProductStock(this.productFrozenByNitrogenStock)){
                        int  NitrogenExposition, recommendedTemp, numLot, price;
                        String packagingDate, originCountry, expDate, name, FrozingMethod; 
                         
                        
                        System.out.print("Enter name for the product: ");
                        name = sc.next();
                        System.out.print("Enter the product packaging date: ");
                        packagingDate = sc.next();
                        System.out.print("Enter the origin country: ");
                        originCountry = sc.next();
                        System.out.print("Enter an expiration date: ");
                        expDate = sc.next();
                        System.out.print("Enter Lot Number: ");
                        numLot = sc.nextInt();
                        System.out.print("Enter a price for this product: ");
                        price = sc.nextInt();
                        System.out.print("Enter the storage recommended temperature storage: ");
                        recommendedTemp = sc.nextInt();
                        System.out.print("Frozing Method used: ");
                        FrozingMethod = sc.next();
                        System.out.print("Enter the time, in minutes, that this product it´s been exposed to nitrogen: ");
                        NitrogenExposition = sc.nextInt();

                        ProductFrozenByNitrogen productFrozenByAir = new ProductFrozenByNitrogen(FrozingMethod, NitrogenExposition, packagingDate, originCountry, recommendedTemp, expDate, name, numLot, price);
                      
                        this.worker.addFrozenNitroProductToStock(productFrozenByAir, this.productFrozenByNitrogenStock);
                        System.out.println("Frozen by nitrogen Product added to the stock Succesfully!");
                    }
                    break;
                case 3:
                    if(this.worker.checkFrozenWaterProductStock(productFrozenByWaterStock)){
                        int salinity, recommendedTemp, numLot, price;
                        String packagingDate, originCountry, expDate, name; 
                         
                        
                        System.out.print("Enter name for the product: ");
                        name = sc.next();
                        System.out.print("Enter the product packaging date: ");
                        packagingDate = sc.next();
                        System.out.print("Enter the origin country: ");
                        originCountry = sc.next();
                        System.out.print("Enter an expiration date: ");
                        expDate = sc.next();
                        System.out.print("Enter Lot Number: ");
                        numLot = sc.nextInt();
                        System.out.print("Enter a price for this product: ");
                        price = sc.nextInt();
                        System.out.print("Enter the recommended storage temperature: ");
                        recommendedTemp = sc.nextInt();
                        System.out.print("Enter the salinity of the frozing water (in grams salt/ 1 water litre): ");
                        salinity = sc.nextInt();
                        
                        ProductFrozenByWater productFrozenByWater = new ProductFrozenByWater(salinity, packagingDate, originCountry, recommendedTemp, expDate, name, numLot, price);
                      
                        this.worker.addFrozenWaterProductToStock(productFrozenByWater, this.productFrozenByWaterStock);
                        System.out.println("Frozen by water Product added to the stock Succesfully!");
                    }
                    
                    break;
                case 4:
                    aux = false;
                default: 
                    System.out.println("Not a valid option, please try again!");
                    break;
            }
        }
    }

    public static FreshProduct[] getFreshProductStock() {
        return freshProductStock;
    }

    public static void setFreshProductStock(FreshProduct[] freshProductStock) {
        Plant.freshProductStock = freshProductStock;
    }

    public static ProductFrozenByAir[] getFrozenByAirProductStock() {
        return frozenByAirProductStock;
    }

    public static void setFrozenByAirProductStock(ProductFrozenByAir[] frozenByAirProductStock) {
        Plant.frozenByAirProductStock = frozenByAirProductStock;
    }

    public static RefrigeratedProduct[] getRefrigeratedProductStock() {
        return refrigeratedProductStock;
    }

    public static void setRefrigeratedProductStock(RefrigeratedProduct[] refrigeratedProductStock) {
        Plant.refrigeratedProductStock = refrigeratedProductStock;
    }

    public static ProductFrozenByNitrogen[] getProductFrozenByNitrogenStock() {
        return productFrozenByNitrogenStock;
    }

    public static void setProductFrozenByNitrogenStock(ProductFrozenByNitrogen[] productFrozenByNitrogenStock) {
        Plant.productFrozenByNitrogenStock = productFrozenByNitrogenStock;
    }

    public static ProductFrozenByWater[] getProductFrozenByWaterStock() {
        return productFrozenByWaterStock;
    }

    public static void setProductFrozenByWaterStock(ProductFrozenByWater[] productFrozenByWaterStock) {
        Plant.productFrozenByWaterStock = productFrozenByWaterStock;
    }

    public static Worker getWorker() {
        return worker;
    }

    public boolean isTakeInput() {
        return takeInput;
    }

    public void setTakeInput(boolean takeInput) {
        this.takeInput = takeInput;
    }

    public Scanner getSc() {
        return sc;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public Manager getManager() {
        return manager;
    }
    
    
}
