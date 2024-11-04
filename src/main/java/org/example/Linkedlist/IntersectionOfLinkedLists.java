package org.example.Linkedlist;

public class IntersectionOfLinkedLists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
        {
            return null;
        }

        ListNode ptr1 = headA, ptr2 = headB;

        // If they meet, they will meet at the intersection point.
        // If they don't, they will both reach the end at the same time.
        while (ptr1 != ptr2) {
            ptr1 = ptr1 == null ? headB : ptr1.next;
            ptr2 = ptr2 == null ? headA : ptr2.next;
        }

        return ptr1;
    }


    public class ListNode {
        int val;
        IntersectionOfLinkedLists.ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }


}
