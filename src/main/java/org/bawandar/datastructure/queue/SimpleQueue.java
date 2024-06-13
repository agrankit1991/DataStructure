package org.bawandar.datastructure.queue;

import java.util.LinkedList;
import java.util.List;

public class SimpleQueue<T> implements Queue<T> {
    private final List<T> queue;

    public SimpleQueue() {
        this.queue = new LinkedList<>();
    }

    @Override
    public void enqueue(T data) {
        queue.add(data);
    }

    @Override
    public T dequeue() {
        return queue.removeFirst();
    }

    @Override
    public T peek() {
        return queue.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        final Queue<Integer> queue = new SimpleQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        while (!queue.isEmpty()) {
            System.out.printf("%d ", queue.dequeue());
        }

    }
}
