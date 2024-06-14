package org.bawandar.datastructure.stack;

public interface Stack<T> {
    void push(final T data);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
}
