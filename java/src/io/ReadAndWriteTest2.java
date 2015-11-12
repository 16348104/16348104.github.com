package io;

import java.io.*;

/**
 * Created by xdx on 2015/11/12.
 */
public class ReadAndWriteTest2 {
    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream("f:/jquery-1.11.3.js"));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("java/src/io/io"));
            int i;
            while ((i = bufferedInputStream.read()) != -1) {

                bufferedOutputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedInputStream.close();
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println("done");

    }
}
