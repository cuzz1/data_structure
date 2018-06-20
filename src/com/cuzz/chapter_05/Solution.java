package com.cuzz.chapter_05;



public class Solution {
    /**
     * @param head: a ListNode
     * @param val: An integer
     * @return: a ListNode
     */
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;

    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 1, 2, 3, 3,};
        ListNode node = new ListNode(arr);
        System.out.println(node);
        ListNode res = Solution.removeElements(node, 3);
        System.out.println(res);

    }
}
