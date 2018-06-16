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

    // 获取index索引位置的元素
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed, index is illegal");
        }
        return data[index];
    }

    // 修改index索引的元素
    public void set(int index, int e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Set failed, index is illegal");
        }
        data[index] = e;
    }

    // 查找数组中是否有元素e
    public boolean contains(int e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return true;
            }
        }
        return false;
    }

    // 查找数组中的元素e所在的索引，如果不存在元素e,则返回-1
    public int find(int e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return i;
            }
        }
        return -1;
    }

    // 删除数值第index位置的元素, 并返回该元素
    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("remove filed, index is illegal");
        }

        int res = data[index];

        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size --;
        return res;
    }

    // 从数组中移除第一个元素
    public int removeFirst() {
        return remove(0);
    }

    // 从数值移除最后一个元素
    public int removeLast() {
        return remove(size - 1);
    }

    // 从数值中删除元素e
    public void removeElement(int e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    @Override
    public String toString() {
        StringBuffer res = new StringBuffer();
        res.append(String.format("Array: size = %d, capacity = %d\n",size, data.length));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i] + ", ");
        }
        res.replace(res.length()-2, res.length(), "]");
        return res.toString();
    }
}
