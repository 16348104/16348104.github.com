/**
 * Created by xdx on 2015/10/23.
 */
public class E9 {
    public static void main(String[] args) {
//        int m, i, sum;
        for (int i = 1; i <= 1000; i++)              //从1开始到1000循环结束
        {
            int sum = 0;                             //初始化因子之和s为0

            for (int j = 1; j < i; j++)              //寻找在1到m之间，有多少m的因子
                if (i % j == 0)                      //如果m能整除i，则i为m的因子
                    sum = sum + j;                   //将因子累加

            if (sum == i)                            //如果因子之和等于这个数
                System.out.print(" "+sum);      //输出
        }
    }
}
