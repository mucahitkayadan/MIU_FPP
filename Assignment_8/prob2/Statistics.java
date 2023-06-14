package prob2;

import java.util.List;

public class Statistics {
    public static double computeSumOfSalaries(List<Employee> aList) {
        double sum = 0.0;
        for (Employee employee : aList) {
            sum += employee.getSalary();
        }
        return sum;
    }
}

