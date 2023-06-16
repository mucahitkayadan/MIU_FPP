# ArrayQueueImpl

ArrayQueueImpl is a Java implementation of a queue data structure using an array as the underlying storage.

## Features

- Supports unlimited enqueue (insertion/add) operations by dynamically resizing the underlying array.
- Throws an exception or returns -1 for dequeue (delete/remove) and peek operations when the queue is empty.
- Does not rely on Java library collection classes.

## Usage

To use the `ArrayQueueImpl` class, follow these steps:

1. Import the `ArrayQueueImpl` class into your Java program:

   ```java
   import com.example.ArrayQueueImpl;
Create an instance of the ArrayQueueImpl class:

java
Copy code
ArrayQueueImpl queue = new ArrayQueueImpl();
Use the following methods to interact with the queue:

peek(): Returns the element at the front of the queue without removing it.
enqueue(int obj): Adds an element to the rear of the queue.
dequeue(): Removes and returns the element at the front of the queue.
isEmpty(): Returns true if the queue is empty, false otherwise.
size(): Returns the number of elements in the queue.
Example usage:

```java
queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);

System.out.println(queue.peek()); // Output: 10

System.out.println(queue.dequeue()); // Output: 10
System.out.println(queue.dequeue()); // Output: 20

System.out.println(queue.isEmpty()); // Output: false
System.out.println(queue.size()); // Output: 1

System.out.println(queue.dequeue()); // Output: 30
System.out.println(queue.dequeue()); // Output: Queue is Empty, -1
```
## Contributing
Contributions to ArrayQueueImpl are welcome! If you find any bugs or have suggestions for improvements, please create an issue or submit a pull request.





