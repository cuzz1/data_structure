package com.cuzz.chapter_02;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(10);
        for (int i = 0; i < 10; i++) {
            array.addList(i);
        }

        System.out.println(array);
    }
}
