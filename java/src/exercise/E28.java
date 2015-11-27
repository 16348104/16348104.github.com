package exercise;

/**
 * Created by xdx on 2015/11/27.
 * 计算字符串中子串出现的次数
 */
public class E28 {
    public static void main(String[] args) {
        String str = "lenovo";
        String str1 = "o";
        int count = 0;
        int start = 0;
        while (str.indexOf(str1, start) >= 0 && start < str.length()) {
            count++;
            start = str.indexOf(str1, start) + str1.length();
        }
        System.out.println(str1 + "在" + str + "出现" + count+"次。");
    }
}
