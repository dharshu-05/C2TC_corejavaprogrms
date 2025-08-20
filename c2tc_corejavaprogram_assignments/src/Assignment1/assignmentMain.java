package Assignment1;

import com.dharshini.assignment.employee.Manager;
import com.dharshini.assignment.employee.Developer;
import com.dharshini.assignment.utilities.EmployeeUtilities;

public class assignmentMain {
    public static void main(String[] args) {
        // Create objects
        Manager manager = new Manager("Alice", 101, 80000, "HR");
        Developer developer = new Developer("Bob", 102, 60000, "Java");

        // Create utility helper
        EmployeeUtilities util = new EmployeeUtilities();

        System.out.println("Manager Details:");
        util.printEmployeeDetails(manager);

        System.out.println("\nDeveloper Details:");
        util.printEmployeeDetails(developer);

        // Increase salaries
        util.increaseSalary(manager, 5000);
        util.increaseSalary(developer, 4000);
    }
}
