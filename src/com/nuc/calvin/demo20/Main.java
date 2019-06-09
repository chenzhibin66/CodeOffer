package com.nuc.calvin.demo20;

import java.util.Arrays;

/**
 * @author Calvin
 * @Description:数组中有一个数字出现的次数超过数组长度的一半，
 * 请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，
 * 超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,2,4,2,5,2,3};
        System.out.println(MoreThanHalfNum_Solution(a));

    }

    public static int MoreThanHalfNum_Solution(int[] array) {
        int n = array.length;
        int count = 0;
        if (n < 1) {
            return 0;
        }
        Arrays.sort(array);

        int num = array[n / 2];
        for (int i = 0; i < n; i++) {
            if (num == array[i]) {
                count++;
            }
        }
        if (count <= n / 2) {
            return 0;
        }
        return num;
    }
}
