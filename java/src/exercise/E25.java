package exercise;

import java.util.Scanner;

/**
 * Created by dell on 2015/10/29.
 * 一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 */
public class E25 {
    public static void main(String[] args) {
        int val, m, sum = 0;
        System.out.println("请输入一个正整数：");
        Scanner scanner = new Scanner(System.in);
        val = scanner.nextInt();
        m = val;


        while (m != 0) {
            sum = sum * 10 + m % 10;
            m = m / 10;

        }


        if (val == sum) {
            System.out.println("Yes！");
        } else {
            System.out.println("No! ");
        }
    }

}
