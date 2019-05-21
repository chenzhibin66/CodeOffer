package com.nuc.calvin.Fibonacci;

/**
 * @author Calvin
 * @Description:大家都知道斐波那契数列，现在要求输入一个整数n， 请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<= 3 9
 * 0 1 1 2 3 5 8 13 21 34....
 * @Date:Created on 20:57 2019/5/21
 */
public class Main {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fibonacci(n));
    }

    public static int Fibonacci(int n) {
        int preNum = 1;
        int prePreNum = 0;
        int result = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            result = preNum + prePreNum;
            prePreNum = preNum;
            preNum = result;
        }
        return result;
    }
}
