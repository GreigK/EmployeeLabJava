package techStuff;

import staff.Employee;

public class Developer extends Employee {

    public Developer(String name, String niNumber, double salary) {
        super(name, niNumber, salary);
    }

    public void raiseSalary(double num) {
        this.salary += num;
    }

    public void payBonus() {
        this.salary += salary * .01;
    }
}
