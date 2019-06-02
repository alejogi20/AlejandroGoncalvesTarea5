
package alejandrogoncalvestarea5;

import java.util.Scanner;

/**
 *
 * @author Alejandro Goncalves
 */
public class Manager extends Employee{
    
    
    private boolean takeInput = true;
    private final Scanner sc = new Scanner(System.in);
    
    public Manager(int salary) {
        super(salary);
    }
    
    public void menu(){
        System.out.println("Hello boss! This is what I can do for you:");
        
        while(this.takeInput){
            System.out.print("\nEnter 1 - To know if today´s activity is profitable so far" +
                             "\nEnter 2 - to know my salary" +
                             "\nEnter 3 - To go back and talk to another employee"+
                             "\nWhat do you want me to do? : ");
                        
            int option = sc.nextInt();

            switch(option){
                case 1:
                    
                    int totalSalaries =  Plant.getWorker().getSalary() + Plant.getManager().getSalary() + Plant.getSupervisor().getSalary();
                    
                    if(Plant.getTotalOfDay() <= totalSalaries) System.out.println("The bussiness is not profitable! sell more products...");
                    else System.out.println("Congratulations, bussiness is profitable!");
                    
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
}
