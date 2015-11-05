package exception;

/**
 * Created by xdx on 2015/11/5.
 */
public class ET
{
    public static void createException() {
        throw new ArrayIndexOutOfBoundsException();
    }

    public static void method() {
        try {
            createException();
            System.out.println("a");
        } catch (ArithmeticException e) {
            System.out.println("b");
        } finally {
            System.out.println("c");// 1
        }
        System.out.println("d");
    }

    public static void main(String[] args) {
        try {
            method();
            System.out.println("e");
        } catch (Exception e) {
            System.out.println("f");// 2
        } finally {
            System.out.println("g");// 3
        }
        System.out.println("h");// 4
    }

}
