public class ExampleClass {
    private int instanceField1;
    private String instanceField2;
    private static int staticField = 10;

    // Instance initialization block 1
    {
        System.out.println("Inside instance initialization block 1");
    }

    // Instance initialization block 2
    {
        System.out.println("Inside instance initialization block 2");
    }

    // Constructor 1
    public ExampleClass(int field1, String field2) {
        instanceField1 = field1;
        instanceField2 = field2;
        System.out.println("Inside Constructor 1");
    }

    // Constructor 2
    public ExampleClass() {
        System.out.println("Inside Constructor 2");
    }

    // Instance method 1
    public void instanceMethod1() {
        System.out.println("Inside instanceMethod1");
    }

    // Instance method 2
    public void instanceMethod2() {
        System.out.println("Inside instanceMethod2");
    }

    // Static initialization block 1
    static {
        System.out.println("Inside static initialization block 1");
    }

    // Static initialization block 2
    static {
        System.out.println("Inside static initialization block 2");
    }

    // Static method 1
    public static void staticMethod1() {
        System.out.println("Inside staticMethod1");
    }

    // Static method 2
    public static void staticMethod2() {
        System.out.println("Inside staticMethod2");
    }
}

public class Main {
    public static void main(String[] args) {
        ExampleClass obj1 = new ExampleClass(5, "Hello");
        System.out.println("-----------------");
        ExampleClass obj2 = new ExampleClass();
    }
}

/*
When you run the Main class, the program execution order will be as follows:

The static initialization blocks will execute first, in the order they are defined. In this case, "Inside static initialization block 1" will be printed first, followed by "Inside static initialization block 2".

Then, the main method is executed. It creates two objects of ExampleClass: obj1 and obj2.

For obj1 creation:

The instance initialization blocks will execute next, in the order they are defined. Here, "Inside instance initialization block 1" will be printed first, followed by "Inside instance initialization block 2".
The constructor ExampleClass(int field1, String field2) is called, which initializes the instance fields and prints "Inside Constructor 1".
After the creation of obj1, "-----------------" is printed as a separator in the console.

For obj2 creation:

The instance initialization blocks will execute again, as they are executed for every object creation. Here, "Inside instance initialization block 1" will be printed first, followed by "Inside instance initialization block 2".
The constructor ExampleClass() is called, which prints "Inside Constructor 2".
*/
