package io;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by xdx on 2015/11/12.
 */
public class ReadAndWriteTest1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("java/src/io/data"));
        String string;
        while ((string = bufferedReader.readLine()) != null) {
            System.out.println(string);
        }

    }
}
