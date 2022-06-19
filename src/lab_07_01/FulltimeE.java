package lab_07_01;

public class FulltimeE extends Employee{
    String typeE = "Fulltime";

    public int salary = 50000;

    @Override
    public int getSalary() {
        return salary;
    }
}

