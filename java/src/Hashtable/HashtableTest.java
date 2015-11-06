package Hashtable;

import java.util.Hashtable;

/**
 * Created by Administrator on 2015/11/1.
 */
public class HashtableTest<I, I1> {
    public static void main(String[] args) {

        Hashtable<Integer, String> num = new Hashtable<>();
        num.put(1, "a");
        num.put(2, "b");
        num.put(3, "c");
        num.put(4, "d");
        num.put(4, "e");

        System.out.println(num.size());
        System.out.println(num.get(1));
        System.out.println(num.keySet());
        for (Integer i : num.keySet()) {//for-each 循环 iter + Tab
            System.out.println();
        }
        for (Integer integer : num.keySet()) {
            System.out.println(integer + "-->" + num.get(integer));
        }

    }

}


