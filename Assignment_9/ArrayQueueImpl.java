public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public void enqueue(int obj) {
        if (rear == arr.length) {
            resize();
        }
        arr[rear++] = obj;
        if (front == -1) {
            front++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int element = arr[front];
        if (front == rear - 1) {
            front = -1;
            rear = 0;
        } else {
            front++;
        }
        return element;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return rear - front;
    }

    private void resize() {
        int newSize = arr.length * 2;
        int[] newArr = new int[newSize];
        System.arraycopy(arr, front, newArr, 0, size());
        arr = newArr;
        rear = size();
        front = 0;
    }
}
