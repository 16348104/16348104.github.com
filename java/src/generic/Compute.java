package generic;

/**
 * Created by Administrator on 2015/11/1.
 */
public class Compute<T>{
    public String add(T x,T y) {
        return String.valueOf(x) + String.valueOf(y);
    }
    public static void main(String[] args) {
//        Compute com<Integer, Integer>= new Compute<>();
        Compute <Integer>co= new Compute<>();

        System.out.println(co.add(2, 3));
    }
}
