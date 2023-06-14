package prob2;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Staff> staff = new ArrayList<>();
        staff.add(new Staff("John", 110000, 2));
        staff.add(new Staff("Tom", 110000, 4));
        staff.add(new Staff("Edward", 120000, 1));
        staff.add(new Staff("Rich", 90000, 3));
        staff.add(new Staff("Kevin", 100000, 1));

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Andrew", 110000, 10000));
        teachers.add(new Teacher("Rabelais", 130000, 5500));
        teachers.add(new Teacher("Phil", 135000, 12000));
        teachers.add(new Teacher("Tony", 95000, 8000));

        List<Employee> combined = combine(staff, teachers);
        double salarySum = Statistics.computeSumOfSalaries(combined);
        System.out.println("Sum of salaries: " + salarySum);
    }

    public static List<Employee> combine(List<Staff> staff, List<Teacher> teachers) {
        List<Employee> combinedList = new ArrayList<>();
        combinedList.addAll(staff);
        combinedList.addAll(teachers);
        return combinedList;
    }
}
