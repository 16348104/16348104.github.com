package exercise;

import java.util.Scanner;

/**
 * Created by dell on 2015/10/28.
 * 输入三个整数x，y，z，请把这三个数由小到大输出。
 * 冒泡法
 */
public class E15 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k = 0;
        int t = 0;//临时
        Scanner input = new Scanner(System.in);
        System.out.print("请输入第一个数\n");
        i = input.nextInt();
        System.out.print("请输入第二个数\n");
        j = input.nextInt();
        System.out.print("请输入第三个数\n");
        k = input.nextInt();
        if (i > j) {
            t = i;
            i = j;
            j = t;
        }
        if (i > k) {
            t = i;
            i = k;
            k = t;
        }
        if (j > k) {
            t = j;
            j = k;
            k = t;
        }
        System.out.println("排列后："+i + ", " + j + ", " + k);
    }

}

