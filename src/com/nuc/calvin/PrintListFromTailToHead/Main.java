package com.nuc.calvin.PrintListFromTailToHead;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Calvin
 * @Description:输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。 实现思路：利用栈先进后出的原理
 * @Date:Created on 21:43 2019/5/14
 */
public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(7);
        ListNode node4 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        System.out.println(printListFromTailToHead(node1));
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode head) {
        if (head == null) {
            return null;
        }
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> listNodes = new ArrayList<>();
        while (head != null) {
            stack.add(head.val);
            head = head.next;
        }
        while (!stack.isEmpty()) {
            listNodes.add(stack.pop());
        }
        return listNodes;
    }
}
