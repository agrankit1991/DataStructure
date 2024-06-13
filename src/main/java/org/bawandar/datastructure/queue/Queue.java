package org.bawandar.datastructure.queue;

public interface Queue<T> {
    void enqueue(final T data);
    T dequeue();
    T peek();
    boolean isEmpty();
    int size();
}
