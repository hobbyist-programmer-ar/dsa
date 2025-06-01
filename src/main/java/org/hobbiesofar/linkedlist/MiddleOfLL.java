package org.hobbiesofar.linkedlist;

class MiddleOfLL {
    public static class Node<T> {
            public T val;
            public Node<T> next;

            public Node(T val) {
                this(val, null);
            }

            public Node(T val, Node<T> next) {
                this.val = val;
                this.next = next;
            }
        }
        public static int middleOfLinkedList(Node<Integer> head) {
            // WRITE YOUR BRILLIANT CODE HERE
            Node<Integer> fast = head;
            Node<Integer> slow = head;

            while(fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }

            return slow.val;
        }
}
