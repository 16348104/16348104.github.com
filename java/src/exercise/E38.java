package exercise;

import java.util.Scanner;

/**
 * Created by xdx on 2015/11/19.
 * 写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
 */
public class E38 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String string = scanner.next();
        System.out.println("字符串长度："+mystr(string));
    }

   static int mystr(String s) {
      return s.length();
   }

}
