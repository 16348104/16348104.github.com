/**
 * Created by xdx on 2015/11/6.
 */
public class Array {
    public static void main(String[] args) {
//        int[] a  = new int[10];
        String[] str = new String[10];
//        System.out.println(a[0]);
        System.out.println(str[9]);

//        System.out.println(args[args.length - 1]);

        String[] strings = {"as", "sd", "df"};
        System.out.println(strings.length);

        int[][] ints = new int[3][4];
        System.out.println(ints.length);

        System.out.println(ints[2][3]);

        String[][] strings1 = new String[3][];
        strings1[0] = new String[4];
        strings1[1] = new String[2];
        strings1[2] = new String[1];
        for (int i = 0; i < strings1.length; i++) {
            for (int j = 0; j < strings1[i].length; j++) {
                strings1[i][j] = "" + i * j;
            }
        }
        System.out.println(strings1[2][0]);

        int[][][] ints1 = new int[1][2][3];
        for (int i = 0; i < ints1.length; i++) {
            for (int j = 0; j < ints1[i].length; j++) {
                for (int k = 0; k < ints1[i][j].length; k++) {
                    ints1[i][j][k] = i * j * k;
                }
            }
        }


        double[] doubles = new double[10];
        doubles[9] = 100;
        System.out.println(doubles[9]);
    }

}
