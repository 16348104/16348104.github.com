package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by Administrator on 2015/11/7.
 */
public class ReaderT {
    public static void main(String[] args) {
        Reader reader = null;

        try {
            reader = new FileReader("java/src/io/data");
            int i = reader.read();
            while (i != -1) {
                System.out.print((char) i);
                i = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if ( reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }
}
