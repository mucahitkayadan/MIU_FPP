import java.util.Arrays;

abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    /**
     * Constructs an Employee object with the specified details.
     *
     * @param firstName           the first name of the employee
     * @param lastName            the last name of the employee
     * @param socialSecurityNumber the social security number of the employee
     */
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * Returns the payment amount for the employee.
     *
     * @return the payment amount for the employee
     */
    public abstract double getPayment();

    // Getters and setters

    /**
     * Returns the first name of the employee.
     *
     * @return the first name of the employee
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the employee.
     *
     * @param firstName the first name of the employee
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name of the employee.
     *
     * @return the last name of the employee
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the employee.
     *
     * @param lastName the last name of the employee
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the social security number of the employee.
     *
     * @return the social security number of the employee
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets the social security number of the employee.
     *
     * @param socialSecurityNumber the social security number of the employee
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * Returns a string representation of the Employee object.
     *
     * @return a string representation of the Employee object
     */
    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", lastName=" + lastName +
                ", socialSecurityNumber=" + socialSecurityNumber + "]";
    }
}

class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    /**
     * Constructs a CommissionEmployee object with the specified details.
     *
     * @param firstName           the first name of the employee
     * @param lastName            the last name of the employee
     * @param socialSecurityNumber the social security number of the employee
     * @param grossSales          the gross sales of the employee
     * @param commissionRate      the commission rate of the employee
     */
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                              double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    /**
     * Returns the payment amount for the commission employee.
     *
     * @return the payment amount for the commission employee
     */
    @Override
    public double getPayment() {
        return grossSales * commissionRate;
    }

    // Getters and setters

    /**
     * Returns the gross sales of the commission employee.
     *
     * @return the gross sales of the commission employee
     */
    public double getGrossSales() {
        return grossSales;
    }

    /**
     * Sets the gross sales of the commission employee.
     *
     * @param grossSales the gross sales of the commission employee
     */
    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    /**
     * Returns the commission rate of the commission employee.
     *
     * @return the commission rate of the commission employee
     */
    public double getCommissionRate() {
        return commissionRate;
    }

    /**
     * Sets the commission rate of the commission employee.
     *
     * @param commissionRate the commission rate of the commission employee
     */
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    /**
     * Returns a string representation of the CommissionEmployee object.
     *
     * @return a string representation of the CommissionEmployee object
     */
    @Override
    public String toString() {
        return super.toString() + " CommissionEmployee [grossSales=" + grossSales +
                ", commissionRate=" + commissionRate + "]";
    }
}

class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    /**
     * Constructs a BasePlusCommissionEmployee object with the specified details.
     *
     * @param firstName           the first name of the employee
     * @param lastName            the last name of the employee
     * @param socialSecurityNumber the social security number of the employee
     * @param grossSales          the gross sales of the employee
     * @param commissionRate      the commission rate of the employee
     * @param baseSalary          the base salary of the employee
     */
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    /**
     * Returns the payment amount for the base plus commission employee.
     *
     * @return the payment amount for the base plus commission employee
     */
    @Override
    public double getPayment() {
        return baseSalary + (getGrossSales() * getCommissionRate());
    }

    // Getters and setters

    /**
     * Returns the base salary of the base plus commission employee.
     *
     * @return the base salary of the base plus commission employee
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * Sets the base salary of the base plus commission employee.
     *
     * @param baseSalary the base salary of the base plus commission employee
     */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * Returns a string representation of the BasePlusCommissionEmployee object.
     *
     * @return a string representation of the BasePlusCommissionEmployee object
     */
    @Override
    public String toString() {
        return super.toString() + " BasePlusCommissionEmployee [baseSalary=" + baseSalary + "]";
    }
}

class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    /**
     * Constructs an HourlyEmployee object with the specified details.
     *
     * @param firstName           the first name of the employee
     * @param lastName            the last name of the employee
     * @param socialSecurityNumber the social security number of the employee
     * @param wage                the wage per hour of the employee
     * @param hours               the number of hours worked by the employee
     */
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                          double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    /**
     * Returns the payment amount for the hourly employee.
     *
     * @return the payment amount for the hourly employee
     */
    @Override
    public double getPayment() {
        return wage * hours;
    }

    // Getters and setters

    /**
     * Returns the wage per hour of the hourly employee.
     *
     * @return the wage per hour of the hourly employee
     */
    public double getWage() {
        return wage;
    }

    /**
     * Sets the wage per hour of the hourly employee.
     *
     * @param wage the wage per hour of the hourly employee
     */
    public void setWage(double wage) {
        this.wage = wage;
    }

    /**
     * Returns the number of hours worked by the hourly employee.
     *
     * @return the number of hours worked by the hourly employee
     */
    public double getHours() {
        return hours;
    }

    /**
     * Sets the number of hours worked by the hourly employee.
     *
     * @param hours the number of hours worked by the hourly employee
     */
    public void setHours(double hours) {
        this.hours = hours;
    }

    /**
     * Returns a string representation of the HourlyEmployee object.
     *
     * @return a string representation of the HourlyEmployee object
     */
    @Override
    public String toString() {
        return super.toString() + " HourlyEmployee [wage=" + wage + ", hours=" + hours + "]";
    }
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    /**
     * Constructs a SalariedEmployee object with the specified details.
     *
     * @param firstName           the first name of the employee
     * @param lastName            the last name of the employee
     * @param socialSecurityNumber the social security number of the employee
     * @param weeklySalary        the weekly salary of the employee
     */
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,
                            double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    /**
     * Returns the payment amount for the salaried employee.
     *
     * @return the payment amount for the salaried employee
     */
    @Override
    public double getPayment() {
        return weeklySalary;
    }

    // Getters and setters

    /**
     * Returns the weekly salary of the salaried employee.
     *
     * @return the weekly salary of the salaried employee
     */
    public double getWeeklySalary() {
        return weeklySalary;
    }

    /**
     * Sets the weekly salary of the salaried employee.
     *
     * @param weeklySalary the weekly salary of the salaried employee
     */
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    /**
     * Returns a string representation of the SalariedEmployee object.
     *
     * @return a string representation of the SalariedEmployee object
     */
    @Override
    public String toString() {
        return super.toString() + " SalariedEmployee [weeklySalary=" + weeklySalary + "]";
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new CommissionEmployee("Burmaa", "Enkhbat", "123-456-7890",
                5000, 0.1);
        employees[1] = new BasePlusCommissionEmployee("Muja", "Kayadan", "987-654-3210",
                10000, 0.08, 2000);
        employees[2] = new HourlyEmployee("Ken", "Daley", "456-789-0123",
                20, 40);
        employees[3] = new SalariedEmployee("Elvis", "Presley", "789-012-3456",
                500);
        employees[4] = new SalariedEmployee("Michael", "Jackson", "234-567-8901",
                700);

        // Display current status of the objects
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        // Calculate total salaries of all employees
        double totalSalaries = 0;
        for (Employee employee : employees) {
            totalSalaries += employee.getPayment();
        }

        // Print total salaries
        System.out.println("Total Salaries: " + totalSalaries);
    }
}
