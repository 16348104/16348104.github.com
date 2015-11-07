/**
 * Created by Administrator on 2015/11/7.
 */
public class E3_7 {
    public static void main(String[] args) {
        A x = new A();
        A y = new A();
        x.setA(5);
        y.setA(10);
        System.out.println("x.a=" + x.getA() + ",y.a=" + y.getA());
        x.setB(-5);
        y.setB(-10);
        System.out.println("x.b=" + x.getB() + ",y.b=" + y.getB());
    }
}
