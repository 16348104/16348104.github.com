package inherited;

/**
 * Created by xdx on 2015/10/27.
 */
public class Car extends Vehicle {
    String oil;

    String didi() {
              return "didi...";
    }

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.id);
        System.out.println(c.color);
        System.out.println(c.run);
        System.out.println(c.running());
        System.out.println(c.oil);
        System.out.println(c.didi());
        System.out.println(c instanceof Vehicle);//c是vehicle的子类吗？


    }
}
