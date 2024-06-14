package org.bawandar.datastructure.stack;

import java.util.LinkedList;
import java.util.List;

import static org.bawandar.datastructure.Constants.LINE_BREAK;

public class LinkedDoubleEndedStack<T> implements DoubleEndedStack<T> {
    private final List<T> doubleEndedStack;

    public LinkedDoubleEndedStack() {
        this.doubleEndedStack = new LinkedList<>();
    }

    @Override
    public void push(T data) {
        doubleEndedStack.addFirst(data);
    }

    @Override
    public void pushBottom(T data) {
        doubleEndedStack.addLast(data);
    }

    @Override
    public T pop() {
        return doubleEndedStack.removeFirst();
    }

    @Override
    public T popBottom() {
        return doubleEndedStack.removeLast();
    }

    @Override
    public T peek() {
        return doubleEndedStack.getFirst();
    }

    @Override
    public T peekBottom() {
        return doubleEndedStack.getLast();
    }

    @Override
    public boolean isEmpty() {
        return doubleEndedStack.isEmpty();
    }

    @Override
    public int size() {
        return doubleEndedStack.size();
    }

    public static void main(String[] args) {
        final DoubleEndedStack<Integer> doubleEndedStack = new LinkedDoubleEndedStack<>();
        doubleEndedStack.push(1);
        doubleEndedStack.push(2);
        doubleEndedStack.push(3);
        doubleEndedStack.push(4);
        doubleEndedStack.push(5);
        while (!doubleEndedStack.isEmpty()) {
            System.out.printf("%d ", doubleEndedStack.pop());
        }

        System.out.println(LINE_BREAK);

        doubleEndedStack.push(1);
        doubleEndedStack.push(2);
        doubleEndedStack.push(3);
        doubleEndedStack.push(4);
        doubleEndedStack.push(5);
        while (!doubleEndedStack.isEmpty()) {
            System.out.printf("%d ", doubleEndedStack.popBottom());
        }
    }
}
