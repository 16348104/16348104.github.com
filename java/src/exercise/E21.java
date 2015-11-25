package exercise;

/**
 * Created by XDX on 2015/11/26.
 * 求1+2!+3!+…+20!的和
 */
public class E21 {
    public static void main(String[] args) {
        long fun=0;
        int s = 1;
        for (int i = 1; i <= 20; i++) {
            s*=i;
            fun += s;
        }
        System.out.println(fun);
    }
}
