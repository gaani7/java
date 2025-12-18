package nodePackage;

import java.util.NoSuchElementException;

public class cercularArray<T> {

    private static final int DE = 5;
    private int front, rear, count;
    private T[] queue;

    // Constructor
    public cercularArray(int initialSize) {
        front = 0;
        rear = 0;
        count = 0;
        queue = (T[]) new Object[initialSize];
    }

    // De constructor
    public cercularArray() {
        this(DE);
    }


    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    // isFull
    public boolean isFull() {
        return count == queue.length;
    }

    // Enqueue
    public void enqueue(T element) {
        if (isFull()) {
            throw new NoSuchElementException("Queue is full");
        }

        queue[rear] = element;
        rear = (rear + 1) % queue.length;
        count++;
    }

    // Dequeue
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        T out = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        count--;

        return out;
    }

    // First / Peek
    public T first() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue[front];
    }

    // Search element
    public boolean searchArry(T value) {
        if (isEmpty()) {
            return false;
        }

        int index = front;

        for (int i = 0; i < count; i++) {
            if (queue[index].equals(value)) {
                return true;
            }
            index = (index + 1) % queue.length;
        }
        return false;
    }

    // Print queue
    public void print() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        }

        int index = front;
        for (int i = 0; i < count; i++) {
            System.out.print(queue[index] + " ");
            index = (index + 1) % queue.length;
        }
        System.out.println();
    }
}
