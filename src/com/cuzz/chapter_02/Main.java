package com.cuzz.chapter_02;

public class Main {
    public static void main(String[] args) {
        Array<String> array = new Array<>();
        for (int i = 0; i < 20; i++) {
            array.addList(i + "");
        }

        array.add(1, "aa");
        System.out.println(array);

        array.remove(2);
        System.out.println(array);

        array.removeFirst();
        System.out.println(array);

        for (int i = 0; i < 15; i++) {
            array.removeFirst();
            System.out.println(array);
        }


    }
}
