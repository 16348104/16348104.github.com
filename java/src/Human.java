

/**
 * Created by Administrator on 2015/10/24.
 */
public class Human {
    int age;
    char sex;
    String fuse;
    boolean marry;

//    void study() {
//
//    }

    void sleep() {

    }

    public Human() {
   }


    public Human(int age, char sex, String fuse, boolean marry) {
        this.age = age;
        this.sex = sex;
        this.fuse = fuse;
        this.marry = marry;
    }

    void print() {
        System.out.println(age + "  " + sex + "  ");
    }
}
