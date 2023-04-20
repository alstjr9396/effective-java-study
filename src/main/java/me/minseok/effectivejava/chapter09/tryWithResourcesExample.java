package me.minseok.effectivejava.chapter09;

import java.io.*;

public class tryWithResourcesExample {

    private static final int BUFFER_SIZE = 8 * 1024;

    public static void main(String[] args) throws IOException {
        // InputStream, OutputStream Closeable을 상속 받고 있다.
        try(InputStream in = new FileInputStream("d:/fake/location");
            OutputStream out = new FileOutputStream("d/fake/location");) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0) {
                out.write(buf, 0, n);
            }
        }
    }
}
