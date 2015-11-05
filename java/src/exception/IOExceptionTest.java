package exception;

import java.io.IOException;

/**
 * Created by xdx on 2015/11/5.
 */
public class IOExceptionTest {
    public static void test() throws IOException {
  throw  new IOException();
    }
    public  static void main(String[] args) {
        try {
            test();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("hello");

    }
}
