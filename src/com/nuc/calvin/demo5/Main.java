package com.nuc.calvin.demo5;

/**
 * @author Calvin
 * @Description:用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @Date:Created on 14:31 2019/5/17
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.push(1);
        solution.push(2);
        solution.push(3);
        System.out.println(solution.pop());
        System.out.println(solution.pop());
        System.out.println(solution.pop());

    }


}
