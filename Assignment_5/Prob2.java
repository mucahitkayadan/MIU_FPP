import java.time.LocalDate;

/**
 * Represents a department employee.
 */
class DeptEmployee {
    private String name;
    private LocalDate hireDate;

    /**
     * Constructs a department employee with the given name and hire date.
     *
     * @param name     the name of the employee
     * @param hireDate the hire date of the employee
     */
    public DeptEmployee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    /**
     * Retrieves the name of the employee.
     *
     * @return the name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the hire date of the employee.
     *
     * @return the hire date of the employee
     */
    public LocalDate getHireDate() {
        return hireDate;
    }

    /**
     * Computes the salary of the employee.
     *
     * @return the computed salary of the employee
     */
    public double computeSalary() {
        return 0.0; // Default salary computation
    }
}

/**
 * Represents a professor employee.
 */
class Professor extends DeptEmployee {
    private int numberOfPublications;

    /**
     * Constructs a professor with the given name, hire date, and number of publications.
     *
     * @param name                 the name of the professor
     * @param hireDate             the hire date of the professor
     * @param numberOfPublications the number of publications of the professor
     */
    public Professor(String name, LocalDate hireDate, int numberOfPublications) {
        super(name, hireDate);
        this.numberOfPublications = numberOfPublications;
    }

    /**
     * Retrieves the number of publications of the professor.
     *
     * @return the number of publications of the professor
     */
    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    /**
     * Sets the number of publications of the professor.
     *
     * @param numberOfPublications the number of publications of the professor
     */
    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

    /**
     * Computes the salary of the professor.
     *
     * @return the computed salary of the professor
     */
    @Override
    public double computeSalary() {
        // Add your logic to compute the salary for a Professor
        // Example: return baseSalary + (numberOfPublications * publicationBonus);
        return 0.0;
    }
}

/**
 * Represents a secretary employee.
 */
class Secretary extends DeptEmployee {
    private double overtimeHours;

    /**
     * Constructs a secretary with the given name, hire date, and overtime hours.
     *
     * @param name         the name of the secretary
     * @param hireDate     the hire date of the secretary
     * @param overtimeHours the overtime hours of the secretary
     */
    public Secretary(String name, LocalDate hireDate, double overtimeHours) {
        super(name, hireDate);
        this.overtimeHours = overtimeHours;
    }

    /**
     * Retrieves the overtime hours of the secretary.
     *
     * @return the overtime hours of the secretary
     */
    public double getOvertimeHours() {
        return overtimeHours;
    }

    /**
     * Sets the overtime hours of the secretary.
     *
     * @param overtimeHours the overtime hours of the secretary
     */
    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    /**
     * Computes the salary of the secretary.
     *
     * @return the computed salary of the secretary
     */
    @Override
    public double computeSalary() {
        // Add your logic to compute the salary for a Secretary
        // Example: return baseSalary + (overtimeHours * overtimeRate);
        return super.computeSalary() + (overtimeHours * 12);
    }
}

/**
 * Represents the main class to test the department and its employees.
 */
public class Main {
    /**
     * The main method of the application.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // Create instances of professors and secretaries
        Professor professor1 = new Professor("John Doe", LocalDate.of(2010, 1, 1), 5);
        Professor professor2 = new Professor("Jane Smith", LocalDate.of(2015, 3, 15), 8);
        Professor professor3 = new Professor("David Johnson", LocalDate.of(2018, 7, 20), 3);

        Secretary secretary1 = new Secretary("Mary Johnson", LocalDate.of(2012, 6, 10), 10);
        Secretary secretary2 = new Secretary("Emily Davis", LocalDate.of(2016, 9, 5), 8);

        // Create an array of department employees
        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = professor1;
        department[1] = professor2;
        department[2] = professor3;
        department[3] = secretary1;
        department[4] = secretary2;

        // Ask the user if they want to see the sum of all salaries
        // Assuming user input is given as "Y" or "N" (case-insensitive)
        String userInput = "Y"; // Replace with actual user input

        if (userInput.equalsIgnoreCase("Y")) {
            // Calculate the sum of all salaries in the department
            double totalSalary = 0.0;
            for (DeptEmployee employee : department) {
                totalSalary += employee.computeSalary();
            }

            // Output the result
            System.out.println("Total Salary of all Professors and Secretaries: " + totalSalary);
        }
    }
}
