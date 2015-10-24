package exercise;

import java.util.Random;

/**
 * Created by xdx on 2015/10/24.
 */
public class E34 {
    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            int a;
            a = (int) (1 + Math.random() * 20);

            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------------"+"另外一种方法"+"---------------------------------------------------------------------");
        for (int j = 0; j < 1000; j++) {

            Random r = new Random();
            int b=r.nextInt(20)+1;
        System.out.print(b+" ");

        }
    }
}
