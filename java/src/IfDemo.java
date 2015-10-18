
/**
 * Created by Administrator on 2015/10/18.
 */
public class IfDemo {
    public static void main(String[] args) {
        int grade = 75;
        char c='优';
        if (grade >= 85) {
            System.out.println("85-100");
        } else if (grade >= 60) {
            System.out.println("60-70");
        } else if (grade >= 75) {
            System.out.println("75-85");
        } else {
            System.out.println("0-60");
        }
        switch (c){
            case'优':
                System.out.println("85-100");

        }
    }
}
