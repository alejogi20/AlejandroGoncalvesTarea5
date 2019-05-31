
package alejandrogoncalvestarea5;

/**
 *
 * @author Alejandro Goncalves
 */
public abstract class Employee {
    
    protected int salary; // daily payout in USD $

    public Employee(int salary) {
        this.salary = salary;
    }
    
    public void work(){};
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
}
