package com.nuc.calvin.demo10;

/**
 * @author Calvin
 * @Description:输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Main {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(NumberOf1(n));
    }

    public static int NumberOf1(int n) {
        int count = 0;
        char[] ch = Integer.toBinaryString(n).toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '1') {
                count++;
            }
        }
        return count;
    }
}
