package com.cuzz.chapter_03;

import com.cuzz.chapter_02.Array;

import java.util.Random;

public class TestQueue {
    private static double testQueue(Queue<Integer> q, int count) {

        long startTime = System.nanoTime();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }

        while (!q.isEmpty()) {
            q.dequeue();
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {

        int count = 100000;
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        double time1 = testQueue(arrayQueue, count);

        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double time2 = testQueue(loopQueue, count);

        System.out.println("ArrayQueue time: " + time1 + "s");
        System.out.println("LoopQueue time: " + time2 + "s");
    }
}
