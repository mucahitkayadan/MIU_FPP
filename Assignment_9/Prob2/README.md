ArrayStack
==========

ArrayStack is a Java implementation of a stack data structure using an array as the underlying storage.

Features
--------

*   Supports unlimited push (insertion/add) operations by dynamically resizing the underlying array.
*   Throws an exception or returns null for pop (delete/remove) and peek operations when the stack is empty.
*   Does not rely on Java library collection classes.

Usage
-----

To use the `ArrayStack` class, follow these steps:

1.  Import the `ArrayStack` class into your Java program:

    import com.example.ArrayStack;
    

2.  Create an instance of the `ArrayStack` class:

    ArrayStack stack = new ArrayStack();
    

3.  Use the following methods to interact with the stack:

*   `push(Object item)`: Adds an element to the top of the stack.
*   `pop()`: Removes and returns the element from the top of the stack.
*   `peek()`: Returns the element at the top of the stack without removing it.
*   `isEmpty()`: Returns `true` if the stack is empty, `false` otherwise.
*   `size()`: Returns the number of elements in the stack.

Example usage:

    stack.push(10);
    stack.push(20);
    stack.push(30);
    
    System.out.println(stack.peek()); // Output: 30
    
    System.out.println(stack.pop()); // Output: 30
    System.out.println(stack.pop()); // Output: 20
    
    System.out.println(stack.isEmpty()); // Output: false
    System.out.println(stack.size()); // Output: 1
    

Contributing
------------

Contributions to ArrayStack are welcome! If you find any bugs or have suggestions for improvements, please create an issue or submit a pull request.

License
-------

This project is licensed under the [MIT License](LICENSE).
