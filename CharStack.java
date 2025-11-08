package c1230088;

import java.util.Arrays;
import java.util.EmptyStackException;

public class CharStack<T> {
    private static final int DEFAULT_CAPACITY = 2;
    private int top;
    private T[] stack;

    CharStack() {
        this(DEFAULT_CAPACITY);
    }

    CharStack(int initialCapacity) {
        top = 0;
        stack = (T[]) (new Object[initialCapacity]);
    }

    public void push(T element) {
        if (size() == stack.length) {
            expand();
        }
        stack[top] = element;
        top++;
    }

    private void expand() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        top--;
        T removed = stack[top];
        stack[top] = null;
        return removed;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack Elements:");
        for (int i = 0; i < top; i++) {
            System.out.println(stack[i] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }
}

