import java.util.*;

public class Main {
    public static void main(String[] args) {
        EmployeeData worker1 = new EmployeeData("Worker1", 1000, 1, "2024-05-17", "Worker under worker 2");
        EmployeeData worker2 = new EmployeeData("Worker2", 2000, 2, "2023-05-17", "Worker under worker 3");
        EmployeeData worker3 = new EmployeeData("Worker3", 3000, 3, "2022-05-17", "Worker under worker 4");
        EmployeeData worker4 = new EmployeeData("Worker4", 4000, 4, "2021-05-17", "Worker under Manager");
        EmployeeData worker5 = new EmployeeData("Worker5", 5000, 2, "2021-05-17", "Worker under Manager");
        EmployeeData manager1 = new EmployeeData("Manager1", 20000, 5, "2020-05-17", "Boss");
        EmployeeData manager2 = new EmployeeData("Manager2", 25000, 6, "2019-05-17", "boss");
        EmployeeData manager3 = new EmployeeData("Manager3", 30000, 3, "2018-05-17", "boss");

        List<EmployeeData> employees = Arrays.asList(worker1, worker2, worker3, worker4, worker5, manager1, manager2, manager3);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        for (EmployeeData employee : employees) {
            totalSalary += employee.salary;

            if (employee.position.equals("Manager")) {
                totalManagerSalary += employee.salary;
            } else if (employee.position.equals("Worker")) {
                totalWorkerSalary += employee.salary;
            }
        }

        System.out.println("Całkowita suma salary wszystkich pracowników: " + totalSalary);
        System.out.println("Całkowita suma salary wszystkich workerów: " + totalManagerSalary);
        System.out.println("Całkowita suma salary wszystkich managerów: " + totalWorkerSalary);

        Map<Integer, List<EmployeeData>> employeesById = new HashMap<>();
        for (EmployeeData employee : employees) {
            if (!employeesById.containsKey(employee.id)) {
                employeesById.put(employee.id, new ArrayList<>());
            }
            employeesById.get(employee.id).add(employee);
        }

        for (List<EmployeeData> employeesWithSameId : employeesById.values()) {
            if (employeesWithSameId.size() > 1) {
                System.out.println("Pracownicy o tym samym identyfikatorze:");
                for (EmployeeData employee : employeesWithSameId) {
                    System.out.println("- " + employee.name);
                }
            }
        }
    }

    static class EmployeeData {
        String name;
        double salary;
        int id;
        String hireDate;
        String position;

        public EmployeeData(String name, double salary, int id, String hireDate, String position) {
            this.name = name;
            this.salary = salary;
            this.id = id;
            this.hireDate = hireDate;
            this.position = position.contains("Manager") ? "Manager" : "Worker";
        }
    }
}
