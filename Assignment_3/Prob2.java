import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private static final int RESTING_HEART_RATE = 70;
    private static final double LOWER_BOUNDARY = 0.5;
    private static final double UPPER_BOUNDARY = 0.85;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int calculateAge() {
        AgeCalculator ageCalculator = new AgeCalculator();
        return ageCalculator.calculateAge(dateOfBirth);
    }

    public int calculateMaximumHeartRate() {
        int age = calculateAge();
        return 220 - age;
    }

    public void calculateAndPrintTargetHeartRateRange() {
        int maximumHeartRate = calculateMaximumHeartRate();
        int averageHeartRate = maximumHeartRate - RESTING_HEART_RATE;
        int lowerBoundaryTargetHeartRate = (int) (averageHeartRate * LOWER_BOUNDARY) + RESTING_HEART_RATE;
        int upperBoundaryTargetHeartRate = (int) (averageHeartRate * UPPER_BOUNDARY) + RESTING_HEART_RATE;

        System.out.println("Target Heart Rate Range:");
        System.out.println("Lower Boundary: " + lowerBoundaryTargetHeartRate + " bpm");
        System.out.println("Upper Boundary: " + upperBoundaryTargetHeartRate + " bpm");
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nDate of Birth: " + dateOfBirth +
                "\nAge: " + calculateAge() + " years" +
                "\nMaximum Heart Rate: " + calculateMaximumHeartRate() + " bpm";
    }

    public LocalDate getBirthday() {
        Scanner scanner = new Scanner(System.in);
        LocalDate birthday;
        while (true) {
            System.out.println("Please enter your birthday in yyyy-MM-dd format (e.g. 1980-9-28): ");
            String input = scanner.nextLine();
            try {
                birthday = LocalDate.parse(input, formatter);
                return birthday;
            } catch (DateTimeParseException e) {
                System.out.println("Error! Please try again");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        HeartRates heartRates = new HeartRates(firstName, lastName, null);
        LocalDate birthday = heartRates.getBirthday();
        heartRates.setDateOfBirth(birthday);

        System.out.println("\n" + heartRates.toString());

        System.out.println();
        heartRates.calculateAndPrintTargetHeartRateRange();
    }
}
