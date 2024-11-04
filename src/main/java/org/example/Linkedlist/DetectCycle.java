package org.example.Linkedlist;

public class DetectCycle {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head, fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;

            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;

    }

    // Assuming the ListNode class is defined elsewhere (outside DetectCycle)
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}

