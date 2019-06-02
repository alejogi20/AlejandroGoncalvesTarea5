/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alejandrogoncalvestarea5;

import java.util.Scanner;

/**
 *
 * @author Alejandro Goncalves
 */
public class Supervisor extends Employee{
    
    private boolean takeInput = true;
    private Scanner sc = new Scanner(System.in);

    public Supervisor(int salary) {
        super(salary);
    }
    
    public void menu(){
        System.out.println("Hello boss! This is what I can do for you:");
        
        while(this.takeInput){
            System.out.print("Enter 1 - To sell a product" +
                             "\nEnter 2 - to know my salary" +
                             "\nEnter 3 - To go back and talk to another employee"+
                             "\nWhat do you want me to do? : ");
                        
            int option = sc.nextInt();

            switch(option){
                case 1:
                    this.sellProduct();
                    this.takeInput = true;
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
    
    public void sellProduct(){
        
        
        while(this.takeInput){
            
            int total = 0;
            int counter = 0;
            int quantity;
            
            System.out.print("Enter 1 - To sell fresh products" +
                             "\nEnter 2 - to sell refrigerated products " +
                             "\nEnter 3 - To sell frozen with air product "+
                             "\nEnter 4 - To sell frozen with Nitrogen product "+
                             "\nEnter 5 - To sell frozen with water product "+
                             "\nEnter 6 - To cancel "+
                             "\nWhat do you want me to do? : ");
                        
            int option = sc.nextInt();

            switch(option){
                case 1:
                    System.out.println("How many products will you sell? : ");
                     quantity = sc.nextInt();
                    
                    if(quantity <= 10){
                        
                        for (FreshProduct freshProductStock : Plant.getFreshProductStock()) {
                            
                            if (freshProductStock != null) counter++;
                             
                        }
                        
                        if(counter >= quantity){
                            
                            for(int i = 0; i < counter; i++){
                                
                               if(Plant.getFreshProductStock()[i] != null){
                                   
                                   System.out.println("You selled " + Plant.getFreshProductStock()[i].getName() + 
                                                      " by " + Plant.getFreshProductStock()[i].getPrice() + "$");
                                   
                                   total += Plant.getFreshProductStock()[i].getPrice();
                                   Plant.getFreshProductStock()[i] = null;
                               }
                               
                            }
                            
                            System.out.println("Total is: " + total);
                        
                            Plant.setTotalOfDay(Plant.getTotalOfDay() + total);
                            
                        }else System.out.println("There are less products than that");
                        
                    }else System.out.println("This is more than our capacity can take(10 products max)");
                    
                    break;
                case 2:
                    System.out.println("How many products will you sell? : ");
                     quantity = sc.nextInt();
                     total = 0;
                     counter = 0; 
                    
                    if(quantity <= 10){
                        
                        for (RefrigeratedProduct RefrigeratedProduct : Plant.getRefrigeratedProductStock()) {
                            
                            if (RefrigeratedProduct  != null) counter++;
                             
                        }
                        
                        if(counter >= quantity){
                            
                            for(int i = 0; i < counter; i++){
                                
                               if(Plant.getRefrigeratedProductStock()[i] != null){
                                   
                                   System.out.println("You selled " + Plant.getRefrigeratedProductStock()[i].getName() + 
                                                      " by " + Plant.getRefrigeratedProductStock()[i].getPrice() + "$");
                                   
                                   total += Plant.getRefrigeratedProductStock()[i].getPrice();
                                   Plant.getRefrigeratedProductStock()[i] = null;
                               }
                               
                            }
                            
                            System.out.println("Total is: " + total);
                        
                            Plant.setTotalOfDay(Plant.getTotalOfDay() + total);
                            
                        }else System.out.println("There are less products than that");
                        
                    }else System.out.println("This is more than our capacity can take(10 products max)");
                    
                    
                    break;
                case 3:
                    System.out.println("How many products will you sell? : ");
                     quantity = sc.nextInt();
                     total = 0;
                     counter = 0; 
                    
                    if(quantity <= 10){
                        
                        for (ProductFrozenByAir productFrozenByAir : Plant.getFrozenByAirProductStock()) {
                            
                            if (productFrozenByAir  != null) counter++;
                             
                        }
                        
                        if(counter >= quantity){
                            
                            for(int i = 0; i < counter; i++){
                                
                               if(Plant.getFrozenByAirProductStock()[i] != null){
                                   
                                   System.out.println("You selled " + Plant.getFrozenByAirProductStock()[i].getName() + 
                                                      " by " + Plant.getFrozenByAirProductStock()[i].getPrice() + "$");
                                   
                                   total += Plant.getFrozenByAirProductStock()[i].getPrice();
                                   Plant.getFrozenByAirProductStock()[i] = null;
                               }
                               
                            }
                            
                            System.out.println("Total is: " + total);
                        
                            Plant.setTotalOfDay(Plant.getTotalOfDay() + total);
                            
                        }else System.out.println("There are less products than that");
                        
                    }else System.out.println("This is more than our capacity can take(10 products max)");
                    
                    
                    break;
                case 4:
                    
                    System.out.println("How many products will you sell? : ");
                     quantity = sc.nextInt();
                     total = 0;
                     counter = 0; 
                    
                    if(quantity <= 10){
                        
                        for (ProductFrozenByWater productFrozenByWater : Plant.getProductFrozenByWaterStock()) {
                            
                            if (productFrozenByWater  != null) counter++;
                             
                        }
                        
                        if(counter >= quantity){
                            
                            for(int i = 0; i < counter; i++){
                                
                               if(Plant.getProductFrozenByWaterStock()[i] != null){
                                   
                                   System.out.println("You selled " + Plant.getProductFrozenByWaterStock()[i].getName() + 
                                                      " by " + Plant.getProductFrozenByWaterStock()[i].getPrice() + "$");
                                   
                                   total += Plant.getProductFrozenByWaterStock()[i].getPrice();
                                   Plant.getProductFrozenByWaterStock()[i] = null;
                               }
                               
                            }
                            
                            System.out.println("Total is: " + total);
                        
                            Plant.setTotalOfDay(Plant.getTotalOfDay() + total);
                            
                        }else System.out.println("There are less products than that");
                        
                    }else System.out.println("This is more than our capacity can take(10 products max)");
                    
                    
                    break;
                
                case 5:
                    System.out.println("How many products will you sell? : ");
                     quantity = sc.nextInt();
                     total = 0;
                     counter = 0; 
                    
                    if(quantity <= 10){
                        
                        for (ProductFrozenByNitrogen productFrozenByNitro : Plant.getProductFrozenByNitrogenStock()) {
                            
                            if (productFrozenByNitro  != null) counter++;
                             
                        }
                        
                        if(counter >= quantity){
                            
                            for(int i = 0; i < counter; i++){
                                
                               if(Plant.getProductFrozenByNitrogenStock()[i] != null){
                                   
                                   System.out.println("You selled " + Plant.getProductFrozenByNitrogenStock()[i].getName() + 
                                                      " by " + Plant.getProductFrozenByNitrogenStock()[i].getPrice() + "$");
                                   
                                   total += Plant.getProductFrozenByNitrogenStock()[i].getPrice();
                                   Plant.getProductFrozenByNitrogenStock()[i] = null;
                               }
                               
                            }
                            
                            System.out.println("Total is: " + total);
                        
                            Plant.setTotalOfDay(Plant.getTotalOfDay() + total);
                            
                        }else System.out.println("There are less products than that");
                        
                    }else System.out.println("This is more than our capacity can take(10 products max)");
                    
                    break;
                
                case 6:
                    
                    this.takeInput = false;
                default:
                    
                    System.out.println("Excuse me, Sir? I don´t know what you mean, try again.");
                    break;
            }
        }
    }
}
