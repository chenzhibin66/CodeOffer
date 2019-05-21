package com.nuc.calvin.demo8;

/**
 * @author Calvin
 * @Description:一只青蛙一次可以跳上1级台阶，也可以跳上2级。 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * @Date:Created on 21:02 2019/5/21
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(JumpFloor(4));
    }

    private static int JumpFloor(int target) {
        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int one = 1;
        int two = 2;
        int result = 0;
        for (int i = 2; i < target; i++) {
            result = one + two;
            one = two;
            two = result;
        }
        return result;
    }
}
