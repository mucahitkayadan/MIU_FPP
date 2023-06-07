![Capture](https://github.com/mucahitkayadan/MIU_FPP/assets/23214076/59200017-dc6b-4b61-bf38-9107ec5e6f8e)

<h1>Lesson – 5 – Inheritance and Polymorphism.</h1>
<h3>Note : Need to solve all the problems in a Polymorphic way.</h3>
<h2>Day – 1</h2>
Perform the following tasks
a. The return value of calcualteArea() & calculatePerimeter() is double.
b. Don’t provide any getter or setters, make all the fields as either default or protected.
c. In the Shape class just return 0.0 for the calcualteArea() & calculatePerimeter().
d. Square class has no attribute. Assign the passed side value to height and width attribute of
its super class Rectangle. Because four sides are same in the Square. No need to
implement calcualteArea() & calculatePerimeter() inside Square class. You have to make
use Rectangle class calcualteArea() & calculatePerimeter(). Because you pass height and
width as same value.
e. Create a main class to test the application to perform the below tasks
a. Create an array of Shape[] to hold at-least five objects for its subtypes.
b. Create a Static method to print the total area of all the Shape objects and print the
total perimeter of all the Shape objects.
public static void printTotal(Shape[] shapes)
 { // Implement your code
 } 
 <h2>Problem : 2  </h2>
A university department consists of professors and secretaries. Each professor and each secretary
has a name, a salary, and a hire date. Use inheritance and polymorphism to create an application
that represents the department and its professors and secretaries as objects, and provides a test
class that creates 3 professors and 2 secretaries, and then outputs the combined total of all of
their salaries.
Start by creating classes
Professor
Secretary
DeptEmployee
having the following relationship:
![Capture](https://github.com/mucahitkayadan/MIU_FPP/assets/23214076/1991d54d-31f2-48b5-a11f-a555a0803aea)
Place instance fields and corresponding accessor/mutator methods in DeptEmployee to represent
name and hire date (as a type of LocalDate )(do not create accessors or mutators for salary). Do
not put these fields in either the Professor or Secretary class. Also place in the Professor class an
int field numberOfPublications, with corresponding accessor and mutator methods. Place in the
Secretary class a double field overtimeHours, also with corresponding accessor and mutator
methods.
Place a computeSalary method in DeptEmployee which simply returns the value stored in salary.
Override the computeSalary method in Secretary so that the return value is the sum of the value
of salary plus 12 times the number of overtime hours.
Then in the main method of a class named Main, create three instances of Professor and two
instances of Secretary (you can invent the values to pass into the constructor). Finally, create an
array of department employees:
DeptEmployee[] department = new DeptEmployee[5]
DeptEmployee
Professor Secretary
and then populate the array with the Professor and Secretary instances you have just created.
Then ask the user if he wishes to see the sum of all Professor and Secretary(means all
DeptEmployee array objects) salary in the department. If the user responds "Y", then loop
through the department array and polymorphically read, and sum, all salaries, and output the
result to the console.
