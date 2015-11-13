package oop;

/**
 * Created by Administrator on 2015/10/24.
 */
public class China extends Human {
    //域
    String shengxiao;


    //  方法
    void mahjong() {

    }

    public China(int age, char sex, String fuse, boolean marry, String shengxiao) {
        super(age, sex, fuse, marry);
        this.shengxiao = shengxiao;
    }
//
    China(){
    super();

}
//    public Chinese(String s, int i, char c, boolean b) {
//        super(s, i, c, b);
//    }

    public static void main(String[] args) {
        China c = new China();
        System.out.println(c.age);

    }
}
