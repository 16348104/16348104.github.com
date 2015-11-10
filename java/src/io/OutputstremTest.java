package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by xdx on 2015/11/10.
 */
public class OutputstremTest {

    public static void main(String[] args) {
    OutputStream outputstream = null;

        try {
            outputstream = new FileOutputStream("java/src/io/write.test");
            outputstream.write('b');

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        if(outputstream != null)
        try {
            outputstream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


