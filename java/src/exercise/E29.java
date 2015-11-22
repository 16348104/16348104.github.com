package exercise;


import java.util.Scanner;

/**
 * Created by xdx on 2015/11/19.
 * 求一个3*3矩阵对角线元素之和。
 */
public class E29 {
    public static void main(String[] args) {
        int s = 0;
        System.out.println("请输入整数：");
        Scanner scanner = new Scanner(System.in);
//        int a[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] a = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = scanner.nextInt();
//
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    s += a[i][j];}
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("3*3矩阵对角线元素之和:" + s);
    }

}
