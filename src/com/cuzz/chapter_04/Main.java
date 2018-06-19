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

        LinkedlistQueue<Integer> queue = new LinkedlistQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
    }
}
