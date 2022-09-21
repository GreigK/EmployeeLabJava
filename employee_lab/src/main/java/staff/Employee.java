package staff;

public abstract class Employee {
    protected String name;
    protected String NiNumber;
    protected double salary;


    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.NiNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return NiNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name){
        if(name == "") {
            this.name = this.name;
        } else {
            this.name = name;
        }
    }

    public void setNiNumber(String niNumber) {
        this.NiNumber = niNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public  abstract void raiseSalary(double num);

    public abstract void payBonus();

    }


