package com.nuc.calvin.demo12;

/**
 * @author Calvin
 * @Description:输入一个链表，输出该链表中倒数第k个结点。
 */
public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(7);
        ListNode node5 = new ListNode(0);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println( FindKthToTail(node1,2).val);
    }

    public static ListNode FindKthToTail(ListNode head, int k) {
        if (k < 1) {
            return null;
        }
        if (head == null) {
            return null;
        }
        ListNode oldHead = head;
        for (int i = 0; i <= k - 1; i++) {
            oldHead = oldHead.next;
        }
        ListNode newHead = head;
        if (oldHead == null) {
            return null;
        }
        while (oldHead != null) {
            oldHead = oldHead.next;
            newHead = newHead.next;
        }
        return newHead;
    }
}
