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

    // 所有元素中添加一个新的元素
    public void addList(int e) {
        add(size, e);
    }

    // 在所有元素前添加一个新的元素
    public void addFirst(int e) {
        add(0, e);
    }

    // 在第index位置插入一个元素e
    public void add (int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("AddList failed");
        }

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("AddList failed");
        }

        for (int i = size - 1; i >= index; i--) {
            data[i+1] = data[i];
        }

        data[index] = e;
        size++;
    }

    @Override
    public String toString() {
        StringBuffer res = new StringBuffer();
        res.append(String.format("Array: size = %d, capacity = %d",size, data.length));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i] + ", ");
        }
        res.replace(res.length()-1, res.length(), "]");
        return res.toString();
    }
}
