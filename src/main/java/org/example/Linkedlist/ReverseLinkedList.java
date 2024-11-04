package org.example.Linkedlist;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null, next = null;
        ListNode current = head;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
