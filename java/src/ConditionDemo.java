/**
 * Created by Administrator on 2015/10/18.
 */
public class ConditionDemo {
    public static void main(String[] args) {
        boolean x = (100%1000>10)?true:false;
        System.out.println(x);
        System.out.println("-----------");

        int a = 100;
        int b = 1;

        String s1 = "hello,";
        String s2 = " world!";
        System.out.println(a + b);
        System.out.println(s1 + s2);

        System.out.println((b + a) + "..."+ a);
    }
}
