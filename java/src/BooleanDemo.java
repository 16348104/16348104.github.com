/**
 * Created by Administrator on 2015/10/18.
 */
public class BooleanDemo {

        public static void main(String[] args) {
            boolean a = true;
            boolean b = true;
            boolean c = false;
            boolean d = false;
            System.out.println("---- & ----");
            System.out.println(a & b);// true
            System.out.println(a & c);
            System.out.println(c & a);
            System.out.println(c & d);

            System.out.println("---- | ----");
            System.out.println(a | b);
            System.out.println(a | c);
            System.out.println(c | a);
            System.out.println(c | d);// false

            System.out.println("---- ^ ----");
            System.out.println(a ^ b);// false
            System.out.println(a ^ c);
            System.out.println(c ^ a);
            System.out.println(c ^ d);// false

            System.out.println("---- ! ----");
            System.out.println(!a);// false
            System.out.println(!c);// true

            System.out.println("---- && ----");
            System.out.println(a && b);//true
            System.out.println(a && c);
            System.out.println(c && a);
            System.out.println(c && d);

            System.out.println("---- || ----");
            System.out.println(a || b);
            System.out.println(a || c);
            System.out.println(c || a);
            System.out.println(c || d);//false

            System.out.println("------------");
            int x = 0;
            int y = 1;

//        System.out.println(x > y);
//        System.out.println(x++);
//        System.out.println(x);

            System.out.println((x > y) && (x++  > 0));
            System.out.println("x = " + x);
        }

    }
