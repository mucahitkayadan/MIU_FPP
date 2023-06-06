/**
 * Represents a generic shape.
 */
class Shape {
    String color;

    /**
     * Constructs a shape with the given color.
     *
     * @param color the color of the shape
     */
    public Shape(String color) {
        this.color = color;
    }

    /**
     * Calculates the area of the shape.
     *
     * @return the area of the shape
     */
    public double calculateArea() {
        return 0.0;
    }

    /**
     * Calculates the perimeter of the shape.
     *
     * @return the perimeter of the shape
     */
    public double calculatePerimeter() {
        return 0.0;
    }
}

/**
 * Represents a rectangle shape.
 */
class Rectangle extends Shape {
    private double width;
    private double height;

    /**
     * Constructs a rectangle with the given color, width, and height.
     *
     * @param color  the color of the rectangle
     * @param width  the width of the rectangle
     * @param height the height of the rectangle
     */
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of the rectangle.
     *
     * @return the area of the rectangle
     */
    @Override
    public double calculateArea() {
        return width * height;
    }

    /**
     * Calculates the perimeter of the rectangle.
     *
     * @return the perimeter of the rectangle
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

/**
 * Represents a square shape.
 */
class Square extends Rectangle {
    /**
     * Constructs a square with the given color and side length.
     *
     * @param color the color of the square
     * @param side  the side length of the square
     */
    public Square(String color, double side) {
        super(color, side, side);
    }
}

/**
 * Represents a circle shape.
 */
class Circle extends Shape {
    private double radius;

    /**
     * Constructs a circle with the given color and radius.
     *
     * @param color  the color of the circle
     * @param radius the radius of the circle
     */
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     *
     * @return the area of the circle
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the perimeter of the circle.
     *
     * @return the perimeter of the circle
     */
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

/**
 * Main class to test the application.
 */
public class Main {
    /**
     * Prints the total area and perimeter of all shapes.
     *
     * @param shapes an array of Shape objects
     */
    public static void printTotal(Shape[] shapes) {
        double totalArea = 0.0;
        double totalPerimeter = 0.0;

        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
            totalPerimeter += shape.calculatePerimeter();
        }

        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter: " + totalPerimeter);
    }

    /**
     * Main method to execute the program.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Rectangle("Blue", 5.0, 4.0);
        shapes[1] = new Square("Red", 3.0);
        shapes[2] = new Circle("Green", 2.5);
        shapes[3] = new Rectangle("Yellow", 6.0, 3.0);
        shapes[4] = new Circle("Purple", 4.0);

        printTotal(shapes);
    }
}
