package exercise;

/**
 * Created by dell on 2015/10/29.
 * 求100之内的素数。
 */
public class E27 {
    public static void main(String[] args) {
        for (int i = 2; i < 101; i++) {
            boolean b = true;
            for (int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {

                System.out.print(i + " ");
            }
        }

    }
}