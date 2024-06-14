package org.bawandar.datastructure.stack;

import java.util.LinkedList;
import java.util.List;

public class SimpleStack<T> implements Stack<T> {
    private final List<T> stack;

    public SimpleStack() {
        this.stack = new LinkedList<>();
    }

    @Override
    public void push(T data) {
        stack.addFirst(data);
    }

    @Override
    public T pop() {
        return stack.removeFirst();
    }

    @Override
    public T peek() {
        return stack.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        final Stack<Integer> stack = new SimpleStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while (!stack.isEmpty()) {
            System.out.printf("%d ", stack.pop());
        }
    }
}
