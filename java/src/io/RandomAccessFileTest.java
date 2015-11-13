package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by xdx on 2015/11/10.
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile("java/src/io/rat.txt", "rw");
            for (int i = 0; i < 10; i++) {
                randomAccessFile.writeInt(i);
            }
//            randomAccessFile.seek(1);
//            randomAccessFile.writeDouble(12.34);
            randomAccessFile = new RandomAccessFile("java/src/io/rat.txt", "r");
            for (int i = 0; i <10; i++) {
                System.out.println("val: "+randomAccessFile.readInt());

            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {
            if (randomAccessFile != null) {

                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}