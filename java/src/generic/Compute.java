package generic;

import java.io.Serializable;

/**
 * Created by Administrator on 2015/11/1.
 */
public class Compute<T extends Object & Serializable & Comparable, S> {
    public String add(T x, S y) {
        return String.valueOf(x) + String.valueOf(y);
    }

    public static void main(String[] args) {
        Compute<Double, Boolean> co = new Compute<Double, Boolean>();
//        Compute <Integer>co= new Compute<>();

        System.out.println(co.add(2.5, false));
    }
}
