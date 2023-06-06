class Shape {
    String color;

    // Constructor for the Shape class
    public Shape(String color) {
        this.color = color;
    }

    // Method to calculate the area of a shape
    public double calculateArea() {
        return 0.0; // Since Shape is an abstract concept, the area is not defined and set to 0.0
    }

    // Method to calculate the perimeter of a shape
    public double calculatePerimeter() {
        return 0.0; // Since Shape is an abstract concept, the perimeter is not defined and set to 0.0
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor for the Rectangle class
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    // Override the calculateArea() method from the Shape class
    @Override
    public double calculateArea() {
        return width * height; // Calculate the area of the rectangle
    }

    // Override the calculatePerimeter() method from the Shape class
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height); // Calculate the perimeter of the rectangle
    }
}

class Square extends Rectangle {
    // Constructor for the Square class
    public Square(String color, double side) {
        super(color, side, side); // Pass the side as width and height to the Rectangle constructor
    }
}

class Circle extends Shape {
    private double radius;

    // Constructor for the Circle class
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Override the calculateArea() method from the Shape class
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Calculate the area of the circle
    }

    // Override the calculatePerimeter() method from the Shape class
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // Calculate the perimeter of the circle
    }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];

        // Create instances of Rectangle, Square, and Circle
        shapes[0] = new Rectangle("Blue", 5.0, 4.0);
        shapes[1] = new Square("Red", 3.0);
        shapes[2] = new Circle("Green", 2.5);
        shapes[3] = new Rectangle("Yellow", 6.0, 3.0);
        shapes[4] = new Circle("Purple", 4.0);

        printTotal(shapes);
    }

    // Method to print the total area and perimeter of all shapes
    public static void printTotal(Shape[] shapes) {
        double totalArea = 0.0;
        double totalPerimeter = 0.0;

        // Iterate over the shapes array
        for (Shape shape : shapes) {
            // Calculate the total area and perimeter by calling the respective methods of each shape
            totalArea += shape.calculateArea();
            totalPerimeter += shape.calculatePerimeter();
        }

        // Print the total area and perimeter
        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter: " + totalPerimeter);
    }
}
