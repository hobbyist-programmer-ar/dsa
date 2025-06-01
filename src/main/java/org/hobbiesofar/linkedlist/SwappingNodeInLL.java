package org.hobbiesofar.linkedlist;

class SwappingNodeInLL {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode swapNodes(ListNode head, int k) {
        ListNode kthNodeFromStart = head;

        while(--k > 0) {
            kthNodeFromStart = kthNodeFromStart.next;
        }

        ListNode kthNodeFromEnd = head;
        ListNode current = kthNodeFromStart;

        while(current.next != null) {
            current = current.next;
            kthNodeFromEnd = kthNodeFromEnd.next;
        }

        int tempVal = kthNodeFromEnd.val;
        kthNodeFromEnd.val = kthNodeFromStart.val;
        kthNodeFromStart.val = tempVal;

        return head;
    }
}
