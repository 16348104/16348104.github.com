package abst;

/**
 * Created by Administrator on 2015/10/25.
 * 圆
 */
public abstract class Sub3 extends Shape {
    private int a;

    public Sub3(int a) {
        this.a = a;
    }

    @Override
    public double mianji() {
       return (int)a* Math.PI;
    }

    public double  zhouchang() {
        return a*2* Math.PI;
    }
}
