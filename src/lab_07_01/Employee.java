package lab_07_01;

public class Employee {
    public Employee() {
    }

    public int salary;
    private String typeE;


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String typeE) {
        this.typeE = typeE;
    }
}