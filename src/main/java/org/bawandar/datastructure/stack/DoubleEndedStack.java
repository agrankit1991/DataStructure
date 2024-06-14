package org.bawandar.datastructure.stack;

public interface DoubleEndedStack<T> extends Stack<T> {
    void pushBottom(final T data);
    T popBottom();
    T peekBottom();
}
