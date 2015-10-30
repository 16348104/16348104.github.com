package abst;

/**
 * Created by Administrator on 2015/10/25.
 */
public class ShapeTest {

//        Shape s = new Square(1.0); ?
    public static void main(String[] args) {
        Shape s = new Square(5.0);
        Shape r= new Rectangle(4,3);//?
        System.out.println(s.Area());
        System.out.println(s.Periemter());
        System.out.println(r.Area());
        System.out.println(r.Periemter());
    }
}
