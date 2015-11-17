package collection;

import java.util.Vector;

/**
 * Created by xdx on 2015/11/6.
 */
public class VectorTest {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<String>();
        vector.add("a");
        vector.add("s");
        vector.add("d");
        vector.add("f");
        vector.add("dghghghghghghg");
        System.out.println(vector.size());
        System.out.println(vector.get(4));
        vector.clear();
        System.out.println(vector.size());
        Vector<Integer> vector1 = new Vector<Integer>();
        vector1.add(100);
        System.out.println(vector1.get(0));

    }
}
