package Question5;

import java.util.List;

public class EmployeeController {
    public int totalSalary(List<EmployeeMain> employeeMainList){
        int totalSalary = 0;
        for (EmployeeMain employeeMain : employeeMainList) {
            totalSalary = totalSalary + employeeMain.getSalary();
        }
        return totalSalary;
    }
}
