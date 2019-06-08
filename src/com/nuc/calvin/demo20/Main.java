package com.nuc.calvin.demo20;

import java.util.Arrays;

/**
 * @author Calvin
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 2, 2, 2, 2, 5, 4, 2};
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
