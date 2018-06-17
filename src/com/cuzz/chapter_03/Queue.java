package com.cuzz.chapter_03;

public interface Queue<E> {
    int getSize();
    boolean isEmpty();
    void enquene(E e);
    E dequene();
    E getFront();
}
