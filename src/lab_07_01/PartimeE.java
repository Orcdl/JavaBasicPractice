package lab_07_01;

public class PartimeE extends Employee{
    String typeE = "Partime";

    public int salary = 40000;

    @Override
    public int getSalary() {
        return salary;
    }
}
