package management;

import staff.Employee;

public class Director extends Employee {

    private double budget;

    public Director(String name, String niNumber, double salary, double budget) {
        super(name, niNumber, salary);
        this.budget = budget;
    }
    public void raiseSalary(double num) {
        this.salary += num;
    }

    public void payBonus() {
        this.salary =+ salary * 0.2;
    }

    public double getBudget() {
        return budget;
    }
}
