# Doubly Linked List

The Doubly Linked List is a data structure implementation in Java that represents a collection of elements with each element containing a reference to the previous and next elements.

## Description

This project provides a `DoublyLinkedList` class that allows you to perform basic operations on a doubly linked list such as adding elements to the end of the list and removing elements.

## Features

- Adding elements to the end of the list
- Removing elements from the list
- Displaying the contents of the list

## Usage

You can use the `DoublyLinkedList` class by following these steps:

1. Create an instance of the `DoublyLinkedList` class.
2. Add elements to the list using the `addLast` method.
3. Remove elements from the list using the `remove` method.
4. Display the contents of the list using the `toString` method.

Here's an example usage:

```java
DoublyLinkedList list = new DoublyLinkedList();
list.addLast("Bob");
list.addLast("Bill");
list.addLast("Tom");
System.out.println(list);

list.remove("Bill");
System.out.println(list);
```

## Requirements

- Java Development Kit (JDK) 8 or above

## License

This project is licensed under the [MIT License](LICENSE).

