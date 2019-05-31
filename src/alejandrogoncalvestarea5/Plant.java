
package alejandrogoncalvestarea5;

import java.util.Scanner;
/**
 *
 * @author Alejandro Goncalves
 */
public class Plant {
    private final Scanner sc = new Scanner(System.in);
    private final Worker worker = new Worker(15);
    
    public Plant() {
    }
    
    
    
    
    public void menu(){
        
        boolean correctInput = false;
        System.out.print("Boss, welcome to the plant!");
                     
        while(correctInput == false){
            System.out.print("\nEnter 1 - To talk to the worker" +
                               "\nEnter 2 - To talk to the Supervisor" +
                               "\nEnter 3 - To talk to the administrator" +
                               "\n Who would you like to talk to? : ");

            int option = sc.nextInt();

            switch(option){

                case 1:
                    correctInput = true;
                    System.out.println("You are talking to the worker....");
                    this.worker.menu();
                    break;
                case 2:
                    correctInput = true;
                    
                    break;
                case 3:
                    correctInput = true;
                    
                    break;
                default: 
                    System.out.println("Not a valid option, please try again!");
                    break;
            }
        }
    }
}
