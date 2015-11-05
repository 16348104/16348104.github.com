package exception;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Administrator on 2015/11/1.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        String[] sr = new String[10];
        int x = 1;
        int y = 0;
        try {
            System.out.println(x / y);
            System.out.println(sr[11]);
            System.out.println("hi");
        } catch (ArrayIndexOutOfBoundsException e) {

        } catch (ArithmeticException e) {
        } finally {
            System.out.println("hello");
        }
    }

}
