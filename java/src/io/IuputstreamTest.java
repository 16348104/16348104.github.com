package io;

import exception.IOExceptionTest;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2015/11/7.
 */
public class IuputstreamTest {
    public static void main(String[] args) {
        InputStream input = null;
        try {
             input = new FileInputStream("java/src/io/q");
            int i;
            while ((i = input.read()) != -1) {

                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
