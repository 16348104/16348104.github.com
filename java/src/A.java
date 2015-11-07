/**
 * Created by Administrator on 2015/11/7.
 */
public class A {
    int a;
    static int b;

    public void setA(int i) {
        a = i;
        b = i + 1;
    }

    public int getA() {
        return a;
    }

    public static void setB(int i) {
        b += i;

    }

    public static int getB() {
        return b;
    }
}
