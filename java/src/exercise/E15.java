package exercise;

import java.util.Scanner;

/**
 * Created by dell on 2015/10/28.
 * 输入三个整数x，y，z，请把这三个数由小到大输出。
 */
public class E15 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k = 0;
        int x = 0;
        System.out.print("请输入第一个数\n");
        Scanner input = new Scanner(System.in);
        i = input.nextInt();
        System.out.print("请输入第二个数\n");
        j = input.nextInt();
        System.out.print("请输入第三个数\n");
        k = input.nextInt();
        if (i > j) {
            x = i;
            i = j;
            j = x;
        }
        if (i > k) {
            x = i;
            i = k;
            k = x;
        }
        if (j > k) {
            x = j;
            j = k;
            k = x;
        }
        System.out.println(i + ", " + j + ", " + k);
    }

}

