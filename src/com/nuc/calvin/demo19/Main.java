package com.nuc.calvin.demo19;

/**
 * @author Calvin
 * @Description:输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Main {

    public TreeNode Convert(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        }
        TreeNode left = Convert(root.left);
        TreeNode p = left;
        while (p != null && p.right != null) {
            p = p.right;
        }
        if (left != null) {
            p.right = root;
            root.left = p;
        }
        TreeNode right = Convert(root.right);
        if (right != null) {
            root.right = right;
            right.left = root;
        }
        return left != null ? left : root;
    }
}
