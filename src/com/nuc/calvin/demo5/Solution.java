package com.nuc.calvin.demo5;

import java.util.Stack;

/**
 * @author Calvin
 * @Description:用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @Date:Created on 14:33 2019/5/17
 */
public class Solution {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int val = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return val;
    }
}
