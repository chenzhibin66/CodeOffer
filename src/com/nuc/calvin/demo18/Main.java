package com.nuc.calvin.demo18;

import java.util.ArrayList;

/**
 * @author Calvin
 * @Description:输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(8);
        TreeNode node5 = new TreeNode(9);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.right=node5;
        System.out.println(FindPath(root,13));
    }

    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        if (root == null) {
            return arrayList;
        }
        int sum = 0;
        pa(root, target, arrayList, list, sum);
        return arrayList;
    }

    private static void pa(TreeNode root, int target, ArrayList<ArrayList<Integer>> arrayList, ArrayList<Integer> list, int sum) {
        if (root == null) {
            return;
        }
        sum += root.val;
        if (root.left == null && root.right == null) {
            if (sum == target) {
                list.add(root.val);
                arrayList.add(new ArrayList<Integer>(list));
                list.remove(list.size() - 1);
            }
            return;
        }
        list.add(root.val);
        pa(root.left, target, arrayList, list, sum);
        pa(root.right, target, arrayList, list, sum);
        list.remove(list.size() - 1);
    }
}
