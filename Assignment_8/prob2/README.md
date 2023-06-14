# Employee Salary Calculation

This project demonstrates the calculation of the sum of salaries for a list of employees, including staff and teachers. It utilizes polymorphism to compute the sum of salaries without checking types.

## EmployeeData Interface

The `EmployeeData` interface defines the contract for managing employee data. It provides methods to add and remove employees, retrieve all employees, and get an employee by ID.

## Staff Class

The `Staff` class represents a staff member. It implements the `Employee` interface and provides methods to get the staff member's name, salary, and number of dependants.

## Teacher Class

The `Teacher` class represents a teacher. It also implements the `Employee` interface and provides methods to get the teacher's name, salary, and bonus amount.

## Statistics Class

The `Statistics` class contains the `computeSumOfSalaries` method, which takes a list of employees and calculates the sum of all the salaries using polymorphism. It iterates over the list and calls the `getSalary` method of each employee to obtain their salary and add it to the total sum.

## Main Class

The `Main` class serves as the entry point of the program. It demonstrates the usage of the `combine` method to merge staff and teacher lists into a single list. Then, it calls the `computeSumOfSalaries` method from the `Statistics` class to calculate the total sum of salaries for all employees in the combined list.

## Getting Started

To run the program, follow these steps:

1. Clone the repository.
2. Open the project in your preferred Java development environment.
3. Compile and run the `Main` class.
4. The program will display the sum of salaries for all employees.

Feel free to modify the provided classes and experiment with different employee data to observe the calculated sum of salaries.

