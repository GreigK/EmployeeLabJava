package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String niNumber, double salary, String deptName) {
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void raiseSalary(double num) {
        this.salary =+ num;
    }

    public void payBonus() {
        this.salary += salary * .01;
    }
}
