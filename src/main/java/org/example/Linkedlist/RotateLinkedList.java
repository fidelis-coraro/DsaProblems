package org.example.Linkedlist;

public class RotateLinkedList {
    public static IntersectionOfLinkedLists.ListNode rotateRight(IntersectionOfLinkedLists.ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        int length = 1;
        IntersectionOfLinkedLists.ListNode current = head;
        while (current.next != null)
        {
            current = current.next;
            length++;
        }

        k = k % length;
        if (k == 0) {
            return head;

        }

        current.next = head; // Connect the tail to the head
        int newLength = length - k;
        current = head;
        for (int i = 0; i < newLength - 1; i++) {
            current = current.next;
        }
        IntersectionOfLinkedLists.ListNode newHead = current.next;
        current.next = null;

        return newHead;
    }


}
