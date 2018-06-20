package com.cuzz.chapter_05;



public class Solution {
    /**
     * @param head: a ListNode
     * @param val: An integer
     * @return: a ListNode
     */
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);

        dummy.next = head;

        ListNode pre = dummy;
        while(pre.next != null) {
            if (pre.next.val == val) {
                ListNode node = pre.next;
                pre.next = node.next;
                node.next = null;
            } else {
                pre = pre.next;
            }

        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 1, 2, 3, 3,};
        ListNode node = new ListNode(arr);
        System.out.println(node);
        ListNode res = Solution.removeElements(node, 3);
        System.out.println(res);

    }
}
