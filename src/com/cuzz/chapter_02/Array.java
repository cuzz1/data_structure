package com.cuzz.chapter_02;

public class Array {
    private int[] data;
    private int size;

    // 构造函数, 传入数组的容量capacity构造函数
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    // 无参的构造器, 默认数组的容量capacity=10
    public Array() {
        this(10);
    }

    // 获取数组中元素的个数
    public int getSize() {
        return size;
    }

    // 获取数组的容量
    public int getCapacity() {
        return data.length;
    }

    // 是否为空
    public boolean isEmpty() {
        return size == 0;
    }
}
