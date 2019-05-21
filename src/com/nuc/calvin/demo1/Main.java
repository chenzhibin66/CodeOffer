package com.nuc.calvin.demo1;

/**
 * @author Calvin
 * @Description:在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @Date:Created on 21:19 2019/5/13
 */
public class Main {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 3;
        System.out.println(Find(target, array));
    }

    public static boolean Find(int target, int[][] array) {
        int row = 0;
        int column = array.length - 1;
        while (column > 0 && row <= array[0].length - 1) {
            if (array[row][column] > target) {
                column--;
            } else if (array[row][column] < target) {
                row++;
            } else {
                return true;
            }
        }
        return false;
    }
}
