package exception;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Administrator on 2015/11/1.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        String[] sr = new String[10];
        try {

        System.out.println(sr[11]);
        }catch (ArrayIndexOutOfBoundsException e){

        }
        System.out.println("hello");
    }

}
