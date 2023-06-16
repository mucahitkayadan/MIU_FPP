public class LinkedListStackDemo {
    public static void main(String[] args) {
        LinkedListStack stk = new LinkedListStack();
        Object item;
        stk.push('A');
        stk.push('B');
        stk.push('C');
        stk.push('D');
        System.out.println("size: " + stk.size());
        System.out.println("stack: " + stk.peek());
        System.out.println(stk.toString());

        item = stk.pop();
        System.out.println("Popped item: " + item);
        System.out.println("size: " + stk.size());
        System.out.println("stack: " + stk.peek());
        System.out.println(stk.toString());
    }
}

class LinkedListStack {
    private Node top;

    public void push(Object item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        Object item = top.data;
        top = top.next;
        return item;
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack{ ");
        Node current = top;
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        sb.append("}");
        return sb.toString();
    }

    private static class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }
    }
}
