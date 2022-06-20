package lab_09;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee2> employeeList2 = new ArrayList();
        FullE2 etf2_1 = new FullE2("Fulltime");
        FullE2 etf2_2 = new FullE2("Fulltime");
        FullE2 etf2_3 = new FullE2("Fulltime");
        PartE2 epf2_1 = new PartE2("Parttime");
        PartE2 epf2_2 = new PartE2("Parttime");

        employeeList2.add(etf2_1);
        employeeList2.add(etf2_2);
        employeeList2.add(etf2_3);
        employeeList2.add(epf2_1);
        employeeList2.add(epf2_2);


        int totalSalary2 = 0;
        for (Employee2 employee : employeeList2) {
            totalSalary2 = totalSalary2 + employee.getSalary();
        }
        System.out.println("Total salary of Employee" + " " + totalSalary2);
    }
}
