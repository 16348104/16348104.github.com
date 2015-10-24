/**
 * Created by Administrator on 2015/10/24.
 */
public class Vehicle {
    //域
    int id;
    boolean running;
    String color;

    Vehicle(int i, boolean b, String str) {
        id = i;
        running = b;
        color = str;

    }

    void running() {

    }

    int work() {
        return 1;
    }

}
