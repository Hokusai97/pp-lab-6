import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Worker 1", 1000, 1, "2020-01-01", "worker under 2");
        Worker worker2 = new Worker("Worker 2", 2000, 2, "2019-03-15", "worker under 3");
        Worker worker3 = new Worker("Worker 3", 3000, 2, "2021-07-22", "worker under 4"); 
        Manager manager1 = new Manager("Manager 1", 20000, 3, "2017-02-10", "boss");

        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager1.getName() + " has code: " + manager1.hashCode());

        System.out.println("worker2.equals(Worker1): " + worker2.equals(worker1));
        System.out.println("worker2.equals(Worker2): " + worker2.equals(worker2));
        System.out.println("worker2.equals(Worker3): " + worker2.equals(worker3));
        System.out.println("worker2.equals(Manager1): " + worker2.equals(manager1));
    }
}
