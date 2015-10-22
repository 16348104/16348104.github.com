//输入两个正整数m和n，求其最大公约数和最小公倍数。
import java.util.Scanner;
public class E6 {
    public static void main(String[] args) {
        int n, m,r,m1,n1;
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入整数(m>0):  ");
        m1=scan.nextInt();
        System.out.println("请输入整数(n>0):  ");
        n1=scan.nextInt();
        if(m1>n1)
        {
            m=m1;
            n=n1;
        }
        else
        {
            m=n1;
            n=m1;
        }
        do{
            r=m%n;
            m=n;
            n=r;
        }while(r!=0);
        System.out.println(m1+"和"+n1+"的最大公约数= "+m+",最小公倍数="+m1*n1/m);
    }

}

