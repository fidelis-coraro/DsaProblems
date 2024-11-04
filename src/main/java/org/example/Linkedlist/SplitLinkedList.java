package org.example.Linkedlist;

public class SplitLinkedList {
    public static ListNode[] splitListToParts(ListNode head, int k) {
        if (head == null) {
            return new ListNode[0];
        }

        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        int partLength = length / k;
        int extraNodes = length % k;

        // Declare the parts array here
        ListNode[] parts = new ListNode[k];

        current = head;
        for (int i = 0; i < k; i++) {
            parts[i] = current;
            int len = partLength + (i < extraNodes ? 1 : 0);
            for (int j = 0; j < len - 1; j++) {
                current = current.next;
            }
            ListNode nextPart = current.next;
            current.next = null;
            current = nextPart;
        }

        return parts;
    }

    // Assuming the ListNode class is defined elsewhere (outside SplitLinkedList)
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }


}
