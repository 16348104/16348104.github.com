package exercise;

/**
 * Created by xdx on 2015/11/19.
 */
public class E23 {
    int GetAge(int n) {
        if (n=1){
            return 10;
        }
        return GetAge()+2;

    }
    public static void main(String[] args) {
        System.out.println("年龄为："+GetAge(5));

    }
}
