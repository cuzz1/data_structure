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
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.enqueue("d");
        System.out.println(queue);

        LoopQueue<String> loopQueue = new LoopQueue<>();
        loopQueue.enqueue("aa");
        loopQueue.enqueue("bb");
        loopQueue.enqueue("cc");
        loopQueue.enqueue("dd");
        loopQueue.enqueue("dd");
        System.out.println(loopQueue);
        loopQueue.dequeue();
        System.out.println(loopQueue);

    }
}
