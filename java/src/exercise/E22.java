package exercise;

import java.util.Scanner;

/**
 * Created by XDX on 2015/11/26.
 * 利用递归方法求5!。
 */
public class E22 {
    int fun(int n) {
        if (n == 1) {
            return 1;
        }
        return fun(n - 1) * n;
    }
    public static void main(String[] args) {
        System.out.println("输入一个正整数：");
        Scanner scanner=new Scanner(System.in);
        int s = scanner.nextInt();
        E22 e2 = new E22();
        System.out.println(e2.fun(s));

    }
}
