package exercise;

/**
 * Created by dell on 2015/10/28.
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
 */
public class E10 {
    public static void main(String[] args) {
        double sum=0,h=100;
        for (int i = 0; i < 10; i++) {
            sum += h;
            h = h / 2;
        }
        System.out.println("共经过"+sum+"米");
        System.out.println("反弹"+h+"米");

    }
}
