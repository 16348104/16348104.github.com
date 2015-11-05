/**
 * Created by xdx on 2015/11/5.
 */
public class StaticTest {
    private String name;
    private int age;

    public static void m1() {

    }

    public static void m2() {

        m1();
    }

    public StaticTest(String name, int age) {//alt+insert
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

    }
}

