package lab_07_01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList();
        FulltimeE etf1 = new FulltimeE();
        FulltimeE etf2 = new FulltimeE();
        FulltimeE etf3 = new FulltimeE();
        etf1.setSalary(50000);
        etf2.setSalary(50000);
        etf3.setSalary(50000);
        PartimeE epf1 = new PartimeE();
        PartimeE epf2 = new PartimeE();
        etf2.setSalary(40000);
        etf2.setSalary(40000);
        employeeList.add(etf1);
        employeeList.add(etf2);
        employeeList.add(etf3);
        employeeList.add(epf1);
        employeeList.add(epf2);

        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary();
        }
        System.out.println("Total salary of Employee" + " " + totalSalary);






    }
}
