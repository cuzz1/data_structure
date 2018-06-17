package com.cuzz.chapter_03;


import com.cuzz.chapter_02.Array;

public class ArrayQueue<E> implements Queue<E>{
    private Array<E> array;

    public ArrayQueue(int capacity) {
        array = new Array<>(capacity);
    }

    public ArrayQueue() {
        array = new Array<>();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void enquene(E e) {
        array.addList(e);
    }

    @Override
    public E dequene() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Queue: ");
        sb.append("front [");
        for (int i = 0; i < array.getSize(); i++) {
            sb.append(array.get(i) +", ");
        }
        sb.replace(sb.length()-2, sb.length(), "]");
        return sb.toString();
    }
}
