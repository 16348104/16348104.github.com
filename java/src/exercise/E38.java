package exercise;

import java.util.Scanner;

/**
 * Created by xdx on 2015/11/19.
 * 写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
 */
public class E38 {
    public static int m(String s) {
        return s.length();
    }

    public static void main(String[] args) {
        System.out.println("请输入一串字符：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(m(str));
    }
}
