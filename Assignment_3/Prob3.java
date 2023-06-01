public class Triangle {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double computeArea() {
        return 0.5 * base * height;
    }
}

public class Rectangle {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double computeArea() {
        return width * length;
    }
}

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter C for Circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Triangle");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("C")) {
            System.out.println("Enter the radius of the Circle");
            double radius = scanner.nextDouble();

            Circle circle = new Circle(radius);
            double area = circle.computeArea();
            System.out.printf("The area of the Circle is: %.2f", area);
        } else if (choice.equalsIgnoreCase("R")) {
            System.out.println("Enter the width of the Rectangle");
            double width = scanner.nextDouble();
            System.out.println("Enter the length of the Rectangle");
            double length = scanner.nextDouble();

            Rectangle rectangle = new Rectangle(width, length);
            double area = rectangle.computeArea();
            System.out.printf("The area of the Rectangle is: %.2f", area);
        } else if (choice.equalsIgnoreCase("T")) {
            System.out.println("Enter the base of the Triangle");
            double base = scanner.nextDouble();
            System.out.println("Enter the height of the Triangle");
            double height = scanner.nextDouble();

            Triangle triangle = new Triangle(base, height);
            double area = triangle.computeArea();
            System.out.printf("The area of the Triangle is: %.2f", area);
        } else {
            System.out.println("Invalid choice");
        }
    }
}
