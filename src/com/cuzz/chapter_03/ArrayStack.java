package com.cuzz.chapter_03;

import com.cuzz.chapter_02.Array;

public class ArrayStack<E> implements Stack<E>{

    Array<E> array;

    public ArrayStack(int capacity) {
        array = new Array<>(capacity);
    }

    public ArrayStack() {
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
    public void push(E e) {
        array.addList(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Stack: ");
        sb.append("[");
        for (int i = 0; i < array.getSize(); i++) {
            sb.append(array.get(i) + ", ");
        }
        sb.replace(sb.length()-2, sb.length(), "]");
        sb.append(" top");
        return sb.toString();
    }
}
