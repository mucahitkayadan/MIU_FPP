package prob2;

import java.util.List;

public interface EmployeeData {
    void addEmployee(Employee employee);
    void removeEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
}

