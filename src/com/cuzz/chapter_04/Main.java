package com.cuzz.chapter_04;

import com.cuzz.chapter_03.ArrayStack;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        System.out.println(linkedList);
        linkedList.add(2,233);
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);

        LinkedListStack<Integer> stack = new LinkedListStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
    }
}
