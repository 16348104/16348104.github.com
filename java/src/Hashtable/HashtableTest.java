package Hashtable;

import java.util.Hashtable;

/**
 * Created by Administrator on 2015/11/1.
 */
public class HashtableTest<I, I1> {
    public static void main(String[] args) {

        Hashtable<Integer, String> num = new Hashtable<>();
        num.put(1, "a");
        num.put(1, "b");
        num.put(1, "c");
        num.put(1, "d");
        num.put(1, "e");
        for (Integer integer : num.keySet()) {
            System.out.println(num.keySet()+"-->"+num.get(integer));
        }

    }

}


