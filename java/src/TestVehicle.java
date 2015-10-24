/**
 * Created by Administrator on 2015/10/24.
 */
public class TestVehicle {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(7, true, "orange");
        System.out.println(v.id);
        System.out.println(v.color);
        System.out.println(v.running);
//        System.out.println(v.work());
    }
}
