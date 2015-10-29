package inherited;

/**
 * Created by dell on 2015/10/29.
 */
public class Father {

    int i;

    void test() {
        System.out.println("test method in father class...");
        i++;
    }
}

class Son extends Father {

//   void test() {
//      System.out.println("test method in son class...");
//   }

    Son() {
        super();
        System.out.println("in son constructor...");
    }

    @Override
// 注解
    void test() {
        int j = i;
        super.test();
        System.out.println("test method in son class...");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.test();
    }
}

