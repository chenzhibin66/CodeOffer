package com.nuc.calvin.demo17;

/**
 * @author Calvin
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        int[] sequence = new int[]{9, 6, 8, 5, 2, 1, 0};
        System.out.println(VerifySquenceOfBST(sequence));
    }

    public static boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0) {
            return false;
        }
        return IsTreeBST(sequence, 0, sequence.length - 1);

    }

    private static boolean IsTreeBST(int[] sequence, int start, int end) {
        if (start >= end) {
            return true;
        }
        int i = start;
        for (; i < end; i++) {
            if (sequence[i] > sequence[end]) {
                break;
            }
        }
        for (int j = i; j < end; j++) {
            if (sequence[j] < sequence[end]) {
                return false;
            }
        }
        return IsTreeBST(sequence, start, i - 1) && IsTreeBST(sequence, i, end - 1);
    }
}
