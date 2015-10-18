import java.util.Scanner;

/**
 * Created by Administrator on 2015/10/18.
 * 利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，
 * 60分以下的用C表示。
 */
public class E5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入分数：");
        int g=input.nextInt();
        if (g>=90) {
            System.out.println('A');
        } else if(g>=60&g<=89){
            System.out.println('B');
        }
        else {
            System.out.println('C');
        }

    }
}
