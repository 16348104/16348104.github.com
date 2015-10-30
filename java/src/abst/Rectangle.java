package abst;



/**
 * Created by Administrator on 2015/10/25.
 * 长方
 */
public  class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double Area(){
       return a * b;
    }

    @Override
    public double Periemter() {
          return (a+b)*2;
    }
}
