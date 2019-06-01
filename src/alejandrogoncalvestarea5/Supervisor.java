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
    
    private boolean takeInput;
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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Excuse me, Sir? I don´t know what you mean, try again.");
                    break;
            }
        }
    }
    
    public void sellProduct(){
        
        
    }
}
