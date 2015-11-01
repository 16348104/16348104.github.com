package pass;

/**
 * Created by Administrator on 2015/11/1.
 */




    public class Passtest {

        private int i;// Integer

        public static void method(Passtest passTest) {// 形式参数
            System.out.println("b: i = " + passTest.i);
            passTest.i += 1000;
            System.out.println("c: i = " + passTest.i);
        }

        public static void test(String string) {
            string += "test";
        }

        public static void integerTest(Integer i) {
            i++;
        }

        public static void main(String[] args) {
            Passtest passTest = new Passtest();
//        passTest.i = 0;
            System.out.println("a: i = " + passTest.i);
            method(passTest);// 实际参数
            System.out.println("d: i = " + passTest.i);// ?

            String string = "测试";
            test(string);
            System.out.println(string);

            int i = 0;
            integerTest(i);
            System.out.println(i);
        }
    }



