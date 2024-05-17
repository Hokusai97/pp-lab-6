import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new Worker("Worker 1", 1000, 1),
                new Worker("Worker 2", 4000, 2),
                new Worker("Worker 3", 2000, 3),
                new Worker("Worker 4", 3000, 4), 
                new Manager("Manager 1", 20000, 5)
        };

        for (Employee employee : employees) {
            System.out.println("Employee: " + employee.getName() + " getting: " + employee.getSalary());
            employee.work();
        }
    }
}
