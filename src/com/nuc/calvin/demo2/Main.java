package com.nuc.calvin.demo2;

/**
 * @author Calvin
 * @Description:请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * @Date:Created on 19:37 2019/5/14
 */
public class Main {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We Are Happy");
        System.out.println(replaceSpace(str));
        ;
    }

    public static String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        StringBuffer newS = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                newS.append('%');
                newS.append('2');
                newS.append('0');
            } else {
                newS.append(str.charAt(i));
            }
        }
        return newS.toString();
    }
}
