/**
 * Created by xdx on 2015/11/5.
 */
public class Variabel {

    public static void main(String[] args) {
        m(1);
    }

    public static void m(int k) {

        int i = 100;
        System.out.println(i);
        int j = 0;
        System.out.println(j);
        System.out.println(k);
        test();
//        int l = 10;
        for (int l = 0; l < 10; l++) {
            for (int m = 0; m < 100; m++) {
                System.out.println(m);
            }
//            System.out.println(m);
        }


        for (int l = 0; l < 10; l++) {
            System.out.println(l);
        }
    }

    public static void test() {
        System.out.println(i);
//        System.out.println(j);
//        m(1);
    }


    private static int i;

}
