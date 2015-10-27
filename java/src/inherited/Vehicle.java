package inherited;

/**
 * Created by Administrator on 2015/10/24.
 */
public class Vehicle {
    //域
    int id;
    boolean run;
    String color;

//    Vehicle(int i, boolean b, String str) {
//        id = i;
//        running = b;
//        color = str;
//        double speed;
//    }

    String running() {
        return "running...";
    }

    int work() {
        return 1;
    }

}
