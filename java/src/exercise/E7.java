package exercise; /**
 * Created by xdx on 2015/10/23.
 * //输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 */

import java.util.Scanner;

public class E7 {

    public static void main(String[] args) {
        System.out.println("请输入一行字符: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int other = 0;             //其它
        int digit = 0;              //数字
        int space = 0;            //空格
        int character = 0;      //字母
        int chinese = 0;            //中文
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) < '9') {
                digit++;              //判断数字
            } else if ((s.charAt(i) >= 'a' && s.charAt(i) < 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                character++;      //判断英文
            } else if (s.charAt(i) >= '\u4e00' && s.charAt(i) <= '\u9fa5') {
                chinese++;             //判断中文
            } else if (s.charAt(i) == ' ') {
                space++;           //判断空格
            } else {
                other++;        //判断其它
            }
        }
        System.out.println("数字：" + digit + '个');
        System.out.println("英文：" + character + '个');
        System.out.println("中文：" + chinese + '个');
        System.out.println("空格：" + space + '个');
        System.out.println("其它：" + other + '个');
    }

}


