package com.nuc.calvin.demo16;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Calvin
 * @Description:从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Main {
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        while (!deque.isEmpty()) {
            TreeNode t = deque.pop();
            list.add(t.val);
            if (t.left != null) {
                deque.add(t.left);
            }
            if (t.right != null) {
                deque.add(t.right);
            }
        }
        return list;
    }
}
