package com.cuzz.chapter_03;

public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);

        ArrayQueue<String> queue = new ArrayQueue<>();
        queue.enquene("a");
        queue.enquene("b");
        queue.enquene("c");
        queue.enquene("d");
        System.out.println(queue);

    }
}
