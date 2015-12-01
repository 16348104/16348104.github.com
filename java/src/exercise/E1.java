package exercise;

import sun.org.mozilla.javascript.internal.Function;

/**
 * Created by xdx on 2015/12/1.
 * 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的兔子总数为多少？
 */
public class E1 {
    public static void main(String[] args) {
        math m1 = new math();
        for (int i = 0; i < 12; i++) {
            System.out.println(m1.fun(i));
        }
    }

}

class math {
    public int fun(int f) {
        if (f == 1 || f == 2)
            return 1;
        else
            return
                    fun(f - 1) + fun(f - 2);

    }
}
