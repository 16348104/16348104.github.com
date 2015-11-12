package exercise;

/**
 * Created by dell on 2015/10/29.
 * 打印出如下图案（菱形）
    x
   xxx
  xxxxx
 xxxxxxx
  xxxxx
   xxx
    x
 要求只使用以下三种语句
 1. System.out.print(" ")
 2. System.out.print("x");
 3. System.out.println("x")
 */
public class E19 {
    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("x");
            }
            System.out.println();

        }
        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("x");
            }
            System.out.println();
        }

    }
}

