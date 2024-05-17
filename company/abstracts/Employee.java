package company.abstracts;

import company.interfaces.Employable;

public abstract class Employee implements Employable {
    private String name;
    private double salary;
    private int id;
    private String hireDate; // Dodano pole hireDate
    private String position; // Dodano pole position

    public Employee(String name, double salary, int id, String hireDate, String position) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.hireDate = hireDate; // Inicjalizacja hireDate
        this.position = position; // Inicjalizacja position
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public String getHireDate() { // Dodano metodę getHireDate
        return this.hireDate;
    }

    public String getPosition() { // Dodano metodę getPosition
        return this.position;
    }

    @Override
    public int hashCode() { // Dodano metodę hashCode
        return this.id;
    }

    public abstract void work();
}
