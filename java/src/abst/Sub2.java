package abst;



/**
 * Created by Administrator on 2015/10/25.
 * 长方
 */
public abstract class Sub2 extends Shape {
    private int a;
    private int b;

    public Sub2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int  mianji() {
       return a * b;
    }

    @Override
    public int zhouchang() {
          return (a+b)*2;
    }
}
