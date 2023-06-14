# Marketing ArrayList Project

This project demonstrates the usage of ArrayList with the Marketing class. The Marketing class represents a marketing entry with employee name, product name, and sales amount. The project provides various methods to interact with the Marketing ArrayList and perform operations such as adding objects, removing objects, sorting, and filtering based on sales amount.

## Classes

### Marketing

Represents a marketing entry with employee name, product name, and sales amount.

#### Constructors

- `Marketing(String employeeName, String productName, double salesAmount)`: Constructs a Marketing object with the given employee name, product name, and sales amount.

#### Methods

- `getEmployeeName()`: Retrieves the employee name.
- `getProductName()`: Retrieves the product name.
- `getSalesAmount()`: Retrieves the sales amount.
- `toString()`: Returns a string representation of the Marketing object.
- `equals(Object obj)`: Compares this Marketing object to the specified object.

### SalesAmountComparator

Comparator implementation for comparing Marketing objects based on the sales amount.

#### Methods

- `compare(Marketing m1, Marketing m2)`: Compares two Marketing objects based on their sales amounts.

### Main

Main class to demonstrate the usage of ArrayList with Marketing objects.

#### Methods

- `main(String[] args)`: The entry point of the program.
- `listMoreThan1000(List<Marketing> list)`: Retrieves a list of Marketing objects with sales amount greater than $1000.

## Usage

1. Add Marketing objects to the list using the `add()` method.
2. Remove Marketing objects from the list using the `remove()` method.
3. Print the size of the list using the `size()` method.
4. Override the `toString()` method to display the contents of the list.
5. Override the `equals()` method to compare Marketing objects.
6. Sort the list in natural order for the field sales amount using the `SalesAmountComparator`.
7. Sort the list in natural order using employee name for employees who achieve more than $1000 in sales amount. Use the `listMoreThan1000()` method to retrieve the result list and then sort it.

Feel free to explore and modify the code as needed for your requirements.

