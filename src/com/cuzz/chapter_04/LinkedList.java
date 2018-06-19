package com.cuzz.chapter_04;

public class LinkedList<E> {

    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node(){
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedList() {
        dummyHead = new Node();
        size = 0;
    }

    // 获取元素的个数
    public int getSize() {
        return size;
    }

    // 返回链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 在链表头添加新的元素
    public void addFirst(E e) {
        add(0 , e);
    }

    // 添加元素
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Illegal index");
        }

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node node = new Node(e);
        node.next = prev.next;
        prev.next = node;

        size ++;
    }

    // 在链表末尾添加新的元素
    public void addList(E e) {
        add(size, e);
    }

    // 获取一个index元素
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("get Failed, illegal index");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    // 获取链表的第一个元素
    public E getFirst() {
        return get(0);
    }

    // 获取链表的最后的一个元素
    public E getList() {
        return get(size - 1);
    }

    // 修改
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("set failed, illegal index");
        }

        Node cur = dummyHead.next;

        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    // 查找链表中是否有元素
    public boolean contains(E e) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (cur.e.equals(e)) {
                return true;
            }
        }
        return false;
    }

    // 从链表中删除元素
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("remove failed, index illegal");
        }

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        Node node = prev.next;
        prev.next = node.next;
        node.next = null;
        size--;

        return node.e;
    }

    // 删除第一个元素返回
    public E removeFirst() {
        return remove(0);
    }

    // 删除最后一个元素
    public E removeLast() {
        return remove(size - 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Node cur = dummyHead.next;
        while (cur != null) {
            cur = cur.next;
            sb.append(cur + "->");
        }
        sb.delete(sb.length()-2, sb.length());
        return sb.toString();
    }
}
