package generic;

/**
 * Created by xdx on 2015/11/5.
 */
public interface GenericInterface <T>{
    void m1(T m);
}
    class Test<T> implements GenericInterface<T> {
        @Override
        public void m1(T m) {

        }

        public static void main(String[] args) {
            Test<Double> test;
            test = new Test<>();
        }
    }
