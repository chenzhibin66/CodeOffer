package com.nuc.calvin.RebuildBinaryTree;

/**
 * @author Calvin
 * @Description:输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树并输出后序遍历。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @Date:Created on 21:28 2019/5/16
 */
public class Main {
    public static void main(String[] args) {
        int[] pre = new int[]{1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = new int[]{4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode tree = reBuildBinaryTree(pre, in);
        postorderTraversal(tree);
    }


    public static TreeNode reBuildBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null) {
            return null;
        }
        TreeNode tree = reBuildHelp(pre, in, 0, pre.length - 1, 0, in.length - 1);
        return tree;
    }

    private static TreeNode reBuildHelp(int[] pre, int[] in, int startPre, int endPre, int startIn, int endIn) {
        if (startPre > endPre) {
            return null;
        }
        TreeNode root = new TreeNode(pre[startPre]);
        root.left = null;
        root.right = null;
        if (startPre == endPre && startIn == endIn) {
            return root;
        }
        int index = 0;
        for (index = startIn; index <= endIn; index++) {
            if (in[index] == pre[startPre]) {
                break;
            }
        }
        int leftLength = index - startIn;
        int rightLength = endIn - index;
        if (leftLength > 0) {
            root.left = reBuildHelp(pre, in, startPre + 1, startPre + leftLength, startIn, index - 1);
        }
        if (rightLength > 0) {
            root.right = reBuildHelp(pre, in, startPre + leftLength + 1, endPre, index + 1, endIn);
        }
        return root;
    }

    private static void postorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            postorderTraversal(root.left);
        }
        if (root.right != null) {
            postorderTraversal(root.right);
        }
        System.out.print(root.val);

    }

}
