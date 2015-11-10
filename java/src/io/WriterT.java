package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by xdx on 2015/11/10.
 */
public class WriterT {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer = new FileWriter("java/src/io/writer");
            writer.write("中文。。。");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(writer!=null)
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
