package prob4;

/**
 * This class represents a Doubly Linked List.
 */
public class DoublyLinkedList {
	Node header;

	/**
	 * Constructs a new DoublyLinkedList object.
	 */
	DoublyLinkedList() {
		header = new Node();
	}

	/**
	 * Adds the input string to the end of the linked list.
	 *
	 * @param item the string to be added
	 */
	public void addLast(String item) {
		Node newNode = new Node();
		newNode.value = item;

		if (header.next == null) {
			// If the list is empty, add the new node as the first node
			header.next = newNode;
			newNode.previous = header;
		} else {
			// Traverse the list to the last node and add the new node
			Node currentNode = header.next;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
			newNode.previous = currentNode;
		}
	}

	/**
	 * Removes the first occurrence of the input string from the linked list.
	 *
	 * @param item the string to be removed
	 * @return true if the string was found and removed, false otherwise
	 */
	public boolean remove(String item) {
		Node currentNode = header.next;
		while (currentNode != null) {
			if (currentNode.value != null && currentNode.value.equals(item)) {
				// Found the node to be removed
				Node previousNode = currentNode.previous;
				Node nextNode = currentNode.next;
				previousNode.next = nextNode;
				if (nextNode != null) {
					nextNode.previous = previousNode;
				}
				return true;
			}
			currentNode = currentNode.next;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		toString(sb, header.next);
		return sb.toString();
	}

	private void toString(StringBuilder sb, Node node) {
		if (node == null) return;
		if (node.value != null) sb.append(" ").append(node.value);
		toString(sb, node.next);
	}

	/**
	 * This class represents a node in the DoublyLinkedList.
	 */
	class Node {
		String value;
		Node next;
		Node previous;

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	/**
	 * The main method is used for testing purposes.
	 *
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addLast("Bob");
		list.addLast("Bill");
		list.addLast("Tom");
		System.out.println(list);

		list.remove("Bill");
		System.out.println(list);

		list.remove("Alice");
		System.out.println(list);
	}
}
