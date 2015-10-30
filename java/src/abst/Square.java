package abst;

/**
 * Created by Administrator on 2015/10/25.
 * 正方
 */
public class Square extends Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double Periemter() {
        return a*4;
    }

    @Override
    public double Area() {
        return Math.pow(a, 2);
    }
    //    public double getA() {
//        return a;
//    }
//
//    public void setA(int a) {
//        this.a = a;
//    }
}
