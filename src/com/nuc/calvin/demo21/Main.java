package com.nuc.calvin.demo21;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Calvin
 * @Description:输入n个整数，找出其中最小的K个数。 例如输入4, 5, 1, 6, 2, 7, 3, 8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class Main {
    public static void main(String[] args) {
        int[] input = new int[]{4, 5, 1, 6, 2, 7, 3, 8};
        System.out.println(GetLeastNumbers_Solution(input, 4));
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        if (input.length < k || k == 0) {
            return list;
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < input.length - 1 - i; j++) {
                if (input[j] < input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
            list.add(input[input.length - 1 - i]);
        }
        return list;
    }
}
