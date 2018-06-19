package com.cuzz.chapter_04;

import com.cuzz.chapter_03.Queue;

public class LinkedlistQueue<E> implements Queue<E>{

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

    private Node head, tail;
    private int size;

    public LinkedlistQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E e) {
        if (tail == null) {
            tail = new Node(e);
            head = tail;
        } else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size ++;

    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("cannot dequeue from an empty queue");
        }
        Node node = head;
        head = head.next;
        node.next = null;
        if (head == null) {
            tail = null;
        }

        return node.e;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
           throw new IllegalArgumentException("Queue is empty");
        }
        return head.e;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Queue: front ");
        Node cur = head;
        while(cur != null) {
            sb.append(cur + "->");
            cur = cur.next;
        }
        sb.replace(sb.length()-2, sb.length(), "");
        return sb.toString();
    }
}
