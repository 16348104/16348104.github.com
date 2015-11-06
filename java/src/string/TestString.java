package string;


import java.util.Scanner;

/**
 * Created by Administrator on 2015/10/31.
 */
public class TestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
//        String str = "abc";
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'a' && c[i] <= 'z') {
                c[i] -= 32;
            }
        }
        System.out.println(new String(c));
        String[] strings = {"a", "bc", "def"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        for (String s : strings) {
            System.out.println(s);
        }
//        for (String string : strings) {// 迭代 循环
//            System.out.println(string);
//        }
    }
}
