public class Main {
    public static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl();

        System.out.println("Queue is empty: " + queue.isEmpty());
        System.out.println("Queue size: " + queue.size());

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Peek: " + queue.peek()); // Output: 10

        System.out.println("Dequeue: " + queue.dequeue()); // Output: 10
        System.out.println("Dequeue: " + queue.dequeue()); // Output: 20

        System.out.println("Queue is empty: " + queue.isEmpty());
        System.out.println("Queue size: " + queue.size());

        System.out.println("Dequeue: " + queue.dequeue()); // Output: 30
        System.out.println("Dequeue: " + queue.dequeue()); // Output: Queue is Empty, -1
    }
}
