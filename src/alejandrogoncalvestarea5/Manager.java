
package alejandrogoncalvestarea5;

/**
 *
 * @author Alejandro Goncalves
 */
public class Manager extends Employee{
    
    private boolean profitable;

    public Manager(int salary) {
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
}
