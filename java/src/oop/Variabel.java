package oop;

/**
 * Created by xdx on 2015/11/5.
 */
public class Variabel {

    public static void main(String[] args) {
        m(1);
    }

    public static void m(int k) {
        //参数k局部变量
        int i = 100;//方法内部同名变量i比域i运算级高
        System.out.println("i:" + i);
        int j = 0;
        System.out.println("j:" + j);
        System.out.println("k:" + k);
        test();//可以用test（）
//        int l = 10;//重复定义变量
        for (int l = 0; l < 10; l++) {
            for (int m = 0; m < 100; m++) {
                System.out.println("m:" + m);
            }
//            System.out.println(m);//变量m是块作用域
        }
        for (int l = 0; l < 10; l++) {
            System.out.println("l:" + l);
        }
    }

    public static void test() {
        System.out.println("i:" + i);
//       System.out.println(j);
        m(1);//可以用m()
    }


    private static int i;//任意位置定义

}
