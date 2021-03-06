package com.cuzz.chapter_05;

 public class ListNode {
     int val;
     ListNode next;

     public ListNode(int x) {
         val = x;
         next = null;
     }

     public ListNode(int[] arr) {
         if (arr == null || arr.length == 0) {
             throw new IllegalArgumentException("Array is empty");
         }
         this.val = arr[0];
         ListNode cur = this;
         for (int i = 1; i < arr.length; i++) {
             cur.next = new ListNode(arr[i]);
             cur = cur.next;
         }
     }

     @Override
     public String toString() {
         StringBuilder sb = new StringBuilder();
         ListNode cur = this;
         while (cur != null) {
             sb.append(cur.val + "->");
             cur = cur.next;
         }
         sb.append("null");
         return sb.toString();
     }
 }
