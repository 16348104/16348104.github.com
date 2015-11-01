package exercise;

import Hashtable.HashtableTest;

import java.util.Hashtable;
import java.util.Random;

/**
 * Created by xdx on 2015/10/24.
 */
//随机生成[1， 20]数10000次，使用两种方法实现（java.lang.Math，java.util.Random），
//并判断两种方法的效率和分布。


public class E34 {

    public static void main(String[] args) {
        Hashtable<Integer, Integer> has = new Hashtable<>();
        for (int i = 0; i < 20; i++) {
            has.put(i = 1, 0);
        }
        long s1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int a;
            a = (int) (1 + Math.random() * 20);
            System.out.print(a + " ");
            has.put(a, has.get(a)+1);
        }
        System.out.println();
        System.out.println("time:" + (System.currentTimeMillis() - s1));

//        System.out.println("-------------------------------------------------------------------------"+"另外一种方法"+"---------------------------------------------------------------------");
//        long s2=System.currentTimeMillis();
//        for (int j = 0; j < 10000; j++) {
//            Random r = new Random();
//            int b=r.nextInt(20)+1;
//            System.out.print(b+" ");
//
//        }
//        System.out.println();
//        System.out.println("time:"+(System.currentTimeMillis()-s1));
    }
}


