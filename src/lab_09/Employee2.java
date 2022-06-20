package lab_09;
/*
Create a class Employee with a method salary to return employee’s salar
There are 2 types of employee: Full time employee and contract employee
Full time employee has salary is 50000 and contract employee has salary 40000
Write a method to accept a list of Employee and calculate total salary
For example, company has 3 FTE and 2 contractor
Using abstract method
 */
public abstract class  Employee2 {
    public  Employee2() {

    }
    public int salary;
    public String typeE;


    public void setSalary(int salary) {

        this.salary = salary;
    }
    public Employee2(String typeE) {
        this.typeE = typeE;
    }

    abstract int getSalary();
}
