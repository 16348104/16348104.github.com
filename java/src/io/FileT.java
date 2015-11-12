package io;
import java.io.File;
import java.util.Date;

/**
 * Created by xdx on 2015/11/12.
 */
public class FileT {
    public static void main(String[] args) {
        File f = new File("java/src/io/rat");
        if (f.isDirectory()) {
            String files[] = f.list();
            for (String s : files) {

                System.out.println(s);
            }
        } else {
            System.out.println(f.exists());
            System.out.println(f.isAbsolute());
            System.out.println(f.isHidden());
            System.out.println(f.getAbsoluteFile());
            System.out.println(f.getAbsolutePath());
            System.out.println(f.getName());
            System.out.println(f.length());
            System.out.println(new Date(f.lastModified()));
        }
    }
}

