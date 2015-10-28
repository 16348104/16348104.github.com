package exercise;

/**
 * Created by dell on 2015/10/28.
 * 输出9*9口诀。
 */
public class E16 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {

            for (int j = 1; j < 10; j++) {
                System.out.print(+i + "*" + j + "=" + i * j+"\t" );
            }
            System.out.println();
        }
    }
}

