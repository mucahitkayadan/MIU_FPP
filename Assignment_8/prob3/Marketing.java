import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Represents a marketing entry with employee name, product name, and sales amount.
 */
class Marketing {
    private String employeeName;
    private String productName;
    private double salesAmount;

    /**
     * Constructs a Marketing object with the given employee name, product name, and sales amount.
     *
     * @param employeeName The name of the employee.
     * @param productName  The name of the product.
     * @param salesAmount  The sales amount.
     */
    public Marketing(String employeeName, String productName, double salesAmount) {
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    /**
     * Retrieves the employee name.
     *
     * @return The employee name.
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * Retrieves the product name.
     *
     * @return The product name.
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Retrieves the sales amount.
     *
     * @return The sales amount.
     */
    public double getSalesAmount() {
        return salesAmount;
    }

    /**
     * Returns a string representation of the Marketing object.
     *
     * @return A string representation of the Marketing object.
     */
    @Override
    public String toString() {
        return "Marketing [Employee Name: " + employeeName + ", Product Name: " + productName + ", Sales Amount: " + salesAmount + "]";
    }

    /**
     * Compares this Marketing object to the specified object. The result is true if the objects are equal,
     * false otherwise.
     *
     * @param obj The object to compare.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Marketing marketing = (Marketing) obj;
        return Double.compare(marketing.salesAmount, salesAmount) == 0 &&
                employeeName.equals(marketing.employeeName) &&
                productName.equals(marketing.productName);
    }
}

/**
 * Comparator implementation for comparing Marketing objects based on the sales amount.
 */
class SalesAmountComparator implements Comparator<Marketing> {
    /**
     * Compares two Marketing objects based on their sales amounts.
     *
     * @param m1 The first Marketing object to compare.
     * @param m2 The second Marketing object to compare.
     * @return A negative integer if m1's sales amount is less than m2's sales amount,
     *         zero if they are equal, or a positive integer if m1's sales amount is greater than m2's sales amount.
     */
    @Override
    public int compare(Marketing m1, Marketing m2) {
        return Double.compare(m1.getSalesAmount(), m2.getSalesAmount());
    }
}

/**
 * Main class to demonstrate the usage of ArrayList with Marketing objects.
 */
public class Main {
    /**
     * The entry point of the program.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        List<Marketing> marketingList = new ArrayList<>();

        // Adding objects to the Marketing list
        marketingList.add(new Marketing("John", "Product A", 1500.0));
        marketingList.add(new Marketing("Jane", "Product B", 2000.0));
        marketingList.add(new Marketing("Tom", "Product C", 1200.0));
        marketingList.add(new Marketing("Emily", "Product D", 1800.0));

        // Removing an object from the Marketing list
        marketingList.remove(1);

        // Printing the size of the Marketing list
        System.out.println("Size of the Marketing list: " + marketingList.size());

        // Printing the contents of the Marketing list
        System.out.println("Contents of the Marketing list:");
        for (Marketing marketing : marketingList) {
            System.out.println(marketing);
        }

        // Sorting the Marketing list by sales amount using SalesAmountComparator
        marketingList.sort(new SalesAmountComparator());

        // Printing the sorted Marketing list
        System.out.println("Sorted Marketing list by sales amount:");
        for (Marketing marketing : marketingList) {
            System.out.println(marketing);
        }

        // Getting a list of employees with sales amount > $1000 and sorting by employee name
        List<Marketing> filteredList = listMoreThan1000(marketingList);
        filteredList.sort(Comparator.comparing(Marketing::getEmployeeName));

        // Printing the filtered and sorted Marketing list
        System.out.println("List of employees with salesAmount > $1000, sorted by employeeName:");
        for (Marketing marketing : filteredList) {
            System.out.println(marketing);
        }
    }

    /**
     * Retrieves a list of Marketing objects with sales amount greater than $1000.
     *
     * @param list The list of Marketing objects.
     * @return A list of Marketing objects with sales amount greater than $1000.
     */
    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> result = new ArrayList<>();
        for (Marketing marketing : list) {
            if (marketing.getSalesAmount() > 1000.0) {
                result.add(marketing);
            }
        }
        return result;
    }
}
