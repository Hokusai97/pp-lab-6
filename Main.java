import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[] {
                new Worker("Worker 1", 1000, 1, "2024-05-17", "worker under 2"),
                new Worker("Worker 2", 2000, 2, "2023-05-17", "worker under 3"),
                new Worker("Worker 3", 3000, 3, "2022-05-17", "worker under 4"),
                new Worker("Worker 4", 4000, 4, "2021-05-17", "worker under manager"),
                new Manager("Manager 1", 20000, 5, "2020-05-17", "boss")
        };

        ArrayList<Employee> employees = new ArrayList<>();

        for (Employee employee : employeesArray) {
            employees.add(employee);
        }

        for (Employee employee : employees) {
            employee.work();
            String employeeMessage = String.format("- %s (ID: %d, Position: %s, Hire date: %s, Salary: %.2f)",
                    employee.getName(),
                    employee.getId(),
                    employee.getPosition(),
                    employee.getHireDate(),
                    employee.getSalary());
            System.out.println(employeeMessage);
        }
    }
}
